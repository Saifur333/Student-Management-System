
package projectsms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;

public class DipanitaCourseMenu extends CourseMenu{
     int option;
    DipanitaCourseMenu(){
        
        new_menuitem.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
             File file;
             filename1=null;
            //JOptionPane.showMessageDialog(null, "why");
            if(filename1==null){
                int option = filechooser.showSaveDialog(DipanitaCourseMenu.this);
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
                 DipanitaCourseMenu dmf = new DipanitaCourseMenu();
                  
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
                  DipanitaModule dtm = new DipanitaModule();
            
                  
               }
            }
            
        });
        
    }
    
}
