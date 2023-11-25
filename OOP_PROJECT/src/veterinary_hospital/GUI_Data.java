package veterinary_hospital;
import java.awt.*;
import javax.swing.*;

public class GUI_Data {
File_handling new_vet_obj=new File_handling();


public GUI_Data(){
  new_vet_obj.LoadData();
  JFrame myframe = new JFrame("Created by APOO Software House");
       
       myframe.setSize(1200, 800);
       myframe.setDefaultCloseOperation(myframe.EXIT_ON_CLOSE);
       myframe.setResizable(false);
       myframe.setLocationRelativeTo(null);
       
       
         
       JPanel myPanel = new JPanel();
       myPanel.setBackground(null);
       myPanel.setLayout(null);
       
       
       javax.swing.border.Border LineBorder = BorderFactory.createLineBorder(Color.red,4,true);
       javax.swing.border.Border LineBorder2 = BorderFactory.createLineBorder(Color.black,2,true);
       javax.swing.border.Border LineBorder3 = BorderFactory.createLineBorder(Color.cyan,3,true);  
       javax.swing.border.Border LineBorder4 = BorderFactory.createLineBorder(Color.WHITE,2,true); 
       
       JPanel Panel2 = new JPanel();
       Panel2.setBounds(70,50 , 650, 140);
       Panel2.setBackground(new Color(213,134,145,123));
       Panel2.setBorder(LineBorder);
       Panel2.setLayout(null);
       
       JPanel Panel3 = new JPanel();
       Panel3.setBounds(510,740 , 230, 30);
       Panel3.setBackground(new Color(213,134,145,123));
       Panel3.setBorder(LineBorder4);      
       Panel3.setLayout(null);
       
      Font font1 = new Font("San Serif", Font.PLAIN, 15);
      
      ImageIcon img = new ImageIcon("clinic.jpg");
      ImageIcon img1 = new ImageIcon("pTqrGbk6c.gif");
      
       JLabel background = new JLabel("",img,0);
       background.setBounds(0, 0, 1200, 1005);
       
       JLabel background1 = new JLabel("",img1,0);
       background1.setBounds(600, 200, 150, 150);
       
       JLabel mytext = new JLabel("  Welcome to Apoo Veterinary Hospital");
       mytext.setBounds(90, 50, 600, 70);
       mytext.setFont(new Font("Pro Font Windows", Font.BOLD, 30));
       mytext.setForeground(Color.BLACK);
       
       JLabel my2text = new JLabel("     Animal Caring hospital");
       my2text.setBounds(160, 110, 550, 70);
       my2text.setFont(new Font("Pro Font Windows", Font.BOLD, 35));
       my2text.setForeground(Color.BLACK);
       
       JPanel rightpanel = new JPanel();
       rightpanel.setLayout(null);
       rightpanel.setBackground(Color.LIGHT_GRAY);
       rightpanel.setBounds(770, 20, 410, 735);
       
       
       
       // ---------------Add new Record---------------------
       
       JButton add_button = new JButton("Add New Record");
       add_button.setForeground(Color.black);
       add_button.setBorder(LineBorder2);
       add_button.setFocusable(false);
       add_button.setBackground(Color.GRAY);
       add_button.setFont(new Font("javassoul", Font.BOLD, 23));
       add_button.setBounds(100,260 , 330, 65);
       
       
        add_button.addActionListener(al -> {
          
           JLabel namelabel = new JLabel("Pet Name:");
           namelabel.setBounds(10, 20, 200, 25);
           namelabel.setFont(font1);
           namelabel.setForeground(Color.black);
           
           JTextField namefeild = new JTextField();
           namefeild.setBounds(100, 20, 200, 25);
           namefeild.setFont(font1);
           namefeild.setForeground(Color.black);
           namefeild.setBorder(LineBorder2);
           
           JLabel tokenlabel = new JLabel("Token no.:");
           tokenlabel.setBounds(10,70,200, 25);
           tokenlabel.setFont(font1);
           tokenlabel.setForeground(Color.black);                  
           
           JTextField tokenfeild = new JTextField();
           tokenfeild.setBounds(100, 70, 200, 25);
           tokenfeild.setFont(font1);
           tokenfeild.setForeground(Color.black);
           tokenfeild.setBorder(LineBorder2);
           
           JLabel healthlabel = new JLabel("Health Status:");
           healthlabel.setBounds(10,120,200, 25);
           healthlabel.setFont(font1);
           healthlabel.setForeground(Color.black);
           
           JTextField healthfeild = new JTextField();
           healthfeild.setBounds(100, 120, 200, 25);
           healthfeild.setForeground(Color.black);
           healthfeild.setFont(font1);
           healthfeild.setBorder(LineBorder2);
           
           JLabel patlabel = new JLabel("Pet Age:");
           patlabel.setBounds(10,170,200, 25);
           patlabel.setFont(font1);
           patlabel.setForeground(Color.black);
           
           JTextField patfeild = new JTextField();
           patfeild.setBounds(100, 170, 200, 25);
           patfeild.setForeground(Color.black);
           patfeild.setFont(font1);
           patfeild.setBorder(LineBorder2);
           
           JLabel timelabel = new JLabel("Appoint. time:");
           timelabel.setBounds(10,220,200, 25);
           timelabel.setFont(font1);
           timelabel.setForeground(Color.black);
           
           JTextField timefeild = new JTextField();
           timefeild.setBounds(100, 220, 200, 25);
           timefeild.setForeground(Color.black);
           timefeild.setFont(font1);
           timefeild.setBorder(LineBorder2);
           
           JLabel ownamelabel = new JLabel("Owner Name:");
           ownamelabel.setBounds(10,270,200, 25);
           ownamelabel.setFont(font1);
           ownamelabel.setForeground(Color.black);
           
           JTextField ownerfeild = new JTextField();
           ownerfeild.setBounds(100, 270, 200, 25);
           ownerfeild.setFont(font1);
           ownerfeild.setForeground(Color.black);
           ownerfeild.setBorder(LineBorder2);
           
           JLabel pnumlabel = new JLabel("Owner Ph #:");
           pnumlabel.setBounds(10,320,200, 25);
           pnumlabel.setFont(font1);
           pnumlabel.setForeground(Color.black);
           
           JTextField pnumfeild = new JTextField();
           pnumfeild.setBounds(100, 320, 200, 25);
           pnumfeild.setFont(font1);
           pnumfeild.setForeground(Color.black);
           pnumfeild.setBorder(LineBorder2);
           
           JLabel Addresslabel = new JLabel("Owner's add:");
           Addresslabel.setBounds(10,370,200, 25);
           Addresslabel.setFont(font1);
           Addresslabel.setForeground(Color.black);
           
           JTextField Addressfeild = new JTextField();
           Addressfeild.setBounds(100, 370, 200, 25);
           Addressfeild.setFont(font1);
           Addressfeild.setForeground(Color.black);
           Addressfeild.setBorder(LineBorder2);
           
            JButton Ok_button = new JButton("Ok");
            Ok_button.setFocusable(false);
            Ok_button.setFont(new Font("Upakarti", Font.BOLD, 22));
            Ok_button.setForeground(Color.black);
            Ok_button.setBackground(Color.red);
            Ok_button.setBorder(LineBorder3);
            Ok_button.setBounds(70, 600, 100, 40);
            Ok_button.addActionListener(ok_al -> {
                String name = namefeild.getText();
                String healthfeld = healthfeild.getText();
                String Addressfel=Addressfeild.getText();
                String owfel=ownerfeild.getText();
                
                String  Timeappo = timefeild.getText();
                String  tknumfel = tokenfeild.getText();
                String  PAge = patfeild.getText();
                String  pnumfel = pnumfeild.getText();
                
           new_vet_obj.add(Add_func(name, healthfeld, Addressfel,owfel, Timeappo, tknumfel, PAge, pnumfel  ));
           namefeild.setText("");
           healthfeild.setText("");
           Addressfeild.setText("");
           ownerfeild.setText("");
           timefeild.setText("");
           tokenfeild.setText("");
           patfeild.setText("");
           pnumfeild.setText("");
           
           JOptionPane.showMessageDialog(null, "Data Added Successfully ");
           
           new_vet_obj.saveData();
           
       });
       
       JButton cancel_user_menu = new JButton("Cancel");
       cancel_user_menu.setFocusable(false);
       cancel_user_menu.setFont(new Font("Upakarti", Font.BOLD, 22));
       cancel_user_menu.setForeground(Color.BLACK);
       cancel_user_menu.setBackground(Color.lightGray);
       cancel_user_menu.setBorder(LineBorder3);
       cancel_user_menu.setBounds(230, 600, 100, 40);
       cancel_user_menu.addActionListener(can_al ->{ 
           namefeild.setText("");
           healthfeild.setText("");
           Addressfeild.setText("");
           ownerfeild.setText("");
           timefeild.setText("");
           tokenfeild.setText("");
           patfeild.setText("");
           pnumfeild.setText("");
         
          
       });
           
           
           rightpanel.removeAll();
           rightpanel.revalidate();
           rightpanel.repaint();
           
         
           
           rightpanel.add(namefeild);
           rightpanel.add(namelabel);
           
           rightpanel.add(tokenlabel);
           rightpanel.add(tokenfeild);
           
           rightpanel.add(healthlabel);
           rightpanel.add(healthfeild);
           
           rightpanel.add(patlabel);
           rightpanel.add(patfeild);
           
           rightpanel.add(timelabel);
           rightpanel.add(timefeild);
           
           rightpanel.add(ownamelabel);
           rightpanel.add(ownerfeild);
           
           rightpanel.add(pnumlabel);
           rightpanel.add(pnumfeild);
           
           rightpanel.add(Addresslabel);
           rightpanel.add(Addressfeild);
           
           rightpanel.add(Ok_button);
           rightpanel.add(cancel_user_menu);
       });
                  // ---------------Delete Record---------------------
            JButton remove_button = new JButton("Delete Record");
       remove_button.setFocusable(false);
       remove_button.setBorder(LineBorder2);
       remove_button.setForeground(Color.black);
       remove_button.setFont(new Font("javassoul", Font.BOLD, 20));
       remove_button.setBackground(Color.GRAY);
       remove_button.setBounds(100, 360, 330, 65);
       remove_button.addActionListener(rem_al ->{
          
           JLabel headlabel = new JLabel("Delete Record");
           headlabel.setBounds(70, 80, 300, 100);
           headlabel.setFont(new Font("Serif", Font.BOLD, 50));
           headlabel.setForeground(Color.blue);
           
           JLabel head2label = new JLabel("");
           head2label.setBounds(290, 130, 250, 100);
           head2label.setFont(new Font("Serif", Font.BOLD, 30));
           head2label.setForeground(Color.black);
           
           JPanel adduserbackpanel = new JPanel();
           adduserbackpanel.setBounds(55,100 , 330, 105);
           adduserbackpanel.setBackground(Color.darkGray);
           adduserbackpanel.setBorder(LineBorder);
           adduserbackpanel.setLayout(null);
           
           JLabel namelabel = new JLabel("Enter pet owner name");
           namelabel.setBounds(50, 280,400, 100);
           namelabel.setFont(new Font("Serif", Font.BOLD, 25));
           namelabel.setForeground(Color.white);
           JLabel namelabel1 = new JLabel("to be Removed :");
           namelabel1.setBounds(120, 315,400, 100);
           namelabel1.setFont(new Font("Serif", Font.BOLD, 25));
           namelabel1.setForeground(Color.black);
           
           JTextField namelabel_feild = new JTextField();
           namelabel_feild.setFont(font1);
           namelabel_feild.setForeground(Color.black);
           namelabel_feild.setBounds(60, 420, 280, 40);
           namelabel_feild.setBorder(LineBorder2);
           
            JButton Ok_button = new JButton("Ok");
            Ok_button.setFont(new Font("Upakarti", Font.BOLD, 22));
            Ok_button.setFocusable(false);
            Ok_button.setForeground(Color.black);
            Ok_button.setBackground(Color.red);
            Ok_button.setBorder(LineBorder3);
            Ok_button.setBounds(70, 600, 100, 40);
            Ok_button.addActionListener(ok_al -> {              
                String namelabel2 =namelabel_feild.getText();
                new_vet_obj.delete(namelabel2);
                new_vet_obj.saveData();
                namelabel_feild.setText("");
                
            });

            JButton cancel_remove_menu = new JButton("Cancel");
            cancel_remove_menu.setFocusable(false);
            cancel_remove_menu.setFont(new Font("Upakarti", Font.BOLD, 22));
            cancel_remove_menu.setForeground(Color.BLACK);
            cancel_remove_menu.setBackground(Color.lightGray);
            cancel_remove_menu.setBorder(LineBorder3);
            cancel_remove_menu.setBounds(230, 600, 100, 40);
            cancel_remove_menu.addActionListener(can  -> {
                namelabel_feild.setText("");
            });
       
           rightpanel.removeAll();
           rightpanel.revalidate();
           rightpanel.repaint();
           
           
           rightpanel.add(headlabel);
           rightpanel.add(head2label);
           rightpanel.add(adduserbackpanel);
           
           rightpanel.add(namelabel);
           rightpanel.add(namelabel1);
           rightpanel.add(namelabel_feild);
           
           rightpanel.add(Ok_button);
           rightpanel.add(cancel_remove_menu);
           
       });
                        //----------------Search Record-------------------
                        
      JButton search_button = new JButton("Search Record");
       search_button.setFocusable(false);
       search_button.setBorder(LineBorder2);
       search_button.setFont(new Font("javassoul", Font.BOLD, 23));
       search_button.setForeground(Color.BLACK);       
       search_button.setBackground(Color.GRAY);
       search_button.setBounds(100, 460, 330, 65);
       search_button.addActionListener(sea_al -> {
           
           JLabel headlabel = new JLabel("Search Record");
           headlabel.setBounds(80, 85, 300, 100);
           headlabel.setFont(new Font("Serif", Font.BOLD, 50));
           headlabel.setForeground(Color.white);
           
           JLabel head2label = new JLabel("");
           head2label.setBounds(290, 130, 250, 100);
           head2label.setFont(new Font("Serif", Font.BOLD, 30));
           head2label.setForeground(Color.black);
           
           JPanel adddatabackpanel = new JPanel();
           adddatabackpanel.setBounds(55,100 , 330, 105);
           adddatabackpanel.setBackground(Color.darkGray);
           adddatabackpanel.setBorder(LineBorder);
           adddatabackpanel.setLayout(null);
           
                   
           JLabel search_name_label = new JLabel("Enter pet owner name:");
           search_name_label.setBounds(110, 430,400, 100);
           search_name_label.setFont(new Font("Serif", Font.BOLD, 18));
           search_name_label.setForeground(Color.black);       
                   
         
           
           JTextField search_name_feild = new JTextField();
           search_name_feild.setBounds(70, 510, 280, 40);
           search_name_feild.setFont(font1);
           search_name_feild.setForeground(Color.black);
           search_name_feild.setBorder(LineBorder2);
           
           JButton Ok_button = new JButton("Ok");
           Ok_button.setFocusable(false);
            Ok_button.setFont(new Font("Upakarti", Font.BOLD, 22));
            Ok_button.setForeground(Color.black);
            Ok_button.setBackground(Color.red);
            Ok_button.setBorder(LineBorder3);
            Ok_button.setBounds(70, 600, 100, 40);
            Ok_button.addActionListener(ok_al -> {
                
                               
                String feild = search_name_feild.getText();
                if(!feild.equals("")){
                  new_vet_obj.search(feild);
                }

            });
            
            JButton cancel_remove_menu = new JButton("Cancel");
            cancel_remove_menu.setFocusable(false);
            cancel_remove_menu.setFont(new Font("Upakarti", Font.BOLD, 22));
            cancel_remove_menu.setForeground(Color.BLACK);
            cancel_remove_menu.setBackground(Color.lightGray);
            cancel_remove_menu.setBorder(LineBorder3);
            cancel_remove_menu.setBounds(230, 600, 100, 40);
            cancel_remove_menu.addActionListener(can  -> {
                search_name_feild.setText("");
                
            });
           
           rightpanel.removeAll();
           rightpanel.revalidate();
           rightpanel.repaint();
           
           
           rightpanel.add(headlabel);
           rightpanel.add(head2label);
           rightpanel.add(adddatabackpanel);
         
           
           rightpanel.add(search_name_label);
           rightpanel.add(search_name_feild);
          
           
           rightpanel.add(Ok_button);
           rightpanel.add(cancel_remove_menu);
           
       });   
       
                          // ------Show ALL Data------
                          
                          
                          
    JButton View_button = new JButton("Show All Record");
       View_button.setFocusable(false);
       View_button.setBorder(LineBorder2);
       View_button.setFont(new Font("javassoul", Font.BOLD, 23));
       View_button.setForeground(Color.BLACK);
       View_button.setBackground(Color.GRAY);
       View_button.setBounds(100, 560, 330, 65);
       View_button.addActionListener(view_al -> {          
            
           
           new_vet_obj.show();
 
          
           
           JLabel headlabel = new JLabel("Show All Record");
           headlabel.setBounds(43, 85, 500, 100);
           headlabel.setFont(new Font("javassoul", Font.BOLD, 40));
           headlabel.setForeground(Color.black);
           
           JLabel head2label = new JLabel("");
           head2label.setBounds(290, 130, 250, 100);
           head2label.setFont(new Font("Serif", Font.BOLD, 30));
           head2label.setForeground(Color.black);
           
           JPanel adddatabackpanel = new JPanel();
           adddatabackpanel.setBounds(35,100 , 360, 105);
           adddatabackpanel.setBackground(Color.darkGray);
           adddatabackpanel.setBorder(LineBorder);
           adddatabackpanel.setLayout(null);
           
           JButton view_back_button = new JButton("Back");
           view_back_button.setFocusable(false);
            view_back_button.setFont(new Font("Serif", Font.BOLD, 22));
            view_back_button.setForeground(Color.black);
            view_back_button.setBackground(Color.white);
            view_back_button.setBorder(LineBorder3);
            view_back_button.setBounds(60, 500, 200, 50);
            view_back_button.addActionListener(ok_al -> {
               rightpanel.removeAll();
               rightpanel.revalidate();
               rightpanel.repaint();
            });
           
           
            
           rightpanel.removeAll();
           rightpanel.revalidate();
           rightpanel.repaint();
           
           
           rightpanel.add(headlabel);
           rightpanel.add(head2label);
           rightpanel.add(adddatabackpanel);
           
           rightpanel.add(view_back_button);
          
            
           
            
            
            
       });
       
       
       
       
       JButton exit_button = new JButton("Exit");
       exit_button.setFocusable(false);
       exit_button.setBorder(LineBorder2);
       exit_button.setForeground(Color.BLACK);
       exit_button.setFont(new Font("javassoul", Font.BOLD, 23));
       exit_button.setBackground(Color.gray);
       exit_button.setBounds(100, 660, 330, 65);
       exit_button.addActionListener(Al -> {
           
           myframe.dispose();
       });
        
       background.add(background1);
       
       myPanel.add(add_button);
       myPanel.add(remove_button);
       myPanel.add(search_button);
       myPanel.add(View_button);
       myPanel.add(exit_button);
       
       background.add(mytext);
       background.add(my2text);
     
       
       background.add(Panel2);
       background.add(Panel3);
       
       
       myframe.add(rightpanel);
       myPanel.add(background);
       
       
       myframe.add(myPanel);
       
      
       myframe.setVisible(true); 
    }                      

        
       private Patient_info Add_func(String P_name, String p_h_status, String A_owner, String p_owner_name, String T_appointment, String T_number, String p_age, String P_number){
       Patient_info new_Add = new Patient_info( P_name, p_h_status, A_owner, p_owner_name, T_appointment,T_number, p_age, P_number);
       return new_Add;
    } 
      
}
   


