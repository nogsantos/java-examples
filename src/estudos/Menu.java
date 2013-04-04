/**
 *
 * Descrição:Classe Menu
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
import java.util.Scanner;


public class Menu {

    public static void menuPrincipal() throws IOException{
        Scanner leitor = new Scanner(System.in);
        StringBuilder menu = new StringBuilder();
        Integer acao;
        
        menu.append("\n");
        menu.append("Selecione abaixo a opção:").append("\n");
        menu.append("1. Escrever arquivo").append("\n");
        menu.append("2. Ler arquivo").append("\n");
        menu.append("3. TreeSet").append("\n");
        menu.append("4. HashSet").append("\n");
        menu.append("5. Strings").append("\n");
        menu.append("6. Run time").append("\n");
        menu.append("7. Swing").append("\n");
        
        System.out.println(menu);
        acao = leitor.nextInt();
        defineAcao(acao);
    }
    
    private static void defineAcao(int acao) throws IOException{
        switch(acao){
            case 1:
                try {
                    Escrever.criarArquivo();
                } catch (IOException ex) {
                    System.err.println(ex.getMessage());
                }
                break;  
            case 2:
                try {
                    Ler.lerArquivo();
                } catch (IOException ex) {
                    System.err.println(ex.getMessage());
                }
                break;  
            case 3:
                EstudoTreeSet.exemploTreeSet();
                break;  
            case 4:
                EstudoHashSet.exemploHashSet();
                break;  
            case 5:
                EstudoStrings.exemploStrings();
                break;
            case 6:
                EstudoRunTime.exemploRunTime();
                break;
            case 7:
                EstudoSwing.ler();
                break;
        }
    }

}
