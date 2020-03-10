
package projectsms;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class Teacher5AddCourse extends AddCourses{
    
    Teacher5AddCourse(){
        
        back_button = new JButton("Back");
        back_button.setBounds(290, 560, 130, 50);
        back_button.setBackground(Color.BLACK);
        back_button.setForeground(Color.WHITE);
        back_button.setFont(font);
        container.add(back_button);
        
         
         
         Add_button.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
               if(e.getSource()==Add_button)
            {
                
                String name =name_textfield.getText();
                String code =code_textfield.getText();
                String  description = description_textfield.getText();
                if(name.equals("")){
                    JOptionPane.showMessageDialog(null, "Pelase Enter  Coursename");
                }
                else if(code.equals("")){
                    JOptionPane.showMessageDialog(null, "Pelase Enter  Course Code");
                }
                else if(description.equals("")){
                    JOptionPane.showMessageDialog(null, "Pelase Say something About Course");
                }
                else{
                    filewriter(name,code,description);
                    JOptionPane.showMessageDialog(null,"added Successfully");
                    name_textfield.setText("");
                    code_textfield.setText("");
                   description_textfield.setText("");
                    
                }
                
                
                
                
                
                
            }
        }
            private void filewriter(String tname, String tcode, String desArea) {
                try{
                    FileWriter wr = new FileWriter("teacher5Course.txt",true);
                    wr.write(tname+" "+"#");
                    wr.write(tcode+" "+"#");
                    wr.write(desArea+" "+"#");   
                    wr.write(System.getProperty("line.separator"));
                    wr.close();
                }
                catch(Exception ae)
                {
                    System.out.println(ae);
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
            
  
                frame.dispose();
                Teacher5Module admin =new Teacher5Module();
        }
        
        });
        
    }
    
}
