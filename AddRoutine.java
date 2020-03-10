
package projectsms;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class AddRoutine extends JFrame{
    
    public Container container;
    public JLabel daylbl,firstlbl,secondlbl,thirdlbl,fourthlbl,fifthlbl,sixthlbl;
    public JTextField daytf,firsttf,secondtf,thirdtf,fourthtf,fifthtf,sixthtf;
    public JButton add,clear,home;
    public Font font;
    
    AddRoutine()
    {
        container=this.getContentPane();
        container.setLayout(null);
        container.setBackground(new java.awt.Color(0, 230, 230));
        
        font=new Font("Arial",Font.BOLD,24);
        
        
        daylbl=new JLabel("Day name      :");      
        daylbl.setFont(font);
        daylbl.setBounds(140,100,220,50);
        container.add(daylbl);
        
        daytf=new JTextField();      
        daytf.setFont(font);
        daytf.setBounds(400,100,300,40);
        container.add(daytf);
        
        
        firstlbl=new JLabel("09.00am-10.00am:");      
        firstlbl.setFont(font);
       firstlbl.setBounds(140,160,220,50);
        container.add(firstlbl);
        
       firsttf=new JTextField();      
        firsttf.setFont(font);
        firsttf.setBounds(400,160,300,40);
        container.add(firsttf);
        
        secondlbl=new JLabel("10.00am-11.00am:");      
        secondlbl.setFont(font);
        secondlbl.setBounds(140,220,220,50);
        container.add(secondlbl);
        
        secondtf=new JTextField();      
        secondtf.setFont(font);
        secondtf.setBounds(400,220,300,40);
        container.add(secondtf);
        
        thirdlbl=new JLabel("11.00am-12.00pm:");      
        thirdlbl.setFont(font); 
        thirdlbl.setBounds(140,280,220,50);
        container.add(thirdlbl);
        
        thirdtf=new JTextField();      
        thirdtf.setFont(font);
        thirdtf.setBounds(400,280,300,40);
        container.add(thirdtf);
        
        fourthlbl=new JLabel("12.00pm-01.00pm:");      
        fourthlbl.setFont(font); 
        fourthlbl.setBounds(140,340,220,50);
        container.add(fourthlbl);
        
        fourthtf=new JTextField();      
        fourthtf.setFont(font);
        fourthtf.setBounds(400,340,300,40);
        container.add(fourthtf);
        
        fifthlbl=new JLabel("02.00pm-03.00pm:");      
        fifthlbl.setFont(font);
        fifthlbl.setBounds(140,400,220,50);
        container.add(fifthlbl);
        
        fifthtf=new JTextField();      
        fifthtf.setFont(font);
        fifthtf.setBounds(400,400,300,40);
        container.add(fifthtf);
        
        sixthlbl=new JLabel("03.00pm-04.00pm:");      
        sixthlbl.setFont(font);
        sixthlbl.setBounds(140,460,220,50);
        container.add(sixthlbl);
        
        sixthtf=new JTextField();      
        sixthtf.setFont(font);
        sixthtf.setBounds(400,460,300,40);
        container.add(sixthtf);
        
        add=new JButton("Add");
        add.setBounds(520,510,150,50);
        add.setFont(font);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        container.add(add);
        
        clear=new JButton("Clear");
        clear.setBounds(180,570,150,50);
        clear.setFont(font);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        container.add(clear);
        
        home=new JButton("Home");
        home.setBounds(520,570,150,50);
        home.setFont(font);
        home.setBackground(Color.BLACK);
        home.setForeground(Color.WHITE);
        container.add(home);
        
        clear.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            daytf.setText("");
            firsttf.setText("");
            secondtf.setText("");
            thirdtf.setText("");
            fourthtf.setText("");
            fifthtf.setText("");
            sixthtf.setText("");
            }
             });
        
        home.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            
            if(e.getSource()==home)
            {
                dispose();
                Home home=new Home();  
            }
            }
        
        });

        add.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(e.getSource()==add){
         String sntf=daytf.getText();
         String mntf=firsttf.getText();
         String fntf=secondtf.getText();
         String httf=thirdtf.getText();
         String etf=fourthtf.getText();
         String ctf=fifthtf.getText();
         String btf=sixthtf.getText();
       
         filewriter(sntf,mntf,fntf,httf,etf,ctf,btf); 
                }
             }
             });
               
        
        JFrame frame=new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,800,650);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setTitle("Add Routine data");
        frame.setVisible(true);
        frame.add(container);
        
    }
        
        public void filewriter(String sntf,String mntf,String fntf,String httf,String etf,String ctf,String btf)
        {
        try{
            FileWriter fn=new FileWriter("routine.txt",true);
            fn.write(sntf+" "+"");
            fn.write(mntf+" "+"");
            fn.write(fntf+" "+"");
            fn.write(httf+" "+"");
            fn.write(etf+" "+"");
            fn.write(ctf+" "+"");
            fn.write(btf+" "+"");
            fn.write(System.getProperty("line.separator"));

           fn.close();   
         }
        catch(Exception e)
        {
          e.printStackTrace();
        }
         
        }
    
    
    public static void main(String[] args) {
        AddRoutine r =new AddRoutine();
    }
    
}
