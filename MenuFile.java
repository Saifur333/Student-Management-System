
package projectsms;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import static java.awt.SystemColor.menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class MenuFile extends JFrame{
       Container container;
       JMenuBar menubar;
        JMenu  menu;
       JMenuItem new_menuitem,open_menuitem;
       JButton home_button,back_button;
     JFrame frame;
     String filename1;
     JFileChooser filechooser;
     JTable table;
    DefaultTableModel model;
    JScrollPane scroll;
    String[] coloum = {"Name","Roll No","CT1","CT2","Assignment","Attendence","total mark"};
    
     
       
    MenuFile(){
        container = this.getContentPane();
        container.setLayout(null);
        container.setBackground(new java.awt.Color(0, 230, 230));
         
        menubar=new JMenuBar();
        menubar.setBounds(0, 0,1600,50);
        menubar.getMaximumSize();
        
        
        menu=new JMenu("File"); 
        menu.setPreferredSize(new Dimension(105,50));
            
        new_menuitem = new JMenuItem("New"); 
        new_menuitem.setPreferredSize(new Dimension(100,50));
        open_menuitem=new JMenuItem("Open"); 
        open_menuitem.setPreferredSize(new Dimension(100,50));
            
            
        menu.add(new_menuitem); menu.add(open_menuitem);  
        menubar.add(menu);
        container.add(menubar);
        
        
         Font hf=new Font("Arial",Font.BOLD,16);
        table = new JTable();
        
        model = new DefaultTableModel();
        
        
        
        filechooser = new JFileChooser();
        
         home_button=new JButton("Home");
        home_button.setBounds(500,600,150,50);
        home_button.setFont(hf);
        home_button.setBackground(Color.BLACK);
        home_button.setForeground(Color.WHITE);
        container.add(home_button);
        back_button=new JButton("Back");
        back_button.setBounds(700,600,150,50);
        back_button.setFont(hf);
        back_button.setBackground(Color.BLACK);
        back_button.setForeground(Color.WHITE);
        container.add(back_button);
        
        
        frame=new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,800,650);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setTitle("Menu");
        frame.setVisible(true);
        frame.add(container);
        
        
        
        open_menuitem.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
                
                model.setColumnIdentifiers(coloum);
                table.setModel(model);
                table.setFont(hf);
                table.setSelectionBackground(Color.BLACK);
                table.setBackground(Color.WHITE);
                table.setRowHeight(30);
        
                scroll = new JScrollPane(table);
                scroll.setBounds(10,60,1300,500);
                container.add(scroll);
  
                int option = filechooser.showOpenDialog(MenuFile.this);
                if (option == JFileChooser.APPROVE_OPTION){
                    
                    File sf = filechooser.getSelectedFile();
                    filename1 =sf.getPath();
                    sf  = new File(filename1);
                    try{
                        FileReader  fr = new FileReader(sf);
                         BufferedReader br = new BufferedReader(fr); 
                         
                         Object[] lines = br.lines().toArray();
                        for(int i=0;i<lines.length;i++)
                        {
                            String[] row = lines[i].toString().split("#");
                             model.addRow(row);
                                
                         }
                    }
                    catch(Exception ae){
                       ae.printStackTrace();
                    }
                    
                }
                
        }
        
        });
        
       home_button.addActionListener(new ActionListener(){
        
  
        @Override
        public void actionPerformed(ActionEvent e){
            
  
                frame.dispose();
                Home hm = new Home();           
        }
        
        });
           
        
        
    }
    
    
    
    
    
    
}
