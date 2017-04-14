import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridworldLesson {
	public static void main(String[] args) {
		World world1 = new World();
		world1.show();
		Bug bug1 = new Bug();
		Location loc1 = new Location(5, 5);
		world1.add(loc1, bug1);
		world1.add(new Location(1, 1), new Bug());
		bug1.setColor(Color.BLUE);
		bug1.turn();
		Flower flower1 = new Flower();
		world1.add(new Location(1, 0), new Flower());
		world1.add(new Location(1, 2), new Flower());
	}
}
