
package veterinary_hospital;

public class Patient_info {
    protected String pet_name;
    protected String pet_health_status;
    protected String Address_of_owner;
    protected String pet_owner_name;
    protected String time_of_appointment;
    protected String Token_number;
    protected String pet_Age;
    protected String phone_number;

    public String getPet_name() {
        return pet_name;
    }

    public String getPet_health_status() {
        return pet_health_status;
    }

    public String getAddress_of_owner() {
        return Address_of_owner;
    }

    public String getPet_owner_name() {
        return pet_owner_name;
    }

    public String getTime_of_appointment() {
        return time_of_appointment;
    }

    public String getToken_number() {
        return Token_number;
    }

    public String getPet_Age() {
        return pet_Age;
    }

    public String getPhone_number() {
        return phone_number;
    }
   /*
    public Patient_info(){
        
    }*/
    public Patient_info(String P_name, String p_h_status, String A_owner, String p_owner_name, String T_appointment, String T_number, String p_age, String P_number){
    this.pet_name=P_name;
    this.pet_health_status=p_h_status;
    this.Address_of_owner=A_owner;
    this.pet_owner_name=p_owner_name;
    this.time_of_appointment=T_appointment;
    this.Token_number=T_number;
    this.pet_Age=p_age;
    this.phone_number=P_number;
    }

    @Override
    public String toString() {
        return ("Patient_info"  + "pet_name=" + pet_name + "\n"+
                ", pet_health_status=" + pet_health_status +"\n"+
                ", Address_of_owner=" + Address_of_owner +"\n"+
                ", pet_owner_name=" + pet_owner_name +"\n"+ ", time_of_appointment=" 
                + time_of_appointment +"\n"+ ", Token_number=" + Token_number +"\n"+
                ", pet_Age=" + pet_Age +"\n"+ ", phone_number=" + phone_number);
    }
}

