
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;


public class Quiz extends JFrame implements ActionListener {
    
    String questions [][]= new String[10][5];
    String answers [][] = new String[10][2];
    String useranswers [][]= new String[10][1];
    
    JLabel Q, Ques;
    JRadioButton opt1,opt2,opt3, opt4;
     ButtonGroup groupoption;
      JButton submit,next;
    public static int timer =15;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;
   
    String name;
    Quiz(String name)
    {
        this.name = name;
        setBounds(30,0, 1450,835);
         getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
//          ImageIcon i1 = new ImageIcon (ClassLoader.getSystemResource("icons/O1.jpeg"));
//        Image i2 = i1.getImage().getScaledInstance(1000, 350, Image.SCALE_DEFAULT);
//        ImageIcon i3 =  new ImageIcon(i2);
//        JLabel image = new JLabel (i3);
//        image.setBounds(1000,00, 300,250);
//        add (image);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/O1.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(000, 000, 1000, 350);
        add(image);
        
           Q = new JLabel ();
      Q.setBounds(100,450,60,30);
        Q.setFont(new Font ("Monospaced", Font.PLAIN,24));
//        Q.setForeground(Color.BLACK);
        add (Q);
        
           Ques = new JLabel ();
      Ques.setBounds(150,450,1500,30);
        Ques.setFont(new Font ("Monospaced", Font.PLAIN,24));
        Ques.setForeground(Color.BLACK);
        add (Ques);
        
        questions[0][0] = "Who is the last and final prophet in Islam?";
        questions[0][1] = " Moses";
        questions[0][2] = "Jesus";
        questions[0][3] = "Muhammad SAW";
        questions[0][4] = "Abraham";

        questions[1][0] = "Which is the holy book of Islam?";
        questions[1][1] = "Torah";
        questions[1][2] = " Bible";
        questions[1][3] = "Quran";
        questions[1][4] = "Zend Avesta";

        questions[2][0] = "What is the name of the pilgrimage to Mecca that every Muslim should perform at least once in their lifetime?";
        questions[2][1] = "Umrah";
        questions[2][2] = "Hajj";
        questions[2][3] = "Zakat";
        questions[2][4] = " Sawm";

        questions[3][0] = "What is the name of the holy month of fasting in Islam?";
        questions[3][1] = "Ramadan";
        questions[3][2] = "Shawwal";
        questions[3][3] = "Dhul-Hijjah";
        questions[3][4] = "Muharram";

        questions[4][0] = "Which direction do Muslims face when they pray";
        questions[4][1] = "North";
        questions[4][2] = "South";
        questions[4][3] = "East";
        questions[4][4] = "West";

        questions[5][0] = "How many chapters (surahs) are there in the Quran?";
        questions[5][1] = "100";
        questions[5][2] = "114";
        questions[5][3] = "144";
        questions[5][4] = "99";

        questions[6][0] = "What is the name of the angel who revealed the Quran to the Prophet Muhammad?";
        questions[6][1] = "Jibreel (Gabriel)";
        questions[6][2] = "Israfil";
        questions[6][3] = "Azrael";
        questions[6][4] = "Mikail (Michael)";

        questions[7][0] = "What is the Islamic declaration of faith called?";
        questions[7][1] = "Salat";
        questions[7][2] = " Hajj";
        questions[7][3] = "Shahada";
        questions[7][4] = "Zakat";

        questions[8][0] = "Which city is considered the second holiest city in Islam after Mecca?";
        questions[8][1] = "Medina";
        questions[8][2] = "Jerusalem";
        questions[8][3] = " Cairo";
        questions[8][4] = "Baghdad";

        questions[9][0] = "What is the name of the Islamic month in which fasting is forbidden?";
        questions[9][1] = "Muharram";
        questions[9][2] = "Shawwal";
        questions[9][3] = "Rajab";
        questions[9][4] = "Dhu al-Qa'dah";


        answers[0][1] = "Muhammad SAW";
        answers[1][1] = "Quran";
        answers[2][1] = "Hajj";
        answers[3][1] = "Ramadan";
        answers[4][1] = "East";
        answers[5][1] = "114";
        answers[6][1] = "Jibreel (Gabriel)";
        answers[7][1] = " Shahada";
        answers[8][1] = "Medina";
        answers[9][1] = "Dhu al-Qa'dah";
        
        
         opt1 = new JRadioButton();
        opt1.setBounds (170,520,700,30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font ("Dialog", Font.PLAIN,20));
        add(opt1);
        
        opt2 = new JRadioButton();
        opt2.setBounds (170,560,700,30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font ("Dialog", Font.PLAIN,20));
        add(opt2);
        
         opt3 = new JRadioButton();
        opt3.setBounds (170,600,700,30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font ("Dialog", Font.PLAIN,20));
        add(opt3);
        
        opt4 = new JRadioButton();
        opt4.setBounds (170,640,700,30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font ("Dialog", Font.PLAIN,20));
        add(opt4);
        
      groupoption = new ButtonGroup();
     groupoption.add(opt1);
     groupoption.add(opt2);
     groupoption.add(opt3);
     groupoption.add(opt4);
     
      next = new JButton("Next");
        next.setBounds(1100, 550, 200, 40);
        next.setBackground(Color.PINK);
      next.setForeground(Color.WHITE);
       next.addActionListener(this);
        add(next);
        
      submit = new JButton("Submit");
       submit.setBounds(1100, 640, 200, 40);
        submit.setBackground(Color.PINK);
      submit.setForeground(Color.WHITE);
      submit.setEnabled (false);
      submit.addActionListener(this);
        add(submit);
        
        start (count);
        
          setVisible(true);
    }
    @Override
    public void actionPerformed (ActionEvent ae)
    {
       if (ae.getSource() == next) {
           repaint();
           
           ans_given = 1;
           
           if (groupoption.getSelection () ==null){
                useranswers [count][0]= "";
            }else {
                useranswers [count][0] = groupoption.getSelection().getActionCommand();
      
        } 
           
           if (count ==8)
           {
               next.setEnabled (false);
               submit.setEnabled(true);
           }
        if (count ==9)
        {
            if (groupoption.getSelection () ==null){
                useranswers [count][0]= "";
            }else {
                useranswers [count][0] = groupoption.getSelection().getActionCommand();
      
        } 
            for ( int i = 0; i< useranswers.length; i++)
            {
                if(useranswers[i][0].equals(answers[i][1]))
                {
               score += 10;
               }
                else
                {
                          score += 0;
                        
                        }
            
        }
            
            setVisible(false);
             new score(name, score);
        }else
            
        {
            if (groupoption.getSelection () ==null){
                useranswers [count][0]= "";
            }else {
                useranswers [count][0] = groupoption.getSelection().getActionCommand();
      
        } 
        }
           count++;
           start(count);
        } 
       
       else if (ae.getSource() == submit)  
       {
           ans_given =1;
             if (groupoption.getSelection () ==null){
                useranswers [count][0]= "";
            }else {
                useranswers [count][0] = groupoption.getSelection().getActionCommand();
      
        } 
            for ( int i = 0; i< useranswers.length; i++)
            {
                if (useranswers[i][0].equals(answers[i][1])){
               score += 10;}
                else
                {
                          score += 0;
                        
                        }
            }
            setVisible(false);
            new score(name, score);
        }
       
    }
    
