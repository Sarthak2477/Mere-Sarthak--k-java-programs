import java.io.Console;

class AuthenticationFailure extends Exception{
    public AuthenticationFailure(String errMsg){
        super(errMsg);
    }
}
public class AuthenticationTest {
    public static void main(String[] args) {
        try {
            Console console = System.console();
            char pwd[] = console.readPassword("Enter a password: ");
            String password = new String(pwd);
            if(password.compareTo("#Met@1234") != 0){
                throw new AuthenticationFailure("Password does not match");
            }
                System.out.println("Password Matched");
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
