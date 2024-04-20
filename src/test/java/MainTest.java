import org.Calculator.Main;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class MainTest {

    //TC-01-01
    //Memeriksa nilai operand 1 yang tidak valid (selain dari bilangan bulat)
    @Test
    public void testOperand1Invalid() {
        InputStream originalSystemIn = System.in;
        PrintStream originalSystemOut = System.out;
        String input = "a\n";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(printStream);

        Main.main(new String[0]);

        String consoleOutput = outputStream.toString().trim();

        System.setIn(originalSystemIn);
        System.setOut(originalSystemOut);

        Assert.assertTrue(consoleOutput.contains("Input operand 1 tidak valid!"));
    }

    //TC-01-02
    //Memeriksa nilai operator yang tidak valid (selain dari '+, -, /, *)
    @Test
    public void testOperatorInvalid() {
        InputStream originalSystemIn = System.in;
        PrintStream originalSystemOut = System.out;
        String input = "2\n!\n";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(printStream);

        Main.main(new String[0]);

        String consoleOutput = outputStream.toString().trim();
        System.setIn(originalSystemIn);
        System.setOut(originalSystemOut);

        Assert.assertTrue(consoleOutput.contains("Operator tidak valid!"));
    }

    //TC-01-03
    //Memeriksa nilai operand 2 yang tidak valid (selain dari bilangan bulat)
    @Test
    public void testOperand2Invalid() {
        InputStream originalSystemIn = System.in;
        PrintStream originalSystemOut = System.out;
        String input = "2\n+\nc\n";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(printStream);

        Main.main(new String[0]);

        String consoleOutput = outputStream.toString().trim();
        System.setIn(originalSystemIn);
        System.setOut(originalSystemOut);

        Assert.assertTrue(consoleOutput.contains("Input operand 2 tidak valid!"));
    }

    //TC-01-04
    //Melakukan operasi penjumlahan
    @Test
    public void testPenjumlahan() {
        InputStream originalSystemIn = System.in;
        PrintStream originalSystemOut = System.out;
        String input = "2\n" +
                "+\n" +
                "2\n" +
                "n\n";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(printStream);

            Main.main(new String[0]);

            String consoleOutput = outputStream.toString().trim();
            printStream.close();

            Assert.assertTrue(consoleOutput.contains("Hasil dari 2.0 + 2.0 = 4.0"));
        } finally {
            System.setIn(originalSystemIn);
            System.setOut(originalSystemOut);
        }
    }

    //TC-01-05
    //Melakukan operasi pengurangan
    @Test
    public void testPengurangan() {
        InputStream originalSystemIn = System.in;
        PrintStream originalSystemOut = System.out;
        String input = "3\n" +
                "-\n" +
                "2\n" +
                "n\n";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(printStream);

            Main.main(new String[0]);

            String consoleOutput = outputStream.toString().trim();
            printStream.close();

            Assert.assertTrue(consoleOutput.contains("Hasil dari 3.0 - 2.0 = 1.0"));
        } finally {
            System.setIn(originalSystemIn);
            System.setOut(originalSystemOut);
        }
    }

    //TC-01-06
    //Melakukan operasi perkalian
    @Test
    public void testPerkalian() {
        InputStream originalSystemIn = System.in;
        PrintStream originalSystemOut = System.out;
        String input = "2\n" +
                "*\n" +
                "2\n" +
                "n\n";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(printStream);

            Main.main(new String[0]);

            String consoleOutput = outputStream.toString().trim();
            printStream.close();

            Assert.assertTrue(consoleOutput.contains("Hasil dari 2.0 * 2.0 = 4.0"));
        } finally {
            System.setIn(originalSystemIn);
            System.setOut(originalSystemOut);
        }
    }

    //TC-01-07
    //Melakukan operasi pembagian
    @Test
    public void testPembagian() {
        InputStream originalSystemIn = System.in;
        PrintStream originalSystemOut = System.out;
        String input = "2\n" +
                "/\n" +
                "2\n" +
                "n\n";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(printStream);

            Main.main(new String[0]);

            String consoleOutput = outputStream.toString().trim();
            printStream.close();

            Assert.assertTrue(consoleOutput.contains("Hasil dari 2.0 / 2.0 = 1.0"));
        } finally {
            System.setIn(originalSystemIn);
            System.setOut(originalSystemOut);
        }
    }
}
