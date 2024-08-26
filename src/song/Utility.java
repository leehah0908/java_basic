package song;

import java.util.Scanner;

public class Utility {
    public static final String FILE_PATH;
    private static Scanner sc;

    static {
        FILE_PATH = "/Users/leehah/Playdata_backend/java/java_basic/src/song/files";
        sc = new Scanner(System.in);
    }

    public static void makeLine() {
        System.out.println("==============================================================");
    }

    public static String input(String message) {
        System.out.println(message);
        return sc.nextLine();
    }
}
