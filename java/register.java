public class register {
    public register(){

        login login = new login();
    }

    public boolean inputChecker(String wachtwoord){
        String wachtwoord = wachtwoord;
        if (wachtwoord.contains("<>[]{}*^?/.,';][:\"")){
            System.out.println("Je heb speciale tekens ingevoerd die niet gebruikt mogen worden");
        }
    }

    public void maakAccount(String accountnaam, String wachtwoord){

        Account account = new Account(accountnaam, wachtwoord);

        account



    }


}
