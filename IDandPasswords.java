import java.util.HashMap;
public class IDandPasswords {
    
    HashMap<String, String> logininfo = new HashMap<>();
    IDandPasswords(){
        logininfo.put("Bro", "pizza");
        logininfo.put("Brometheus", "PASSWORD");
        logininfo.put("abc", "123");

    }

    public HashMap<String, String> getLogininfo() {
        return logininfo;
    }
}
