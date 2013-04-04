/**
 *
 * Descrição:Main Estudos
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


public class Estudos {
    
    public static void main(String[] args) {
        
        try {
            Menu.menuPrincipal();
        } catch (IOException e) {
            System.err.println("Caracter Inválido");
        }
    }
}
