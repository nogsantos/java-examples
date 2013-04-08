/**
 *
 * Descrição:Classe CopyDemoInputOutputStream
 *
 *
 * @author Fabricio Nogueira
 *
 * @since 08-Apr-2013
 *
 * @version 1.0.0
 *
 */
package estudos.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemoInputOutputStream {

    void copy(String input, String output) {
        FileInputStream inputStr;
        FileOutputStream outputStr;
        int data;
        try {
            inputStr = new FileInputStream(input);
            outputStr = new FileOutputStream(output);
            while ((data = inputStr.read()) != -1) {
                outputStr.write(data);
            }
            inputStr.close();
            outputStr.close();
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }

    public static void main(String args[]) {
        CopyDemoInputOutputStream cf = new CopyDemoInputOutputStream();
        cf.copy("temp.txt", "temp2.txt");
    }
}
