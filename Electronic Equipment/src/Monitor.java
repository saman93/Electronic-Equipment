
public class Monitor extends Device{

	int size;
	String type;
	
	
	Monitor(int weight, int cost, int power, String mnf, int size, String type){
		
		this.size = size;
		this.cost = cost;
		this.mnf =mnf;
		this.power = power;
		this.weight = weight;
		this.type = type;
		
		
		
		printSize();
		printType();
		printCost();
		printMnf();
		printPower();
		printWeight();
		
	}
	
	
	public void printSize(){
		
		System.out.println("The size of the monitor is: "+ size+ " inches");
			
	}
	
	public void printType(){
		
		System.out.println("The type of the monitor is: "+ type);
			
	}
	
}
