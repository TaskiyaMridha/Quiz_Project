
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Rules extends JFrame implements ActionListener {

    String name;
    JButton start, back;

    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        

        JLabel heading = new JLabel(" Welcome To the Game " + name);
        heading.setBounds(120, 50, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        ImageIcon k1 = new ImageIcon (ClassLoader.getSystemResource("icons/LogoGirl.jfif"));
        JLabel image = new JLabel (k1);
        image.setBounds(360,80, 430,500);
        add (image);

        JLabel rules = new JLabel();
        rules.setBounds(50, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 22));
        rules.setForeground(Color.BLACK);
        rules.setText(
                "<html>"
                + "1. Say Bismillah & Start" + "<br><br>"
                + "2. Do not Google the Answer." + "<br><br>"
                + "3. Read the Question Properly." + "<br><br>"
                + "4. Be Focused." + "<br><br>"
                + "5. Use your Brain Properly." + " <br><br>"
                + "GOOD LUCK!"
                + "<html>"
        );
        add(rules);

        back = new JButton("Back");
        back.setBounds(10, 500, 100, 30);
        back.setBackground(Color.BLUE);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(160, 500, 100, 30);
        start.setBackground(Color.RED);
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            
            setVisible (false);
            new Quiz(name);

        } else {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }

}
