import java.awt.Color;

public class Plant {
	
	Color color;
	float height;
	String species;
	String climate;
	boolean alive;
	public Color getColor() {
		return color;
	}
	public float getHeight() {
		return height;
	}
	public String getSpecies() {
		return species;
	}
	public String getClimate() {
		return climate;
	}
	public boolean isAlive() {
		return alive;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public void setClimate(String climate) {
		this.climate = climate;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}	
	
	
//	public Color getColor(){
//		
//		return color;
//	}
//	public float getHeight(){
//		
//		return height;
//	}
//	public String getSpecies(){
//		
//		return species;
//	}
//	public String getClimate(){
//		
//		return climate;
//	}
//	public boolean isAlive(){
//		
//		return true;
//	}
	


}