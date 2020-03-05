
package projectsms;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class AddCoursePresent extends JFrame {
   
    
    
     Container container;
     JLabel namelbl,rolllbl,ct1lbl,ct2lbl,assignlbl,attendencelbl,presentlbl;
     JTextField name,roll,ct1,ct2,assign,attendence,present;
      JButton back_button,home_button,add_button;
     final Font font;
     JFrame frame;
     private static DecimalFormat df2 = new DecimalFormat("#.##");
    
  
    AddCoursePresent(){
        container=this.getContentPane();
        container.setLayout(null);
        container.setBackground(new java.awt.Color(0, 230, 230));
        
        font=new Font("Arial",Font.BOLD,24);
        
        
        namelbl=new JLabel("Roll No");      
        namelbl.setFont(font);
        namelbl.setBounds(140,100,200,50);
        container.add(namelbl);
        
        name=new JTextField();      
        name.setFont(font);
        name.setBounds(500,100,300,40);
        container.add(name);
        
        
        rolllbl=new JLabel("Semester");      
        rolllbl.setFont(font);
        rolllbl.setBounds(140,160,200,50);
        container.add(rolllbl);
       
        roll=new JTextField();      
        roll.setFont(font);
        roll.setBounds(500,160,300,40);
        container.add(roll);
        
        ct1lbl=new JLabel("Session ");      
        ct1lbl.setFont(font);
        ct1lbl.setBounds(140,220,200,50);
        container.add(ct1lbl);
        
        ct1=new JTextField();      
        ct1.setFont(font);
        ct1.setBounds(500,220,300,40);
        container.add(ct1);
        
        ct2lbl=new JLabel("Course name");      
        ct2lbl.setFont(font); 
        ct2lbl.setBounds(140,280,200,50);
        container.add(ct2lbl);
        
        ct2=new JTextField();      
        ct2.setFont(font);
        ct2.setBounds(500,280,300,40);
        container.add(ct2);
        
        assignlbl=new JLabel("Course Code");      
        assignlbl.setFont(font); 
        assignlbl.setBounds(140,340,350,50);
        container.add(assignlbl);
        
        assign=new JTextField();      
        assign.setFont(font);
        assign.setBounds(500,340,300,40);
        container.add(assign);
        
        attendencelbl=new JLabel("Class Held");      
        attendencelbl.setFont(font);
        attendencelbl.setBounds(140,400,350,50);
        container.add(attendencelbl);
        
        attendence=new JTextField();      
        attendence.setFont(font);
        attendence.setBounds(500,400,300,40);
        container.add(attendence);
        
       presentlbl=new JLabel("Class present");      
        presentlbl.setFont(font);
        presentlbl.setBounds(140,460,350,50);
        container.add(presentlbl);
        
       present=new JTextField();      
        present.setFont(font);
        present.setBounds(500,460,300,40);
        container.add(present);
        
      
        add_button=new JButton("Add");
        add_button.setBounds(650,510,150,50);
        add_button.setFont(font);
        add_button.setBackground(Color.BLACK);
        add_button.setForeground(Color.WHITE);
        container.add(add_button);
        
        
        back_button=new JButton("Back");
        back_button.setBounds(180,570,150,50);
       back_button.setFont(font);
        back_button.setBackground(Color.BLACK);
        back_button.setForeground(Color.WHITE);
        container.add(back_button);
        
        home_button=new JButton("Home");
        home_button.setBounds(650,570,150,50);
        home_button.setFont(font);
        home_button.setBackground(Color.BLACK);
        home_button.setForeground(Color.WHITE);
        container.add(home_button);
        
        
         frame=new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,800,650);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setTitle("Student Attendence");
        frame.setVisible(true);
        frame.add(container);
        
        add.addActionListener(new ActionListener(){
        
  
        public void actionPerformed(ActionEvent e){
            
  
                if(e.getSource()==add){
                String sroll =name.getText();
                String semister = roll.getText();
                String session = ct1.getText();
                String cname = ct2.getText();
                String ccode =assign.getText();
                String cheld = attendence.getText();
                String cpresent = present.getText();
                
                String file = sroll+semister;
              
                
                 if(sroll.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Insert roll");
                }
                 else if(semister.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Insert Semister");
                }
                 else if(session.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Insert Session");
                }
                 else if(cname.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Insert Course name");
                }
                else if(ccode.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Insert Course Code");
                }
                else if(cheld.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Insert Class held No");
                }
                 else if(cpresent.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Insert Class Present No");
                }
                 else{
                     
                     double cheld1 =Double.parseDouble(cheld);
                     double cpresent1 =Double.parseDouble(cpresent);
                     double parcent1 =(cpresent1/cheld1)*100;
                     String parcent = df2.format(parcent1);
                     
                     String parcent2 =new Double(parcent).toString();
                     filewriter(file,cname,ccode,cheld,cpresent,parcent2);
                     JOptionPane.showMessageDialog(null, "Added Successfully");
                     name.setText("");
                     roll.setText("");
                     ct1.setText("");
                     ct2.setText("");
                     assign.setText("");
                     attendence.setText("");
                     present.setText("");
                     
                 }
                  
                           

                }
        }
        private void filewriter(String file, String cname, String ccode, String cheld,String cpresent,String parcent1) {
                try{
                    FileWriter wr = new FileWriter(file,true);
                   // wr.write(sroll+" "+"#");
                    //wr.write(semister+" "+"#");
                    //wr.write(session+" "+"#");
                    wr.write(cname+" "+"#");
                    wr.write(ccode+" "+"#");
                    wr.write(cheld+" "+"#");
                    wr.write(cpresent+" "+"#");
                    wr.write(parcent1+" "+"#");
                    
                    
                    
                       
                    wr.write(System.getProperty("line.separator"));
                    wr.close();
                }
                catch(Exception ae)
                {
                    System.out.println(ae);
                }
            }
        
        });
        home.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               if(ae.getSource()==home)
               {
                  frame.dispose();
                  Home menuFile = new Home();
                  
               }
            }
            
        });
    }
    
  
    
}

