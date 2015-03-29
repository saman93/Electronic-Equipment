
public class Phone extends Device {
	
	String number;
	String color;
	
	Phone(int weight, int cost, int power, String mnf, String color, String number){
		
		this.color =color;
		this.cost = cost;
		this.mnf =mnf;
		this.number = number;
		this.power = power;
		this.weight = weight;
		
		
		printColor();
		printNumber();
		printCost();
		printMnf();
		printPower();
		printWeight();
		
	}
	
	public void printNumber(){
		
		System.out.println("The number of the phone is: "+ number);
			
	}
	public void printColor(){
		
		System.out.println("The color of the phone is: "+ color);
			
	}

}
