package check;
import constants.Constants;
public class Check {
	

	public static void main(String[] args) {
		 String firstName = "渡邉";
		 String lastName = "嵩人";
		
		System.out.print("printNameメゾット → ");
		System.out.println(printName(firstName, lastName));
		
		Pet introduce = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		RobotPet Pet  = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		introduce.introduce();
		
	    
	}
	
    private static String printName(String firstName,String lastName){
    return firstName + lastName;
    }
    

}

