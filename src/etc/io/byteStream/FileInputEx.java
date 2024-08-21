package etc.io.byteStream;

import etc.io.FileEx;

import java.io.FileInputStream;

public class FileInputEx {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream(FileEx.ROOT_PATH + "/new_file/hello.txt")) { // -> try문이 종료되면 알아서 삭제됨
            int data = 0;
            // fis.read()응 톨해 지정한 파일의 내용을 바이트 단위로 읽어들임.
            // read(): 더이상 읽을게 없으면 -1 리턴
            while ((data = fis.read()) != -1) {
                // 출력 공간에 읽어들인 데이터를 쓰기.
                System.out.write(data);
            }
            // 미리 작성했던 출력 데이터를 한번에 비워내기.
            System.out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
