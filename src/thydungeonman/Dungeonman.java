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
        clearScreen();
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
    
    public void atMain(String input){
        switch(input.toLowerCase()){
            case "help":
                goMain();
                break;
            case "go north":
                goNorth();
                break;
            case "go south":
                goSouth();
                break;
            case "go dennis":
                goDennis();
                break;
            case "get flask":
               System.out.print("\nYe cannot get the FLASK. It is firmly bolted "
                    + "to a wall which is bolted to the rest of the dungeon "
                    + "which is probably bolted to a castle. Never you mind.");
               break;
            case "get scroll":
                System.out.print("\nYe takes the scroll and reads of "
                        + "it. It doth say:\nBEWARE, READER OF THE "
                        + "SCROLL, DANGER AWAITS TO THE-\n\n The "
                        + "SCROLL disappears in thy hands with ye "
                        + "olde ZAP!");
                break;
            default:
                System.out.print(badInput());
        }
    }
    
    public void atNorth(String input){
        switch(input.toLowerCase()){
            case "help":
                goNorth();
                break;
            case "go south":
                goMain();
                break;
            case "get rope":
                System.out.print("\nYou attempt to take ye ROPE but "
                        + "alas it is enchanted! It glows a mustard "
                        + "red and smells like a public privy. The "
                        + "ROPE wraps round your neck and hangs you "
                        + "from parapets. With your last breath, "
                        + "you wonder what parapets are. GAME OVER\n");
                setAlive(false);
                break;
            default:
                System.out.print(badInput());
        }
    }
    
    public void atSouth(String input){
        switch(input.toLowerCase()){
            case "help":
                goSouth();
                break;
            case "go north":
                goMain();
                break;
            case "get trinket":
                if(hasTrinket()){
                   System.out.print("\nSigh. The trinket is in thou pouchel. Recallest thou?");
                }
                else{
                    System.out.print("\nYe getsts yon TRINKET and discover "
                        + "it to be a bauble. You rejoice at your "
                        + "good fortune. You shove the TRINKET in "
                        + "your pouchel. It kinda hurts.");
                    setTrinket(true);
                }
                break;
            default:
                System.out.print(badInput());
        }
    }
    
    public void atDennis(String input){
        switch(input.toLowerCase()){
            case "help":
                goDennis();
                break;
            case "not dennis":
                goMain();
                break;
            case "talk dennis":
                System.out.print("\nYou engage Dennis in leisurely "
                        + "discussion. Ye learns that his jimberjam "
                        + "was purchased on sale at a discount market "
                        + "and that he enjoys pacing about nervously. "
                        + "You become bored and begin thinking about parapets.");
                break;
            case "give trinket":
                if(hasTrinket()){
                    System.out.print("\nA novel idea! You givst the "
                        + "TRINKET to Dennis and he happily agrees "
                        + "to tell you what parapets are. With this "
                        + "new knowledge, ye escapes from yon "
                        + "dungeon in order to search for new "
                        + "dungeons and to remain... \n\nTHY DUNGEONMAN!! "
                        + "\nYou hath won! Congraturation!!\n");
                    setAlive(false);
                }
                else{
                    System.out.print("Thou don'tst have a trinket to give. Go back to your tiny life.");
                }                
                break;
            default:
               System.out.print(badInput()); 
        }
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
    
    public void prompt(){
        if(isAlive()){
            System.out.print("\n\nWhat wouldst thou deau?\n>");
        }
    }
    
    public String badLocation(){
        return "\nThou cannotst go there. Who do you think thou art? A magistrate?!";
    }
    
    public String badInput(){
        return "\nThat does not computeth. Type HELP is thou needs of it.";
    }
}
