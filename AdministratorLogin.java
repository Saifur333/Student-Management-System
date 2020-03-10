
package projectsms;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class AdministratorLogin extends JFrame{
    
    
           private Container container;
           private Font font ;
           private JLabel username_label,password_label;
           private JTextField username_textfield;
           private JPasswordField passField;
           private JButton submit_button;
    
    AdministratorLogin(){
        
        
        
        container=this.getContentPane();
        container.setLayout(null);
        container.setBackground(new java.awt.Color(0, 230, 230));
        
        font = new Font("Arial",Font.BOLD,30);
        
        username_label = new JLabel("Username   :");
        username_label.setBounds(270, 200, 250,60);
        username_label.setFont(font);
        container.add(username_label);
        
        username_textfield = new JTextField();
        username_textfield.setBounds(520, 200, 400,60);
        username_textfield.setFont(font);
        container.add(username_textfield);
        
        password_label = new JLabel("Password   :");
        password_label.setBounds(270, 330, 250,60);
        password_label.setFont(font);
        container.add(password_label);
        
       
        passField = new JPasswordField();
        passField.setBounds(520, 330, 400,60);
        passField.setFont(font);
        container.add(passField);
        
        submit_button = new JButton("Submit");
        submit_button.setBounds(750, 415, 165, 50);
        submit_button.setFont(font);
        container.add(submit_button);
        
        
        
        JFrame frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,800,650);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setTitle("Administrator");
        frame.setVisible(true);
        frame.add(container);
        
        
        submit_button.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
 
            String name=username_textfield.getText();
            String pass= passField.getText();
 
                if(name.equals("Admin") && pass.equals("1234")){
                    JOptionPane.showMessageDialog(null,"Welcome");
                    frame.dispose();
                    AdminstratorDemo admin = new AdminstratorDemo();
                }
                else{
                    JOptionPane.showMessageDialog(null,"Wrong Password");
                    username_textfield.setText("");
                    passField.setText("");
                }
        }
        
        });
    }
    
}
