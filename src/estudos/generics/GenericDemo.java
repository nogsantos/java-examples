/**
 *
 * Descrição:Classe GenericDemo
 *
 *
 * @author Fabricio Nogueira
 *
 * @since 09-Apr-2013
 *
 * @version 1.0.0
 *
 */
package estudos.generics;

public class GenericDemo {

    public String method(String input) {
        String data1 = input;
        BasicGeneric<String> basicGeneric = new BasicGeneric<String>(data1);
        String data2 = basicGeneric.getData();
        return data2;
    }

    public Integer method(int input) {
        Integer data1 = new Integer(input);
        BasicGeneric<Integer> basicGeneric = new BasicGeneric<Integer>(data1);
        Integer data2 = basicGeneric.getData();
        return data2;
    }

    public static void main(String args[]) {
        GenericDemo sample = new GenericDemo();
        System.out.println(sample.method("Some generic data"));
        System.out.println(sample.method(1234));
    }
}
