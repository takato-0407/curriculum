package check;

public class Check {
	

	public static void main(String[] args) {
		 String firstName = "渡邉";
		 String lastName = "嵩人";
		
		System.out.print("printNameメゾット → ");
		System.out.print(printName(firstName, lastName));
		
		RobotPet introduce = new RobotPet();
		introduce.introduce();
	    
	}
	
    private static String printName(String firstName,String lastName){
    return firstName + lastName;
    }
    

}
