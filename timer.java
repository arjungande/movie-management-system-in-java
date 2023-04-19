import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;



public class timer extends JFrame{
    public static Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
    public static int windowwidth = (int)size.getWidth();
    public static int windowheight = (int)size.getHeight();
    public static Calendar calendar;
    public static SimpleDateFormat timeformat;
    public static SimpleDateFormat apformat;
    public static SimpleDateFormat dayformat;
    public static SimpleDateFormat secformat;

    public static JLabel timelabel;
    public static JLabel aplabel;
    public static JLabel daylabel;

    public static String time;
    public static String ap;
    public static String day;
    public static String sec;


    JProgressBar jp;

    JButton bell;

    JFrame f;
    int clkcount=0;
    timer()
    {
        setLayout(null);
        setSize(windowwidth-50,windowheight-65);
        setLocation(35,10);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);


        ImageIcon closeicon=new ImageIcon("F:\\JAVA\\javaos\\images\\newclose1.png");
        JButton close=new JButton(closeicon);
        close.setBounds(windowwidth-85,5,29,29);
        add(close);
        close.setBorderPainted(false);
        close.setContentAreaFilled(false);
        close.addActionListener(event->{
            this.dispose();
//            System.exit(0);
        });


        timeformat = new SimpleDateFormat("hh:mm:s");
        timelabel=new JLabel();

        secformat=new SimpleDateFormat("s");


        timelabel.setBounds(windowwidth/2-windowwidth/10,windowheight/8,400,130);
        timelabel.setFont(new Font("digital-7",Font.PLAIN,80));
        timelabel.setForeground(new Color(0x00FF5E));
        add(timelabel);

        apformat = new SimpleDateFormat("a");
        aplabel=new JLabel();

        aplabel.setBounds(windowwidth/2-windowwidth/10-50,windowheight/8+69,100,40);
        aplabel.setFont(new Font("digital-7",Font.BOLD,30));
        aplabel.setForeground(new Color(0x00FF5E));
        add(aplabel);

        dayformat = new SimpleDateFormat("E,d");
        daylabel=new JLabel();

        daylabel.setBounds(windowwidth/2-windowwidth/15,windowheight/8+100,100,40);
        daylabel.setFont(new Font("digital-7",Font.ITALIC,20));
        daylabel.setForeground(new Color(0x00FF5E));
        add(daylabel);

        jp=new JProgressBar(0,1200);
        jp.setBounds(windowwidth/2-200,windowheight/8+150,250,7);
        jp.setValue(300);
        jp.setBorderPainted(false);
        jp.setForeground(new Color(0x00FF5E));
        jp.setOpaque(false);
        add(jp);

        JButton start=new JButton("Start");
        start.setBounds(windowwidth/2-20,windowheight/2-80,100,44);
        start.setOpaque(false);
        start.setForeground(new Color(0x00FF5E));
//        start.setContentAreaFilled(false);
        start.setBorderPainted(false);
        start.setFocusPainted(false);
//        add(start);
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settime();
            }
        });

        ImageIcon img2=new ImageIcon("F:\\JAVA\\javaos\\images\\bellnew.png");

        bell=new JButton(img2);
        bell.setBounds(windowwidth/2-100,windowheight/2-80,44,44);
        bell.setOpaque(false);
        bell.setContentAreaFilled(false);
        bell.setBorderPainted(false);
        bell.setFocusPainted(false);
        add(bell);

        bell.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseClicked(e);
                bell.setContentAreaFilled(true);
                bell.setBackground(new Color(0x494949));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                bell.setContentAreaFilled(false);
            }
        });

        bell.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                f=new JFrame();
                f.setSize(500,400);
                f.setLocation(windowwidth/2-250,windowheight/2-200);
                f.setResizable(false);

                int y=10;

                JPanel jp=new JPanel();
                jp.setBounds(0,0,500,400);
                jp.setBackground(new Color(0x000));


                Label tl2=new Label("Avengers:infity war ");
                tl2.setBounds(2,y,400,40);
                tl2.setFont(new Font("digital-7",Font.ITALIC,18));
                tl2.setForeground(new Color(0x00FF5E));
                tl2.setBackground(new Color(0x626262));

