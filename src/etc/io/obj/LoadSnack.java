package etc.io.obj;

import etc.io.FileEx;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class LoadSnack {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream(FileEx.ROOT_PATH + "/new_file/snack.sav")) {
            ObjectInputStream ois = new ObjectInputStream(fis);

            List<Snack> snackList = (List<Snack>) ois.readObject();

            for (Snack snack : snackList) {
                System.out.println(snack);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
