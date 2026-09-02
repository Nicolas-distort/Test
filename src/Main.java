import java.util.Random;
/*
3. Part A
A1: true, true, true, true
A2: Because it needs to check every character in the total password length
A3: It will be out of bound index error
A4: It would be an error because there is no reference point
A5: It would not pass the test because there is no lowercase detected
A6: It would not pass the test because there is no uppercase detected
*/
void main() {
    String password = "Vanier2026";

    boolean upper = false;
    boolean lower = false;
    boolean digit = false;

    for (int i = 0; i < password.length(); i++) {
        char c = password.charAt(i);

        if (Character.isUpperCase(c))
            upper = true;
        else if (Character.isLowerCase(c))
            lower = true;
        else if (Character.isDigit(c))
            digit = true;
    }

    System.out.println(upper);
    System.out.println(lower);
    System.out.println(digit);
    System.out.println(upper && lower && digit);
    System.out.println((isValidPassword("vANIER2620")));
}
/*
4. Part B
1: It should be 0
2: Character.isDigit(text.charAt(i)) is used to check if the character is a digit
3: After incrementing all the tex length
*/
public static int countDigits(String text){
    int count = 0;

    for(int i = 0; i < text.length(); i++){
           char c = text.charAt(i);
           if(Character.isDigit(c))
               count++;
    }
    return count;
}
/*
5. Part C
They are better only for verifying if the condition is fullfilled
*/
public static boolean isValidPassword(String password){

    boolean upper = false;
    boolean lower = false;
    boolean digit = false;

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
/*
6. Part D
The <= will cause an out of bound index error and it should be <
Responsible AI reflection: Change the mistake of using <= to < and understanding to prevvent an invalid String index
*/
public static int countUppercase(String text) {
    int count = 0;

    for (int i = 0; i < text.length(); i++) {
        if (Character.isUpperCase(text.charAt(i)))
            count++;
    }
    return count;
}
/*
7. Part E
import java.util.Random; has been imported at the top of the code
*/
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
/* Part G
1: One digit is enough to pass the test
2: It returns true during the first loop repetition
3: It will return false because there is no digit in the string
4: The method only needs to know whether at least one digit is exist and not how many
5: The loop runs zero times and then the methoid returns false
 */
public static boolean containsDigit(String text) {
    for (int i = 0; i < text.length(); i++) {
        if (Character.isDigit(text.charAt(i)))
            return true;
    }

    return false;
}
/*
Responsible AI reflection
Change the mistake of using <= to < and understanding to prevvent an invalid String index
I traced the code of vanier and saw the semicolon made the count++ run for each character then I verified the issue before changing it
*/