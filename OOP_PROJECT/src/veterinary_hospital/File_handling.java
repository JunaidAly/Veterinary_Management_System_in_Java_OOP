package veterinary_hospital;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class File_handling {
    //Using arraylist
  ArrayList<Patient_info> my_pet_list = new ArrayList<>();
//constructor
    public File_handling() {
       
    }
    void add(Patient_info pet){
    my_pet_list.add(pet);   
    }

    public void LoadData() {
        //Exceptional handling
        try {
            FileReader fr = new FileReader("pet_information.txt");
            BufferedReader br = new BufferedReader(fr);
            String s = br.readLine();
            while (s != null) {
                String [] token = s.split(",");
                String Pet_name = token[0];
                String Pet_health_status = token[1];
                String address_of_owner = token[2];
                String owner_name = token[3];
                String Time_of_appointment = token[4];
                String token_number = token[5];
                String Pet_Age = token[6];
                String Phone_number = token[7];
                
                Patient_info obj = new Patient_info(Pet_name,Pet_health_status,address_of_owner,owner_name,Time_of_appointment,token_number,Pet_Age,Phone_number);
                my_pet_list.add(obj);

                s = br.readLine();

            }
            fr.close();
            br.close();

        } catch (IOException ex) {
            System.out.println(ex);

        }

    }

    public void saveData() {
        //Exceptional Handling
        try {
            //File handling
            FileWriter fw = new FileWriter("pet_information.txt");
            PrintWriter pw = new PrintWriter(fw);
            for (int j = 0; j < my_pet_list.size(); j++) {
                Patient_info p = (Patient_info) my_pet_list.get(j);
                pw.println(p.getPet_Age() + "," + p.getPet_health_status() + "," + p.getPet_name() + "," + p.getPet_owner_name() + "," + p.getPhone_number() + "," + p.getTime_of_appointment() + "," + p.getAddress_of_owner() + "," + p.getToken_number());
            }
            pw.close();
            fw.close();

        } catch (IOException ex) {
            System.out.println(ex);
        }
    }


    public void search(String name) {

        
        for (int j = 0; j < my_pet_list.size(); j++) {
            Patient_info p = (Patient_info) my_pet_list.get(j);
            if (name.equals(p.getPet_owner_name())) {
                JOptionPane.showMessageDialog(null, "record Found :\n" + p.toString());
            }
        }
    }

    public void delete(String name) {

        
        for (int j = 0; j < my_pet_list.size(); j++) {
            Patient_info p = (Patient_info) my_pet_list.get(j);
            if (name.equals(p.getPet_owner_name())) {
                my_pet_list.remove(j);
                JOptionPane.showMessageDialog(null, "Deleting Record:\n" + p.toString());
            }
        }

    }

    public void show() {

        String temp = "Total Record:" + my_pet_list.size() + "\n";
        for (int j = 0; j < my_pet_list.size(); j++) {
            Patient_info p = (Patient_info) my_pet_list.get(j);
            temp = temp + p.toString() + "\n";
        }

        JOptionPane.showMessageDialog(null, temp);
    }
}


