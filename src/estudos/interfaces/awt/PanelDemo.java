/**
 *
 * Descrição:Classe PanelDemo
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

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.TextField;

public class PanelDemo extends DefaultLayout{

    
    public PanelDemo(Frame f) {
        super(f);
    }

    public Frame controles() {
        
        Frame fwc = new Frame();
        fwc.setLayout(new FlowLayout());
        
        fwc.add(new Button("Test Me!"));
        fwc.add(new Label("Labe"));
        fwc.add(new TextField());
        
        CheckboxGroup cbg = new CheckboxGroup();
        fwc.add(new Checkbox("chk1", cbg, true));
        fwc.add(new Checkbox("chk2", cbg, false));
        fwc.add(new Checkbox("chk3", cbg, false));
        
        List list = new List(3, false);
        for (int i = 0; i < 10; i++) {
            list.add("Pos" + i);
        }
        fwc.add(list);
        
        Choice chooser = new Choice();
        chooser.add("Avril");
        chooser.add("Monica");
        chooser.add("Britney");
        fwc.add(chooser);
        
        fwc.add(new Scrollbar());
        
        TextArea txt = new TextArea();
        txt.append("Grande texto;;;");
        fwc.add(txt);
        
        fwc.setVisible(true);
        
        return fwc;
    }
}
