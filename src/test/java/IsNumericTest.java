import org.Calculator.Validasi;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IsNumericTest {

    @Test
    public void testIsNumericWithEmptyString() {
        Assert.assertFalse(Validasi.isNumeric(""), "Test with empty string should return false");
    }

    @Test
    public void testIsNumericWithPositiveInteger() {
        Assert.assertTrue(Validasi.isNumeric("100"), "Test with positive integer should return true");
    }

    @Test
    public void testIsNumericWithNegativeInteger() {
        Assert.assertTrue(Validasi.isNumeric("-100"), "Test with negative integer should return true");
    }

    @Test
    public void testIsNumericWithZero() {
        Assert.assertTrue(Validasi.isNumeric("0"), "Test with zero should return true");
    }

    @Test
    public void testIsNumericWithPositiveDecimal() {
        Assert.assertTrue(Validasi.isNumeric("1.5"), "Test with positive decimal should return true");
    }

    @Test
    public void testIsNumericWithNegativeDecimal() {
        Assert.assertTrue(Validasi.isNumeric("-55.5"), "Test with negative decimal should return true");
    }

    @Test
    public void testIsNumericWithVeryLargePositiveInteger() {
        String largeNumber = "1111" + "1111".repeat(30);
        Assert.assertTrue(Validasi.isNumeric(largeNumber), "Test with very large positive integer should return true");
    }

    @Test
    public void testIsNumericWithVeryLargeNegativeInteger() {
        String largeNumber = "-1111" + "1111".repeat(30);
        Assert.assertTrue(Validasi.isNumeric(largeNumber), "Test with very large negative integer should return true");
    }

    @Test
    public void testIsNumericWith256DigitPositiveInteger() {
        String largeNumber = "1" + "1".repeat(255);  // Creates a string of 256 '1's
        Assert.assertTrue(Validasi.isNumeric(largeNumber), "Test with 256-digit positive integer should return true");
    }

    @Test
    public void testIsNumericWithAlphabeticCharacters() {
        Assert.assertFalse(Validasi.isNumeric("a"), "Test with alphabetic characters should return false");
    }

    @Test
    public void testIsNumericWithNumbersAndDotsMixedWithLetters() {
        Assert.assertFalse(Validasi.isNumeric("123.a"), "Test with numbers and dots mixed with letters should return false");
    }

    @Test
    public void testIsNumericWithLettersMixedWithNumbers() {
        Assert.assertFalse(Validasi.isNumeric("ab221"), "Test with letters mixed with numbers should return false");
    }

    @Test
    public void testIsNumericWithSpacesAndNumbers() {
        Assert.assertFalse(Validasi.isNumeric(" 223"), "Test with spaces and numbers should return false");
    }
}
