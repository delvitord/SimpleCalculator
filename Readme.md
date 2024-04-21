# Aplikasi Kalkulator

## Daftar Isi
- [Deskripsi](#deskripsi)
- [Penggunaan](#penggunaan)
- [Pengujian dengan TestNG](#pengujian-dengan-testng)
- [Pengembang](#pengembang)
- [Alat](#alat)

## Deskripsi
Aplikasi Kalkulator Java ini dibangun menggunakan Gradle sebagai alat pembangunan dan TestNG untuk pengujian otomatis. Proyek ini terdiri dari tiga kelas utama:

1. **Main:** Berisi modul utama untuk menjalankan aplikasi.
2. **Validasi:** Berisi modul untuk memvalidasi input, yaitu `isNumeric` dan `isValid`.
3. **Perhitungan:** Berisi modul untuk operasi aritmatika dasar (`kurang`, `tambah`, `bagi`, dan `kali`).

Setiap modul/method yang terkandung dalam ketiga kelas utama tersebut dapat dilihat pada tabel berikut:

### Modul Aplikasi
Pengujian dilakukan permodul dengan daftar item pengujian berikut:

| No. | Nama Kelas    | Nama Modul       |
|-----|---------------|------------------|
| 1   | ` MainApp`    | `Main`           |
| 2   | `Validasi`    | `isNumeric`      |
|     |               | `isValidOperator`|
| 3   | `Perhitungan` | `tambah`         |
|     |               | `kurang`         |
|     |               | `kali`           |
|     |               | `bagi`           |

## Prasyarat

1. Pastikan untuk mengklon repository ini ke dalam direktori lokal Anda dengan perintah:
    ```
    git clone https://github.com/delvitord/SimpleCalculator.git
    ```
   Ini akan mendownload salinan proyek ke komputer Anda.

2. Pastikan Anda telah menginstal Node.js. Anda dapat mengunduh dan menginstal Node.js dari situs resminya: [Node.js Download](https://nodejs.org/).

   Untuk memeriksa apakah Node.js sudah terinstal, jalankan perintah berikut di terminal:
    ```
    node -v
    ```

3. Pastikan Anda telah menginstal Java JDK versi 16. Anda dapat mengunduh dan menginstal Java JDK dari situs resminya: [Java SE Development Kit 16 Downloads](https://www.oracle.com/java/technologies/javase-jdk16-downloads.html).

   Untuk memeriksa apakah Java JDK sudah terinstal, jalankan perintah berikut di terminal:
    ```
    java -version
    ``` 

4. Pastikan sudah terinstal Gradle. Anda dapat mengunduh dan menginstal Gradle dari situs resminya: [Gradle Installation Guide](https://gradle.org/install/).

   Untuk memeriksa apakah Gradle sudah terinstal, jalankan perintah berikut di terminal:
    ```
    gradle -v
    ```

## Cara Menjalankan

1. Buka proyek dengan IDE favorit Anda. Disarankan untuk menggunakan IntelliJ IDEA untuk kenyamanan pengembangan.

2. Lakukan build proyek untuk menyiapkan aplikasi dengan perintah build di IDE Anda atau dengan perintah:
    ```
    npm run build
    ```

3. (Opsional) Proyek ini menggunakan TestNG untuk melakukan pengujian otomatis, Anda dapat menginstalnya dengan cara:
    - Untuk pengguna Eclipse, Anda bisa mendownload dan menginstal TestNG dari Eclipse Marketplace.
    - IntelliJ IDEA dan Visual Studio Code biasanya sudah menyertakan dukungan untuk TestNG tanpa instalasi tambahan.

4. Generate file-file Gradle yang diperlukan dengan perintah:
    ```
    npm run wrapper
    ```

5. Jalankan program untuk melakukan pengujian manual dengan perintah:
    ```
    npm start
    ```
   Ini akan menjalankan program dalam mode pengembangan atau sesuai dengan skrip start yang telah dikonfigurasi.

6. Lakukan pengujian otomatis dengan perintah:
    ```
    npm test
    ```
   Ini akan menjalankan skrip pengujian otomatis yang telah disiapkan untuk proyek.


## Pengujian dengan TestNG
Pengujian dilakukan menggunakan TestNG untuk memastikan fungsi kalkulator beroperasi dengan benar. Hasil pengujian sebagai berikut:

- Total test: <span style="color:#2196F3; font-weight:bold;">77</span>
- Successful: <span style="color:#4CAF50; font-weight:bold;">74 (96%)</span>
- Failures: <span style="color:#F44336; font-weight:bold;">3 (4%)</span>
- Igroned: <span style="color:#FFC107; font-weight:bold;">0</span>

## Pengembang
[<img src="https://github.com/delvitord.png" width="50" style="border-radius:50%">](https://github.com/delvitord)
[<img src="https://github.com/mentarialysias.png" width="50" style="border-radius:50%">](https://github.com/mentarialysias)
[<img src="https://github.com/yasminazizahtuhfah.png" width="50" style="border-radius:50%">](https://github.com/yasminazizahtuhfah)


<b>Delvito Rahim Derivansyah - 211524039 ([@delvitord](https://github.com/delvitord))
<br> Mentari Ayu Alysia Sudrajat - 211524047 ([@mentarialysias](https://github.com/mentarialysias))
<br> Yasmin Azizah Tuhfah - 211524064 ([@yasminazizahtuhfah](https://github.com/yasminazizahtuhfah))
<b>
## Alat
- ![](https://img.shields.io/badge/Gradle-Versi_7.4-%2383afd7)
<br>Digunakan sebagai alat pembangunan untuk mengelola proyek Java dengan efisien. Kunjungi [situs web Gradle](https://gradle.org/) untuk informasi lebih lanjut.
  

- ![](https://img.shields.io/badge/Java-Versi_16-%23ffcc80) 
<br>Versi 16 atau yang lebih baru</span>. Bahasa pemrograman Java digunakan dalam proyek ini. Pastikan untuk menginstal versi Java yang sesuai. Kunjungi [situs web Java](https://www.java.com/) untuk informasi lebih lanjut.


- ![](https://img.shields.io/badge/TestNG-Framework_Pengujian-%23a5d6a7)
<br>Framework pengujian</span> yang digunakan untuk menulis dan menjalankan unit tes dalam proyek Java. Kunjungi [situs web TestNG](https://testng.org/) untuk informasi lebih lanjut.


- ![](https://img.shields.io/badge/Node.js-Platform_runtime_JavaScript-%23b39ddb)
<br>Platform runtime JavaScript</span> yang digunakan untuk menjalankan aplikasi JavaScript di sisi server. Pastikan Node.js telah diinstal untuk menjalankan aplikasi. Kunjungi [situs web Node.js](https://nodejs.org/) untuk informasi lebih lanjut.
