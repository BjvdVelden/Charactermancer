public class Account {

    public String accountUsername;
    public String accountWachtwoord;

    public Account(String accountUsername, String accountWachtwoord){
        this.accountUsername = accountUsername;
        this.accountWachtwoord = accountWachtwoord;
    }

    public String getAccountUsername() {
        return accountUsername;
    }

    public void setAccountUsername(String accountUsername) {
        this.accountUsername = accountUsername;
    }

    public String getAccountWachtwoord() {
        return accountWachtwoord;
    }

    public void setAccountWachtwoord(String accountWachtwoord) {
        this.accountWachtwoord = accountWachtwoord;
    }
}
