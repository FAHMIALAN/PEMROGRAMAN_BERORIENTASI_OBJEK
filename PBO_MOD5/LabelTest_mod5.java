
import java.awt.*;
import javax.swing.*;

public class LabelTest_mod5 extends JFrame {

    private JLabel label;

    public LabelTest_mod5() {
        super("Mencoba JLabel");
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        label = new JLabel("Label dengan text");
        label.setToolTipText("Ini adalah label1");
        label.setForeground(Color.BLUE);
        container.add(label);
        setSize(500, 400);
        setVisible(true);
    }

    public static void main(String args[]) {
        LabelTest_mod5 aplikasi = new LabelTest_mod5();
        aplikasi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
