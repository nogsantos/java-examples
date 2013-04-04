/**
 *
 * Descrição:Classe Ler
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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ler {

    public static void lerArquivo() throws IOException {
        System.out.println(
                "What is the name of the file to read from?");
        String filename;
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        filename = br.readLine();
        System.out.println(
                "Now reading from " + filename + "...");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(filename);
        } catch (FileNotFoundException ex) {
            System.out.println("File not found.");
        }
        char data;
        int temp;
        do {
            temp = fis.read();
            data = (char) temp;
            if (temp != -1) {
                System.out.print(data);
            }
        } while (temp != -1);

        Menu.menuPrincipal();
    }
}
