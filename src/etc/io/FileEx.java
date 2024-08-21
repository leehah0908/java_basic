package etc.io;

import java.io.File;
import java.io.IOException;

public class FileEx {
    // 파일을 저장할 기본 경로
    public static final String ROOT_PATH = "/Users/leehah/Playdata_backend/java/files";

    public static void main(String[] args) {
        // 폴더 생성 명령
        // 파일 정보를 가지는 객체 생성
        File derectory = new File(ROOT_PATH + "/new_file");

        // 폴더 생성
        if (!derectory.exists()) derectory.mkdir();

        // 파일 생성
        File newfile = new File(ROOT_PATH + "/new_file/food.txt");
        if (!newfile.exists()) {
            try {
                newfile.createNewFile();
            } catch (IOException e) {
                System.out.println("파일 생성 실패");;
            }
        }


    }
}
