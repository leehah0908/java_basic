package etc.io.obj;

import etc.io.FileEx;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SaveSnack {
    public static void main(String[] args) {
        List<Snack> snackList = new ArrayList<>();

        Collections.addAll(snackList,
                new Snack("콘칩", 1970, 1500, Snack.Taste.GOOD),
                new Snack("사브레", 1980, 2500, Snack.Taste.BAD),
                new Snack("오징어집", 1990, 1000, Snack.Taste.SOSO)
                );

        try (FileOutputStream fos = new FileOutputStream(FileEx.ROOT_PATH + "/new_file/snack.sav")) {
            // 객체를 출력할 수 있는 보조 스트림
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(snackList);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
