/**
 *
 * Descrição:Classe EstudoSwing
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
import javax.swing.JOptionPane;

public class EstudoSwing {

    public static void ler() {
        JOptionPane.showInputDialog("teste");

        try {
            Menu.menuPrincipal();
        } catch (IOException e) {
            System.err.println("Caracter Inválido");
        }
    }
}
