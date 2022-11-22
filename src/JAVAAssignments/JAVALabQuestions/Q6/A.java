package JAVAAssignments.JAVALabQuestions.Q6;

import java.applet.*;
import java.awt.*;
public class A extends Applet{
    public void init()
    {

    }
    public void paint(Graphics g)
    {
        g.drawOval(80,70,150,150);      //Outer boundary
        g.setColor(Color.black);
        //The eyes
        g.fillOval(120,120,15,15);
        g.fillOval(170,120,15,15);
        g.drawArc(130,180,50,20,180,180);   //Smile
    }
}
