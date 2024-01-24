import java.util.Scanner;

public class Utils {
    static boolean isInteger(String val) {
        return val.matches("-?[0-9]+");
    }
    static Scanner userInput = new Scanner(System.in);

    static int getIntInput(String prompt){
        while(true){
            System.out.println(prompt);
            String intInput = userInput.nextLine();
            try{
                if(isInteger(intInput)){
                    System.out.println("Success!");
                    return Integer.parseInt(intInput);
                }else{
                    throw new NumberFormatException("Bad input");
                }
            }catch(NumberFormatException e){
                System.out.println("Försök igen");
            }
        }
    }
}
