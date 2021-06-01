package CharacterSheet;

import java.util.Scanner;

public class CharacterSheet {

    private String characterName;
    private String playerName;
    private String characterBackground;
    private String characterAlignment;
    private int characterLevel = 1;
    private String characterClass;
    private String characterRace;
    private int characterExp = 0;

    private boolean characterInspiration = false;
    private int characterProfiencyBonus = 2;
    private int characterInitiative;
    private int characterAC = 10;

    private int characterStr;
    private int characterDex;
    private int characterCon;
    private int characterInt;
    private int characterWis;
    private int characterCha;

    public CharacterSheet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wat is de speler zijn naam");
        this.playerName = scanner.nextLine().toLowerCase();
        System.out.println("Wat is de character zijn naam");
        this.characterName = scanner.nextLine().toLowerCase();
        System.out.println("Wat is de character zijn background");
        this.characterBackground = scanner.nextLine().toLowerCase();
        System.out.println("Wat is de character zijn alignment");
        this.characterAlignment = scanner.nextLine().toLowerCase();
        System.out.println("Wat is de character zijn Class");
        this.characterClass = scanner.nextLine().toLowerCase();
        System.out.println("Wat is de character zijn Race");
        this.characterRace = scanner.nextLine().toLowerCase();

        System.out.println("Wat is de character zijn Strength");
        this.characterStr = scanner.nextInt();
        System.out.println("Wat is de character zijn Dexterity");
        this.characterDex = scanner.nextInt();
        System.out.println("Wat is de character zijn Constitiution");
        this.characterCon = scanner.nextInt();
        System.out.println("Wat is de character zijn Wisdom");
        this.characterWis = scanner.nextInt();
        System.out.println("Wat is de character zijn Intelligence");
        this.characterInt = scanner.nextInt();
        System.out.println("Wat is de character zijn Charisma");
        this.characterCha = scanner.nextInt();

    }


    public void showCharactersheet(){
        System.out.println("Character name: "+ this.characterName + "\n" +
                "-----------------------------------------" +
                "Player Mame: "+ this.playerName + "\n" +
                "Background: "+ this.characterBackground + "\n" +
                "Alignment: "+ this.characterAlignment + "\n" +
                "Class: "+ this.characterClass + "\n" +
                "Level: "+ this.characterLevel + "\n" +
                "Exp: "+ this.characterExp + "\n" +
                "Race: "+ this.characterRace + "\n" +
                "-----------------------------------------" +
                "Inspiration: "+ this.characterInitiative + "\n" +
                "Armor class: "+ this.characterAC + "\n" +
                "Initiative: "+ this.characterInitiative + "\n" +
                "-----------------------------------------" +
                "Strength: "+ this.characterStr + "\n" +
                "Dex: "+ this.characterDex + "\n" +
                "Constitution: "+ this.characterCon + "\n" +
                "Wisdom: "+ this.characterWis + "\n" +
                "Intelligence: "+ this.characterInt + "\n" +
                "Charisma: " + this.characterCha + "\n" +
                 "-----------------------------------------");

    }
}
