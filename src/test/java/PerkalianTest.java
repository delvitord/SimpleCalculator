import org.Calculator.Komputasi;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PerkalianTest {

    @Test
    public void positifPositif() {
        double hasil = Komputasi.kali(1.0, 1.0);
        Assert.assertEquals(hasil, 1.0, 0.0001, "Hasil perkalian positif * positif salah");
    }

    @Test
    public void positifNegatif() {
        double hasil = Komputasi.kali(1.0, -1.0);
        Assert.assertEquals(hasil, -1.0, 0.0001, "Hasil perkalian positif * negatif salah");
    }

    @Test
    public void negatifPositif() {
        double hasil = Komputasi.kali(-1.0, 1.0);
        Assert.assertEquals(hasil, -1.0, 0.0001, "Hasil perkalian negatif * positif salah");
    }

    @Test
    public void negatifNegatif() {
        double hasil = Komputasi.kali(-1.0, -1.0);
        Assert.assertEquals(hasil, 1.0, 0.0001, "Hasil perkalian negatif * negatif salah");
    }

    @Test
    public void nolPositif() {
        double hasil = Komputasi.kali(0.0, 1.0);
        Assert.assertEquals(hasil, 0.0, 0.0001, "Hasil perkalian nol * positif salah");
    }

    @Test
    public void nolNegatif() {
        double hasil = Komputasi.kali(0.0, -1.0);
        Assert.assertEquals(hasil, 0.0, 0.0001, "Hasil perkalian nol * negatif salah");
    }

    @Test
    public void positifNol() {
        double hasil = Komputasi.kali(1.0, 0.0);
        Assert.assertEquals(hasil, 0.0, 0.0001, "Hasil perkalian positif * nol salah");
    }

    @Test
    public void negatifNol() {
        double hasil = Komputasi.kali(-1.0, 0.0);
        Assert.assertEquals(hasil, 0.0, 0.0001, "Hasil perkalian negatif * nol salah");
    }

    @Test
    public void desimalBulat() {
        double hasil = Komputasi.kali(0.5, 2.0);
        Assert.assertEquals(hasil, 1.0, 0.0001, "Hasil perkalian desimal * bulat salah");
    }

    @Test
    public void desimalDesimal() {
        double hasil = Komputasi.kali(0.5, 0.5);
        Assert.assertEquals(hasil, 0.25, 0.0001, "Hasil perkalian desimal * desimal salah");
    }

    @Test
    public void batasString() {
        double hasil = Komputasi.kali(111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111.0, 111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111.0);
        Assert.assertEquals(String.valueOf(hasil), "1.2345679012E507", "Hasil perkalian berdigit 255 salah");

    }

    @Test
    public void batasMelebihiString() {
        double hasil = Komputasi.kali(11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111.0, 11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111.0);
        Assert.assertEquals(String.valueOf(hasil), "1.2345679012E512", "Hasil perkalian berdigit 257 salah");
    }

}
