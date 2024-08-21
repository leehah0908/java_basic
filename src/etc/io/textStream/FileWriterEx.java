package etc.io.textStream;

import etc.io.FileEx;

import java.io.FileWriter;
import java.util.Scanner;

// 텍스트 기반 스트림: 텍스트 입출력에 특화된 스트림
// 2바이트 이상 데티어를 처리 가능
public class FileWriterEx {
    public static void main(String[] args) {
        String targetPath = FileEx.ROOT_PATH + "/new_file/hobby.txt";
        Scanner input = new Scanner(System.in);

        try (FileWriter fw = new FileWriter(targetPath)){
            System.out.print("취미를 입력하세요: ");
            String hobby = input.nextLine();

            String outMsg = String.format("내 취미는 %s입니다.\n", hobby);

            fw.write(outMsg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
