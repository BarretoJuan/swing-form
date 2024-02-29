package proyecto;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.*;

public class BackgroundPanel extends JPanel {
        private Image imagen;
    
        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/resources/books.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
            
        }
    }

