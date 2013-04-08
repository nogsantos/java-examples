/**
 *
 * Descrição:Classe EstudoSwing
 *
 *
 * @author Fabricio Nogueira
 *
 * @since 05-Apr-2013
 *
 * @version 1.0.0
 *
 */

package estudos.interfaces.swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class EstudoSwing extends JFrame {

    private JTextField tf;
    private JButton bt1;
    private JButton bt2;

    public EstudoSwing(String title) {
        super(title);
        this.tf = new JTextField();
        this.bt1 = new JButton("Clicked");
        this.bt2 = new JButton("Fechar");
        
        add(this.tf, BorderLayout.SOUTH);
        add(this.bt1, BorderLayout.NORTH);
        add(this.bt2, BorderLayout.BEFORE_LINE_BEGINS);
        
        this.bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showMensagem();
            }
        });
        this.bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fechar();
            }
        });
        setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    private void showMensagem(){
        JOptionPane.showMessageDialog(this, "teste", "teste", WIDTH);
    }
    private void fechar(){
        System.exit(0);
    }

            

    public static void main(String[] args) {
        new EstudoSwing("Action Demo");
    }

}
