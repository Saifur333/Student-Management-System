
package projectsms;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;


public class AdminstratorDemo extends JFrame{
    
    private Container container;
    private JLabel adminlabel,label1,label2,label3,label4,label5,label6,label7,label8;
    private JButton homebtn,addfacultybtn,addstubtn,updatebtn,deletestubtn,updatefacbtn,deletetfacbtn,routinebtn,addroutinebtn;
    private final Font font;
    private final Font hf;
    private final Cursor cursor; 
    
    AdminstratorDemo(){
        container=this.getContentPane();
        container.setLayout(null);
        container.setBackground(new java.awt.Color(0, 230, 230));
        
        
        hf=new Font("Arial",Font.BOLD,28);
        font=new Font("Arial",Font.BOLD,24);
        cursor =new Cursor(Cursor.HAND_CURSOR);
        
        adminlabel=new JLabel("Administrator");
        adminlabel.setFont(hf);
        adminlabel.setBounds(380,60,200,70);
        container.add(adminlabel);
        
        label1=new JLabel("1.");
        label1.setFont(font);
        label1.setBounds(180,140,20,50);
        container.add(label1);
        
        updatebtn=new JButton("Update Student Information");
        updatebtn.setBounds(200,140,370,50);
        updatebtn.setFont(font);
        updatebtn.setCursor(cursor);
        updatebtn.setBackground(new java.awt.Color(0,230,230));
        container.add(updatebtn);
        
        label2=new JLabel("2.");
        label2.setFont(font);
        label2.setBounds(180,200,20,50);
        container.add(label2);
        
        addstubtn=new JButton("Add Student");
        addstubtn.setBounds(200,200,190,50);
        addstubtn.setFont(font);
        addstubtn.setCursor(cursor);
        addstubtn.setBackground(new java.awt.Color(0,230,230));
        container.add(addstubtn);
        
        label3=new JLabel("3.");
        label3.setFont(font);
        label3.setBounds(180,260,20,50);
        container.add(label3);
        
        deletestubtn=new JButton("Delete Student");
        deletestubtn.setBounds(200,260,210,50);
        deletestubtn.setFont(font);
        deletestubtn.setCursor(cursor);
        deletestubtn.setBackground(new java.awt.Color(0,230,230));
        container.add(deletestubtn);
        
        label4=new JLabel("4.");
        label4.setFont(font);
        label4.setBounds(180,320,20,50);
        container.add(label4);
        
        addfacultybtn=new JButton("Add a Faculty member");
        addfacultybtn.setBounds(200,320,300,50);
        addfacultybtn.setFont(font);
        addfacultybtn.setCursor(cursor);
        addfacultybtn.setBackground(new java.awt.Color(0,230,230));
        container.add(addfacultybtn);
        
        label5=new JLabel("5.");
        label5.setFont(font);
        label5.setBounds(180,380,20,50);
        container.add(label5);
        
        updatefacbtn=new JButton("Update Faculty member Information");
        updatefacbtn.setBounds(200,380,450,50);
        updatefacbtn.setFont(font);
        updatefacbtn.setCursor(cursor);
        updatefacbtn.setBackground(new java.awt.Color(0,230,230));
        container.add(updatefacbtn);
        
        label6=new JLabel("6.");
        label6.setFont(font);
        label6.setBounds(180,440,20,50);
        container.add(label6);
        
        deletetfacbtn=new JButton("Delete a Faculty member");
        deletetfacbtn.setBounds(200,440,330,50);
        deletetfacbtn.setFont(font);
        deletetfacbtn.setCursor(cursor);
        deletetfacbtn.setBackground(new java.awt.Color(0,230,230));
        container.add(deletetfacbtn);
        
        label7=new JLabel("7.");
        label7.setFont(font);
        label7.setBounds(180,500,20,50);
        container.add(label7);
        
        routinebtn=new JButton("Update Routine");
        routinebtn.setBounds(200,500,220,50);
        routinebtn.setFont(font);
        routinebtn.setCursor(cursor);
        routinebtn.setBackground(new java.awt.Color(0,230,230));
        container.add(routinebtn);
        
        label8=new JLabel("8.");
        label8.setFont(font);
        label8.setBounds(180,560,20,50);
        container.add(label8);
        
        addroutinebtn=new JButton("Add Routine");
        addroutinebtn.setBounds(200,560,210,50);
        addroutinebtn.setFont(font);
        addroutinebtn.setCursor(cursor);
        addroutinebtn.setBackground(new java.awt.Color(0,230,230));
        container.add(addroutinebtn);
        
        
        homebtn=new JButton("Home");
        homebtn.setBounds(300,620,150,50);
        homebtn.setFont(font);
        homebtn.setBackground(Color.BLACK);
        homebtn.setForeground(Color.WHITE);
        homebtn.setCursor(cursor);
        container.add(homebtn);
        
        Border emptyBorder = BorderFactory.createEmptyBorder();
        addstubtn.setBorder(emptyBorder);
        updatebtn.setBorder(emptyBorder);
       deletestubtn.setBorder(emptyBorder);
        addfacultybtn.setBorder(emptyBorder);
        updatefacbtn.setBorder(emptyBorder);
        deletetfacbtn.setBorder(emptyBorder);
        routinebtn.setBorder(emptyBorder);
        addroutinebtn.setBorder(emptyBorder);
        
        JFrame frame=new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,800,650);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setTitle("Administrator");
        frame.setVisible(true);
        frame.add(container);   
        
        
        homebtn.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                frame.dispose();
                Home admin =new Home();
        }
        
        });
        
        addfacultybtn.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                if(e.getSource()==addfacultybtn){
                 
                    frame.dispose();
                    AddfacultyMember addmember = new AddfacultyMember();
                    
                }
        }
        
        });
        
        addstubtn.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                if(e.getSource()==addstubtn){
                 
                    frame.dispose();
                    AddStudentMember addmember = new AddStudentMember();
                    
                }
        }
        
        });
        
        updatebtn.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                if(e.getSource()==updatebtn){
                 
                    frame.dispose();
                    try {
                        UpdateStudentInformation up = new UpdateStudentInformation();
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(AdminstratorDemo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
        }
        
        });
        
       updatefacbtn.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                if(e.getSource()==updatefacbtn){
                 
                    frame.dispose();
                    try {
                        UpdateFacultyInformation up = new UpdateFacultyInformation();
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(AdminstratorDemo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
        }
        
        });
        
        deletestubtn.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                if(e.getSource()==deletestubtn){
                 
                    frame.dispose();
                    try {
                        DeleteStudent deletestu = new DeleteStudent();
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(AdminstratorDemo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                   
                    
                    
                }
        }
        
        });
        
         deletetfacbtn.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                if(e.getSource()== deletetfacbtn){
                 
                    frame.dispose();
                    try {
                        DeleteFaculty delete = new DeleteFaculty();
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(AdminstratorDemo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                   
                    
                    
                }
        }
        
        });
         routinebtn.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                if(e.getSource()== routinebtn){
                 
                    frame.dispose();
                    try {
                        UpdateRoutine updateRoutine = new UpdateRoutine();
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(AdminstratorDemo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                   
                    
                    
                }
        }
        
        });
         addroutinebtn.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                if(e.getSource()== addroutinebtn){
                 
                    frame.dispose();
                    AddRoutine updateRoutine = new AddRoutine();
                   
                    
                    
                }
        }
        
        });         
    }
    public static void main(String[] args) {
       AdminstratorDemo adminDemo = new AdminstratorDemo();
    }
}
