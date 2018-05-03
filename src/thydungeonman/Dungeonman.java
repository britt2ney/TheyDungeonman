/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thydungeonman;

/**
 *
 * @author Britt2ney
 */
public class Dungeonman {
    private int score;
    private String location;
    private boolean alive;
    private boolean trinket;
    
    public Dungeonman(){
        score = 0;
        location = "main";
        alive = true;
        trinket = false;
        System.out.println("THY DUNGEONMAN\n" +
            "\n\nYOU ARE THY DUNGEONMAN!\n");
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public boolean hasTrinket() {
        return trinket;
    }

    public void setTrinket(boolean trinket) {
        this.trinket = trinket;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getLocation() {
        return location;
    }
    
    public void goMain(){
        System.out.print("\nYe find yeself in yon dungeon. Ye see a SCROLL. "
                + "Behind ye scroll is a FLASK. Obvious exits are NORTH, "
                + "SOUTH and DENNIS.");
        this.location = "main";
    }
    
    public void goNorth(){
        System.out.print("\nYou go NORTH through yon corridor. You arrive at "
                + "parapets. Ye see a ROPE. Obvious exits are SOUTH.");
        this.location = "north";
    }
    
    public void goSouth(){
        System.out.print("\nYou head south to an enbankment. Or maybe a chasm. "
                + "You can't decide which. Anyway, ye spies a TRINKET. "
                + "Obvious exits are NORTH.");
        this.location = "south";
    }
    
    public void goDennis(){
        System.out.print("\nYe arrive at Dennis. He wears a sporty frock coat "
                + "and a long jimberjam. He paces about nervously. "
                + "Obvious exits are NOT DENNIS.");
        this.location = "dennis";
    }
    
    public void clearScreen(){
        System.out.print("\033[H\033[2J");
    }
    
    public String badLocation(){
        return "\nThou cannotst go there. Who do you think thou art? A magistrate?!";
    }
    
    public String badInput(){
        return "\nThat does not computeth. Type HELP is thou needs of it.";
    }
}
