
package projectsms;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;




public class AddMemberFaculty extends JFrame{
    
    public Container container;
    public JLabel name_label,roll_label,session_label,hometown_label,email_label,contact_label,bloodlabel;
    public JTextField name_textfield,hometown_textfield,email_textfield,contact_textfield,blood_textfield;
     public JButton add_button,back_button,home_button;
     public Font font;
    public JFrame frame;
    
  
    AddMemberFaculty(){
        container=this.getContentPane();
        container.setLayout(null);
        container.setBackground(new java.awt.Color(0, 230, 230));
        
        font=new Font("Arial",Font.BOLD,24);
        
        
        name_label=new JLabel("Name                 :");      
        name_label.setFont(font);
        name_label.setBounds(180,100,200,50);
        container.add(name_label);
        
        name_textfield=new JTextField();      
        name_textfield.setFont(font);
        name_textfield.setBounds(400,100,300,40);
        container.add(name_textfield);
        
        hometown_label=new JLabel("Home town        :");      
        hometown_label.setFont(font); 
        hometown_label.setBounds(180,160,200,50);
        container.add(hometown_label);
        
        hometown_textfield=new JTextField();      
        hometown_textfield.setFont(font);
        hometown_textfield.setBounds(400,160,300,40);
        container.add(hometown_textfield);
        
       email_label=new JLabel("Email                 :");      
      email_label.setFont(font); 
      email_label.setBounds(180,220,200,50);
      container.add(email_label);
        
        email_textfield=new JTextField();      
        email_textfield.setFont(font);
        email_textfield.setBounds(400,220,300,40);
        container.add(email_textfield);
        
        contact_label=new JLabel("Contact             :");      
        contact_label.setFont(font);
        contact_label.setBounds(180,280,200,50);
        container.add(contact_label);
        
        contact_textfield=new JTextField();      
        contact_textfield.setFont(font);
        contact_textfield.setBounds(400,280,300,40);
        container.add(contact_textfield);
        
        bloodlabel=new JLabel("Blood Group    :");      
        bloodlabel.setFont(font);
        bloodlabel.setBounds(180,340,200,50);
        container.add(bloodlabel);
        
        blood_textfield=new JTextField();      
        blood_textfield.setFont(font);
        blood_textfield.setBounds(400,340,300,40);
        container.add(blood_textfield);
        
        
        
        back_button=new JButton("Back");
        back_button.setBounds(180,570,150,50);
        back_button.setFont(font);
        back_button.setBackground(Color.BLACK);
        back_button.setForeground(Color.WHITE);
        container.add(back_button);
        
        home_button=new JButton("Home");
        home_button.setBounds(520,570,150,50);
        home_button.setFont(font);
        home_button.setBackground(Color.BLACK);
        home_button.setForeground(Color.WHITE);
        container.add(home_button);
        
        
         frame=new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,800,650);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setTitle("Add faculty member");
        frame.setVisible(true);
        frame.add(container);
       
       
         
    
        
       }
    
    
}
