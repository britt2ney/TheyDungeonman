/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thydungeonman;

import java.util.Scanner;

/**
 *
 * @author Britt2ney
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String input;
        Dungeonman dude = new Dungeonman();
        dude.goMain();
        System.out.print("\n\nWhat wouldst thou deau?\n>");
        
        do{
            input = keyboard.nextLine();
            dude.clearScreen();
            switch(dude.getLocation()){
                case "main":
                    switch(input.toLowerCase()){
                        case "help":
                            dude.goMain();
                            break;
                        case "go north":
                            dude.goNorth();
                            break;
                        case "go south":
                            dude.goSouth();
                            break;
                        case "go dennis":
                            dude.goDennis();
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
                            System.out.print(dude.badInput());
                    }
                    break;
                case "north":
                    switch(input.toLowerCase()){
                        case "help":
                            dude.goNorth();
                            break;
                        case "go south":
                            dude.goMain();
                            break;
                        case "get rope":
                            System.out.print("\nYou attempt to take ye ROPE but "
                                    + "alas it is enchanted! It glows a mustard "
                                    + "red and smells like a public privy. The "
                                    + "ROPE wraps round your neck and hangs you "
                                    + "from parapets. With your last breath, "
                                    + "you wonder what parapets are. GAME OVER");
                            dude.setAlive(false);
                            break;
                        default:
                            System.out.print(dude.badInput());
                    }
                    break;
                case "south":
                    switch(input.toLowerCase()){
                        case "help":
                            dude.goSouth();
                            break;
                        case "go north":
                            dude.goMain();
                            break;
                        case "get trinket":
                            if(dude.hasTrinket()){
                               System.out.print("\nSigh. The trinket is in thou pouchel. Recallest thou?");
                            }
                            else{
                                System.out.print("\nYe getsts yon TRINKET and discover "
                                    + "it to be a bauble. You rejoice at your "
                                    + "good fortune. You shove the TRINKET in "
                                    + "your pouchel. It kinda hurts.");
                            }
                            break;
                        default:
                            System.out.print(dude.badInput());
                    }
                    break;
                case "dennis":
                    switch(input.toLowerCase()){
                        case "help":
                            dude.goDennis();
                            break;
                        case "not dennis":
                            dude.goMain();
                            break;
                        case "talk dennis":
                            System.out.print("\nYou engage Dennis in leisurely "
                                    + "discussion. Ye learns that his jimberjam "
                                    + "was purchased on sale at a discount market "
                                    + "and that he enjoys pacing about nervously. "
                                    + "You become bored and begin thinking about parapets.");
                            break;
                        case "give trinket":
                            System.out.print("\nA novel idea! You givst the "
                                    + "TRINKET to Dennis and he happily agrees "
                                    + "to tell you what parapets are. With this "
                                    + "new knowledge, ye escapes from yon "
                                    + "dungeon in order to search for new "
                                    + "dungeons and to remain... \n\nTHY DUNGEONMAN!! "
                                    + "\nYou hath won! Congraturation!!");
                            dude.setAlive(false);
                            break;
                    }
                    break;
                default:
                    System.out.print(dude.badInput());
            }        
            System.out.print("\n\nWhat wouldst thou deau?\n>");
        }while(dude.isAlive());
    }
}
