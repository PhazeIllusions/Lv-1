
public class Backpack {
	
	private Pencil2 pencil;
	private Ruler2 ruler;
	private Textbook2 textbook;

	Backpack(){
		System.out.println("Nice Backpack");
	}
	
	public static void main (String[] args){
		/* Your mission is to get to school, but first you need to get all of your supplies into your backpack. */
Backpack backpack = new Backpack();
Textbook2 textbook = new Textbook2();
Supply2 supply = new Supply2();
Pencil2 pencil = new Pencil2();
Ruler2 ruler = new Ruler2();
backpack.putInBackpack(ruler);
backpack.putInBackpack(pencil);
backpack.putInBackpack(textbook);
backpack.goToSchool();


	}
	
	public void putInBackpack(Supply2 supply){
		if (supply instanceof Pencil2){
			this.pencil = (Pencil2) supply;
			System.out.println("You put your pencil in your Backpack");
		}else if(supply instanceof Ruler2){
			this.ruler = (Ruler2) supply;
			System.out.println("You put your ruler in your Backpack");
		}else if(supply instanceof Textbook2){
			this.textbook = (Textbook2) supply;
			System.out.println("You put your textbook in your Backpack");
		}else{
			System.out.println("That isn't a valid school supply");
		}
	}
	
	public void goToSchool(){
		if(pencil == null || ruler == null || textbook == null){
			System.out.println("You are not ready for School");
		}else{
			System.out.println("Congratulations! You are ready for school");
		}
	}
}

class Supply {
	protected String name;
}

class Pencil extends Supply2 {
	
	Pencil(){
		this.name = "pencil";
		System.out.println("You got your pencil!");
	}
	
	public void write(String writing){
		System.out.println(writing);
	}
}


class Ruler extends Supply2 {

	Ruler(){
		this.name = "ruler";
		System.out.println("You found your ruler!!");
	}
	
	public void measure(){
		System.out.println("Now you can measure your mouse!");
	}
}

class Textbook extends Supply2{

	Textbook(){
		this.name = "textbook";
		System.out.println("You got your boring textbook");
	}
	
	public void read(){
		System.out.println("The history of Iceland is long and interesting");
	}
}


