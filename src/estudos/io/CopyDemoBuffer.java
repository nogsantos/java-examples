/**
 *
 * Descrição:Classe CopyDemoBuffer
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

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDemoBuffer {

    public void copy(String input, String output) {
        BufferedReader reader;
        BufferedWriter writer;
        String data;
        try {
            reader = new BufferedReader(new FileReader(input));
            writer = new BufferedWriter(new FileWriter(output));
            while ((data = reader.readLine()) != null) {
                writer.write(data, 0, data.length());
            }
            reader.close();
            writer.close();
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }

    public static void main(String args[]) {
        CopyDemoBuffer cf = new CopyDemoBuffer();
        cf.copy("temp.txt", "temp2.txt");
    }
}