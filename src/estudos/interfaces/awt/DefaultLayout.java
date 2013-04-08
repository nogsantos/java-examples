/**
 *
 * Descrição:Classe DefaultLayout
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

import java.awt.Color;
import java.awt.Frame;

abstract public class DefaultLayout extends Frame{

    private Frame f = new Frame();
    
    DefaultLayout(Frame f) {
        f.show();
    }
    
    public void setBackground(){
        this.f.setBackground(Color.white);
    }
    
    @Override
    public void setTitle(String titulo){
        this.f.setTitle(titulo);
    }
    
    public void setSize(){
        this.f.setSize(800, 600);
    }
}
