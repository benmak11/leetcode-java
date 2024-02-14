package interview;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainClass {

    private static final String IN_FILE_PATH = "src/main/resources/input-data-file.txt";
    private static TidyNumbers tidy = new TidyNumbers();
    public static void main(String[] args) {
        System.out.println("Testing one, two, three");

        FileInputStream file = null;
        Scanner in = null;
        FileWriter fw = null;
        try {
            file = new FileInputStream(IN_FILE_PATH);
            in = new Scanner(file);
            int t = in.nextInt();
            for (int i = 1; i <= t; i++) {
                int n = in.nextInt();
                int result = tidy.getTidyNumber(n);
                System.out.println(result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert in != null;
                in.close();
                assert file != null;
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
