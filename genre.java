import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class genre extends JFrame{
    public static Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
    public static int windowwidth = (int)size.getWidth();
    public static int windowheight = (int)size.getHeight();
    JLabel l[]=new JLabel[8];
    JLabel l1[]=new JLabel[8];
    JFrame miniscreen;
    Label heading;
    Label description;
    Label des[]=new Label[13];
    JButton moremovies;
    genre()
    {
        setLayout(null);
        setSize(windowwidth-50,windowheight-65);
        setLocation(35,10);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);

        miniscreen =new JFrame();
        miniscreen.setUndecorated(true);
        miniscreen.setSize(500,500);
        miniscreen.setVisible(false);

        heading=new Label("genre : ");
        heading.setBounds(30,30,300,40);
        heading.setFont(new Font("Arial",Font.PLAIN,26));
        heading.setBackground(new Color(0x494949));
        heading.setForeground(new Color(0x33FFF9));
        miniscreen.add(heading);

        description=new Label("Desciption : ");
        description.setBounds(30,70,500,20);
        description.setFont(new Font("Arial",Font.PLAIN,15));
        description.setBackground(new Color(0x494949));
        description.setForeground(new Color(0xB217FF));
        miniscreen.add(description);

        des[0]=new Label("you can write reviews ,read reviews for any movie in this website.");
        des[0].setBounds(30,90,500,20);
        des[0].setFont(new Font("Arial",Font.PLAIN,15));
        des[0].setBackground(new Color(0x494949));
        des[0].setForeground(new Color(0xFF21A6));
        miniscreen.add(des[0]);

        des[1]=new Label("you can even buy the tickets and check your nearby theatres using");
        des[1].setBounds(30,110,500,20);
        des[1].setFont(new Font("Arial",Font.PLAIN,15));
        des[1].setBackground(new Color(0x494949));
        des[1].setForeground(new Color(0xFF7100));
        miniscreen.add(des[1]);

        des[2]=new Label("our website.");
        des[2].setBounds(30,130,500,20);
        des[2].setFont(new Font("Arial",Font.PLAIN,15));
        des[2].setBackground(new Color(0x494949));
        des[2].setForeground(new Color(0xFF7100));
        miniscreen.add(des[2]);

        des[3]=new Label("Every genre is available in this website, you can also find movies ");
        des[3].setBounds(30,150,500,20);
        des[3].setFont(new Font("Arial",Font.PLAIN,15));
        des[3].setBackground(new Color(0x494949));
        des[3].setForeground(new Color(0xF6FF00));
        miniscreen.add(des[3]);

        des[4]=new Label("which are not even released yet.");
        des[4].setBounds(30,170,500,20);
        des[4].setFont(new Font("Arial",Font.PLAIN,15));
        des[4].setBackground(new Color(0x494949));
        des[4].setForeground(new Color(0xF6FF00));
        miniscreen.add(des[4]);

        des[5]=new Label("Available genre : Action,Horror,Comedy,etc.");
        des[5].setBounds(30,190,500,20);
        des[5].setFont(new Font("Arial",Font.PLAIN,15));
        des[5].setBackground(new Color(0x494949));
        des[5].setForeground(new Color(0x115CFF));
        miniscreen.add(des[5]);

        des[6]=new Label("And everyones favorite ANIME is also available in our website,");
        des[6].setBounds(30,210,500,20);
        des[6].setFont(new Font("Arial",Font.PLAIN,15));
        des[6].setBackground(new Color(0x494949));
        des[6].setForeground(new Color(0x42FF81));
        miniscreen.add(des[6]);

        des[7]=new Label("so feel free to explore our website and have a good time visiting");
        des[7].setBounds(30,230,500,20);
        des[7].setFont(new Font("Arial",Font.PLAIN,15));
        des[7].setBackground(new Color(0x494949));
        des[7].setForeground(new Color(0xA2FF00));
        miniscreen.add(des[7]);

        des[8]=new Label("our website.");
        des[8].setBounds(30,250,500,20);
        des[8].setFont(new Font("Arial",Font.PLAIN,15));
        des[8].setBackground(new Color(0x494949));
        des[8].setForeground(new Color(0xA2FF00));
        miniscreen.add(des[8]);

        des[9]=new Label("Total number of movies available in our website : more than 10000");
        des[9].setBounds(30,270,500,20);
        des[9].setFont(new Font("Arial",Font.PLAIN,15));
        des[9].setBackground(new Color(0x494949));
        des[9].setForeground(new Color(0xFF0062));
        miniscreen.add(des[9]);

        Label n=new Label("No further pages as the project is already so long.");
        n.setBounds(30,360,500,20);
        n.setFont(new Font("Arial",Font.PLAIN,15));
        n.setBackground(new Color(0x494949));
        n.setForeground(new Color(0xFF0000));
        miniscreen.add(n);

        moremovies=new JButton("more movies");
        moremovies.setBounds(30,300,440,40);
        moremovies.setFont(new Font("Arial",Font.BOLD,16));
        moremovies.setBorder(new LineBorder(new Color(0xEA1616),2));
        moremovies.setForeground(new Color(0xEA1616));
        moremovies.setContentAreaFilled(false);
        moremovies.setOpaque(false);
        moremovies.setFocusPainted(false);
        miniscreen.add(moremovies);


        Label miniscreenbg=new Label("");
        miniscreenbg.setBounds(0,0,500,500);
        miniscreenbg.setBackground(new Color(0x494949));
        miniscreen.add(miniscreenbg);


        ImageIcon closeicon=new ImageIcon("F:\\JAVA\\javaos\\images\\newclose1.png");
        JButton close=new JButton(closeicon);
        close.setBounds(windowwidth-85,5,29,29);
        add(close);
        close.setBorderPainted(false);
        close.setContentAreaFilled(false);
        close.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                miniscreen.setVisible(false);
            }
        });
        close.addActionListener(event->{
            this.dispose();
            miniscreen.dispose();
//            System.exit(0);
        });



        ImageIcon poc=new ImageIcon("F:\\JAVA\\javaos\\images\\new\\pirates of carebian.png");
        ImageIcon pocd=new ImageIcon("F:\\JAVA\\javaos\\images\\new\\pirates of carebiand.png");
        ImageIcon titanic=new ImageIcon("F:\\JAVA\\javaos\\images\\new\\titanic.png");
        ImageIcon titanicd=new ImageIcon("F:\\JAVA\\javaos\\images\\new\\titanicd.png");
        ImageIcon dbz=new ImageIcon("F:\\JAVA\\javaos\\images\\new\\dbz.png");
        ImageIcon dbzd=new ImageIcon("F:\\JAVA\\javaos\\images\\new\\dbzd.png");
        ImageIcon herapheri=new ImageIcon("F:\\JAVA\\javaos\\images\\new\\hera pheri.png");
        ImageIcon herapherid=new ImageIcon("F:\\JAVA\\javaos\\images\\new\\hera pherid.png");
        ImageIcon harryp=new ImageIcon("F:\\JAVA\\javaos\\images\\new\\harry potter.png");
        ImageIcon harrypd=new ImageIcon("F:\\JAVA\\javaos\\images\\new\\harry potterd.png");
        ImageIcon lucifer=new ImageIcon("F:\\JAVA\\javaos\\images\\new\\lucifer.png");
        ImageIcon luciferd=new ImageIcon("F:\\JAVA\\javaos\\images\\new\\luciferd.png");
        ImageIcon thenun=new ImageIcon("F:\\JAVA\\javaos\\images\\new\\the nun.png");
        ImageIcon thenund=new ImageIcon("F:\\JAVA\\javaos\\images\\new\\the nund.png");
        ImageIcon jw=new ImageIcon("F:\\JAVA\\javaos\\images\\new\\john wick.png");
        ImageIcon jwd=new ImageIcon("F:\\JAVA\\javaos\\images\\new\\john wickd.png");
        l1[0]=new JLabel("Action");
        l1[0].setBounds(15,4,200,100);
        l1[0].setFont(new Font("Arial",Font.BOLD,40));
        l1[0].setForeground(new Color(0xffffff));
        add(l1[0]);
        l[0]=new JLabel(jw);
        l[0].setBounds(4,4,349,384);
        add(l[0]);
        l[0].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                l[0].setIcon(jwd);
                heading.setText("genre : ");
                String s=heading.getText();
                s+=l1[0].getText();
                heading.setText(s);
                miniscreen.setLocation(371,200);
                miniscreen.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                l[0].setIcon(jw);
