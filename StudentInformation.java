
package projectsms;


import java.awt.Color;
import java.awt.Container; 
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class StudentInformation extends JFrame{
    
    Container container;
    JTable table;
    DefaultTableModel model;
    JScrollPane scroll;
    String[] coloum = {"Name","Roll No","Session","Home town","Email","Contact","Blood group"};
      JFrame frame;      
    //String[] rows = new String[6];
    JButton home_button;
    
    public StudentInformation() throws FileNotFoundException {
    
         
        container=this.getContentPane();
        container.setLayout(null);
        container.setBackground(new java.awt.Color(0, 230, 230));
        
       
        
         Font hf=new Font("Arial",Font.BOLD,16);
        
        
        table = new JTable();
        
        model = new DefaultTableModel();
        model.setColumnIdentifiers(coloum);
        table.setModel(model);
        table.setFont(hf);
        table.setSelectionBackground(Color.BLACK);
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);
        
        scroll = new JScrollPane(table);
        scroll.setBounds(10,30,1300,500);
        container.add(scroll);
        
        
        home_button=new JButton("Home");
        home_button.setBounds(1100,600,150,50);
        //home_button.setFont(f);
        home_button.setBackground(Color.BLACK);
        home_button.setForeground(Color.WHITE);
        container.add(home_button);
        
        
        
        
        frame=new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,800,650);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setTitle("Student Information");
        frame.setVisible(true);

        frame.add(container);
        
        //String arr[]= {"dsfs","dhgfh","fgdh","hggfh","fgh","fghf"};
        //model.addRow(arr);
        String filepath = "";
        
        File file  = new File("student.txt");
         
      try{
           FileReader  fr = new FileReader(file);
           BufferedReader br = new BufferedReader(fr); 
           
           Object[] lines = br.lines().toArray();
           
           for(int i=0;i<lines.length;i++)
           {
               String[] row = lines[i].toString().split("#");
               
               model.addRow(row);
           }
           
      }
      catch(Exception e)
      {
          e.printStackTrace();
      }
        
        
        home_button.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                frame.dispose();
                Home hm = new Home();           
        }
        
        });
        
        
       
        
       
    }
    
    
}
