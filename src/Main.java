public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the User Registration");
        UserRegistrationMtd obj = new UserRegistrationMtd();
        String firstName = obj.Name("First Name");
        String lastName = obj.Name("Last Name");
        String email = obj.email();
    }
}