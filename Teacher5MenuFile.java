
package projectsms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;


public class Teacher5MenuFile extends MenuFile{
    int option;
    Teacher5MenuFile(){
             
              new_menuitem.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
             File file;
             filename1=null;
            //JOptionPane.showMessageDialog(null, "why");
            if(filename1==null){
                int option = filechooser.showSaveDialog(Teacher5MenuFile.this);
            if(option==JFileChooser.APPROVE_OPTION){
                file=filechooser.getSelectedFile();
                filename1 = file.getPath();
                frame.dispose();
                AddStudentMarks addStudentMarks = new AddStudentMarks();
                addStudentMarks.filename=filename1;
               addStudentMarks.back_button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               if(ae.getSource()==addStudentMarks.back_button)
               {
                 addStudentMarks.frame.dispose();
                 Teacher5MenuFile dmf = new Teacher5MenuFile();
                  
               }
            }
            
        });
                
            }
            }
            
            
            
            
        }
        
        });
              back_button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               if(ae.getSource()==back_button)
               {
                  frame.dispose();
                 Teacher5Module dtm = new Teacher5Module();
            
                  
               }
            }
            
        });
              
              
    }
    
}

