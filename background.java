import javax.swing.*;
import java.awt.*;

public class background extends JFrame {
    public static Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
    public static int windowwidth = (int)size.getWidth();
    public static int windowheight = (int)size.getHeight();
    background()
    {
        setLayout(null);
        setSize(windowwidth-50,windowheight-65);
        setLocation(35,10);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);

        Label l=new Label("please close every window before u click on new menu, otherwise the windows will stack on each other.(you cannot close this window)");
        l.setBounds(windowwidth/2-500,windowheight/2-200,1000,40);
        l.setForeground(new Color(0x575757));
        l.setFont(new Font("Arial",Font.PLAIN,14));
        l.setBackground(new Color(0x000));
        add(l);

        JLabel bg=new JLabel("");
        bg.setBounds(0,0,windowwidth-50,windowheight-65);
        bg.setBackground(new Color(0x000));
        bg.setOpaque(true);
        add(bg);
        setVisible(true);
    }
}
