package etc.io.byteStream;

import etc.io.FileEx;

import java.io.FileOutputStream;

public class FileOutputEx {
    // 바이트 기반 출력 스트림: 영상, 이미지, 텍스트 등 모든 데이터 출력 가능

    public static void main(String[] args) {
        String message = "Hello World! Today is 24.08.21, Wednesday";

        // try with resource: close가 필요한 하드웨어 접근 코드에 대해 메모리 자원 반납 처리를 자동화 해주는 문법
        // close 하려는 객체가 AutoCloseable 인터페이스의 구현체여야 합니다.
//        FileOutputStream fos = null;
//        try {
//            fos = new FileOutputStream(FileEx.ROOT_PATH + "/new_file/hello.txt");
//            fos.write(message.getBytes()); // 파일 출력 명령
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                fos.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        }

        // 더 좋은 코드
        try (FileOutputStream fos = new FileOutputStream(FileEx.ROOT_PATH + "/new_file/hello.txt")){ // -> try문이 종료되면 알아서 삭제됨
            fos.write(message.getBytes()); // 파일 출력 명령
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
