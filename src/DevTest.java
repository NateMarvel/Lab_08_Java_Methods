import java.util.Scanner;
public class DevTest {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String name = SafeInput.getNonZeroLenString(in, "Enter your name");
        System.out.println("You entered: " + name);

        int num = SafeInput.getInt(in, "Enter an integer");
        System.out.println("You entered: " + num);

        double dub = SafeInput.getDouble(in, "Enter a Double" );
        System.out.println("You entered: " + dub);

        int rint = SafeInput.getRangedInt(in, "Enter a ranged int", 1, 12);
        System.out.println("You entered: " + rint);

        double rdub = SafeInput.getRangedDouble(in, "Enter a ranged double", 1.0, 10.0);
        System.out.println("You entered: " + rdub);

        boolean yn = SafeInput.getYNConfirm(in, "Yes or No/True or False");
        System.out.println("You entered: " + yn);
    }
}
