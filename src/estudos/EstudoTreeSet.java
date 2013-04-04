/**
 *
 * Descrição:Classe TreeSet
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

import java.io.IOException;
import java.util.TreeSet;


public class EstudoTreeSet {

    public static void exemploTreeSet(){
        TreeSet ts = new TreeSet();
        ts.add("one");
        ts.add("thow");
        ts.add("three");
        ts.add("four");
        System.out.println(ts.last());
        try {
            Menu.menuPrincipal();
        } catch (IOException e) {
            System.err.println("Caracter Inválido");
        }
    }
}
