package CharacterSheet;

import java.util.Scanner;

public class Mage extends CharacterSheet{


    private String characterClass = "Ranger";
    private int health = 0;
    private String armorProfiency;
    private String weaponProfiency;
    private String toolsProfiency;
    private String savingThrows;

    private String spellCasting;

    private String spells;


    public Mage() {
        super();
    }


    @Override
    public String getCharacterClass(){
        return characterClass;
    }

    @Override
    public int healthCalculation(int characterCon) {
        int abilityScoreModifier =  characterCon-10 / 2;
        int health = 10 + abilityScoreModifier;

        return health;
    }

    @Override
    public void setProficiencies() {
        this.armorProfiency = "Light Armor, Medium Armor, Shields";
        this.weaponProfiency = "Simple Weapons, Martial Weapons";
        this.toolsProfiency= "None";
        this.savingThrows = "Strength, Dexterity";
    }

    @Override
    public String selectSkills() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kies 2 Skills uit; Animal Handling, Athletics, Insights, Investigation, Nature, Perception, Stealth and Survival");
        String skill1 = scanner.nextLine();
        String skill2 = scanner.nextLine();
        return skill1 + ", " + skill2;
    }

    @Override
    public String selectEquipment() {

        String equipment;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kies uit de volgende equipment (Door a of b te schrijven)");
        System.out.println("(A) Scale mail of (B) leather armor");
        String antwoord1 = scanner.nextLine().toLowerCase();
        if (antwoord1.equals("a")){
            equipment = "Scale mail";
        }
        else {
            equipment = "leather armor";
        }
        System.out.println("(A) Two shortswords of (B) Two simple melee weapons");
        String antwoord2 = scanner.nextLine().toLowerCase();
        if (antwoord2.equals("a")){
            equipment += ",  Two shortswords";
        }
        else {
            equipment += ", Two simple melee weapons";
        }
        System.out.println("(A) Dungeoneers pack of (B) Explorer's pack");
        String antwoord3 = scanner.nextLine().toLowerCase();
        if (antwoord3.equals("a")){
            equipment += ", Dungeoneers pack.";
        }
        else {
            equipment += ", Explorer's pack.";
        }

        equipment += ", A longbow and a quiver with 20 arrows";

        return equipment;
    }

    @Override
    public void showClassFeatures(){

        System.out.println("-----------------------------------------" +
                "Class: "+ this.health + "\n" +
                "Health: "+ this.health + "\n" +
                "Armor Profiency: "+ this.armorProfiency + "\n" +
                "weapon Profiency: "+ this.weaponProfiency + "\n" +
                "tools Profiency: "+ this.toolsProfiency + "\n" +
                "savingThrows "+ this.savingThrows + "\n" +
                "-----------------------------------------");
    }

}