//                f.add(tl2);

                JButton jb1=new JButton(img2);
                jb1.setBounds(410,y,60,40);
                jb1.setBackground(new Color(0x000000));
                jb1.setBorderPainted(false);
                jb1.setFocusPainted(false);
                jb1.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        super.mouseEntered(e);
                        jb1.setBackground(new Color(0x626262));
                        tl2.setText("set timer for Avengers:infity war ");

                    }
                    public void mouseExited(MouseEvent e) {
                        super.mouseEntered(e);
                        jb1.setBackground(new Color(0x000000));
                        tl2.setText("Avengers:infity war ");
                    }
                });


                y+=50;

                Label tl3 =new Label("Avengers:end game ");
                tl3.setBounds(2,y,400,40);
                tl3.setFont(new Font("digital-7",Font.ITALIC,18));
                tl3.setForeground(new Color(0x00FF5E));
                tl3.setBackground(new Color(0x626262));
//                f.add(tl3);


                JButton jb2 =new JButton(img2);
                jb2.setBounds(410,y,60,40);
                jb2.setBackground(new Color(0x000000));
                jb2.setBorderPainted(false);
                jb2.setFocusPainted(false);

                jb2.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        super.mouseEntered(e);
                        jb2.setBackground(new Color(0x626262));
                        tl3.setText("set timer for Avengers:end game ");

                    }
                    public void mouseExited(MouseEvent e) {
                        super.mouseEntered(e);
                        jb2.setBackground(new Color(0x000000));
                        tl3.setText("Avengers:end game ");
                    }
                });

                y+=50;

                Label tl4 =new Label("overflow ");
                tl4.setBounds(2,y,400,40);
                tl4.setFont(new Font("digital-7",Font.ITALIC,18));
                tl4.setForeground(new Color(0x00FF5E));
                tl4.setBackground(new Color(0x626262));
//                f.add(tl4);
                JButton jb3 =new JButton(img2);
                jb3.setBounds(410,y,60,40);
                jb3.setBackground(new Color(0x000000));
                jb3.setBorderPainted(false);
                jb3.setFocusPainted(false);

                jb3.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        super.mouseEntered(e);
                        jb3.setBackground(new Color(0x626262));
                        tl4.setText("set timer for overflow ");

                    }
                    public void mouseExited(MouseEvent e) {
                        super.mouseEntered(e);
                        jb3.setBackground(new Color(0x000000));
                        tl4.setText("overflow ");
                    }
                });

                y+=50;

                Label tl5 =new Label("suzume no tojimori ");
                tl5.setBounds(2,y,400,40);
                tl5.setFont(new Font("digital-7",Font.ITALIC,18));
                tl5.setForeground(new Color(0x00FF5E));
                tl5.setBackground(new Color(0x626262));
//                f.add(tl5);
                JButton jb4 =new JButton(img2);
                jb4.setBounds(410,y,60,40);
                jb4.setBackground(new Color(0x000000));
                jb4.setBorderPainted(false);
                jb4.setFocusPainted(false);

                jb4.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        super.mouseEntered(e);
                        jb4.setBackground(new Color(0x626262));
                        tl5.setText("set timer for suzume no tojimori ");

                    }
                    public void mouseExited(MouseEvent e) {
                        super.mouseEntered(e);
                        jb4.setBackground(new Color(0x000000));
                        tl5.setText("suzume no tojimori ");
                    }
                });

                y+=50;

                Label tl6 =new Label("Demon slayer swordsmith village arc ");
                tl6.setBounds(2,y,400,40);
                tl6.setFont(new Font("digital-7",Font.ITALIC,18));
                tl6.setForeground(new Color(0x00FF5E));
                tl6.setBackground(new Color(0x626262));
//                f.add(tl6);
                JButton jb5 =new JButton(img2);
                jb5.setBounds(410,y,60,40);
                jb5.setBackground(new Color(0x000000));
                jb5.setBorderPainted(false);
                jb5.setFocusPainted(false);

                jb5.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        super.mouseEntered(e);
                        jb5.setBackground(new Color(0x626262));
                        tl6.setText("set timer for Demon slayer swordsmith village arc ");

                    }
                    public void mouseExited(MouseEvent e) {
                        super.mouseEntered(e);
                        jb5.setBackground(new Color(0x000000));
                        tl6.setText("Demon slayer swordsmith village arc ");
                    }
                });

                y+=50;

                Label tl7 =new Label("Tokyo revengers christmas eve ");
                tl7.setBounds(2,y,400,40);
                tl7.setFont(new Font("digital-7",Font.ITALIC,18));
                tl7.setForeground(new Color(0x00FF5E));
                tl7.setBackground(new Color(0x626262));
