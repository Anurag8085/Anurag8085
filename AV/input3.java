import java.io.Console;

public class input3 {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.print("Enter Your Username");
        String Uname = c.readLine();
        System.out.println("Enter Your Password");
        char[] str = c.readPassword();
        System.out.println("username  "+Uname);
        System.out.println("password  ");
        System.out.println(str);
    }
}
