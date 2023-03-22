public class epic extends Akun{
    private String tier;
    epic(String us_name, String pass, String tier){
        super(us_name, pass);
        this.tier = tier;
    }

    public void setTier(String tier){
        this.tier = tier;
    }

    public String getTier(){
        return tier;
    }

    @Override
    public void tampak(){
        System.out.println("=================================");
        super.tampak();
        System.out.println("3. Tier  = " + this.tier);
        System.out.println("=================================");
    }
}
