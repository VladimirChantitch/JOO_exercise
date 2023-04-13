package Java_Projects.BANK_MEGAPROJECT.banking.src.main.java.com.bank.Servives;

public class DbHelper {
    public static DbHelper Instance;

    private DbHelper(){
        Instance = this;
    }

    public static DbHelper getInstance(){
        if (Instance == null){
            new DbHelper();
        }
        return Instance;
    }
}
