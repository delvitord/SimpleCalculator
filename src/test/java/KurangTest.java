import org.Calculator.Komputasi;
import org.testng.Assert;
import org.testng.annotations.Test;


public class KurangTest {

    @Test
    public void positifPositif() {
        double hasil = Komputasi.kurang(1.0, 1.0);
        Assert.assertEquals(hasil, 0.0, 0.0001, "Hasil pengurangan positif - positif salah");
    }

    @Test
    public void positifNegatif() {
        double hasil = Komputasi.kurang(1.0, -1.0);
        Assert.assertEquals(hasil, 2.0, 0.0001, "Hasil pengurangan positif - negatif salah");
    }

    @Test
    public void negatifPositif() {
        double hasil = Komputasi.kurang(-1.0, 1.0);
        Assert.assertEquals(hasil, -2.0, 0.0001, "Hasil pengurangan negatif positif salah");
    }

    @Test
    public void negatifNegatif() {
        double hasil = Komputasi.kurang(-1.0, -1.0);
        Assert.assertEquals(hasil, 0.0, 0.0001, "Hasil pengurangan negatif negatif salah");
    }

    @Test
    public void nolPositif() {
        double hasil = Komputasi.kurang(0.0, 1.0);
        Assert.assertEquals(hasil, -1.0, 0.0001, "Hasil pengurangan nol - positif salah");
    }

    @Test
    public void nolNegatif() {
        double hasil = Komputasi.kurang(0.0, -1.0);
        Assert.assertEquals(hasil, 1.0, 0.0001, "Hasil pengurangan nol - negatif salah");
    }

    @Test
    public void positifNol() {
        double hasil = Komputasi.kurang(1.0, 0.0);
        Assert.assertEquals(hasil, 1.0, 0.0001, "Hasil pengurangan positif - nol salah");
    }

    @Test
    public void negatifNol() {
        double hasil = Komputasi.kurang(-1.0, 0.0);
        Assert.assertEquals(hasil, -1.0, 0.0001, "Hasil pengurangan negatif - nol salah");
    }

    @Test
    public void desimalBulat() {
        double hasil = Komputasi.kurang(0.5, 10.0);
        Assert.assertEquals(hasil, -9.5, 0.0001, "Hasil pengurangan desimal - bulat salah");
    }

    @Test
    public void desimalDesimal() {
        double hasil = Komputasi.kurang(0.5, 2.5);
        Assert.assertEquals(hasil, -2.0, 0.0001, "Hasil pengurangan desimal - desimal salah");
    }

    @Test
    public void batasString() {
        double hasil = Komputasi.kurang(111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111.0, 111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111.0);
        Assert.assertEquals(hasil, 0.0, 0.0001, "Hasil pengurangan berdigit 255 salah");
    }

    @Test
    public void batasMelebihiString() {
        double hasil = Komputasi.kurang(11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111.0, 11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111.0);
        Assert.assertEquals(hasil, 0.0, 0.0001, "Hasil pengurangan berdigit 257 salah");
    }
}
