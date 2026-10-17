import java.util.Scanner;
public class BirthDate
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int birthYear = SafeInput.getRangedInt(in, "What is your birth year", 1950, 2015);
        int birthMonth = SafeInput.getRangedInt(in, "What is your birth month", 1, 12);
        int maxDay = 0;
        switch (birthMonth) {
            case 9, 4, 6, 11:
                maxDay = 30;
                break;
            case 2:
                maxDay = 29;
                break;
            case 1, 3, 5, 7, 8, 10, 12:
                maxDay = 31;
                break;
        }
        int birthDay = SafeInput.getRangedInt(in, "What day of the month were you born", 1, maxDay);
        System.out.println("You were born on " + birthMonth + "/" + birthDay + "/" + birthYear);
    }
}
