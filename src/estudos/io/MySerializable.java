/**
 *
 * Descrição:Classe MySerializable
 * <pre>
 *  Para permitir que um objeto seja serializável (isto é, possa ser salvo e recuperado),
 *  a classe deve implementar a interface Serializable.
 *  A classe também deve prover um construtor padrão (ou um construtor sem argumentos).
 *  Uma das coisas interessantes a respeito de serialização é que a
 *  mesma é herdada, o que significa que não precisamos implementar Serializable em cada classe.
 *  Isso significa menos trabalho para os programadores. É possível simplesmente implementar
 *  Serializable uma única vez ao longo da hierarquia de classes.
 * </pre>
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
import java.io.ObjectInputStream;
import java.io.Serializable;

public class MySerializable implements Serializable {
    /*
     * Há, alguns objetos que não são serializáveis porque os dados que
     * eles representam mudam constantemente.
     *
     * Uma classe contendo um objeto não serializável ainda pode ser serializada
     * se a referência e este objeto não serializável for marcada com a palavra-
     * chave transient.
     */

    transient Thread thread;
    int data;

    public MySerializable() {
        Boolean booleanData = null;
        try {
            FileInputStream fis = new FileInputStream("boolean.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            booleanData = (Boolean) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Unserialized Boolean from "
                + "boolean.txt");
        System.out.println("Boolean data: " + booleanData);
        System.out.println("Compare data with true: "
                + booleanData.equals(new Boolean("true")));
    }

    public static void main(String args[]) {
        new MySerializable();
    }
}
