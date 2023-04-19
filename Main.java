import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.plaf.metal.MetalButtonUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {
    public static void main(String[] args)
    {
        lockscreen instance=new lockscreen();
        instance.setResizable(false);
    }
}

class lockscreen extends JFrame
{
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


    public static JProgressBar bar ;
    static int n;

    lockscreen()
    {


        System.out.println(windowwidth+","+windowheight);
        setLayout(null);
        setSize(windowwidth,windowheight);
        setLocation(0,0);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon closeicon=new ImageIcon("F:\\JAVA\\javaos\\images\\newclose1.png");
        JButton close=new JButton(closeicon);
        close.setBounds(windowwidth-29,0,29,29);
        add(close);
        close.setBorderPainted(false);
        close.setBackground(new Color(0x0FFFFFF, true));
        close.setUI (new MetalButtonUI() {
            protected void paintButtonPressed (Graphics g, AbstractButton b) { }
        });
        close.addActionListener(event->{
            System.exit(0);
        });




        JButton account=new JButton("Teampro");
        account.setBounds(windowwidth/2-190,windowheight/2,340,70);
        account.setBorderPainted(false);
        account.setContentAreaFilled(false);
        account.setFont(new Font("Arial",Font.PLAIN,20));
        account.setForeground(new Color(0x8C8C8C));
        account.setFocusPainted(false);
        account.setHorizontalAlignment(JButton.LEFT);
        add(account);


        account.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            account.setFont(new Font("Arial",Font.ITALIC,20));
        }

