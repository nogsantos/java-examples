/**
 *
 * Descrição:Classe CopyDemo
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

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDemo {

    private void copy(String input, String output) {
        FileReader reader;
        FileWriter writer;
        int data;
        try {
            reader = new FileReader(input);
            writer = new FileWriter(output);
            while ((data = reader.read()) != -1) {
                writer.write(data);
            }
            reader.close();
            writer.close();
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }

    public static void main(String args[]) {
        CopyDemo cf = new CopyDemo();
        cf.copy("temp.txt", "temp2.txt");
    }
}
