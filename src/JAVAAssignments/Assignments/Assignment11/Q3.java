package JAVAAssignments.Assignments.Assignment11;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Q3 extends Applet{
    Label pwd,eid;
    TextField upwd, ueid;
    Button submit;
    String msg;
    public void init()
    {
        pwd = new Label("Enter your password");
        eid = new Label("Enter your email id");
        upwd = new TextField();
        ueid = new TextField();
        submit = new Button("Submit");
        add(pwd);
        add(eid);
        add(upwd);
        add(ueid);
        add(submit);
        msg = "";
    }
    public void start()
    {
        submit.addActionListener((ActionListener) this);
    }

    public void onActionPerformed(ActionEvent e)
    {
        msg = ueid.getText()+"\n"+upwd.getText();
        repaint();
    }

    public void paint(Graphics g)
    {
        g.drawString(msg,50,50);
    }
}
/*
<applet code="Q3.class" width="300" height="300"></applet>
 */