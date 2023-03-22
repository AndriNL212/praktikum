import java.util.*;
public class Main {
    private static ArrayList<Akun> akun = new ArrayList<>();
    private static ArrayList<epic> data_epic = new ArrayList<>();
    private static ArrayList<legend> data_legend = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    static void sleep(int sec){
        try {
            Thread.currentThread().sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws Exception {
        while(true){
            Scanner input = new Scanner(System.in);
            System.out.println("1. Nambah akun");
            System.out.println("2. Tampil akun");
            System.out.println("3. Update akun");
            System.out.println("4. hapus  akun");
            System.out.println("5. keluar");
            System.out.print("Masukkan pilihan >> ");
            int pilihan = input.nextInt();
            switch(pilihan){
                case 1:
                    nambah();
                    break;
                case 2:         
                    lihat();
                    break;           
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("=================");
                    System.out.println("pilihan tidak ada");
                    System.out.println("=================");
                    break;
            }
        }
        
    }

    private static void nambah(){
        System.out.println("======================");
        System.out.println("1. Tambah  Data Biasa ");
        System.out.println("2. Tambah  Tier Epic  ");
        System.out.println("3. Tambah  Tier Legend");
        System.out.println("======================");
        System.out.print("Masukkan pilihan >> ");int pilih = input.nextInt();
        switch(pilih){
            case 1:
                System.out.print("Masukkan nama akun >> ");
                String nama_akun = input.next();
                System.out.print("Masukkan password  >> ");
                String pass = input.next();
                Akun akun_baru = new Akun(nama_akun, pass);
                akun.add(akun_baru);
                sleep(1);
                break;
            case 2:
                System.out.print("Masukkan nama akun >> ");
                String nama = input.next();
                System.out.print("Masukkan password  >> ");
                String password = input.next();
                epic new_acc = new epic(nama, password, "epic");
                data_epic.add(new_acc);
                sleep(1);
                break;
            case 3:
                System.out.print("Masukkan nama akun >> ");
                String nm = input.next();
                System.out.print("Masukkan password  >> ");
                String pw = input.next();
                legend data_baru = new legend(nm, pw, "legend");
                data_legend.add(data_baru);
                sleep(1);
                break;
            default:
                System.out.println("=================");
                System.out.println("pilihan tidak ada");
                System.out.println("=================");
                break;
        }
    }

    private static void lihat(){
        System.out.println("Lihat data");
        System.out.println("=========================");
        System.out.println("1. Lihat data Akun  biasa");
        System.out.println("2. Lihat data Akun   epic");
        System.out.println("3. Lihat data Akun legend");
        System.out.println("=========================");
        System.out.print("Masukkan pilihan >> ");int pil = input.nextInt();
        switch(pil){
            case 1:
                for(int i =0; i < akun.size(); i++){
                    akun.get(i).tampak();
                }
                System.out.println("");
                sleep(1);
                break;
            case 2:
                for(int i =0; i < data_epic.size(); i++){
                    data_epic.get(i).tampak();
                }
                System.out.println("");
                sleep(1);
                break;
            case 3:
                for(int i =0; i < data_legend.size(); i++){
                    data_legend.get(i).tampak();
                }
                System.out.println("");
                sleep(1);
                break;
            default:
                System.out.println("===================");
                System.out.println(" Pilihan tidak ada ");
                System.out.println("===================");
                break;
        }        
    }

    private static void update(){
        System.out.println("===========");
        System.out.println("Update Data");
        System.out.println("===========");
        System.out.println("==========================");
        System.out.println("1. Update data Akun  biasa");
        System.out.println("2. Update data Akun   epic");
        System.out.println("3. Update data Akun legend");
        System.out.println("==========================");
        System.out.print("Masukkan pilihan >> ");int p = input.nextInt();
        switch(p){
            case 1: 
                System.out.print("Masukkan nama akun >> ");String cari_kn = input.next();
                for(Akun akn : akun){
                    if(akn.user_name.equals(cari_kn)){
                        System.out.print("Masukkan user name baru >> ");
                        akn.setName(input.next());
                        System.out.print("masukkan password baru >> ");
                        akn.setPass(input.next());
                        break;
                    }
                    else{
                        System.out.println("data salah");
                        sleep(1);
                    }
                }
                sleep(1);
                break;
            case 2:
                System.out.print("Masukkan nama akun >> ");String cari = input.next();
                for(epic e : data_epic){
                    if(e.user_name.equals(cari)){
                        System.out.print("Masukkan user name baru >> ");
                        e.setName(input.next());
                        System.out.print("masukkan password baru >> ");
                        e.setPass(input.next());
                        break;
                    }
                    else{
                        System.out.println("data salah");
                        sleep(1);
                    }
                }
                sleep(1);
                break;
            case 3:
                System.out.print("Masukkan nama akun >> ");String c = input.next();
                for(legend l : data_legend){
                    if(l.user_name.equals(c)){
                        System.out.print("Masukkan user name baru >> ");
                        l.setName(input.next());
                        System.out.print("masukkan password baru >> ");
                        l.setPass(input.next());
                        break;
                    }
                    else{
                        System.out.println("data salah");
                        sleep(1);
                    }
                }
                sleep(1);
                break;
            default:
                System.out.println("===================");
                System.out.println(" Pilihan tidak ada ");
                System.out.println("===================");
                break;
        }
    }

    private static void delete(){
        System.out.println("================== ");
        System.out.println("    hapus data     ");
        System.out.println("===================");
        System.out.println("1.Hapus akun biasa ");
        System.out.println("2.Hapus akun  epic ");
        System.out.println("3.Hapus akun legend");
        System.out.println("==================");
        int pilihan = input.nextInt();
        switch(pilihan){
            case 1:
                System.out.print("Masukkan nama akun >>> ");
                String us_nm = input.next();
                for(int i = 0; i < akun.size();  i++){
                    if(akun.get(i).user_name.equals(us_nm)){
                        akun.remove(i);
                    }
                }
                sleep(1);
                break;
            case 2:
                System.out.print("Masukkan nama akun >>> ");
                String us = input.next();
                for(int i = 0; i < data_epic.size();  i++){
                    if(data_epic.get(i).user_name.equals(us)){
                        data_epic.remove(i);
                    }
                }
                sleep(1);
                break;
            case 3:
                System.out.print("Masukkan nama akun >>> ");
                String u_name = input.next();
                for(int i = 0; i < data_epic.size();  i++){
                    if(data_legend.get(i).user_name.equals(u_name)){
                        data_legend.remove(i);
                    }
                }
                sleep(1);
                break;
        }

    }
}

