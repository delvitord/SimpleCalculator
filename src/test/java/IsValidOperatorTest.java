import org.Calculator.Validasi;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IsValidOperatorTest {
    @Test
    public void testIsValidOperatorPlus() {
        Assert.assertTrue(Validasi.isValidOperator("+"), "Test with '+' operator should return true");
    }

    @Test
    public void testIsValidOperatorMinus() {
        Assert.assertTrue(Validasi.isValidOperator("-"), "Test with '-' operator should return true");
    }

    @Test
    public void testIsValidOperatorMultiply() {
        Assert.assertTrue(Validasi.isValidOperator("*"), "Test with '*' operator should return true");
    }

    @Test
    public void testIsValidOperatorDivide() {
        Assert.assertTrue(Validasi.isValidOperator("/"), "Test with '/' operator should return true");
    }

    @Test
    public void testIsValidOperatorWithNumber() {
        Assert.assertFalse(Validasi.isValidOperator("123"), "Test with number as operator should return false");
    }

    @Test
    public void testIsValidOperatorWithAlphabet() {
        Assert.assertFalse(Validasi.isValidOperator("abcd"), "Test with alphabet as operator should return false");
    }

    @Test
    public void testIsValidOperatorWithSpaceAndValidOperator() {
        Assert.assertFalse(Validasi.isValidOperator(" +"), "Test with space and valid operator should return false");
    }

    @Test
    public void testIsValidOperatorWithSpecialCharacter() {
        Assert.assertFalse(Validasi.isValidOperator("&"), "Test with special character should return false");
    }

    @Test
    public void testIsValidOperatorWithManyOperators() {
        Assert.assertFalse(Validasi.isValidOperator("+-*/"), "Test with many operators should return false");
    }
}
