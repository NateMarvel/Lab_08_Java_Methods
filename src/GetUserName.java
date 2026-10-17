import java.util.Scanner;
public class GetUserName
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
        String lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");
        String userName = SafeInput.getNonZeroLenString(in, "Enter your username");
        System.out.println("Hello, " + firstName +  " " + lastName + ". Your username is " + userName);
    }
}
