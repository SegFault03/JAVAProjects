package JAVAAssignments.Assignments.Assignment11;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Q4 extends Applet{
    Choice win, brow;
    Button btn;
    String wc,bc;
    public void init()
    {
        win = new Choice();
        win.add("Choice 1");
        win.add("Choice 2");
        win.add("Choice 3");
        brow = new Choice();
        brow.add("Choice 1");
        brow.add("Choice 2");
        brow.add("Choice 3");
        btn = new Button("Submit");
        btn.addActionListener((ActionListener) this);
        win.addItemListener((ItemListener) this);
        brow.addItemListener((ItemListener) this);
        add(btn);
        add(win);
        add(brow);
        wc="";
        bc="";
    }

    public void onActionPerformed(ActionEvent e)
    {
        if(wc.length()!=0 && bc.length()!=0)
            repaint();
    }
    public void itemStateChanged(ItemEvent e)
    {
        if(e.getSource()==win)
            wc = win.getSelectedItem();
        else
            bc = brow.getSelectedItem();
    }

    public void paint(Graphics g)
    {
        g.drawString(wc+"\n"+bc,50,50);
    }
}
