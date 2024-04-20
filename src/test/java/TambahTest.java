import org.Calculator.Komputasi;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TambahTest {
    @Test
    public void positifPositif() {
        double hasil = Komputasi.tambah(1.0, 1.0);
        Assert.assertEquals(hasil, 2.0, 0.0001, "Hasil penambahan positif + positif salah");
    }

    @Test
    public void positifNegatif() {
        double hasil = Komputasi.tambah(1.0, -1.0);
        Assert.assertEquals(hasil, 0.0, 0.0001, "Hasil penambahan positif + negatif salah");
    }

    @Test
    public void negatifPositif() {
        double hasil = Komputasi.tambah(-1.0, 1.0);
        Assert.assertEquals(hasil, 0.0, 0.0001, "Hasil penambahan negatif + positif salah");
    }

    @Test
    public void negatifNegatif() {
        double hasil = Komputasi.tambah(-1.0, -1.0);
        Assert.assertEquals(hasil, -2.0, 0.0001, "Hasil penambahan negatif + negatif salah");
    }

    @Test
    public void nolPositif() {
        double hasil = Komputasi.tambah(0.0, 1.0);
        Assert.assertEquals(hasil, 1.0, 0.0001, "Hasil penambahan nol + positif salah");
    }

    @Test
    public void nolNegatif() {
        double hasil = Komputasi.tambah(0.0, -1.0);
        Assert.assertEquals(hasil, -1.0, 0.0001, "Hasil penambahan nol + negatif salah");
    }

    @Test
    public void positifNol() {
        double hasil = Komputasi.tambah(1.0, 0.0);
        Assert.assertEquals(hasil, 1.0, 0.0001, "Hasil penambahan positif + nol salah");
    }

    @Test
    public void negatifNol() {
        double hasil = Komputasi.tambah(-1.0, 0.0);
        Assert.assertEquals(hasil, -1.0, 0.0001, "Hasil penambahan negatif + nol salah");
    }

    @Test
    public void desimalBulat() {
        double hasil = Komputasi.tambah(0.5, 10.0);
        Assert.assertEquals(hasil, 10.5, 0.0001, "Hasil penambahan desimal + bulat salah");
    }

    @Test
    public void desimalDesimal() {
        double hasil = Komputasi.tambah(0.5, 2.5);
        Assert.assertEquals(hasil, 3.0, 0.0001, "Hasil penambahan desimal + desimal salah");
    }

    @Test
    public void batasString() {
        double hasil = Komputasi.tambah(111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111.0, 111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111.0);
        Assert.assertEquals(hasil, 222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222.0, 0.0001, "Hasil pengurangan berdigit 255 salah");

    }

    @Test
    public void batasMelebihiString() {
        double hasil = Komputasi.tambah(11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111.0, 11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111.0);
        Assert.assertEquals(hasil, 22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222.0, 0.0001, "Hasil pengurangan berdigit 257 salah");

    }

}