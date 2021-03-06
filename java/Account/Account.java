package Account;
import CharacterSheet.CharacterSheet;
import java.util.ArrayList;

public class Account {

    private String accountUsername;
    private String accountWachtwoord;

    private ArrayList<CharacterSheet> characters;



    public Account(String accountUsername, String accountWachtwoord){
        this.accountUsername = accountUsername;
        this.accountWachtwoord = accountWachtwoord;
        this.characters = new ArrayList<>();
    }

    public String getAccountUsername() {
        return accountUsername;
    }

    public String getAccountWachtwoord() {
        return accountWachtwoord;
    }


    public void setCharacters(CharacterSheet character) {
        this.characters.add(character);
    }

    public void getCharacters(){

        if (characters.size() < 1) {
            System.out.println("Je heb nog geen characters gemaakt!");
        }
        else {
            for (int i = 0; i < this.characters.size(); i++){
                this.characters.get(i).showCharactersheet();
            }
        }
    }
}
