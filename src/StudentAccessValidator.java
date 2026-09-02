/*
Part H
*/
public class StudentAccessValidator {
    
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
    
    public static boolean isValidAccess(String id, String password) {
        return isValidStudentId(id) && isValidPassword(password);
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
