import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld_Lesson {
	public static void main(String[] args) {

		World World1 = new World();
		World1.show();
		World1.add(new Location(1, 1), new Bug());
		Bug Bug1 = new Bug();
		Bug1.setColor(Color.CYAN);
		Bug Bug2 = new Bug();
		Bug2.setColor(Color.GREEN);
		Bug Bug3 = new Bug();
		Bug3.setColor(Color.CYAN);
		Bug Bug4 = new Bug();
		Bug4.setColor(Color.GREEN);
		Bug Bug5 = new Bug();
		Bug5.setColor(Color.CYAN);
		Bug Bug6 = new Bug();
		Bug6.setColor(Color.GREEN);
		Bug Bug7 = new Bug();
		Bug7.setColor(Color.CYAN);
		Bug Bug8 = new Bug();
		Bug8.setColor(Color.GREEN);
		Bug Bug9 = new Bug();
		Bug9.setColor(Color.CYAN);
		Bug Bug10 = new Bug();
		Bug10.setColor(Color.GREEN);
		Bug Bug11 = new Bug();
		Bug11.setColor(Color.CYAN);
		Bug Bug12 = new Bug();
		Bug12.setColor(Color.GREEN);
		Bug Bug13 = new Bug();
		Bug13.setColor(Color.CYAN);
		Bug Bug14 = new Bug();
		Bug14.setColor(Color.GREEN);
		Bug Bug15 = new Bug();
		Bug15.setColor(Color.CYAN);
		Bug Bug16 = new Bug();
		Bug16.setColor(Color.GREEN);
		Bug Bug17 = new Bug();
		Bug17.setColor(Color.CYAN);
		Bug Bug18 = new Bug();
		Bug18.setColor(Color.GREEN);
		Bug Bug19 = new Bug();
		Bug19.setColor(Color.CYAN);
		Bug Bug20 = new Bug();
		Bug20.setColor(Color.GREEN);

		// Color Color1;
		// Color Color2;
		// Color1 = Color.WHITE;
		// Color2 = Color.RED;
		// for (int i = 0; i < 10; i++) {
		// for (int j = 0; j < 10; j++) {
		// Flower Flower1 = new Flower();
		// if (j % 2 == 0) {
		// Flower1.setColor(Color.WHITE);
		//
		// } else {
		// Flower1.setColor(Color.RED);
		// }
		// World1.add(new Location(j, i), Flower1);
		//
		// }
		// }
		Location Location1 = new Location(0, 9);
		Location Location2 = new Location(1, 8);
		Location Location3 = new Location(2, 7);
		Location Location4 = new Location(3, 6);
		Location Location5 = new Location(4, 5);
		Location Location6 = new Location(5, 4);
		Location Location7 = new Location(6, 3);
		Location Location8 = new Location(7, 2);
		Location Location9 = new Location(8, 1);
		Location Location20 = new Location(9,0);
		Location Location10 = new Location(9, 9);
		Location Location11 = new Location(8, 8);
		Location Location12 = new Location(7, 7);
		Location Location13 = new Location(6, 6);
		Location Location14 = new Location(5, 5);
		Location Location15 = new Location(4, 4);
		Location Location16 = new Location(3, 3);
		Location Location17 = new Location(2, 2);
		Location Location18 = new Location(1, 1);
		Location Location19 = new Location(0, 0);
		

		World1.add(Location1, Bug1);
		World1.add(Location2, Bug2);
		World1.add(Location3, Bug3);
		World1.add(Location4, Bug4);

		World1.add(Location5, Bug5);
		World1.add(Location6, Bug6);

		World1.add(Location7, Bug7);
		World1.add(Location8, Bug8);

		World1.add(Location9, Bug9);
		World1.add(Location10, Bug10);

		World1.add(Location11, Bug11);
		World1.add(Location12, Bug12);

		World1.add(Location13, Bug13);
		World1.add(Location14, Bug14);
		World1.add(Location15, Bug15);
		World1.add(Location16, Bug16);
		World1.add(Location17, Bug17);
		World1.add(Location18, Bug18);
		World1.add(Location19, Bug19);
		World1.add(Location20, Bug20);

	}

}
