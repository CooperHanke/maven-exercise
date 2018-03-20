import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Maven extends StringUtils{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter something: > ");
        String something = scan.nextLine();
        System.out.println("You entered: \"" + something + "\"");
        if (StringUtils.isNumeric(something)) {
            System.out.println("You \"" + something + "\" is a number.");
        } else {
            System.out.println("You \"" + something + "\" is NOT a number.");
        }
        System.out.println("Flipped Case: " + StringUtils.swapCase(something));
        System.out.println("Reversed: " + StringUtils.reverse(something));
    }
}
