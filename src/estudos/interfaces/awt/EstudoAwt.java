/**
 *
 * Descrição:Classe EstudoAwt
 *
 *
 * @author Fabricio Nogueira
 *
 * @since 05-Apr-2013
 *
 * @version 1.0.0
 *
 */

package estudos.interfaces.awt;

import java.awt.Frame;


public class EstudoAwt extends Frame{

    public static void showFrame(){
        EstudoAwt sf = new EstudoAwt();
        sf.setSize(100, 100);
        sf.setVisible(true);
    }
}
