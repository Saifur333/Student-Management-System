package projectsms;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class AddfacultyMember extends AddMemberFaculty{
    public JButton add_button,back_button,home_button;
    Font font;
    Container container;
    public JTextField name_textfield,hometown_textfield,email_textfield,contact_textfield,blood_textfield;
    String tname,thometown,temail,tcontact,tblood;
    
    AddfacultyMember()
    {
        add_button=new JButton("Add");
        add_button.setBounds(520,510,150,50);
        add_button.setFont(font);
        add_button.setBackground(Color.BLACK);
        add_button.setForeground(Color.WHITE);
        container.add(add_button);
        
        
        add_button.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
             tname= name_textfield.getText();
            thometown = hometown_textfield.getText();
             temail = email_textfield.getText();
             tcontact = contact_textfield.getText();
             tblood = blood_textfield.getText();
            checktf();
        }
        });
        home_button.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                dispose();
                Home home =new Home();
        }
        
        });
        back_button.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
               if(e.getSource()==back_button){
                 
                    frame.dispose();
                    AdminstratorDemo admin = new AdminstratorDemo();
                    
                }
        }
   
        
        });
    }
    ///////////////////  Extract method ///////////////////////////
    public void emptytf()
    {
        name_textfield.setText("");
                   hometown_textfield.setText("");
                   email_textfield.setText("");
                   contact_textfield.setText("");
                   blood_textfield.setText("");
    }
    public void checktf()
    {
         if(tname.equals(""))
                    {
                        JOptionPane.showMessageDialog(null,"Please Enter name");
                    }
                    else if(thometown.equals("")){
                            JOptionPane.showMessageDialog(null, "Please Enter hometown");
                        }
                   else if(temail.equals("")){
                                JOptionPane.showMessageDialog(null, "Please Enter Email");
                            }
                    else if(tcontact.equals("")){
                                    JOptionPane.showMessageDialog(null,"Please Enter contact");
                                }
                    else if(tblood.equals("")){
                                        JOptionPane.showMessageDialog(null,"Please Enter Blood");
                                    }
                
                else{
                    
                    filewriter(tname,thometown,temail,tcontact,tblood);
                   JOptionPane.showMessageDialog(null,"Added Succesfully");
                   emptytf();   
                }
    }
    private void filewriter(String tname, String thometown,String temail, String tcontact, String tblood) {
                
                try{
                    FileWriter wr = new FileWriter("teachersInformation.txt",true);
                    wr.write(tname+" "+"#");
                    wr.write(thometown+" "+"#");
                    wr.write(temail+" "+"#");
                    wr.write(tcontact+" "+"#");
                    wr.write(tblood+" "+"#");
                    wr.write(System.getProperty("line.separator"));
                    wr.close();
                }
                catch(Exception ae)
                {
                    System.out.println(ae);
                }
            }
    public static void main(String[] args) {
        AddfacultyMember m=new AddfacultyMember();
    }
    
}