        public void mouseExited(java.awt.event.MouseEvent evt) {
            account.setFont(new Font("Arial",Font.PLAIN,20));
        }
    });

        account.addActionListener(event->{
            new password().setResizable(false);
            this.dispose();
//            new createmessage();
        });



        JLabel accountbg=new JLabel(new ImageIcon("F:\\JAVA\\javaos\\images\\cgn.png"));
        accountbg.setBounds(windowwidth/2-190,windowheight/2,340,70);
        add(accountbg);






        timeformat = new SimpleDateFormat("hh:mm:s");
        timelabel=new JLabel();


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


        ImageIcon img1 = new ImageIcon("F:\\JAVA\\bg.jpg");
        Image i1 = img1.getImage();
        Image new_img1 = i1.getScaledInstance(windowwidth,windowheight,Image.SCALE_SMOOTH);
        img1 = new ImageIcon(new_img1);




        JLabel bg=new JLabel("");
        bg.setBounds(0,0,windowwidth,windowheight);
        bg.setBackground(new Color(0x000));
        bg.setOpaque(true);
        add(bg);


        setVisible(true);
        settime();

    }



    public void settime()
    {
        while(true)
        {


            time =timeformat.format(Calendar.getInstance().getTime());
            timelabel.setText(time);
            day =dayformat.format(Calendar.getInstance().getTime());
            daylabel.setText(day);
            ap =apformat.format(Calendar.getInstance().getTime());
            aplabel.setText(ap);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}



class password extends JFrame implements MouseListener
{
    public static Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
    public static int windowwidth = (int)size.getWidth();
    public static int windowheight = (int)size.getHeight();
    static int count=0;

    JFrame f;
    JTextField user;
    JLabel username;
    JTextField p;
    JLabel password;
    JButton login;
    {
        count=0;
    }
    password()
    {

        setLayout(null);
        setSize(windowwidth,windowheight);
        int y=windowheight;
        setLocation(0,y);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);




        username=new JLabel("username");
        username.setBounds(windowwidth/2-150,windowheight/2-100,300,40);
        username.setFont(new Font("digital-7",Font.ITALIC,25));
        username.setForeground(new Color(0x009436));
        add(username);

        user=new JTextField("",15);
        user.setBounds(windowwidth/2-150,windowheight/2-100,300,40);
        user.setFont(new Font("digital-7",Font.ITALIC,25));
        user.setHorizontalAlignment(JTextField.CENTER);
        user.setBorder(new LineBorder(new Color(0x00FF5E),2));
        user.setForeground(new Color(0x009436));
        user.setOpaque(false);
        add(user);
        user.addMouseListener((MouseListener) this);


        password=new JLabel("password");
        password.setBounds(windowwidth/2-150,windowheight/2-20,300,40);
        password.setFont(new Font("digital-7",Font.ITALIC,25));
        password.setForeground(new Color(0x009436));
        add(password);

        p=new JPasswordField("",10);
        ((JPasswordField) p).setEchoChar('*');
        p.setBounds(windowwidth/2-150,windowheight/2-20,300,40);
        p.setFont(new Font("digital-7",Font.PLAIN,25));
        p.setOpaque(false);
        p.setHorizontalAlignment(JTextField.CENTER);
        p.setBorder(new LineBorder(new Color(0x00FF5E),2));
        p.setForeground(new Color(0x009436));
        this.add(p);
        p.addMouseListener((MouseListener) this);

        login=new JButton("login");
        login.setBounds(windowwidth/2-50,windowheight/2+60,100,30);
        login.setFont(new Font("digital-7",Font.PLAIN,20));
        login.setOpaque(false);
        login.setHorizontalAlignment(JButton.CENTER);
        login.setBorder(new LineBorder(new Color(0x00FF5E),2));
        login.setContentAreaFilled(false);
        login.setForeground(new Color(0x009436));
        login.setFocusPainted(false);
        this.add(login);


        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                user.setText("teampro");
//                p.setText("123");
                String name=user.getText();
                String pass=p.getText();
                if(name.equals("teampro") && pass.equals("123"))
                {
                    dispose();
                    new homescreen();
                }
                else {
                    inputmessage();
                }
            }
        });



        ImageIcon closeicon=new ImageIcon("F:\\JAVA\\javaos\\images\\newclose1.png");
        JButton close=new JButton(closeicon);
        close.setBounds(windowwidth-29,0,29,29);
        add(close);
        close.setBorderPainted(false);
        close.setBackground(new Color(0x0FFFFFF, true));
        close.setUI (new MetalButtonUI() {
            protected void paintButtonPressed (Graphics g, AbstractButton b) { }
        });
        close.addActionListener(event->{
            this.dispose();
        });

        ImageIcon img1 = new ImageIcon("F:\\JAVA\\bg.jpg");
        Image i1 = img1.getImage();
        Image new_img1 = i1.getScaledInstance(windowwidth,windowheight,Image.SCALE_SMOOTH);
        img1 = new ImageIcon(new_img1);




        JLabel bg=new JLabel("");
        bg.setBounds(0,0,windowwidth,windowheight);
        bg.setBackground(new Color(0x000));
        bg.setOpaque(true);
        add(bg);
        bg.addMouseListener((MouseListener) this);


        setVisible(true);


        move();


    }


    public void inputmessage()
    {
        JFrame f1=new JFrame();
        f1.setLocation(windowwidth/2-200,windowheight/2-100);
        f1.setSize(400,100);
        f1.setUndecorated(true);
        f1.setLayout(null);

        JLabel iup=new JLabel("wrong input or password");
        iup.setBounds(80,0,300,40);
        iup.setFont(new Font("digital-7",Font.BOLD,25));
        iup.setForeground(new Color(0x42FF81));
        f1.add(iup);

        JButton ok=new JButton("OK");
        ok.setBounds(170,60,60,30);
        ok.setFont(new Font("digital-7",Font.PLAIN,20));
        ok.setForeground(new Color(0x42FF81));
        ok.setContentAreaFilled(false);
        ok.setOpaque(false);
        ok.setFocusPainted(false);
        ok.setBorder(new LineBorder(new Color(0x42FF81),2));
        f1.add(ok);
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
            }
        });



        JLabel bg1=new JLabel("");
        bg1.setBounds(0,0,400,100);
        bg1.setBackground(new Color(0x000000));
        bg1.setOpaque(true);
        f1.add(bg1);


        f1.setVisible(true);
    }

    public void move()
    {
        int y=windowheight;
        while(y>=0)
        {
            setLocation(0,y);
            y=y-24;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }






    static int userinputloc=windowheight/2-100;
    static int userplaceholderloc=windowheight/2-100;
    static int passwordplaceholder=windowheight/2-20;


    public void mousePressed(MouseEvent e)
    {
        count++;
        String userstring = user.getText();
        String pstring = p.getText();
        if (userstring.equals("") && pstring.equals("")) {

        if(count%2!=0) {

                while (userplaceholderloc >= windowheight / 2 - 170) {
                    username.setBounds(windowwidth / 2 - 150, userplaceholderloc, 300, 40);
                    userplaceholderloc--;

                }
                while (userinputloc >= windowheight / 2 - 130) {
                    user.setBounds(windowwidth / 2 - 150, userinputloc, 300, 40);
                    userinputloc--;
                }

                while (passwordplaceholder >= windowheight / 2 - 60) {
                    password.setBounds(windowwidth / 2 - 150, passwordplaceholder, 300, 40);
                    passwordplaceholder--;
                }

            } else {

                while (userplaceholderloc <= windowheight / 2 - 100) {
                    username.setBounds(windowwidth / 2 - 150, userplaceholderloc, 300, 40);
                    userplaceholderloc++;

                }
                while (userinputloc <= windowheight / 2 - 100) {
                    user.setBounds(windowwidth / 2 - 150, userinputloc, 300, 40);
                    userinputloc++;
                }

                while (passwordplaceholder <= windowheight / 2 - 20) {
                    password.setBounds(windowwidth / 2 - 150, passwordplaceholder, 300, 40);
                    passwordplaceholder++;
                }

            }
        }

    }
    public void mouseReleased(MouseEvent e)
    {
    }

    public void  mouseClicked(MouseEvent e)
    {
    }
    public void mouseEntered(MouseEvent e)
    {
    }
    public void mouseExited(MouseEvent e)
    {
    }
}

class createmessage extends JFrame
{
    public static Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
    public static int windowwidth = (int)size.getWidth();
    public static int windowheight = (int)size.getHeight();
    createmessage()
    {
        setLocation(70,200);
        setSize(400,75);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setUndecorated(true);
        setVisible(true);
        move();
    }
    void move()
    {
        int y=windowheight;
        while(y>=75)
        {
            y-=24;
            setLocation(70,y);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