    public void paint(Graphics g)
    {
        super.paint (g);
        String time = "Time left -" + timer + "seconds";
        g.setColor (Color.RED);
        g.setFont(new Font ("Tahoma", Font.BOLD,25));
        
        if (timer >0)
        {
            g.drawString(time, 1100, 400);
        }else {
            g.drawString("Times up!!", 1100, 400);
        }
        timer--;
        
        try {
            Thread.sleep(1000);
            repaint ();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        if (ans_given ==1)
        {
            ans_given = 0;
            timer =15;
        }else if (timer<0){
            timer = 15;
            
            if (groupoption.getSelection () ==null){
                useranswers [count][0]= "";
            }else {
                useranswers [count][0] = groupoption.getSelection().getActionCommand();
      
        }       
            count++;
            start(count);
    }
    }
    public void start(int count)
    {
        Q.setText(""+(count+1) + ". ");
        Ques.setText(questions[count][0]);
        opt1.setText (questions [count][1]);
        opt1.setActionCommand (questions[count][1]);
        opt2.setText (questions [count][2]);
        opt2.setActionCommand (questions[count][2]);
        opt3.setText (questions [count][3]);
        opt3.setActionCommand (questions[count][3]);
        opt4.setText (questions [count][4]);
        opt4.setActionCommand (questions[count][4]);
        
        groupoption.clearSelection();
    }
    
    public static void main(String[] args) {
        new Quiz ("User");
    }
}
