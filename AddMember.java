
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




public class AddMember extends JFrame{
    
     Container container;
     JLabel namelbl,rolllbl,sessionlbl,hometownlbl,emaillbl,contactlbl,bloodlbl;
     JTextField name_textfield,roll_textfield,session_textfield,hometown_textfield,email_textfield,contact_textfield,blood_textfield;
      JButton back_button,home_button;
     final Font font;
     JFrame frame;
    
  
    AddMember(){
        container=this.getContentPane();
        container.setLayout(null);
        container.setBackground(new java.awt.Color(0, 230, 230));
        
        font=new Font("Arial",Font.BOLD,24);
        
        
        namelbl=new JLabel("Name                 :");      
        namelbl.setFont(font);
        namelbl.setBounds(180,100,200,50);
        container.add(namelbl);
        
        name_textfield=new JTextField();      
        name_textfield.setFont(font);
        name_textfield.setBounds(400,100,300,40);
        container.add(name_textfield);
        
        
        rolllbl=new JLabel("Roll No              :");      
        rolllbl.setFont(font);
        rolllbl.setBounds(180,160,200,50);
        container.add(rolllbl);
       
        roll_textfield=new JTextField();      
        roll_textfield.setFont(font);
        roll_textfield.setBounds(400,160,300,40);
        container.add(roll_textfield);
        
        sessionlbl=new JLabel("Session             :");      
        sessionlbl.setFont(font);
        sessionlbl.setBounds(180,220,200,50);
       container.add(sessionlbl);
        
        session_textfield=new JTextField();      
        session_textfield.setFont(font);
        session_textfield.setBounds(400,220,300,40);
        container.add(session_textfield);
        
        hometownlbl=new JLabel("Home town        :");      
        hometownlbl.setFont(font); 
        hometownlbl.setBounds(180,280,200,50);
        container.add(hometownlbl);
        
        hometown_textfield=new JTextField();      
        hometown_textfield.setFont(font);
        hometown_textfield.setBounds(400,280,300,40);
        container.add(hometown_textfield);
        
        emaillbl=new JLabel("Email                 :");      
        emaillbl.setFont(font); 
        emaillbl.setBounds(180,340,200,50);
        container.add(emaillbl);
        
        email_textfield=new JTextField();      
        email_textfield.setFont(font);
        email_textfield.setBounds(400,340,300,40);
        container.add(email_textfield);
        
        contactlbl=new JLabel("Contact              :");      
        contactlbl.setFont(font);
        contactlbl.setBounds(180,400,200,50);
        container.add(contactlbl);
        
        contact_textfield=new JTextField();      
        contact_textfield.setFont(font);
        contact_textfield.setBounds(400,400,300,40);
        container.add(contact_textfield);
        
        bloodlbl=new JLabel("Blood Group      :");      
        bloodlbl.setFont(font);
        bloodlbl.setBounds(180,460,200,50);
        container.add(bloodlbl);
        
        blood_textfield=new JTextField();      
        blood_textfield.setFont(font);
        blood_textfield.setBounds(400,460,300,40);
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
        frame.setTitle("Add member");
        frame.setVisible(true);
        frame.add(container);
       
       
         
    
        
       }
    
    public static void main(String[] args) {
        
        AddMember home=new AddMember();
    }
}