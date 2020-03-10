
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
import javax.swing.JFrame;


public class UpdateRoutines extends AddRoutine{
    
    JButton update_button;
    JFrame frame;
    int row;
    
    UpdateRoutines() {
         add.setVisible(false);
        update_button=new JButton("update_button");
        update_button.setBounds(520,510,150,50);
       update_button.setFont(font);
        update_button.setBackground(Color.BLACK);
        update_button.setForeground(Color.WHITE);
        container.add(update_button);
        
         update_button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(e.getSource()==update_button){
         String sntf=daytf.getText();
         String mntf=firsttf.getText();
         String fntf=secondtf.getText();
         String httf=thirdtf.getText();
         String etf=fourthtf.getText();
         String ctf=fifthtf.getText();
         String btf=sixthtf.getText();
         
                    // frame.dispose();
                    Routine_Demo ru;
                    try {
                        ru = new Routine_Demo();
                        
                     ru.model.setValueAt(sntf, row, 0);
                    ru.model.setValueAt(mntf, row, 1);
                    ru.model.setValueAt(fntf, row, 2);
                    ru.model.setValueAt(httf, row, 3);
                    ru.model.setValueAt(etf, row, 4);
                    ru.model.setValueAt(ctf, row, 5);
                    ru.model.setValueAt(btf, row, 6);
                    File file  = new File("routine.txt");
                           try{
                                FileWriter  fr = new FileWriter(file);
                                BufferedWriter bw = new BufferedWriter(fr); 
           
         
        
               
                                for(int i=0;i<ru.table.getRowCount();i++) 
                                {
                                   for(int j=0;j<ru.table.getColumnCount();j++)
                                   {
                                     bw.write(ru.table.getValueAt(i, j).toString()+" "+"#");
                    
                                   }
                                     bw.write(System.getProperty("line.separator")); 
                
                               }
           
                                bw.close(); 
                               fr.close();        
            
                           }
                          catch(FileNotFoundException ea)
                          {
                           ea.printStackTrace();
                          } catch (IOException ex) {
                 Logger.getLogger(AddRoutine.class.getName()).log(Level.SEVERE, null, ex);
             }
                        
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(AddRoutine.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
       
        
                }
             }
             });
                }
    
    
}
