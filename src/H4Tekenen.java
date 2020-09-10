
    import java.awt.*;
import java.applet.*;

    public class H4Tekenen extends Applet {

        public void init() {
        }

        public void paint(Graphics g) {
            setBackground(Color.white);
            g.setColor(Color.black);
            g.drawLine(160, 230, 210, 170);
            g.drawLine(210, 170, 260, 230 );
            g.drawLine(260, 230, 160, 230);
        }
    }
