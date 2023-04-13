package Java_Projects.BANK_MEGAPROJECT.banking.src.main.java.com.bank;

public class BankAccount {
    static Integer id_counter;

    public BankAccount(Integer balance){
        this.id = id_counter + 1;
        this.balance = balance;
    }

    public BankAccount(Integer id, Integer balance){
        this.id = id;
        this.balance = balance;
    }

    public Integer id;
    //Yeah this is a bank with only integers
    public Integer balance;
}
