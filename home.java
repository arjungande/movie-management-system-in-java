import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.util.Scanner;

class home extends JFrame{

    public static Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
    public static int windowwidth = (int)size.getWidth();
    public static int windowheight = (int)size.getHeight();
    JLabel l[]=new JLabel[7];
    JButton pbg;
    JTextField i1;
    JTextField i;
    JTextField ic;

    home(int n)
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

        JLabel pu=new JLabel("username : teampro");
        pu.setBounds(windowwidth+120,windowheight/2-300,200,50);
        pu.setFont(new Font("digital-7",Font.PLAIN,20));
        pu.setForeground(new Color(0x42FF81));
        add(pu);

        JLabel pa =new JLabel("age : 18");
        pa.setBounds(windowwidth+120,windowheight/2-250,200,50);
        pa.setFont(new Font("digital-7",Font.PLAIN,20));
        pa.setForeground(new Color(0x42FF81));
        add(pa);

        JLabel pp =new JLabel("Phone number : 99******08");
        pp.setBounds(windowwidth+120,windowheight/2-200,200,50);
        pp.setFont(new Font("digital-7",Font.PLAIN,20));
        pp.setForeground(new Color(0x42FF81));
        add(pp);

        JLabel pe =new JLabel("email : teampro@gmail.com");
        pe.setBounds(windowwidth+120,windowheight/2-200,200,50);
        pe.setFont(new Font("digital-7",Font.PLAIN,20));
        pe.setForeground(new Color(0x42FF81));
        add(pe);

        JLabel pg =new JLabel("favorite genres : ");
        pg.setBounds(windowwidth+120,windowheight/2-200,200,50);
        pg.setFont(new Font("digital-7",Font.PLAIN,20));
        pg.setForeground(new Color(0x42FF81));
        add(pg);

        JLabel pg1 =new JLabel("Action,Fantasy,Adventure");
        pg1.setBounds(windowwidth+120,windowheight/2-200,200,50);
        pg1.setFont(new Font("digital-7",Font.PLAIN,20));
        pg1.setForeground(new Color(0x42FF81));
        add(pg1);

        JLabel pg2 =new JLabel("Anime,Horror.");
        pg2.setBounds(windowwidth+120,windowheight/2-200,200,50);
        pg2.setFont(new Font("digital-7",Font.PLAIN,20));
        pg2.setForeground(new Color(0x42FF81));
        add(pg2);

        JLabel pr =new JLabel("recently watched : ");
        pr.setBounds(windowwidth+120,windowheight/2-200,200,50);
        pr.setFont(new Font("digital-7",Font.PLAIN,20));
        pr.setForeground(new Color(0x42FF81));
        add(pr);

        JLabel pr1 =new JLabel("Overflow,Avengers:end game");
        pr1.setBounds(windowwidth+120,windowheight/2-200,200,50);
        pr1.setFont(new Font("digital-7",Font.PLAIN,20));
        pr1.setForeground(new Color(0x42FF81));
        add(pr1);

        JButton lo=new JButton("log out->");
        lo.setBounds(windowwidth+120,windowheight/2-200,300,30);
        lo.setFont(new Font("digital-7",Font.PLAIN,20));
        lo.setForeground(new Color(0x42FF81));
        lo.setContentAreaFilled(false);
        lo.setOpaque(false);
        lo.setFocusPainted(false);
        lo.setBorder(new LineBorder(new Color(0x42FF81),2));
        add(lo);

