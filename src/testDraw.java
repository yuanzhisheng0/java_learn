import javax.swing.*;
import java.awt.*;

public class testDraw extends JFrame{
    public static void main(String[] args) {
        new testDraw();
    }
    private MyPanel mp = null;
    public testDraw(){
        mp = new MyPanel();

        this.add(mp);
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
class MyPanel extends JPanel{
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(10,10,100,100);
    }
}
