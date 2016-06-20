
public class Coffee {
	int temperature;
	public static void main(String[] args) {
Coffee y = new Coffee(2);
y.brew();
	}
	Coffee(int temperature){
		this.temperature = temperature;
		
	}
	void brew(){
		temperature = 110;
		System.out.println("the coffee is ready at" + temperature + " degrees");
	}
}
