
package projectsms;

  

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class StudentMarks extends JFrame{
    
    
     Container container;
     JLabel name_label,roll_label,ct1_label,ct2_label,assignment_label,attendence_label;
     JTextField name_textfield,roll_textfield,ct1_textfield,ct2_textfield,assignment_textfield,attendence_textfield;
      JButton back_button,home_button;
     final Font font;
     JFrame frame;
    
  
    StudentMarks(){
        container=this.getContentPane();
        container.setLayout(null);
        container.setBackground(new java.awt.Color(0, 230, 230));
        
        font=new Font("Arial",Font.BOLD,24);
        
        
        name_label=new JLabel("Name                 ");      
        name_label.setFont(font);
        name_label.setBounds(140,100,200,50);
        container.add(name_label);
        
        name_textfield=new JTextField();      
        name_textfield.setFont(font);
        name_textfield.setBounds(500,100,300,40);
        container.add(name_textfield);
        
        
        roll_label=new JLabel("Roll No              ");      
        roll_label.setFont(font);
        roll_label.setBounds(140,160,200,50);
        container.add(roll_label);
       
        roll_textfield=new JTextField();      
        roll_textfield.setFont(font);
        roll_textfield.setBounds(500,160,300,40);
        container.add(roll_textfield);
        
        ct1_label=new JLabel("Class Test 1  ");      
        ct1_label.setFont(font);
        ct1_label.setBounds(140,220,200,50);
        container.add(ct1_label);
        
        ct1_textfield=new JTextField();      
        ct1_textfield.setFont(font);
        ct1_textfield.setBounds(500,220,300,40);
        container.add(ct1_textfield);
        
        ct2_label=new JLabel("Class Test 2    ");      
        ct2_label.setFont(font); 
        ct2_label.setBounds(140,280,200,50);
        container.add(ct2_label);
        
        ct2_textfield=new JTextField();      
        ct2_textfield.setFont(font);
        ct2_textfield.setBounds(500,280,300,40);
        container.add(ct2_textfield);
        
        assignment_label=new JLabel("Assignment Mark");      
        assignment_label.setFont(font); 
        assignment_label.setBounds(140,340,350,50);
        container.add(assignment_label);
        
        assignment_textfield=new JTextField();      
        assignment_textfield.setFont(font);
        assignment_textfield.setBounds(500,340,300,40);
        container.add(assignment_textfield);
        
        attendence_label=new JLabel("Attendence  Mark");      
        attendence_label.setFont(font);
        attendence_label.setBounds(140,400,350,50);
        container.add(attendence_label);
        
        attendence_textfield=new JTextField();      
        attendence_textfield.setFont(font);
        attendence_textfield.setBounds(500,400,300,40);
        container.add(attendence_textfield);
        
      
        
        
        
        back_button=new JButton("Back");
        back_button.setBounds(180,570,150,50);
        back_button.setFont(font);
        back_button.setBackground(Color.BLACK);
        back_button.setForeground(Color.WHITE);
        container.add(back_button);
        
        home_button=new JButton("Home");
        home_button.setBounds(650,570,150,50);
        home_button.setFont(font);
        home_button.setBackground(Color.BLACK);
        home_button.setForeground(Color.WHITE);
        container.add(home_button);
        
        
         frame=new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,800,650);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setTitle("Student Marks");
        frame.setVisible(true);
        frame.add(container);
    }
    
   // public static void main(String[] args) {
      //  StudentMarks sm = new StudentMarks();
   // }
    
}
