import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationMtd {

    public String Name(String x){
        System.out.println("\nEnter " + x + " (1st character should be Capital & Should have at least 3 characters)");
        Scanner sc =  new Scanner(System.in);
        String nameInput  = sc.next();

        if(Pattern.matches("^[A-Z][a-z]{2,}$",nameInput)){
//            System.out.println(x +" : " +nameInput);
            return nameInput;
        }else{
            System.out.println("Please Enter Valid Name");
            Name(x);
            return null;

        }
    }
}
