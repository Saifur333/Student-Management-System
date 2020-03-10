package projectsms;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class semester4 extends JFrame{
    
     private Container container;
     private JLabel l1;
     private Font font;
     private JTable table;
     private JScrollPane scroll;
     private JButton home_button,back_button;
     
     private String[] cols={"Course title","Course Code"};
     
     private String[][] rows={
                           {"Operating Systems and System Programming","CSE 2201"},
                           {"Operating Systems and Lab","CSE 2202"},
                           {"Business Psychology","GE 2203"},
                           {"Information Security","CSE 2205"},
                           {"Information Security Lab","CSE 2206"},
                           {"Database Management System 1","CSE 2207"},
                           {"Database Management System 1 Lab","CSE 2208"},
                           {"Software Requirement  Specifications and Analysis ","SE 2209"},
                           {"Software Requirement  Specifications and Analysis Lab","SE 2210"},
                           {"Object Oriented Concepts 2 Lab","BUS 2211"},
                          
                           
                           
                           
     };
    semester4()
    {
        
        components();
    }
    
    public void components()
    {
         container= this.getContentPane();
       container.setLayout(null);
        container.setBackground(new Color(25,45,45));
        
        font = new Font("Candara",Font.BOLD,18);
        
        l1 = new JLabel("Course Details");
        l1.setBounds(250,20,200,50);
        l1.setForeground(Color.WHITE);
        l1.setFont(font);
        container.add(l1);
        
        table = new JTable(rows,cols);
        table.setSelectionBackground(Color.YELLOW);
        table.setFont(font);
        
        scroll = new JScrollPane(table);
        scroll.setBounds(50, 80, 700, 180);
        container.add(scroll);
        
        home_button = new JButton("Home");
        home_button.setBounds(50, 400, 100, 50);
        home_button.setBackground(new Color(25,45,45));
        home_button.setForeground(Color.WHITE);
        home_button.setBorderPainted(false);
        home_button.setFont(font);
       
        container.add(home_button);
        
        back_button = new JButton("Back");
        back_button.setBounds(200, 400, 100, 50);
        back_button.setBackground(new Color(25,45,45));
        back_button.setForeground(Color.WHITE);
        back_button.setFont(font);
        back_button.setBorderPainted(false);
        container.add(back_button);
        
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
    }
    public static void main(String[] args) {
        
      semester4 frame = new semester4();
     // frame.setVisible(true);
    //    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //   frame.setExtendedState(MAXIMIZED_BOTH);
    }

    
}
