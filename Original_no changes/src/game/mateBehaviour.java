package game;

import edu.monash.fit2099.engine.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
/* Code adapted from a group called spike, methods utilised to make a class attracted to the other to produce the behaviour in question the use of bfs was only done so that the dinosaur classes can procreate*/
public class mateBehaviour implements Behaviour {
    private Class<?> attractor;
    private String name;
    private int maxRange;
    private HashSet<Location> visitedLocations =new HashSet<Location>();

    public mateBehaviour(Class<?> cls, int mRange){
        this.attractor = cls;
        this.name = attractor.toString();;
        this.maxRange =mRange;

    }
    private Action hunt(Actor actor, Location here) {
        visitedLocations.clear();
        ArrayList<Location> now = new ArrayList<Location>();
        now.add(here);
        ArrayList<ArrayList<Location>> layer = new ArrayList<ArrayList<Location>>();
        layer.add(now);


        for (int i = 0; i<maxRange; i++) {
            layer = getNextLayer(actor, layer);
            Location there = search(layer);
            if (there != null)
                return there.getMoveAction(actor, "towards " + name, null);
        }
        return null;
    }

    private ArrayList<ArrayList<Location>> getNextLayer(Actor actor, ArrayList<ArrayList<Location>> layer) {
        ArrayList<ArrayList<Location>> nextLayer = new ArrayList<ArrayList<Location>>();
        for (ArrayList<Location> path : layer) {
            List<Exit> exits = new ArrayList<Exit>(path.get(path.size() - 1).getExits());
            Collections.shuffle(exits);
            for (Exit exit : path.get(path.size() - 1).getExits()) {
                Location destination = exit.getDestination();
                if (!destination.getGround().canActorEnter(actor) || visitedLocations.contains(destination))
                    continue;
                visitedLocations.add(destination);
                ArrayList<Location> newPath = new ArrayList<Location>(path);
                newPath.add(destination);
                nextLayer.add(newPath);
            }
        }
        return nextLayer;
    }

    private Location search(ArrayList<ArrayList<Location>> layer) {

        for (ArrayList<Location> path : layer) {
            if (containsTarget(path.get(path.size() - 1))) {
                return path.get(1);
            }
        }
        return null;
    }

    private boolean containsTarget(Location here) {
        return (here.getActor() != null &&
                attractor.isInstance(here.getActor()));
    }
    @Override
    public Action getAction(Actor actor, GameMap map) {
        // Is there an attackable Actor next to me?
        List<Exit> exits = new ArrayList<Exit>(map.locationOf(actor).getExits());
        Collections.shuffle(exits);

        for (Exit e : exits) {
            if (!(e.getDestination().containsAnActor()))
                continue;
            if (e.getDestination().getActor().hasCapability(Gender.FEMALE)) {
                Actor attr = e.getDestination().getActor();
                return new mateAction((Dinosaur)attr);
            }

        }
        return hunt(actor, map.locationOf(actor));
    }

}
