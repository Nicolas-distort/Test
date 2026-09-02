/*
Part H
*/
import java.util.Random;
public class StudentAccessValidator {
    public static int countDigits(String text) {
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (Character.isDigit(c))
                count++;
        }

        return count;
    }
    public static int countUppercase(String text) {
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i)))
                count++;
        }

        return count;
    }

    public static boolean isValidStudentId(String id) {
        if (id == null) {
            return false;
        }
        if (id.length() != 7) {
            return false;
        }
        if (id.charAt(0) != 'V') {
            return false;
        }
        for (int i = 1; i < id.length(); i++) {
            if (!Character.isDigit(id.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    public static boolean isValidPassword(String password){
        boolean upper = false;
        boolean lower = false;
        boolean digit = false;
        if (password == null) {
        return false;
        }
        for (int i = 0; i < password.length(); i++) {
        char c = password.charAt(i);

        if (Character.isUpperCase(c))
            upper = true;
        else if (Character.isLowerCase(c))
            lower = true;
        else if (Character.isDigit(c))
            digit = true;
    }
    boolean min = password.length() >= 8;

    return upper && lower && digit && min;
}
    public static boolean isValidAccess(String id, String password) {
        return isValidStudentId(id) && isValidPassword(password);
    }
        public static String generateCode() {
        String code = "";
        Random rand = new Random();
        String allowed = "ABCDE";
        for (int i = 0; i < 4; i++) {
        int index = rand.nextInt(5);
        code += allowed.charAt(index);
    }
    return code;
    }
    public static boolean containsDigit(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i)))
                return true;
        }

        return false;
    }
}
/* 
Part I - 1
*/
    public static boolean verifyAccessCode(String generatedCode, String enteredCode) {
        if (generatedCode == null) {
            return false;
        }
        return generatedCode.equals(enteredCode);
    }
/* 
Part I - 2 
*/
    public static boolean isValidAccess(String id, String password, String generatedCode, String enteredCode) {
        return isValidAccess(id, password) && verifyAccessCode(generatedCode, enteredCode);
    }
    public static boolean containsDigit(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i)))
                return true;
        }

        return false;
    }
}
/*
Part J 
1: The input is a string containing the student ID
2: The output is a boolean if the ID is valid and false otherwise
3: The assumption is the ID has 7 characters, starts with 'V' and ends with 6 digits
4: A one edge case is a null
5: A possible future modification is allowing another starting letter
6: assertFalse(isValidStudentId("V1234567"));
*/