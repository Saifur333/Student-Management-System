
package projectsms;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class AddStudentMember extends AddMember{
    
    JButton add;
    String sname,sroll,ssession,shometown,semail,scontact,sblood;
            
            
    AddStudentMember(){
        
        add=new JButton("Add");
        add.setBounds(520,510,150,50);
        add.setFont(font);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        container.add(add);
        
        add.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            
            if(e.getSource()==add)
            {  
             sname =name_textfield.getText();
             sroll =roll_textfield.getText();
              ssession = session_textfield.getText();
              shometown = hometown_textfield.getText();
              semail = email_textfield.getText();
             scontact = contact_textfield.getText();
             sblood = blood_textfield.getText(); 
             checktextfield();
            }
        }
            
        });
      
        home_button.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                frame.dispose();
                Home admin =new Home();
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
    ///////////////////// Extract method /////////////////////
    public void emptytf()
    {
                   name_textfield.setText("");
                   roll_textfield.setText("");
                   session_textfield.setText("");
                   hometown_textfield.setText("");
                   email_textfield.setText("");
                   contact_textfield.setText("");
                   blood_textfield.setText("");
    }
    ///////////////////// Extract method /////////////////////
    public void checktextfield()
    {
        if(sname.equals(""))
                    {
                        JOptionPane.showMessageDialog(null,"Please Enter name");
                    }
            else if(sroll.equals("")){
                            JOptionPane.showMessageDialog(null, "Please Enter hometown");
                        }
            else if(ssession.equals("")){
                            JOptionPane.showMessageDialog(null, "Please Enter Session");
                        }
                    else if(shometown.equals("")){
                            JOptionPane.showMessageDialog(null, "Please Enter hometown");
                        }
                   else if(semail.equals("")){
                                JOptionPane.showMessageDialog(null, "Please Enter Email");
                            }
                    else if(scontact.equals("")){
                                    JOptionPane.showMessageDialog(null,"Please Enter contact");
                                }
                    else if(sblood.equals("")){
                                        JOptionPane.showMessageDialog(null,"Please Enter Blood");
                                    }
                
                else{
                    
                   filewriter(sname,sroll,ssession,shometown,semail,scontact,sblood);
                   JOptionPane.showMessageDialog(null,"Added Succesfully");
                   emptytf();
                    
                }
                
    }
    ///////////////////////// Extract method //////////////////////
    private void filewriter(String sname, String sroll, String ssession, String shometown, String semail, String scontact, String sblood) {
                try{
                    FileWriter wr = new FileWriter("student.txt",true);
                    wr.write(sname+" "+"#");
                    wr.write(sroll+" "+"#");
                    wr.write(ssession+" "+"#");
                    wr.write(shometown+" "+"#");
                    wr.write(semail+" "+"#");
                    wr.write(scontact+" "+"#");
                    wr.write(sblood+" "+"#");    
                    wr.write(System.getProperty("line.separator"));
                    wr.close();
                }
                catch(Exception ae)
                {
                    System.out.println(ae);
                }
            }
    
}
