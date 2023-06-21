
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class score  extends JFrame implements ActionListener{
    
    score(String name, int score){
        setBounds(400,150, 750,550);
         getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon (ClassLoader.getSystemResource("icons/s.jfif"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel image = new JLabel (i3);
        image.setBounds(05,150, 300,250);
        add (image);
        
         JLabel heading = new JLabel ("Thank you " +name + " For Playing!");
      heading.setBounds(150,45,700,30);
       heading.setFont(new Font ("Monospaced", Font.BOLD,26));
        heading.setForeground(Color.MAGENTA);
        add (heading);
        
         JLabel score1 = new JLabel ("Your Score Is " + score );
      score1.setBounds(350,200,300,30);
       score1.setFont(new Font ("Monospaced", Font.BOLD,26));
         score1.setForeground(Color.BLUE);
        add (score1);
        
        JButton submit = new JButton ("Play Again");
      submit.setBounds (380,270, 120, 30);
      //submit.setFont(new Font ("Tahoma", Font.PLAIN,26));
        submit.setBackground (Color.MAGENTA);
       submit.setForeground(Color.BLACK);
        submit.addActionListener (this);
        add (submit);
        setVisible (true);
        
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
            new Login();
        
    }
    public static void main(String[] args) {
        new score ("User",0);
    }
    
}
