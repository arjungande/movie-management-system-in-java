import javax.swing.*;
import java.awt.*;

public class theatres extends JFrame {
    public static Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
    public static int windowwidth = (int)size.getWidth();
    public static int windowheight = (int)size.getHeight();
    theatres()
    {
        setLayout(null);
        setSize(windowwidth-50,windowheight-65);
        setLocation(35,10);
        setUndecorated(true);
        ImageIcon closeicon=new ImageIcon("F:\\JAVA\\javaos\\images\\newclose1.png");
        JButton close=new JButton(closeicon);
        close.setBounds(windowwidth-85,5,29,29);
        add(close);
        close.setBorderPainted(false);
        close.setContentAreaFilled(false);
        close.addActionListener(event->{
            this.dispose();
        });
        ImageIcon pvr=new ImageIcon("F:\\JAVA\\javaos\\images\\pvrtag.png");
        ImageIcon melody=new ImageIcon("F:\\JAVA\\javaos\\images\\melodytag.png");
        ImageIcon inox=new ImageIcon("F:\\JAVA\\javaos\\images\\inoxtag.png");
        ImageIcon nexus=new ImageIcon("F:\\JAVA\\javaos\\images\\nexustag.png");

        JButton b1=new JButton(pvr);
        b1.setBounds(10,10,700,370);
        add(b1);

        JButton b2=new JButton(melody);
        b2.setBounds(730,10,700,370);
        add(b2);

        JButton b3=new JButton(inox);
        b3.setBounds(10,410,700,370);
        add(b3);

        JButton b4 =new JButton(nexus);
        b4.setBounds(730,410,700,370);
        add(b4);


        JLabel bg=new JLabel("");
        bg.setBounds(0,0,windowwidth-50,windowheight-65);
        bg.setBackground(new Color(0x000));
        bg.setOpaque(true);
        add(bg);
        setVisible(true);
    }

//    public static void main(String[] args) {
//        new theatres();
//    }
}