//                miniscreen.setVisible(false);

            }
        });

        l1[1]=new JLabel("Horror");
        l1[1].setBounds(371,4,200,100);
        l1[1].setFont(new Font("Arial",Font.BOLD,40));
        l1[1].setForeground(new Color(0xffffff));
        add(l1[1]);
        l[1]=new JLabel(thenun);
        l[1].setBounds(360,4,349,384);
        add(l[1]);
        l[1].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                l[1].setIcon(thenund);
                heading.setText("genre : ");
                String s=heading.getText();
                s+=l1[1].getText();
                heading.setText(s);
                miniscreen.setLocation(720,200);
                miniscreen.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                l[1].setIcon(thenun);
//                miniscreen.setVisible(false);

            }
        });

        l1[2]=new JLabel("Adventure");
        l1[2].setBounds(731,4,300,100);
        l1[2].setFont(new Font("Arial",Font.BOLD,40));
        l1[2].setForeground(new Color(0xffffff));
        add(l1[2]);
        l[2]=new JLabel(poc);
        l[2].setBounds(720,4,349,384);
        add(l[2]);
        l[2].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                l[2].setIcon(pocd);
                heading.setText("genre : ");
                String s=heading.getText();
                s+=l1[2].getText();
                heading.setText(s);
                miniscreen.setLocation(1080,200);
                miniscreen.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                l[2].setIcon(poc);
