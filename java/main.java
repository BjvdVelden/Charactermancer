import java.util.Scanner;
class Main{
  public static void main(String[] args) {
    login login = new login();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welkom");
    System.out.println("Vul uw gebruikers naam");
    String accountNaam = scanner.nextLine();
    System.out.println("Vul uw wachtwoord");
    String accountWachtwoord = scanner.nextLine();
    login.startLogin(accountNaam,accountWachtwoord);

  }
} 
