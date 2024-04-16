import org.Calculator.Validasi;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidationTest {
    @Test
    public void testIsNumeric_ValidNumber() {
        String validNumber = "123";
        boolean result = Validasi.isNumeric(validNumber);
        Assert.assertTrue(result);
    }

    @Test
    public void testIsNumeric_InvalidNumber() {
        String invalidNumber = "abc";
        boolean result = Validasi.isNumeric(invalidNumber);
        Assert.assertFalse(result);
    }

    @Test
    public void testIsNumeric_NullString() {
        String nullString = null;
        boolean result = Validasi.isNumeric(nullString);
        Assert.assertFalse(result);
    }

    @Test
    public void testIsValidOperator_ValidOperator() {
        String validOperator = "+";
        boolean result = Validasi.isValidOperator(validOperator);
        Assert.assertTrue(result);
    }

    @Test
    public void testIsValidOperator_InvalidOperator() {
        String invalidOperator = "%";
        boolean result = Validasi.isValidOperator(invalidOperator);
        Assert.assertFalse(result);
    }

    @Test
    public void testIsValidOperator_EmptyString() {
        String emptyString = "";
        boolean result = Validasi.isValidOperator(emptyString);
        Assert.assertFalse(result);
    }
}
