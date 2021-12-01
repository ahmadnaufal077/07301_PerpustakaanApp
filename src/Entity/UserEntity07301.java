package Entity;
public abstract class UserEntity07301 {
    protected String nama, pass;
    public UserEntity07301(){    
    }public UserEntity07301 (String nama, String pass){
        this.nama=nama;
        this.pass=pass;
    }public String getNama(){
        return nama;
    }public void setNama(String nama){
        this.nama=nama;
    }public String getPass(){
        return pass;
    }public void setPass(String pass){
        this.pass=pass;
    }
}