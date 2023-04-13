package Java_Projects.BANK_MEGAPROJECT.banking.src.main.java.com.bank.Servives;

public class BankService {
    public static BankService Instance = null;

    private BankService(){
        Instance = this;
    }

    public static BankService getInstance(){
        if (Instance == null){
            new BankService();
        }

        return Instance;
    }

    public void CreateNewAccount(){

    }

    public void CreateNewUser(){

    }

    public void TransfertMoney(){

    }

    public void DeleteUser(){

    }

    public void DeleteAccount(){

    }
}
