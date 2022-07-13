import java.util.*;
class Program {
    static boolean ValidateRegistrationNo(String registrationNo) {
        String[] str = registrationNo.split(" ");
        if (str[0].length() == 2)
        {
            if (!str[0].equals(str[0].toUpperCase()))
                return false;
        }
        else return false;
        if (isNumeric(str[1])) {
            int n = Integer.parseInt(str[1]); {
                if (n < 1 || n > 99) {
                    return false;
                }
            }
        }
        else return false;
        if (isNumeric(str[2])) {
            if (!uniqueCharacters(str[2]))
                    return false;
        }
        else {
            if (str[2].length() <= 2)
            {
                if(!str[2].equals(str[2].toUpperCase()))
                    return false;
            }
            else return false;
            if (isNumeric(str[3])) {
                if (!uniqueCharacters(str[3])) {
                    return false;
                }
            }
            else return false;
        }
        return true;
    }
    public static boolean isNumeric(String string) {
        int intValue;
        if(string.length() == 0) {
            return false;
        }
        try {
            intValue = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {

        }
        return false;
    }
    public static boolean uniqueCharacters(String string) {
        for (int i = 0; i < string.length() - 1; i++) {
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(i) == string.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
public class Question1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the registration plate number: ");
       String str = sc.nextLine();
       if (Program.ValidateRegistrationNo(str)) {
           System.out.println("Registration No. is valid");
       }
       else System.out.println("Registration No. is invalid");
    }
}