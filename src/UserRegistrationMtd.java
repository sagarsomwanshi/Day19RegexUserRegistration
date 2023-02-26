import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationMtd {

    public void firstName(){
        System.out.println("Enter first Name (1st character should be Capital & Should have at least 3 characters)");
        Scanner sc =  new Scanner(System.in);
        String Name  = sc.next();

        if(Pattern.matches("^[A-Z][a-z]{2,}$",Name)){
            System.out.println("Name : "+Name);
        }else{
            System.out.println("Please Enter Valid Name");
            firstName();
        }

    }
}