//                miniscreen.setVisible(false);

            }
        });

        l1[3]=new JLabel("Drama");
        l1[3].setBounds(1091,4,200,100);
        l1[3].setFont(new Font("Arial",Font.BOLD,40));
        l1[3].setForeground(new Color(0xffffff));
        add(l1[3]);
        l[3]=new JLabel(lucifer);
        l[3].setBounds(1080,4,349,384);
        add(l[3]);
        l[3].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                l[3].setIcon(luciferd);
                heading.setText("genre : ");
                String s=heading.getText();
                s+=l1[3].getText();
                heading.setText(s);
                miniscreen.setLocation(650,200);
                miniscreen.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                l[3].setIcon(lucifer);
//                miniscreen.setVisible(false);

            }
        });

        l1[4]=new JLabel("Anime");
        l1[4].setBounds(15,406,200,100);
        l1[4].setFont(new Font("Arial",Font.BOLD,40));
        l1[4].setForeground(new Color(0xffffff));
        add(l1[4]);
        l[4]=new JLabel(dbz);
        l[4].setBounds(4,395,349,384);
        add(l[4]);
        l[4].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                l[4].setIcon(dbzd);
                heading.setText("genre : ");
                String s=heading.getText();
                s+=l1[4].getText();
                heading.setText(s);
                miniscreen.setLocation(371,100);
                miniscreen.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                l[4].setIcon(dbz);

            }
        });

        l1[5]=new JLabel("Fantacy");
        l1[5].setBounds(371,406,200,100);
        l1[5].setFont(new Font("Arial",Font.BOLD,40));
        l1[5].setForeground(new Color(0xffffff));
        add(l1[5]);
        l[5]=new JLabel(harryp);
        l[5].setBounds(360,395,349,384);
        add(l[5]);
        l[5].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                l[5].setIcon(harrypd);
                heading.setText("genre : ");
                String s=heading.getText();
                s+=l1[5].getText();
                heading.setText(s);
                miniscreen.setLocation(720,100);
                miniscreen.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                l[5].setIcon(harryp);

            }
        });

        l1[6]=new JLabel("Comedy");
        l1[6].setBounds(731,406,200,100);
        l1[6].setFont(new Font("Arial",Font.BOLD,40));
        l1[6].setForeground(new Color(0xffffff));
        add(l1[6]);
        l[6]=new JLabel(herapheri);
        l[6].setBounds(720,395,349,384);
        add(l[6]);
        l[6].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                l[6].setIcon(herapherid);
                heading.setText("genre : ");
                String s=heading.getText();
                s+=l1[6].getText();
                heading.setText(s);
                miniscreen.setLocation(1080,100);
                miniscreen.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                l[6].setIcon(herapheri);

            }
        });

        l1[7]=new JLabel("Romance");
        l1[7].setBounds(1091,406,200,100);
        l1[7].setFont(new Font("Arial",Font.BOLD,40));
        l1[7].setForeground(new Color(0xffffff));
        add(l1[7]);
        l[7]=new JLabel(titanic);
        l[7].setBounds(1080,395,349,384);
        add(l[7]);
        l[7].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                l[7].setIcon(titanicd);
                heading.setText("genre : ");
                String s=heading.getText();
                s+=l1[7].getText();
                heading.setText(s);
                miniscreen.setLocation(650,100);
                miniscreen.setVisible(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                l[7].setIcon(titanic);

            }
        });




        JLabel bg=new JLabel("");
        bg.setBounds(0,0,windowwidth-50,windowheight-65);
        bg.setBackground(new Color(0x000));
        bg.setOpaque(true);
        add(bg);
        bg.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                miniscreen.setVisible(false);
            }
        });
        setVisible(true);
    }


//    public static void main(String[] args) {
//        new genre();
//    }
}
