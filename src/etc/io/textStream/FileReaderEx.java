package etc.io.textStream;

import etc.io.FileEx;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderEx {
    public static void main(String[] args) {
        String targetPath = FileEx.ROOT_PATH + "/new_file/hobby.txt";

        try (FileReader fr = new FileReader(targetPath)){

            BufferedReader br = new BufferedReader(fr);
            while (true) {
                String s = br.readLine(); // -> 한줄씩 읽어옴
                if (s == null) break;
                System.out.println(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
