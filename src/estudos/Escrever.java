/**
 *
 * Descrição:Classe Escrever
 *
 *
 * @author Fabricio Nogueira
 *
 * @since 04-Apr-2013
 *
 * @version 1.0.0
 *
 */
package estudos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Escrever {

    public static void criarArquivo() throws IOException {
        System.out.println(
                "What is the name of the file to be written to?");
        String filename;
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        filename = br.readLine();

        System.out.println(
                "Enter data to write to " + filename + "...");
        System.out.println(
                "Type q$ to end.");
        FileOutputStream fos = null;


        try {
            fos = new FileOutputStream(filename);
        } catch (FileNotFoundException ex) {
            System.out.println("File cannot be opened for writing.");
        }


        try {
            boolean done = false;
            int data;
            do {
                data = br.read();
                if ((char) data == 'q') {
                    data = br.read();
                    if ((char) data == '$') {
                        done = true;
                    } else {
                        fos.write('q');
                        fos.write(data);
                    }
                } else {
                    fos.write(data);
                }
            } while (!done);
        } catch (IOException ex) {
            System.out.println("Problem in reading from the file.");
        }finally{
            Menu.menuPrincipal();
        }
    }
}
