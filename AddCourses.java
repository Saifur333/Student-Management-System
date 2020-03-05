
package projectsms;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class AddCourses extends JFrame{
    
     Container container;
     JLabel courseName_label,courseCode_label,courseDescription_label;
     JTextField name_textfield,code_textfield,description_textfield;
     // JTextArea description_textfield;
      JButton back_button,Add_button,home_button;
      Font font;
      JScrollPane description_textfieldscroll;
      JFrame frame;
    
    
    AddCourses(){
        initComponents();
        
    }
    public void initComponents(){
        
        
        container=this.getContentPane();
        container.setLayout(null);
        container.setBackground(new Color(0, 230, 230));
        
        font = new Font("Arial",Font.BOLD,30);
        
        courseName_label = new JLabel("Course Name          :");
        courseName_label.setBounds(220, 50, 300,60);
        courseName_label.setFont(font);
        container.add(courseName_label);
        
        name_textfield = new JTextField();
        name_textfield.setBounds(520, 50, 400,60);
        name_textfield.setFont(font);
        container.add(name_textfield);
        
        courseCode_label = new JLabel("Course Code           :");
        courseCode_label.setBounds(220, 130, 300,60);
        courseCode_label.setFont(font);
        container.add(courseCode_label);
        
       
        code_textfield = new JTextField();
        code_textfield.setBounds(520, 130, 400,60);
        code_textfield.setFont(font);
        container.add(code_textfield);
        
        
        courseDescription_label = new JLabel("Course Description:");
        courseDescription_label.setBounds(220, 200, 320,60);
        courseDescription_label.setFont(font);
        container.add(courseDescription_label);
        
        description_textfield = new JTextField();
        description_textfield.setBounds(520, 200, 400, 60);
        description_textfield.setFont(font);
        container.add(description_textfield);
         
        
       
         
         
        Add_button= new JButton("Add");
        Add_button.setBounds(780,500,130,50);
        Add_button.setBackground(Color.BLACK);
        Add_button.setForeground(Color.WHITE);
        Add_button.setFont(font);
        container.add(Add_button);
        
        
        
        
        home_button= new JButton("Home");
        home_button.setBounds(780, 560, 130, 50);
        home_button.setBackground(Color.BLACK);
        home_button.setForeground(Color.WHITE);
        home_button.setFont(font);
        container.add(home_button);
        
        
         frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,800,650);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setTitle("Add Course");
        frame.setVisible(true);
        frame.add(container);
