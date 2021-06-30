package LoginSysteem;

import Account.Account;
import Database.Database;
import java.util.ArrayList;



class LoginSingleton {
    private static LoginSingleton Singleton;
    private ArrayList<Account> accounts;
    private Boolean isLoggedIn = false;
    private String accountNaam;
    private String accountWachtwoord;
    private boolean loggedIn;
    private Account account;

    private LoginSingleton(){
        Database database = new Database();
        this.accounts = database.getAccounts();
    }

    public static LoginSingleton getInstantiate(){
        if(Singleton == null){
            Singleton = new LoginSingleton();
        }
        return Singleton;
    }

    public void Login(String accountNaam, String accountWachtwoord){
        this.accountNaam = accountNaam;
        this.accountWachtwoord = accountWachtwoord;

        for (int i = 0; i < this.accounts.size(); i++){
            String dataAccountNaam = accounts.get(i).getAccountUsername();
            String dataAccountWachtwoord = accounts.get(i).getAccountWachtwoord();

            if (dataAccountNaam.equals(accountNaam) && dataAccountWachtwoord.equals(accountWachtwoord)){
                this.account = accounts.get(i);
                this.loggedIn = true;
                this.accountNaam = accountNaam;
                this.accountWachtwoord = accountWachtwoord;
                System.out.println("Welkom "+ accountNaam + " !");
            }
        }

        if (!loggedIn){
            System.out.println("accountnaam of wachtwoord klopt niet.");
        }
    }

    public void Register(String AccountNaam, String accountWachtwoord){
        Account account = new Account(AccountNaam, accountWachtwoord);
        this.accountNaam = AccountNaam;
        this.accountWachtwoord = accountWachtwoord;
        this.accounts.add(account);
        this.loggedIn = true;
    }


    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void logOut(){
        this.loggedIn = false;
    }


}
