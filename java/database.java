import java.util.ArrayList;

public class database {

    private boolean loggedIn;
    private Account account;

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

    public Account getAccount(String accountnaam, String accounwachtwoord){
        for (int i = 0; i < this.dataLijst.size(); i++){
            if (dataLijst.get(i).getAccountUsername().equals(accountnaam) && dataLijst.get(i).getAccountWachtwoord().equals(accounwachtwoord)){
                return dataLijst.get(i);
            }
        }
        return null;
    }


    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(Boolean bool){
        this.loggedIn = bool;
    }
}
