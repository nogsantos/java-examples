/**
 *
 * Descrição:Classe EstudoThread
 *
 *
 * @author Fabricio Nogueira
 *
 * @since 05-Apr-2013
 *
 * @version 1.0.0
 *
 */
package estudos.thread;

import estudos.EstudoRunTime;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class EstudoThread extends JFrame{

    JLabel label;

    public EstudoThread(String title) {
        super(title);
        label = new JLabel("Start count!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(label);
        this.setSize(300, 300);
        this.setVisible(true);
    }

    @SuppressWarnings("SleepWhileInLoop")
    private void startCount() {
        try {
            for (int i = 10; i > 0; i--) {
                Thread.sleep(1000);
                label.setText(i + "");
            }
            label.setText("Bomba!!!");
            acao();
        } catch (InterruptedException ie) {
            JOptionPane.showMessageDialog(this, ie.getMessage(), "Erro", 1);
        }
        label.setText(Thread.currentThread().toString());
    }
    private void acao(){
        try {
            EstudoRunTime.exemploRunTime();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", 1);
        }
    }
    public static void main(String args[]) {
        new EstudoThread("Count down GUI").startCount();
    }
}
