import java.util.ArrayList;

public class database {

    public ArrayList<Account> dataLijst;

    public database(){
        dummyAccount dummyAccount = new dummyAccount();
        dummyAccount.generateAccounts();
        dummyAccount data = new dummyAccount();
        data.generateAccounts();
        this.dataLijst = data.getAccountLijst();
    }
}
