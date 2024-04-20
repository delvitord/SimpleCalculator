import org.Calculator.Komputasi;
import org.testng.Assert;
import org.testng.annotations.Test;



public class KomputasiTest {

    @Test
    public void testPositifPositif() {
        Assert.assertEquals(Komputasi.tambah(1, 2), 3.0, 0.0001, "Penjumlahan dengan kedua operand bilangan positif salah");
    }

    @Test
    public void testPositifNegatif() {
        Assert.assertEquals(Komputasi.tambah(1, -2), -1.0, 0.0001, "Penjumlahan dengan operand1 bilangan positif dan operand2 bilangan negatif salah");
    }

    @Test
    public void testNegatifPositif() {
        Assert.assertEquals(Komputasi.tambah(-1, 2), 1.0, 0.0001, "Penjumlahan dengan operand1 bilangan negatif dan operand2 bilangan positif salah");
    }

    @Test
    public void testNegatifNegatif() {
        Assert.assertEquals(Komputasi.tambah(-1, -2), -3.0, 0.0001, "Penjumlahan dengan kedua operand bilangan negatif salah");
    }

    @Test
    public void testNolPositif() {
        Assert.assertEquals(Komputasi.tambah(0, 2), 2.0, 0.0001, "Penjumlahan dengan operand1 nol (0) dan operand2 bilangan positif salah");
    }

    @Test
    public void testNolNegatif() {
        Assert.assertEquals(Komputasi.tambah(0, -2), -2.0, 0.0001, "Penjumlahan dengan operand1 nol (0) dan operand2 bilangan negatif salah");
    }

    @Test
    public void testPositifNol() {
        Assert.assertEquals(Komputasi.tambah(2, 0), 2.0, 0.0001, "Penjumlahan dengan operand1 bilangan positif dan operand2 nol (0) salah");
    }

    @Test
    public void testNegatifNol() {
        Assert.assertEquals(Komputasi.tambah(-2, 0), -2.0, 0.0001, "Penjumlahan dengan operand1 bilangan negatif dan operand2 nol (0) salah");
    }

    @Test
    public void testDesimalBulat() {
        Assert.assertEquals(Komputasi.tambah(1.5, 2), 3.5, 0.0001, "Penjumlahan dengan operand1 bilangan desimal dan operand2 bilangan bulat salah");
    }

    @Test
    public void testDesimalDesimal() {
        Assert.assertEquals(Komputasi.tambah(1.5, 2.3), 3.8, 0.0001, "Penjumlahan dengan operand1 dan operand2 bilangan desimal salah");
    }
}
