package check;
import constants.Constants;
public class Check {
	

	public static void main(String[] args) {
		 String firstName = "渡邉";
		 String lastName = "嵩人";
		
		System.out.print("printNameメゾット → ");
		System.out.println(printName(firstName, lastName));
		
		Pet Pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		Pet.introduce();
		
		RobotPet RobotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		RobotPet.introduce();
		
	    
	}
	
    private static String printName(String firstName,String lastName){
    return firstName + lastName;
    }
    

}

