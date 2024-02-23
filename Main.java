
package enkapsulasi;

public class Main {
    public static void main(String[] args){
        
        Enkapsulasi user = new Enkapsulasi("aaa","bbb");
        Enkapsulasi user1 = new Enkapsulasi();
        
        user.setUsername("LOL");
        user.setPassword("LIL");
        user.setStatus(false);
        user.setId(0);
         
        System.out.println("Username : "+user.getUsername());
        System.out.println("Password : "+user.getPassword());
        System.out.println("Status : "+user.isStatus());
        System.out.println("Id : "+user.getId());
    }
}
