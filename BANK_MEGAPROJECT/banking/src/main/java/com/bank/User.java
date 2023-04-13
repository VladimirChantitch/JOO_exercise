package Java_Projects.BANK_MEGAPROJECT.banking.src.main.java.com.bank;

public class User {
    static Integer id_counter;

    public User(String firstName, String lastName){
        this.id = ++id_counter;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(Integer id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public Integer id;
    public String firstName;
    public String lastName;
}
