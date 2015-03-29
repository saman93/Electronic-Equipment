public class Device {
	
	int weight;
	int cost;
	String mnf;
	int power;
	
	public void printCost(){
		
		System.out.println("The Cost of the device is: "+ cost+ " $");
	}
	
	public void printMnf(){
		
		System.out.println("The Manufacturer of the device is: "+ mnf);
	}
	
	
	public void printPower(){
		
		System.out.println("The Power usage of the device is: "+ power+ " v");
	}
	
	public void printWeight(){
		
		System.out.println("The weight of the device is: "+ weight+ " pound");
	}
	
}