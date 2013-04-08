/**
 *
 * Descrição:Classe SerializeDemo
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

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo{

    public SerializeDemo() {
        Boolean booleanData = new Boolean("true");
        try {
            FileOutputStream fos = new FileOutputStream("boolean.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(booleanData);
            oos.close();
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }

    public static void main(String args[]) {
        new SerializeDemo();
    }
}
