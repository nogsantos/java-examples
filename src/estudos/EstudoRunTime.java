/**
 *
 * Descrição:Classe EstudoRunTime
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

public class EstudoRunTime {

    public static void exemploRunTime() throws IOException {
        Runtime rt = Runtime.getRuntime();
        Process proc;
        try {
            proc = rt.exec("gedit");
//            proc.waitFor();
        } catch (Exception e) {
            System.out.println("regedit is an unknown command.");
        }finally{
            Menu.menuPrincipal();
        }
    }
}
