import java.lang.Math;
import java.util.Random;


public class Computer {
	private int n;
	private String c;
	private Random rand = new Random();
	public Computer(){
		

 n = rand.nextInt(100) + 1;
if(n<= 30){
	c = "R";
}		 
else 
	if(n>30 && n<60){
		c = "S";
		
	}
	else 
		if (n>=60){
			c = "P";
		}
		else c ="R";
	}
	
	
	public String getC(){
		return c;
	}

}