        lo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pu.setBounds(windowwidth+120,windowheight/2-300,200,50);
                pa.setBounds(windowwidth+120,windowheight/2-250,200,50);
                pp.setBounds(windowwidth+120,windowheight/2-200,200,50);
                pe.setBounds(windowwidth+120,windowheight/2-200,200,50);
                pg.setBounds(windowwidth+120,windowheight/2-200,200,50);
                pg1.setBounds(windowwidth+120,windowheight/2-200,200,50);
                pg2.setBounds(windowwidth+120,windowheight/2-200,200,50);
                pr.setBounds(windowwidth+120,windowheight/2-200,200,50);
                pr1.setBounds(windowwidth+120,windowheight/2-200,200,50);
                lo.setBounds(windowwidth+120,windowheight/2-200,300,30);
                pbg.setBounds(windowwidth+100,windowheight/2-350,300,700);
                i1.setText("");
                i.setText("");
                ic.setText("");
            }
        });

        pbg=new JButton("");
        pbg.setBackground(new Color(0x000));
        pbg.setBorder(new LineBorder(new Color(0x42FF81),2));
        pbg.setBounds(windowwidth+100,windowheight/2-350,300,700);
        pbg.setFocusPainted(false);
        pbg.setEnabled(false);
        add(pbg);



        JLabel h1=new JLabel("username :");
        h1.setBounds(windowwidth+100,windowheight/2-150,200,30);
        h1.setFont(new Font("digital-7",Font.PLAIN,20));
        h1.setForeground(new Color(0x42FF81));
        add(h1);

        i1=new JTextField();
        i1.setBounds(windowwidth+100,windowheight/2-115,300,30);
        i1.setFont(new Font("digital-7",Font.PLAIN,20));
        i1.setForeground(new Color(0x42FF81));
        i1.setOpaque(false);
        i1.setBorder(new LineBorder(new Color(0x42FF81),2));
        add(i1);

        JLabel h=new JLabel("password :");
        h.setBounds(windowwidth+100,windowheight/2-50,200,30);
        h.setFont(new Font("digital-7",Font.PLAIN,20));
        h.setForeground(new Color(0x42FF81));
        add(h);

        JLabel hc=new JLabel("confirm password :");
        hc.setBounds(windowwidth+100,windowheight/2-50,200,30);
        hc.setFont(new Font("digital-7",Font.PLAIN,20));
        hc.setForeground(new Color(0x42FF81));
        add(hc);

        i=new JPasswordField();
        ((JPasswordField) i).setEchoChar('*');
        i.setBounds(windowwidth+100,windowheight/2-15,300,30);
        i.setFont(new Font("digital-7",Font.PLAIN,20));
        i.setForeground(new Color(0x42FF81));
        i.setOpaque(false);
        i.setBorder(new LineBorder(new Color(0x42FF81),2));
        add(i);

        ic=new JPasswordField();
        ((JPasswordField) ic).setEchoChar('*');
        ic.setBounds(windowwidth+100,windowheight/2-15,300,30);
        ic.setFont(new Font("digital-7",Font.PLAIN,20));
        ic.setForeground(new Color(0x42FF81));
        ic.setOpaque(false);
        ic.setBorder(new LineBorder(new Color(0x42FF81),2));
        add(ic);

        JButton b1c=new JButton("signup->");
        b1c.setBounds(windowwidth+100,windowheight/2+50,300,30);
        b1c.setFont(new Font("digital-7",Font.PLAIN,20));
        b1c.setForeground(new Color(0x42FF81));
        b1c.setContentAreaFilled(false);
        b1c.setOpaque(false);
        b1c.setFocusPainted(false);
        b1c.setBorder(new LineBorder(new Color(0x42FF81),2));
        add(b1c);
        b1c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1=i.getText();
                String s2=ic.getText();
                String s3=i1.getText();
                if(s1.equals("") || s2.equals("") || s3.equals("")){
                    JOptionPane.showMessageDialog(null,"please fill all fields");
                }
                else if(s1.equals(s2)) {

                    String username = i1.getText();
                    String password = i.getText();
                    try {
                        FileOutputStream fout = new FileOutputStream("F:\\JAVA\\javaos\\database.txt");
                        String s = "{" + username + "," + password + "} ";
                        fout.write(s.getBytes());
                        fout.close();

                    } catch (IOException E) {
                        JOptionPane.showMessageDialog(null, "an error has occured please try again.");
                    }

                }
                else
                {
                    JOptionPane.showMessageDialog(null, "passwords are not matching");
                }

                    pbg.setBounds(windowwidth / 2 + 100, windowheight / 2 - 350, 300, 700);
                    pu.setBounds(windowwidth / 2 + 120, windowheight / 2 - 300, 200, 50);
                    pa.setBounds(windowwidth / 2 + 120, windowheight / 2 - 250, 200, 50);
                    pp.setBounds(windowwidth / 2 + 120, windowheight / 2 - 200, 300, 50);
                    pe.setBounds(windowwidth / 2 + 120, windowheight / 2 - 150, 300, 50);
                    pg.setBounds(windowwidth / 2 + 120, windowheight / 2 - 100, 300, 50);
                    pg1.setBounds(windowwidth / 2 + 140, windowheight / 2 - 50, 300, 50);
                    pg2.setBounds(windowwidth / 2 + 140, windowheight / 2, 300, 50);
                    pr.setBounds(windowwidth / 2 + 120, windowheight / 2 + 50, 300, 50);
                    pr1.setBounds(windowwidth / 2 + 140, windowheight / 2 + 100, 300, 50);
                    lo.setBounds(windowwidth / 2 + 120, windowheight / 2 + 170, 250, 35);
            }

        });

        JButton b1=new JButton("ENTER->");
        b1.setBounds(windowwidth+100,windowheight/2+50,300,30);
        b1.setFont(new Font("digital-7",Font.PLAIN,20));
        b1.setForeground(new Color(0x42FF81));
        b1.setContentAreaFilled(false);
        b1.setOpaque(false);
        b1.setFocusPainted(false);
        b1.setBorder(new LineBorder(new Color(0x42FF81),2));
        add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1=i1.getText();
                String s2=i.getText();
                    File file=new File("F:\\JAVA\\javaos\\database.txt");
                    Scanner sc = null;
                    try {
                        sc = new Scanner(file);
                    } catch (FileNotFoundException ex) {
                        throw new RuntimeException(ex);
                    }

                    // we just need to use \\Z as delimiter
                    sc.useDelimiter("\\Z");
                    String info=sc.next();
                    char infonew[]=info.toCharArray();
                    int en=0,un=0;
                    int count=0;
                    for(int i=1;i<infonew.length-2;i++)
                    {
                        if(infonew[i]==',')
                        {
                            count++;
                            if(count==1)
                            {
                                un=i;
                                break;
                            }
                        }
                    }
                    String usernameentered="";
                    for(int i=en+1;i<un;i++)
                    {
                        usernameentered+=infonew[i];
                    }
                    String passwordentered="";
                    for(int i=un+1;i<infonew.length-2;i++)
                    {
                        passwordentered+=infonew[i];
                    }
                    System.out.println(usernameentered+","+passwordentered);
                    if(i1.getText().equals(usernameentered) && i.getText().equals(passwordentered))
                    {
                        pbg.setBounds(windowwidth/2+100,windowheight/2-350,300,700);
                        pu.setBounds(windowwidth/2+120,windowheight/2-300,200,50);
                        pa.setBounds(windowwidth/2+120,windowheight/2-250,200,50);
                        pp.setBounds(windowwidth/2+120,windowheight/2-200,300,50);
                        pe.setBounds(windowwidth/2+120,windowheight/2-150,300,50);
                        pg.setBounds(windowwidth/2+120,windowheight/2-100,300,50);
                        pg1.setBounds(windowwidth/2+140,windowheight/2-50,300,50);
                        pg2.setBounds(windowwidth/2+140,windowheight/2,300,50);
                        pr.setBounds(windowwidth/2+120,windowheight/2+50,300,50);
                        pr1.setBounds(windowwidth/2+140,windowheight/2+100,300,50);
                        lo.setBounds(windowwidth/2+120,windowheight/2+170,250,35);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"wrong username or password");
                    }

            }
        });

        JButton b=new JButton("login");
        b.setBounds(100,350,400,30);
        b.setFont(new Font("digital-7",Font.PLAIN,20));
        b.setForeground(new Color(0x42FF81));
        b.setContentAreaFilled(false);
        b.setOpaque(false);
        b.setFocusPainted(false);
        b.setBorder(new LineBorder(new Color(0x42FF81),2));
        add(b);
        b.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                b.setForeground(new Color(0xFF4242));
                b.setBorder(new LineBorder(new Color(0xFF4242),2));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                b.setForeground(new Color(0x42FF81));
                b.setBorder(new LineBorder(new Color(0x42FF81),2));
            }
        });
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hc.setBounds(windowwidth+100,windowheight/2-50,200,30);
                ic.setBounds(windowwidth+100,windowheight/2-15,300,30);
                b1c.setBounds(windowwidth+100,windowheight/2+50,300,30);

                h1.setBounds(windowwidth/2+100,windowheight/2-150-50,200,30);
                i1.setBounds(windowwidth/2+100,windowheight/2-115-50,300,30);
                h.setBounds(windowwidth/2+100,windowheight/2-50-50,200,30);
                i.setBounds(windowwidth/2+100,windowheight/2-15-50,300,30);
                b1.setBounds(windowwidth/2+100,windowheight/2+50-50,300,30);
            }
        });



        JButton su=new JButton("signup");
        su.setBounds(100,400,400,30);
        su.setFont(new Font("digital-7",Font.PLAIN,20));
        su.setForeground(new Color(0x42FF81));
        su.setContentAreaFilled(false);
        su.setOpaque(false);
        su.setFocusPainted(false);
        su.setBorder(new LineBorder(new Color(0x42FF81),2));
        add(su);
        su.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                su.setForeground(new Color(0xFF4242));
                su.setBorder(new LineBorder(new Color(0xFF4242),2));

            }

            @Override
            public void mouseExited(MouseEvent e) {
                su.setForeground(new Color(0x42FF81));
                su.setBorder(new LineBorder(new Color(0x42FF81),2));
            }
        });
        su.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b1.setBounds(windowwidth+100,windowheight/2+50,300,30);


                h1.setBounds(windowwidth/2+100,windowheight/2-150-50,200,30);
                i1.setBounds(windowwidth/2+100,windowheight/2-115-50,300,30);
                h.setBounds(windowwidth/2+100,windowheight/2-50-50,200,30);
                i.setBounds(windowwidth/2+100,windowheight/2-15-50,300,30);
                hc.setBounds(windowwidth/2+100,windowheight/2+50-50,200,30);
                ic.setBounds(windowwidth/2+100,windowheight/2+85-50,300,30);

                b1c.setBounds(windowwidth/2+100,windowheight/2+150-50,300,30);
            }
        });


        l[1]=new JLabel("Hello! Guys.....");
        l[1].setBounds(100,100,400,30);
        l[1].setFont(new Font("digital-7",Font.PLAIN,20));
        l[1].setForeground(new Color(0x42FF81));
        this.add(l[1]);

        l[2]=new JLabel("Our project : Movie Management System.");
        l[2].setBounds(100,140,400,30);
        l[2].setFont(new Font("digital-7",Font.PLAIN,20));
        l[2].setForeground(new Color(0x42FF81));
        this.add(l[2]);



        l[3]=new JLabel("Teammates : ");
        l[3].setBounds(100,180,100,30);
        l[3].setFont(new Font("digital-7",Font.PLAIN,20));
        l[3].setForeground(new Color(0x42FF81));
        this.add(l[3]);


        l[4]=new JLabel("Hari ( 12112271 )");
        l[4].setBounds(200,180,400,30);
        l[4].setFont(new Font("digital-7",Font.PLAIN,20));
        l[4].setForeground(new Color(0x42FF81));
        this.add(l[4]);



        l[5]=new JLabel("Arjun ( 12115124 )");
        l[5].setBounds(200,220,400,30);
        l[5].setFont(new Font("digital-7",Font.PLAIN,20));
        l[5].setForeground(new Color(0x42FF81));
        this.add(l[5]);




        l[6] =new JLabel("Aravind ( 12111793 )");
        l[6].setBounds(200,260,400,30);
        l[6].setFont(new Font("digital-7",Font.PLAIN,20));
        l[6].setForeground(new Color(0x42FF81));
        this.add(l[6]);







        JLabel bg=new JLabel("");
        bg.setBounds(0,0,windowwidth-50,windowheight-65);
        bg.setBackground(new Color(0x000));
        bg.setOpaque(true);
        this.add(bg);

        setVisible(true);

//        animation();

    }

    void animation()
    {
        letterbyletter("Hello! Guys.....", 1);
        letterbyletter("Our project : Movie Management System.", 2);
        letterbyletter("Teammates : ", 3);
        letterbyletter("Hari ( 12112271 )", 4);
        letterbyletter("Hari ( 12112271 )", 5);
        letterbyletter("Aravind ( 12111793 )", 6);
    }



        void letterbyletter (String s,int j)
        {

//        JLabel l7 =new JLabel("");
//        l7.setBounds(200,260,800,30);
//        l7.setFont(new Font("digital-7",Font.PLAIN,20));
//        l7.setForeground(new Color(0x42FF81));
//        add(l7);
            String s1 = "";
            char c[] = s.toCharArray();
            int i = 0;
            while (s1.length() < s.length()) {
                s1 += c[i];
                i++;
                l[j].setText(s1);
//                try {
//                    Thread.sleep(30);
//                } catch (InterruptedException e) {
////                    throw new RuntimeException(e);
//                }
            }

        }


    //elements used in this project :
    //

//    public static void main(String[] args) {
//        new home(1);
//    }

}



