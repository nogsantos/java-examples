/**
 *
 * Descrição:Classe BasicGeneric
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

public class BasicGeneric<A> {

    private A data;

    public BasicGeneric(A data) {
        this.data = data;
    }

    public A getData() {
        return data;
    }
}
