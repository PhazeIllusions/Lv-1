public class BackPack3 {
	
	private Pencil2 pencil;
	private Ruler2 ruler;
	private Textbook2 textbook;

	BackPack3(){
		System.out.println("Nice Backpack");
	}
	
	public static void main (String[] args){
		/* Your mission is to get to school, but first you need to get all of your supplies into your backpack. 
		 */
		BackPack3 x = new BackPack3();
		Pencil2 pencil = new Pencil2();
		Ruler2 ruler = new Ruler2();
		Textbook2 textbook = new Textbook2();
x.putInBackpack(pencil);
x.putInBackpack(textbook);
x.putInBackpack(ruler);
x.goToSchool();

	}
	
	public void putInBackpack(Supply supply){
		if (supply instanceof Pencil2){
			this.pencil = (Pencil2) supply;
			System.out.println("You put your pencil in your Backpack");
		}else if(supply instanceof Ruler){
			this.ruler = (Ruler2) supply;
			System.out.println("You put your ruler in your Backpack");
		}else if(supply instanceof Textbook){
			this.textbook = (Textbook2) supply;
			System.out.println("You put your textbook in your Backpack");
		}else{
			System.out.println("That isn't a valid school supply");
		}
	}
	
	public void goToSchool(){
		if(pencil == null || ruler == null || textbook == null){
			System.err.println("You are not ready for School");
		}else{
			System.out.println("Congratulations! You are ready for school");
		}
	}
}

class Supply {
	protected String name;
}

class Pencil2 extends Supply {
	
	Pencil2(){
		this.name = "pencil";
		System.out.println("You got your pencil!");
	}
	
	public void write(String writing){
		System.out.println(writing);
	}
}


class Ruler extends Supply {

	Ruler(){
		this.name = "ruler";
		System.out.println("You found your ruler!!");
	}
	
	public void measure(){
		System.out.println("Now you can measure your mouse!");
	}
}

class Textbook extends Supply{

	Textbook(){
		this.name = "textbook";
		System.out.println("You got your boring textbook");
	}
	
	public void read(){
		System.out.println("The history of Iceland is long and interesting");
	}
}
