
public class Backpack2 {

	private Pencil2 pencil;
	private Ruler2 ruler;
	private Textbook2 textbook;
	private Paper paper;

	Backpack2() {
		System.out.println("Nice Backpack");
	}

	public static void main(String[] args) {
		/*
		 * Your mission is to get to school, but first you need to get all of
		 * your supplies into your backpack.
		 */
		Backpack2 x = new Backpack2();
		Pencil2 y = new Pencil2();
		x.putInBackpack(y);
		Ruler2 z = new Ruler2();
		x.putInBackpack(z);
		Textbook2 a = new Textbook2();
		x.putInBackpack(a);
		Paper b = new Paper();

		x.goToSchool();

	}

	public void putInBackpack(Supply supply) {
		if (supply instanceof Pencil2) {
			this.pencil = (Pencil2) supply;
			System.out.println("You put your pencil in your Backpack");
		} else if (supply instanceof Ruler2) {
			this.ruler = (Ruler2) supply;
			System.out.println("You put your ruler in your Backpack");
		} else if (supply instanceof Textbook2) {
			this.textbook = (Textbook2) supply;
			System.out.println("You put your textbook in your Backpack");
		} else {
			System.out.println("That isn't a valid school supply");
		}
	}

	public void goToSchool() {
		if (pencil == null || ruler == null || textbook == null) {
			System.err.println("You are not ready for School");
		} else {
			System.out.println("Congratulations! You are ready for school");
		}
	}
}

class Supply2 {
	protected String name;
}

class Paper extends Supply {

	Paper() {
		this.name = "paper";
		System.out.println("You got your paper!");
	}
}

class Pencil2 extends Supply {

	Pencil2() {
		this.name = "pencil";
		System.out.println("You got your pencil!");
	}

	public void write(String writing) {
		System.out.println(writing);
	}
}

class Ruler2 extends Supply {

	Ruler2() {
		this.name = "ruler";
		System.out.println("You found your ruler!!");
	}

	public void measure() {
		System.out.println("Now you can measure your mouse!");
	}
}

class Textbook2 extends Supply {

	Textbook2() {
		this.name = "textbook";
		System.out.println("You got your boring textbook");
	}

	public void read() {
		System.out.println("The history of Iceland is long and interesting");
	}
}
