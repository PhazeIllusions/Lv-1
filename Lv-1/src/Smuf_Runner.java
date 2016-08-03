
public class Smuf_Runner {
	public static void main(String[] args) {
		Smurf dagr = new Smurf("Dagr");
		dagr.eat();
		System.out.println(dagr.getName());

		Smurf papaSmuf = new Smurf("PapaSmuf");
		System.out.println(papaSmuf.getName());
		System.out.println(papaSmuf.getHatColor());
		System.out.println(papaSmuf.isGirlOrBoy());

		Smurf smufette = new Smurf("Smufete");
		System.out.println(smufette.getName());
		System.out.println(smufette.getHatColor());
		System.out.println(smufette.isGirlOrBoy());

	}

}
