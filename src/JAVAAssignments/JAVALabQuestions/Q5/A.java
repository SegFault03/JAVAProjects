package JAVAAssignments.JAVALabQuestions.Q5;

import java.applet.*;
import java.awt.*;
public class A extends Applet{
    public void init()
    {
        repaint();
    }

    public void start()
    {

    }

    public void stop()
    {

    }

    public void destroy()
    {

    }
    public void paint(Graphics g)
    {
        g.drawRect(30,30,10,40);        //Rectangle
        g.drawRect(30,10,10,10);        //Square
    }
}
