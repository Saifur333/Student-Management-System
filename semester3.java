package projectsms;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class semester3 extends JFrame {
    
     private Container container;
     private JLabel coursedetails_label;
     private Font font;
     private JTable table;
     private JScrollPane scroll;
     private JButton home_button,back_button;
     
     private String[] cols={"Course title","Course Code"};
     
     private String[][] rows={
                           {"Algorithm Analysis","CSE 2101"},
                           {"Algorithm Analysis Lab","CSE 2102"},
                           {"Theory of Computation","SE 2103"},
                           {"Theory of Computation  Lab","SE 2104"},
                           {"Computer Networks","CSE 2105"},
                           {"Computer Networks Lab","CSE 2106"},
                           {"Numerical Analysis for Engineers","MATH 2107"},
                           {"Numerical Analysis for Engineers Lab","MATH 2108"},
                           {"Object Oriented Concepts 2","SE 2109"},
                           {"Object Oriented Concepts 2 Lab","SE 2110"},
                           {"Softwarer Project Lab","SE 2112"},
                           
                           
                           
     };
    
    
    semester3()
    {
        components();
    }
    
    public void components()
    {
        container= this.getContentPane();
        container.setLayout(null);
        container.setBackground(new Color(25,45,45));
        
        font = new Font("Candara",Font.BOLD,18);
        
        coursedetails_label = new JLabel("Course Details");
        coursedetails_label.setBounds(250,20,200,50);
        coursedetails_label.setForeground(Color.WHITE);
        coursedetails_label.setFont(font);
        container.add(coursedetails_label);
        
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
        
        semester3 frame = new semester3();
       // frame.setVisible(true);
    //    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //   frame.setExtendedState(MAXIMIZED_BOTH);
        
    }
    
}
