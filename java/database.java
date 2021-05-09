import java.util.ArrayList;

public class database {

    private boolean loggedIn;

    private ArrayList<Account> dataLijst;

    public database(){
        dummyAccount dummyAccount = new dummyAccount();
        dummyAccount.generateAccounts();
        dummyAccount data = new dummyAccount();
        data.generateAccounts();
        this.dataLijst = data.getAccountLijst();
    }
    public void addToDatabase(Account account){
        this.dataLijst.add(account);
    }

    public ArrayList<Account> getDataLijst() {
        return dataLijst;
    }

    public void showAccounts(){
        for (int i = 0; i < this.dataLijst.size(); i++){
            System.out.println(this.dataLijst.get(i).getAccountUsername());
            System.out.println(this.dataLijst.get(i).getAccountWachtwoord());
            System.out.println("----");
        }
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(Boolean bool){
        this.loggedIn = bool;
    }
}
