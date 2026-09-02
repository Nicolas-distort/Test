/*
Part F
1: The test will pass because the password has at least 8 characters, 1 uppercase, 1 lowercase, and 1 digit
2: The test will fail because the password has
 */
import com.sun.tools.javac.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void countDigitsNormalCase() {
        assertEquals(4, StudentAccessValidator.countDigits("Vanier2026"));
    }

    @Test
    public void isValidPassword() {
        assertEquals(0, StudentAccessValidator.countDigits("Abcdefg1"));
    }

    @Test
    public void countUppercase() {
        assertEquals(2 , Main.countUppercase("V1A2"));
    }

    @Test
    public void generateCode() {
        String code = StudentAccessValidator.generateCode();
        assertEquals(4, code.length());
        "ABCDE".indexOf(code.charAt()) >= 0;
    }
}
