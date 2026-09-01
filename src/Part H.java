/* Part H 
*/
public class StudentAccessValidator {
    public static boolean isValidStudentId(String id) {
        if (id == null)
            return false;
        if(id.charAt(0) != 'V')
            return false;
        if (id.length() != 7)
            return false;
        for (int i = 1; i < id.charAt(0); i++)
            if (!Character.isDigit(id.charAt(i)))
                return false;
        return true;
    }
}
