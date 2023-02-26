public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the User Registration");
        UserRegistrationMtd obj = new UserRegistrationMtd();
        String firstName = obj.Name("First Name");
        String lastName = obj.Name("Last Name");
        String email = obj.email();
        String phone = obj.phone();
        String password = obj.password();
        System.out.println("User Info : "+
                "\nName : "+firstName +" " +lastName+
                "\nEmail : "+email+
                "\nPhone : "+phone+
                "\nPassword : "+password);
    }
}