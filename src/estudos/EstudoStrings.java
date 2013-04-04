/**
 *
 * Descrição:Classe EstudoStrings
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


public class EstudoStrings {

    public static void exemploStrings(){
        String a;
        a = "Estudos jedi java";
        System.out.println(a.charAt(0));
        
        System.getProperties().list(System.out);
        
        try {
            Menu.menuPrincipal();
        } catch (IOException e) {
            System.err.println("Caracter Inválido");
        }
    }
}
