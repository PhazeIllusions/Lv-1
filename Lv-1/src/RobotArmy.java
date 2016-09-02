
public class RobotArmy {
	public static void main(String[] asd){
		//1. create a new human
Human x = new Human("Ash Ketchum");
		//2. create a new Robot army of good and evil robots.
Robot r1 = new Robot("PIKACHUUUUU", false);
Robot r2 = new Robot("PIKACHUUUUU", false);
Robot r3 = new Robot("PIKACHUUUUU", false);
Robot r4 = new Robot("PIKACHUUUUU", false);
Robot r5 = new Robot("PIKACHUUUUU", false);
Robot r6 = new Robot("PIKACHUUUUU", false);
Robot r7 = new Robot("PIKACHUUUUU", false);
Robot r8 = new Robot("PIKACHUUUUU", false);
Robot r9 = new Robot("PIKACHUUUUU", false);
Robot r10 = new Robot("PIKACHUUUUU", false);
Robot r11 = new Robot("PIKACHUUUUU", false);
Robot r12 = new Robot("PIKACHUUUUU", false);
Robot r13 = new Robot("PIKACHUUUUU", false);
Robot r14 = new Robot("PIKACHUUUUU", false);
Robot r15 = new Robot("PIKACHUUUUU", false);
Robot r16 = new Robot("PIKACHUUUUU", false);
Robot r17 = new Robot("PIKACHUUUUU", false);
Robot r18 = new Robot("PIKACHUUUUU", false);
Robot r19 = new Robot("PIKACHUUUUU", false);		
Robot r20 = new Robot("PIKACHUUUUU", false);
Robot br1 = new Robot("Meowth", true);
Robot br2 = new Robot("Meowth", true);
Robot br3 = new Robot("Meowth", true);
Robot br4 = new Robot("Meowth", true);
Robot br5 = new Robot("Meowth", true);
Robot br6 = new Robot("Meowth", true);
Robot br7 = new Robot("Meowth", true);
Robot br8 = new Robot("Meowth", true);
Robot br9 = new Robot("Meowth", true);
Robot br10 = new Robot("Meowth", true);
Robot br11 = new Robot("Meowth", true);
Robot br12 = new Robot("Meowth", true);
Robot br13 = new Robot("Meowth", true);
Robot br14 = new Robot("Meowth", true);
Robot br15 = new Robot("Meowth", true);
Robot br16 = new Robot("Meowth", true);
Robot br17 = new Robot("Meowth", true);
Robot br18 = new Robot("Meowth", true);
Robot br19 = new Robot("Meowth", true);
Robot br20 = new Robot("Meowth", true);
//3. command your robot army to destroy a human
	r14.destroy(x);
	}
}

/**
 * Human Class
 */
class Human {
	String name;
	boolean isAlive;
	
	public Human(String name){
		this.name = name;
		this.isAlive = true;
	}
	public String getName() {
		return name;
	}
	public void die(){
		isAlive = false;
	}
}

/**
 * Robot Class
 */
class Robot {
	boolean isEvil;
	String name;
	
	public Robot(String name, boolean isEvil){
		this.name = name;
		this.isEvil = isEvil;
	}
	
	public void destroy(Human man){
		if(isEvil){
			System.out.println("Beep Boop Pew! Oh no! the robot " + name + " blasted " + man.getName() + "'s head off!");
			man.die();
		}
		else{
			System.out.println("No!! The robot " + name + " loves " +man.getName());
		}
	}
}
