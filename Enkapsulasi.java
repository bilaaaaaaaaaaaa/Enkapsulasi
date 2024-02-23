
package enkapsulasi;

public class Enkapsulasi {

    private String username ;
    private String password ;
    private int id;
    private boolean status; //true : menikah, false : bm
    
    public Enkapsulasi(){
        System.out.println("INI CONSTRUCTOR");    
    }
    
    public Enkapsulasi(String apaya, String opoyo){
        this.username = apaya ;
        this.password = opoyo ;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}
