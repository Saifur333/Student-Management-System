
package projectsms;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import javax.swing.JButton;


public class UpdateFacultyInformation extends TeacherInformtion {
    
    public JButton update_button,back_button,edit_button;
  
    
    public UpdateFacultyInformation() throws FileNotFoundException
    {
       
      
        
        back_button=new JButton("Back");
        back_button.setBounds(700,600,150,50);
        //home.setFont(f);
        back_button.setBackground(Color.BLACK);
        back_button.setForeground(Color.WHITE);
        container.add(back_button);
        
        
        table.addMouseListener(new MouseAdapter(){
            
            public void mouseClicked(MouseEvent ae){
                
                int numRow = table.getSelectedRow();
                String name =model.getValueAt(numRow, 0).toString();
                String home = model.getValueAt(numRow, 1).toString();
                String email_name  = model.getValueAt(numRow, 2).toString();
                String contact_no = model.getValueAt(numRow, 3).toString();
                String blood_grp = model.getValueAt(numRow, 4).toString();
               // model.removeRow(numRow);
                
                  
        
                
                frame.dispose();
                Updatefaculty adm = new Updatefaculty();
                adm.name_textfield.setText(name);
                adm.hometown_textfield.setText(home);
                adm.email_textfield.setText(email_name);
                adm.contact_textfield.setText(contact_no);
                adm.blood_textfield.setText(blood_grp);
                adm.row=numRow;
                
                
            }
        });
        back_button.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                frame.dispose();
                AdminstratorDemo admin =new AdminstratorDemo();
        }
        
        });
    }
    
}
