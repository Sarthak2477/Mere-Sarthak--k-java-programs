import java.util.Scanner;

public class Wrapper_classes {
    public static void main(String[] args) {
        // String str = "20";
        // Integer integerObj = Integer.parseInt(str);
        // System.out.println(integerObj.intValue());

        // char a = '2';
        // System.out.println("Is letter:" + Character.isLetter(a));
        // System.out.println("Is Digit:" + Character.isDigit(a));
        // System.out.println("Is White space:" + Character.isWhitespace(a));
        // System.out.println("Is White space:" + Character.isWhitespace(a));
        // System.out.println("Is Upper Case:" + Character.isUpperCase(a));
        // System.out.println("Is Upper Case:" + Character.isUpperCase(a));

        String num;
        Scanner sc = new Scanner(System.in);
        Integer numObj;
        System.out.println("Enter a number:");
        num = sc.nextLine();
        try{
            numObj = Integer.parseInt(num);
            System.out.println("Integer: "+numObj);
        }catch(Exception e){
            System.out.println("Enter valid Integer");
        }
        
    }
}
