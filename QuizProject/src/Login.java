
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login extends JFrame implements ActionListener{
    JButton rules,back;
   JTextField tfname;
    Login ()
    {
        getContentPane ().setBackground (Color.WHITE);
        
        setLayout (null);
        
        ImageIcon i1 = new ImageIcon (ClassLoader.getSystemResource("icons/Quizzzz.jpg"));
        JLabel image = new JLabel (i1);
        image.setBounds(0,0,600,400);
        add (image);
        
        JLabel heading = new JLabel (" Let's Play The Islamic Quiz!");
        heading.setBounds(750,60,700,45);
        heading.setFont(new Font ("Serif", Font.BOLD,30));
            heading.setForeground(Color.BLUE);
        add (heading);
        
        JLabel name = new JLabel ("Enter your name");
       name.setBounds(810,150,300,20);
        name.setFont(new Font ("Monospaced", Font.BOLD,18));
        name.setForeground(Color.MAGENTA);
        add (name);
        
         tfname = new  JTextField();
        tfname.setBounds (735, 200, 300, 25);
        tfname.setFont (new Font ("Times New Roman", Font.BOLD,20));
        add(tfname);
        
        rules = new JButton ("Rules");
        rules.setBounds (735,270, 120, 25);
        rules.setBackground (Color.BLUE);
        rules.setForeground(Color.WHITE);
        rules.addActionListener (this);
        add (rules);
        
        
         back = new JButton ("Back");
        back.setBounds (915,270, 120, 25);
         back.setBackground (Color.BLUE);
         back.setForeground(Color.WHITE);
         back.addActionListener (this);
        add ( back);
        
        
        
        setSize (1200, 500);
        setLocation (200, 150);
        setVisible (true);
    }
    
    @Override
    public void actionPerformed (ActionEvent ae)
    {
        if (ae.getSource()== rules)
        {  String name = tfname.getText();
            setVisible (false);
            new Rules(name);
        }else if (ae.getSource()== back)
        {
            setVisible (false);
        }
    }
    public static void main(String[] args) {
        new Login ();
    }
    
}
