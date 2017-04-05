
public class Game {
	private int wins;
	private int loss;
	private int ties;
	private String u;
	private String c;
	
	public Game(String user, Computer computer){
		u = user;
		c = computer.getC();
	}
	public String toString(){
		
		return "Wins: " +wins+ "\nLosses: "+loss+"\nTies: "+ties;
		
	}
	
public void setU(String s){
	u = s;
	
}	
public void setC(String s){
	c = s;
}
	
	
	
	
	
	
	
	public String results(){
		if(u.equals("R") && c.equals("R")){
			ties++;
			return "The user and the computer tied!";
			
		}
		else
		if(u.equals("R") && c.equals("S")  ){
			wins++;
			return "The User won!";
			
		}
		else
			if(u.equals("R") && c.equals("P")){
				loss++; 
				return "The user took an L!";
			}
			else
				if(u.equals("S") && c.equals("S") ){
					ties++;
					return "The user and the computer tied!";
					
				}
				else 
					if(u.equals("S") && c.equals("P")){
						wins++;
						return " The user won!";
						
					}
					else 
						if(u.equals("S")&& c.equals("R")){
							loss++;
							return "The user lossed";
							
						} else
							if(u.equals("P") && c.equals("P") ){
								ties++;
								return "The user and the computer tied!";
								
							}
							else 
								if(u.equals("P")&& c.equals("R")){
									wins++;
									return " The user won!";
									
								}
								else 
									if(u.equals("P")&& c.equals("S")){
										loss++;
										return "The user lossed";
										
									}
									else return "Yall had an error!";
	}
		
		
	}


