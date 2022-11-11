package JAVAAssignments.Assignments.Assignment11;

    // Java program to draw polygon using
// drawPolygon(int[] x, int[] y, int numberofpoints)
// function
import java.applet.Applet;
import java.awt.*;

    public class Q5 extends Applet {

        // called when applet is started
        public void init()
        {
            // set the size of applet to 300, 300
            setSize(200, 200);
            show();
        }

        // invoked when applet is started
        public void start()
        {
        }

        // invoked when applet is closed
        public void stop()
        {
        }

        public void paint(Graphics g)
        {
            // x coordinates of vertices
            int x[] = { 1,3,-2};

            // y coordinates of vertices
            int y[] = { 5,2,1 };

            // number of vertices
            int numberofpoints = 3;

            // set the color of line drawn to blue
            g.setColor(Color.black);
            setForeground(Color.blue);
            setBackground(Color.green);
            // draw the polygon using drawPolygon function
            g.drawPolygon(x, y, numberofpoints);
        }
    }

