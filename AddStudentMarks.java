
package projectsms;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class AddStudentMarks extends  StudentMarks{
    
      JButton add_button;
      JTextField filename_textfield;
      JLabel filenamelbl;
      String filename;
    Object back;
    
    AddStudentMarks(){
        
        filenamelbl=new JLabel("File Name");      
        filenamelbl.setFont(font);
       filenamelbl.setBounds(140,460,350,50);
       container.add(filenamelbl);
        
        filename_textfield=new JTextField();      
        filename_textfield.setFont(font);
        filename_textfield.setBounds(500,460,300,40);
        container.add(filename_textfield);
        
        add_button=new JButton("Add");
        add_button.setBounds(650,510,150,50);
        add_button.setFont(font);
        add_button.setBackground(Color.BLACK);
        add_button.setForeground(Color.WHITE);
        container.add(add_button);
        
        add_button.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            
            if(e.getSource()==add_button)
            {
                String sname =name_textfield.getText();
                String sroll = roll_textfield.getText();
                String sct1 = ct1_textfield.getText();
                String sct2 = ct2_textfield.getText();
                String sassign =assignment_textfield.getText();
                String sattendence = attendence_textfield.getText();
                filename_textfield.setText(filename);
                String sfilename = filename_textfield.getText();
                
                
                
                
                if(sname.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Insert name");
                }
                else if(sroll.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Insert roll");
                }
                else if(sct1.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Insert CT1 Mark");
                }
                else if(sct2.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Insert CT2 Mark");
                }
               else if(sassign.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Insert Assgignment Mark");
                }
               else if(sattendence.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Insert Attentence Mark");
                }
               else if(!sfilename.equals(filename)){
                    JOptionPane.showMessageDialog(null,"You Modify the Filenme");
                }
                else{
                     double intct1 =Double.parseDouble(sct1);
                double intct2 =Double.parseDouble(sct2);
                double intassign =Double.parseDouble(sassign);
               double intattend =Double.parseDouble(sattendence);
                if(intct1>=intassign && intct2>=intassign){
                                 
                      double sum = (intct1+intct2)/2+intattend;
                              
                         String sum1=new Double(sum).toString();
                         filewriter(sname,sroll,sct1,sct2,sassign,sattendence,sum1);
                         JOptionPane.showMessageDialog(null, "Insert Successfully");
                           name_textfield.setText("");
                          roll_textfield.setText("");
                         ct1_textfield.setText("");
                          ct2_textfield.setText("");
                         assignment_textfield.setText("");
                         attendence_textfield.setText("");
                            }
                             else if(intct1>=intct2 && intct2<=intassign){
                                 double sum = (intct1+intassign)/2+intattend;
                                  String sum1=new Double(sum).toString(); 
                                  filewriter(sname,sroll,sct1,sct2,sassign,sattendence,sum1);
                                  JOptionPane.showMessageDialog(null, "Insert Successfully");
                                 name_textfield.setText("");
                                 roll_textfield.setText("");
                                 ct1_textfield.setText("");
                                  ct2_textfield.setText("");
                                 assignment_textfield.setText("");
                                 attendence_textfield.setText("");
                             }
                             else if(intct1<=intct2 && intct1<=intassign){
                                 
                                 double sum = (intct2+intassign)/2+intattend;
                                  String sum1=new Double(sum).toString(); 
                                  filewriter(sname,sroll,sct1,sct2,sassign,sattendence,sum1);
                                 JOptionPane.showMessageDialog(null, "Insert Successfully");
                                 name_textfield.setText("");
                                 roll_textfield.setText("");
                                 ct1_textfield.setText("");
                                 ct2_textfield.setText("");
                                 assignment_textfield.setText("");
                                 attendence_textfield.setText("");
                              
                                 
                                 
                             }
                   
                    
                    
                    
                } 
                
                
            }
            
            }
        private void filewriter(String sname, String sroll, String sct1, String sct2, String sassign, String sattendence,String sum1) {
                try{
                    FileWriter wr = new FileWriter(filename,true);
                    wr.write(sname+" "+"#");
                    wr.write(sroll+" "+"#");
                    wr.write(sct1+" "+"#");
                    wr.write(sct2+" "+"#");
                    wr.write(sassign+" "+"#");
                    wr.write(sattendence+" "+"#");
                    wr.write(sum1+" "+"#");
                    
                    
                    
                       
                    wr.write(System.getProperty("line.separator"));
                    wr.close();
                }
                catch(Exception ae)
                {
                    System.out.println(ae);
                }
            }
        
        });
        
        

        
        
    }
    
   // public static void main(String[] args) {
       // AddStudentMarks addStudentMarks = new AddStudentMarks();
   // }
    
    
}
