
package projectsms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;

public class Teacher4CourseMenu extends CourseMenu{
     int option;
    Teacher4CourseMenu(){
        
        new_menuitem.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
             File file;
             filename1=null;
            //JOptionPane.showMessageDialog(null, "why");
            if(filename1==null){
                int option = filechooser.showSaveDialog(Teacher4CourseMenu.this);
            if(option==JFileChooser.APPROVE_OPTION){
                file=filechooser.getSelectedFile();
                filename1 = file.getPath();
                frame.dispose();
                AddPresent addPresent= new AddPresent();
                addPresent.filename=filename1;
               addPresent.back_button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               if(ae.getSource()==addPresent.back_button)
               {
                 addPresent.frame.dispose();
                 Teacher4CourseMenu dmf = new Teacher4CourseMenu();
                  
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
                  Teacher4Module dtm = new Teacher4Module();
            
                  
               }
            }
            
        });
        
    }
    
}