//                f.add(tl7);
                JButton jb6 =new JButton(img2);
                jb6.setBounds(410,y,60,40);
                jb6.setBackground(new Color(0x000000));
                jb6.setBorderPainted(false);
                jb6.setFocusPainted(false);

                jb6.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        super.mouseEntered(e);
                        jb6.setBackground(new Color(0x626262));
                        tl7.setText("set timer for Tokyo revengers christmas eve ");

                    }
                    public void mouseExited(MouseEvent e) {
                        super.mouseEntered(e);
                        jb6.setBackground(new Color(0x000000));
                        tl7.setText("Tokyo revengers christmas eve ");
                    }
                });

                y+=50;

                Label tl8 =new Label("classroom of elite season 2 ");
                tl8.setBounds(2,y,400,40);
                tl8.setFont(new Font("digital-7",Font.ITALIC,18));
                tl8.setForeground(new Color(0x00FF5E));
                tl8.setBackground(new Color(0x626262));
//                f.add(tl8);
                JButton jb7 =new JButton(img2);
                jb7.setBounds(410,y,60,40);
                jb7.setBackground(new Color(0x000000));
                jb7.setBorderPainted(false);
                jb7.setFocusPainted(false);

                jb7.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        super.mouseEntered(e);
                        jb7.setBackground(new Color(0x626262));
                        tl8.setText("set timer for classroom of elite season 2 ");

                    }
                    public void mouseExited(MouseEvent e) {
                        super.mouseEntered(e);
                        jb7.setBackground(new Color(0x000000));
                        tl8.setText("classroom of elite season 2 ");
                    }
                });

                y+=50;

                Label tl9 =new Label("misfit of demon king academia ");
                tl9.setBounds(2,y,400,40);
                tl9.setFont(new Font("digital-7",Font.ITALIC,18));
                tl9.setForeground(new Color(0x00FF5E));
                tl9.setBackground(new Color(0x626262));
//                f.add(tl9);
                JButton jb8 =new JButton(img2);
                jb8.setBounds(410,y,60,40);
                jb8.setBackground(new Color(0x000000));
                jb8.setBorderPainted(false);
                jb8.setFocusPainted(false);

                jb8.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        super.mouseEntered(e);
                        jb8.setBackground(new Color(0x626262));
                        tl9.setText("set timer for misfit of demon king academia ");

                    }
                    public void mouseExited(MouseEvent e) {
                        super.mouseEntered(e);
                        jb8.setBackground(new Color(0x000000));
                        tl9.setText("misfit of demon king academia ");
                    }
                });

                jp.setLayout(null);
                jp.add(tl2);jp.add(tl3);jp.add(tl4);jp.add(tl5);jp.add(tl6);jp.add(tl7);jp.add(tl8);
                jp.add(jb1);jp.add(jb2);jp.add(jb3);jp.add(jb4);jp.add(jb5);jp.add(jb6);jp.add(jb7);jp.add(jb8);
                f.add(jp);




                Label tl1=new Label("");
                tl1.setBounds(0,0,500,400);
                tl1.setBackground(new Color(0x000));
                f.add(tl1);






                f.setVisible(true);


            }
        });



        JLabel bg=new JLabel("");
        bg.setBounds(0,0,windowwidth-50,windowheight-65);
        bg.setBackground(new Color(0x000));
        bg.setOpaque(true);
        this.add(bg);
        setVisible(true);

        this.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                clkcount=1;
                settimedefault();

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

//        settime();



    }

    public void settimedefault()
    {
        time = timeformat.format(Calendar.getInstance().getTime());
        sec = secformat.format(Calendar.getInstance().getTime());
        timelabel.setText(time);
        day = dayformat.format(Calendar.getInstance().getTime());
        daylabel.setText(day);
        ap = apformat.format(Calendar.getInstance().getTime());
        aplabel.setText(ap);
    }

    public void settime()
    {
        if(clkcount==0) {

            while (true) {


                time = timeformat.format(Calendar.getInstance().getTime());
                sec = secformat.format(Calendar.getInstance().getTime());
                timelabel.setText(time);
                day = dayformat.format(Calendar.getInstance().getTime());
                daylabel.setText(day);
                ap = apformat.format(Calendar.getInstance().getTime());
                aplabel.setText(ap);
                int s = Integer.parseInt(sec);
                jp.setValue(20 * s);
                if (s == 59)
                    smooth();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


    public void smooth()
    {
        int i=1200;
        while(i>=0)
        {
            jp.setValue(i);
            i=i-10;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


//    public static void main(String[] args) {
//
//        new timer();
//    }
}
