package LoginSysteem;

import Account.Account;

import java.util.Scanner;
public class registerFunction {
    private String accountNaam;
    private String accountWachtwoord;

    public registerFunction(){
    }
    public Account startRegistratie(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voer uw accountnaam in");
        String input1 = scanner.nextLine();
        System.out.println("Voer uw wachtwoord in");
        String input2 = scanner.nextLine();

        if(input1.equals("stop") || input2.equals("stop")){
            System.exit(1);
        }

        if(inputChecker(input1) || inputChecker(input2) ){
            if(wachtwoordChecker(input2)){
                this.accountNaam = input1;
                this.accountWachtwoord = input2;
                Account account = new Account(this.accountNaam, this.accountWachtwoord);
                return account;
            }
        }
        return startRegistratie();
    }

    public boolean inputChecker(String input){
        String string = input;
        String specialCharacters = "<>[]{}*^/.,';][:\"";
        for (int i = 0; i < string.length(); i++)
        {
            char check = string.charAt(i);
            if(specialCharacters.contains(Character.toString(check))) {
                break;
            }
            else if(i == string.length()-1){
            return true;
            }
        }
        return false;
    }

    public boolean checkStringSize(String input){
        if (input.length() < 21){
            return true;
        }
        else{
            System.out.println("Je Inlognaam is groter dan 21 tekens");
            return false;
        }
    }


    public boolean wachtwoordChecker(String wachtwoord){
       String string = wachtwoord;
       boolean heeftCijfer = false;
       boolean heeftHoofdletter = false;
       boolean heeftkleineletter = false;

       for(int i = 0; i < string.length(); i++){
           char check = string.charAt(i);
           if(Character.isDigit(check)){
               heeftCijfer = true;
           }
           if(Character.isUpperCase(check)){
               heeftHoofdletter = true;
           }
           if(Character.isLowerCase(check)){
               heeftkleineletter = true;
           }
        }
       if(heeftCijfer && heeftHoofdletter && heeftkleineletter){
           return true;
       }
        System.out.println("Je moet minimaal 1 hoofletter, kleine letter en cijfer hebben in jouw wachtwoord!");
       return false;
    }


}
