package Database;

import Account.Account;

import java.util.ArrayList;

public class Database {

    private boolean loggedIn;
    private Account account;

    private ArrayList<Account> accounts;

    public Database(){
        dummyAccount dummyAccount = new dummyAccount();
        dummyAccount.generateAccounts();
        dummyAccount data = new dummyAccount();
        data.generateAccounts();
        this.accounts = data.getAccountLijst();
    }
    public void addToDatabase(Account account){
        this.accounts.add(account);
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void showAccounts(){
        for (int i = 0; i < this.accounts.size(); i++){
            System.out.println(this.accounts.get(i).getAccountUsername());
            System.out.println(this.accounts.get(i).getAccountWachtwoord());
            System.out.println("----");
        }
    }

    public Account getAccount(String accountnaam, String accounwachtwoord){
        for (int i = 0; i < this.accounts.size(); i++){
            if (accounts.get(i).getAccountUsername().equals(accountnaam) && accounts.get(i).getAccountWachtwoord().equals(accounwachtwoord)){
                return accounts.get(i);
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
