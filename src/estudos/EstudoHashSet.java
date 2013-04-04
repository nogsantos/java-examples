/**
 *
 * Descrição:Classe EstudoHashSet
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
import java.util.HashSet;


public class EstudoHashSet {

    public static void exemploHashSet(){
        HashSet hs = new HashSet(1);
        hs.add("one");
        hs.add("two");
        hs.add("three");
        hs.add("four");
        hs.add("five");
        System.out.println(hs);
        System.out.println(Math.random()*100);
        
        try {
            Menu.menuPrincipal();
        } catch (IOException e) {
            System.err.println("Caracter Inválido");
        }
    }
}
