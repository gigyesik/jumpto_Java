import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Console {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;

        // read one word
        /*
        int a;
        int b;
        int c;

        a = in.read(); // ascii code
        b = in.read();
        c = in.read();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        */

        /*
        // InputStream
        byte[] a = new byte[3];
        in.read(a);

        System.out.println(a[0]); // ascii code
        System.out.println(a[1]);
        System.out.println(a[2]);
        */

        /*
        // InputStreamReader
        InputStreamReader reader = new InputStreamReader(in);
        char[] b = new char[3];
        reader.read(b);

        System.out.println(b);
        */

        /*
        // BufferedReader
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        String a = br.readLine();
        System.out.println(a);
        */

        /*
        // Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine());
        */

        // console output
        System.out.println("standard print");
        System.err.println("err print");
    }

}
