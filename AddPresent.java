
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


public class AddPresent extends JFrame{
    
     Container container;
     JLabel namelbl,rolllbl,heldlbl,presentlbl;
     JTextField name_textfield,roll_textfield,held_textfield,present_textfield;
      JButton back_button,home_button,add_button;
     final Font font;
     JFrame frame;
     private static DecimalFormat df2 = new DecimalFormat("#.##");
     
     String filename;
    
  
    AddPresent(){
        container=this.getContentPane();
        container.setLayout(null);
        container.setBackground(new java.awt.Color(0, 230, 230));
        
        font=new Font("Arial",Font.BOLD,24);
        
        
        namelbl=new JLabel("Name");      
        namelbl.setFont(font);
        namelbl.setBounds(140,100,200,50);
        container.add(namelbl);
        
        name_textfield=new JTextField();      
        name_textfield.setFont(font);
        name_textfield.setBounds(500,100,300,40);
        container.add(name_textfield);
        
        
        rolllbl=new JLabel("Roll no");      
        rolllbl.setFont(font);
        rolllbl.setBounds(140,160,200,50);
        container.add(rolllbl);
       
        roll_textfield=new JTextField();      
        roll_textfield.setFont(font);
        roll_textfield.setBounds(500,160,300,40);
        container.add(roll_textfield);
        
        heldlbl=new JLabel("Class Held(H)");      
        heldlbl.setFont(font);
        heldlbl.setBounds(140,220,200,50);
        container.add(heldlbl);
        
        held_textfield=new JTextField();      
        held_textfield.setFont(font);
        held_textfield.setBounds(500,220,300,40);
        container.add(held_textfield);
        
        presentlbl=new JLabel("Present In Class(H)");      
        presentlbl.setFont(font); 
        presentlbl.setBounds(140,280,250,50);
        container.add(presentlbl);
        
        present_textfield=new JTextField();      
        present_textfield.setFont(font);
        present_textfield.setBounds(500,280,300,40);
        container.add(present_textfield);
             
      
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
        frame.setTitle("Course Attendence");
        frame.setVisible(true);
        frame.add(container);
        
        add_button.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            
            if(e.getSource()==add_button)
            {
                String sname =name_textfield.getText();
                String sroll = roll_textfield.getText();
                String sheld = held_textfield.getText();
                String spresent = present_textfield.getText();
                
                
                
                
                
                if(sname.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Insert name");
                }
                else if(sroll.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Insert roll");
                }
                else if(sheld.equals("")){
                    JOptionPane.showMessageDialog(null,"Please Insert Held classes(H)");
                }
                
                else{
                     double intheld =Double.parseDouble(sheld);
                     double intpresent =Double.parseDouble(spresent);
                     double percent = (intpresent/intheld)*100;
                     String percent1 = df2.format(percent);
                     
                     String parcent2 =new Double(percent1).toString();
                     filewriter(sname,sroll,sheld,spresent,parcent2);
                     JOptionPane.showMessageDialog(null, "Added Successfully");
                     name_textfield.setText("");
                     roll_textfield.setText("");
                     held_textfield.setText("");
                     present_textfield.setText("");
                
                   
                    
                    
                    
                } 
                
                
            }
            
            }
        private void filewriter(String sname, String sroll, String sheld, String spresent, String spercent) {
                try{
                    FileWriter wr = new FileWriter(filename,true);
                    wr.write(sname+" "+"#");
                    wr.write(sroll+" "+"#");
                    wr.write(sheld+" "+"#");
                    wr.write(spresent+" "+"#");
                    wr.write(spercent+" "+"#");
                    
                    
                    
                    
                       
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
            public void actionPerformed(ActionEvent ae) {
               if(ae.getSource()==home_button)
               {
                  frame.dispose();
                  Home menuFile = new Home();
                  
               }
            }
            
        });
    }
    
    public static void main(String[] args) {
        
        AddPresent a =  new AddPresent();
        
    }
    
    
    
}
