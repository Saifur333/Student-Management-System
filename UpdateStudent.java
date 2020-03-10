
package projectsms;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class UpdateStudent extends AddMember{
    
    JButton update_button;
    int row;
    
    UpdateStudent(){
        
        update_button=new JButton("Update");
        update_button.setBounds(520,510,150,50);
        update_button.setFont(font);
        update_button.setBackground(Color.BLACK);
        update_button.setForeground(Color.WHITE);
        container.add(update_button);
        
        update_button.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
         if(e.getSource()==update_button)
            {
                
            String sname =name_textfield.getText();
            String sroll =roll_textfield.getText();
            String  ssession = session_textfield.getText();
            String  shometown = hometown_textfield.getText();
            String  semail = email_textfield.getText();
            String scontact = contact_textfield.getText();
            String sblood = blood_textfield.getText();
            
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
                        JOptionPane.showMessageDialog(null,"Updated Succesfully");
                    
                try {
                    
                    frame.dispose();
                    StudentInformation stu  = new StudentInformation();
                    stu.model.setValueAt(sname, row, 0);
                    stu.model.setValueAt(sroll, row, 1);
                    stu.model.setValueAt(ssession, row, 2);
                    stu.model.setValueAt(shometown, row, 3);
                    stu.model.setValueAt(semail, row, 4);
                    stu.model.setValueAt(scontact, row, 5);
                    stu.model.setValueAt(sblood, row, 6);
               
                           File file  = new File("student.txt");
                           try{
                                FileWriter  fr = new FileWriter(file);
                                BufferedWriter bw = new BufferedWriter(fr); 
           
         
        
               
                                for(int i=0;i<stu.table.getRowCount();i++) 
                                {
                                   for(int j=0;j<stu.table.getColumnCount();j++)
                                   {
                                     bw.write(stu.table.getValueAt(i, j).toString()+" "+"#");
                    
                                   }
                                     bw.write(System.getProperty("line.separator")); 
                
                               }
           
                                bw.close(); 
                               fr.close();        
            
                           }
                          catch(FileNotFoundException ea)
                          {
                           ea.printStackTrace();
                          }     catch (IOException ex) {
                          Logger.getLogger(UpdateStudentInformation.class.getName()).log(Level.SEVERE, null, ex);
                          }
                         } catch (FileNotFoundException ex) {
                         Logger.getLogger(UpdateStudent.class.getName()).log(Level.SEVERE, null, ex);
                         }
                   
                   
                    
                }
                
               
                
            }
        }
           
            
        
        
        });
    }
    
    
}
