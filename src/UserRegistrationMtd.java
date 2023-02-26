import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationMtd {

    public String Name(String x){
        System.out.println("\nEnter " + x + " (1st character should be Capital & Should have at least 3 characters)");
        Scanner sc =  new Scanner(System.in);
        String nameInput  = sc.next();

        if(Pattern.matches("^[A-Z][a-z]{2,}$",nameInput)){
            return nameInput;
        }else{
            System.out.println("Please Enter Valid Name");
            Name(x);
            return null;
        }
    }
    public String email(){
        System.out.println("\nEnter Email Id : ");
        Scanner sc =  new Scanner(System.in);
        String emailInput  = sc.nextLine();

        if(Pattern.matches("^[\\w_.-]+@[a-zA-Z]+.[a-zA-Z.]+$",emailInput)){
            return emailInput;
        }else{
            System.out.println("Please Enter Valid Email ID");
            email();
            return null;
        }
    }
    public String phone(){
        System.out.println("\nEnter Phone Number (Starts with +country code)");
        Scanner sc =  new Scanner(System.in);
        String phone  = sc.nextLine();

        if(Pattern.matches("^\\+[0-9]{2}[0-9]{10}$",phone)){
            return phone;
        }else{
            System.out.println("Please Enter Valid Phone Number");
            phone();
            return null;
        }
    }
    public String password(){
        System.out.println("\nEnter Password (should be minimum 8 characters, should contain at least 1 capital letter, number & special character )");
        Scanner sc =  new Scanner(System.in);
        String password  = sc.nextLine();

        if(Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*+=_-])(?=\\S+$).{8,}$",password)){
            return password;
        }else{
            System.out.println("Please Enter Valid Password");
            password();
            return null;
        }
    }
}
