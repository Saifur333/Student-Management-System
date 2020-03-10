
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


public class DeleteStudent extends StudentInformation{
     
     JButton delete_button,back_button;     
   public  DeleteStudent() throws FileNotFoundException{
        
        
        delete_button=new JButton("Delete");
        delete_button.setBounds(1100,540,150,50);
        //home.setFont(f);
        delete_button.setBackground(Color.BLACK);
        delete_button.setForeground(Color.WHITE);
        container.add(delete_button);
        
        back_button=new JButton("Back");
        back_button.setBounds(700,600,150,50);
        //home.setFont(f);
        back_button.setBackground(Color.BLACK);
        back_button.setForeground(Color.WHITE);
        container.add(back_button);
        
        delete_button.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                int numRow =table.getSelectedRow();
                model.removeRow(numRow);
                
                JOptionPane.showMessageDialog(null,"Delete SuccessFully\n");
                File file  = new File("student.txt");
            try{
           FileWriter  fr = new FileWriter(file);
           BufferedWriter bw = new BufferedWriter(fr); 
           
           //Object[] lines = bw.lines().toArray();
        
               
            for(int i=0;i<table.getRowCount();i++) 
            {
                 for(int j=0;j<table.getColumnCount();j++)
                 {
                  bw.write(table.getValueAt(i, j).toString()+" "+"#");
                    
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
         
        }
      
        
        });
        back_button.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                frame.dispose();
                AdminstratorDemo admin = new AdminstratorDemo();
        }
        
        });
    }
    
}
