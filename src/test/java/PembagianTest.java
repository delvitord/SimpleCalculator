import org.Calculator.Komputasi;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PembagianTest {

    @Test
    public void positifPositif() {
        double hasil = Komputasi.bagi(1.0, 1.0);
        Assert.assertEquals(hasil, 1.0, 0.0001, "Hasil pembagian positif / positif salah");
    }

    @Test
    public void positifNegatif() {
        double hasil = Komputasi.bagi(1.0, -1.0);
        Assert.assertEquals(hasil, -1.0, 0.0001, "Hasil pembagian positif / negatif salah");
    }

    @Test
    public void negatifPositif() {
        double hasil = Komputasi.bagi(-1.0, 1.0);
        Assert.assertEquals(hasil, -1.0, 0.0001, "Hasil pembagian negatif / positif salah");
    }

    @Test
    public void negatifNegatif() {
        double hasil = Komputasi.bagi(-1.0, -1.0);
        Assert.assertEquals(hasil, 1.0, 0.0001, "Hasil pembagian negatif / negatif salah");
    }

    @Test
    public void nolPositif() {
        double hasil = Komputasi.bagi(0.0, 1.0);
        Assert.assertEquals(hasil, 0.0, 0.0001, "Hasil pembagian nol / positif salah");
    }

    @Test
    public void nolNegatif() {
        double hasil = Komputasi.bagi(0.0, -1.0);
        Assert.assertEquals(hasil, 0.0, 0.0001, "Hasil pembagian nol / negatif salah");
    }

    @Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "Tidak bisa melakukan pembagian dengan nol!")
    public void positifNol() {
        Komputasi.bagi(1.0, 0.0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "Tidak bisa melakukan pembagian dengan nol!")
    public void negatifNol() {
        Komputasi.bagi(-1.0, 0.0);
    }


    @Test
    public void desimalBulat() {
        double hasil = Komputasi.bagi(0.5, 2.0);
        Assert.assertEquals(hasil, 0.25, 0.0001, "Hasil pembagian desimal / bulat salah");
    }

    @Test
    public void desimalDesimal() {
        double hasil = Komputasi.bagi(0.5, 0.5);
        Assert.assertEquals(hasil, 1.0, 0.0001, "Hasil pembagian desimal / desimal salah");
    }
    @Test
    public void batasString() {
        double hasil = Komputasi.bagi(111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111.0, 111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111.0);
        Assert.assertEquals(hasil, 1.0, 0.0001, "Hasil pembagian berdigit 255 salah");

    }

    @Test
    public void batasMelebihiString() {
        double hasil = Komputasi.bagi(11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111.0, 11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111.0);
        Assert.assertEquals(hasil, 1.0, 0.0001, "Hasil pembagian berdigit 257 salah");

    }
}
