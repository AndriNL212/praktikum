public class Akun {
    String user_name;
    String password;
    Akun(String us_name, String pass){
        this.user_name = us_name;
        this.password = pass;
    }
    
    void setName(String us_name){
        this.user_name = us_name;
    }

    void setPass(String pass){
        this.password = pass;
    }
    void tampak(){
        System.out.println("=================================");
        System.out.println("1. Nama akun = " + this.user_name);
        System.out.println("2. Password  = " + this.password);
        System.out.println("=================================");
    }
}
