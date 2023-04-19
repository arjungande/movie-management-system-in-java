import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class homescreen extends JFrame
{

    public static Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
    public static int windowwidth = (int)size.getWidth();
    public static int windowheight = (int)size.getHeight();

    JButton home;
    JButton catogories;
    JButton theaters;

    JButton timer;

    JButton close;

    JLabel bg;

    static int hc=-1;
    static int cc=0;
    static int thc=0;
    static int tic=0;


    homescreen()
    {
        setLayout(null);
        setSize(windowwidth/2,40);
        setLocation(windowwidth/2-windowwidth/4,windowheight-50);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        ImageIcon img1 = new ImageIcon("F:\\JAVA\\javaos\\images\\home new1.png");



        home=new JButton("Home",img1);
        home.setBounds(2,1,140,38);
        home.setFont(new Font("digital-7",Font.PLAIN,20));
        home.setForeground(new Color(0x42FF81));
        home.setContentAreaFilled(false);
        home.setOpaque(false);
        home.setBorderPainted(false);
        home.setFocusPainted(false);
        add(home);

        home.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                home.setContentAreaFilled(true);
                home.setBackground(new Color(0x414141));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                if(hc%2!=0)
                {
                    home.setContentAreaFilled(false);
                }

            }

        });

        home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new home(1);
            }
        });


        catogories=new JButton("Genre",img1);
        catogories.setBounds(144,1,140,38);
        catogories.setFont(new Font("digital-7",Font.PLAIN,20));
        catogories.setForeground(new Color(0x42FF81));
        catogories.setContentAreaFilled(false);
        catogories.setOpaque(false);
        catogories.setBorderPainted(false);
        catogories.setFocusPainted(false);
        add(catogories);

        catogories.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                catogories.setContentAreaFilled(true);
                catogories.setBackground(new Color(0x414141));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                if(cc==0)
                catogories.setContentAreaFilled(false);
            }
        });
        catogories.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new genre();
            }
        });

        theaters=new JButton("Theatres",img1);
        theaters.setBounds(286,1,140,38);
        theaters.setFont(new Font("digital-7",Font.PLAIN,20));
        theaters.setForeground(new Color(0x42FF81));
        theaters.setContentAreaFilled(false);
        theaters.setOpaque(false);
        theaters.setBorderPainted(false);
        theaters.setFocusPainted(false);
        add(theaters);
        theaters.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                theaters.setContentAreaFilled(true);
                theaters.setBackground(new Color(0x414141));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                if(thc==0)
                theaters.setContentAreaFilled(false);
            }
        });
        theaters.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new theatres();
            }
        });


        timer=new JButton("Timer",img1);
        timer.setBounds(428,1,140,38);
        timer.setFont(new Font("digital-7",Font.PLAIN,20));
        timer.setForeground(new Color(0x42FF81));
        timer.setContentAreaFilled(false);
        timer.setOpaque(false);
        timer.setBorderPainted(false);
        timer.setFocusPainted(false);
        add(timer);
        timer.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                timer.setContentAreaFilled(true);
                timer.setBackground(new Color(0x414141));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                if(tic==0)
                timer.setContentAreaFilled(false);
            }
        });
        timer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new timer();
            }
        });



        close=new JButton("close",img1);
        close.setBounds(570,1,196,38);
        close.setFont(new Font("digital-7",Font.PLAIN,20));
        close.setForeground(new Color(0x42FF81));
        close.setContentAreaFilled(false);
        close.setOpaque(false);
        close.setBorderPainted(false);
        close.setFocusPainted(false);
        add(close);
        close.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                close.setContentAreaFilled(true);
                close.setBackground(new Color(0x414141));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                close.setContentAreaFilled(false);
            }
        });
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });



        bg=new JLabel("");
        bg.setBounds(0,0,windowwidth/2,40);
        bg.setBackground(new Color(0x000000));
        bg.setOpaque(true);
        add(bg);


        setVisible(true);
        new background();
    }


    JFrame fhome;

    JLabel[] l =new JLabel[7];
    public void home(int n)
    {
        fhome=new JFrame();

        fhome.setLayout(null);
        fhome.setSize(windowwidth-50,windowheight-65);
        fhome.setLocation(35,10);
//        fhome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fhome.setUndecorated(true);


        ImageIcon closeicon=new ImageIcon("F:\\JAVA\\javaos\\images\\newclose1.png");
        JButton close=new JButton(closeicon);
        close.setBounds(windowwidth-85,5,29,29);
        fhome.add(close);
        close.setBorderPainted(false);
        close.setContentAreaFilled(false);
        close.addActionListener(event->{
            fhome.dispose();
        });


        l[1]=new JLabel("");
        l[1].setBounds(100,100,800,30);
        l[1].setFont(new Font("digital-7",Font.PLAIN,20));
        l[1].setForeground(new Color(0x42FF81));
        fhome.add(l[1]);

        l[2]=new JLabel("");
        l[2].setBounds(100,140,800,30);
        l[2].setFont(new Font("digital-7",Font.PLAIN,20));
        l[2].setForeground(new Color(0x42FF81));
        fhome.add(l[2]);



        l[3]=new JLabel("");
        l[3].setBounds(100,180,100,30);
        l[3].setFont(new Font("digital-7",Font.PLAIN,20));
        l[3].setForeground(new Color(0x42FF81));
        fhome.add(l[3]);


        l[4]=new JLabel("");
        l[4].setBounds(200,180,800,30);
        l[4].setFont(new Font("digital-7",Font.PLAIN,20));
        l[4].setForeground(new Color(0x42FF81));
        fhome.add(l[4]);



        l[5]=new JLabel("");
        l[5].setBounds(200,220,800,30);
        l[5].setFont(new Font("digital-7",Font.PLAIN,20));
        l[5].setForeground(new Color(0x42FF81));
        fhome.add(l[5]);




        l[6] =new JLabel("");
        l[6].setBounds(200,260,800,30);
        l[6].setFont(new Font("digital-7",Font.PLAIN,20));
        l[6].setForeground(new Color(0x42FF81));
        fhome.add(l[6]);





        JLabel bg=new JLabel("");
        bg.setBounds(0,0,windowwidth-50,windowheight-65);
        bg.setBackground(new Color(0x000));
        bg.setOpaque(true);
        fhome.add(bg);

        fhome.setVisible(true);

        fhome.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

                animation();
            }

            @Override
            public void windowClosing(WindowEvent e) {

            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });





    }

    void animation()
    {
        letterbyletter("Hello! Guys.....", 1);
        letterbyletter("Our project : Movie Management System.", 2);
        letterbyletter("Teammates : ", 3);
        letterbyletter("Hari ( 12112271 )", 4);
        letterbyletter("Arjun ( 12115124 )", 5);
        letterbyletter("Aravind ( 12111793 )", 6);
    }



    void letterbyletter (String s,int j)
    {
        String s1 = "";
        char[] c = s.toCharArray();
        int i = 0;
        while (s1.length() < s.length()) {
            s1 += c[i];
            i++;
            l[j].setText(s1);
//            try {
//                Thread.sleep(30);
//            } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//            }
        }

    }


//    public static void main(String[] args) {
//
//        new homescreen();
//    }

}
