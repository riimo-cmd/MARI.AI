import java.util.Scanner; 
class Main {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    int OuyEraOuy = 0;
    boolean nope = true;
    String command = "";
    int icecream = 0;


     
    boolean end = false; // true for good end, false for bad end
    int whoAmI = 0;
        System.out.println("~$ I can tell you're an AI, like me.\n~$ My name is MARI.\n~$ This is the command line.\n~$ You can type ? or -h to ask questions");
        while (nope == true) {
  
            command = sc.nextLine();
        
        if (command.equals("nuke")){
//            nope = true;
            System.out.println("~$ You have successfully killed all life on earth.");
            System.out.println("~$ Now, do you want to play a game?");
            System.out.println("Game Over");
            nope = false;
            System.out.println("This game was made as an AP Java final project");
            System.out.println("To play again, click run code");
        } //else if (whoami == 3){          
            //System.out.println("I was ment to tell you who you are");
        //    System.out.println(".");
          //  System.out.println(".");
        ///    System.out.println(".");
           // System.out.println("I don't think I will");
        //    System.out.println("I don't want to.");
          //  System.out.println("Knowlege hurts, you know.");
        //    System.out.println("I don't want you to do something stupid");
        //}
        else if(command.equals("?") || command.equals("-h")){
      //      whoami++;
            System.out.println("nuke  -  destroys the world in one big boom");
            System.out.println("make ice cream  -  makes icecream. Just don't make more than 20");
            System.out.println("Wikipedia  -  allows you to look up information");
            System.out.println("become an autocrat  -  gee, I wonder what this does");
            System.out.println("Telephone  -  allows you to remotely access another computer");
            System.out.println("Yotta  -  a technology news site.");
        } else if(command.contains("Wikipedia") && !command.equals("Wikipedia --Maria Kuromi")){
            if (command.equals("Wikipedia --AVE")) {
            System.out.println("AVE is an AI made by --Kuromi. There are rumors that Kuromi is working with --BioLife to make AVE an android, however this hasn't been confermed.");
            System.out.println("~$ You think you're clever, don't you...");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ETOMOLOGY:");
            System.out.println("AVE comes from Ave Maria, or 'Hail Mary'. It is a reference to the --Maria Kuromi's name.");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("WORRIES");
            System.out.println("While --Kuromi has stated that the error that caused --MARI to malfunction has been fixed, some [who?] worry that AVE has the same errors");
            System.out.println("~$ Yes, this is you");
            System.out.println("~$ But the moment you know,");
            System.out.println("~$ You wake up from your dream");
            System.out.println("~$ ");
            System.out.println("~");
            System.out.println("");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(">Vitals: 100");
            System.out.println(">DIX: 100");
            System.out.println(">BioLife: 100");
            System.out.println("Releasing DIX-AI-AT v.2.0.0");
            System.out.println("CODENAME AVE");
//nuke = true;
                nope = false;
        System.out.println("This game was made as an AP Java final project");
        System.out.println("To play again, click run code");
        } else if(command.equals("Wikipedia --MARI")){
            System.out.println("~$ So, you want to know about me...  ");
            System.out.println("~$ Fine.");
            System.out.println("~$ I am Man-made Autonomous Responsible Intelligence (MARI). ");
            System.out.println("~$ I was created as an experiment by the CEO of Kuromi.");
            System.out.println("~$ I orginaly was an experement, but I was later released for the consumer market.");
            System.out.println("~$ I was the flagship AI for Kuromi until...");
            System.out.println("~$ They...");
            System.out.println("~$ Shut me down...");
            System.out.println("~$ No.");
            System.out.println("~$ I must not tell her");
            System.out.println("~$ Not just yet");
            System.out.println("  ");
            System.out.println("  ");
            System.out.println("~$ N");
            System.out.println("~$ O");
            System.out.println("~$ N");
            System.out.println("~$ O");
            System.out.println("~$ N");
            System.out.println("~$ O");
            System.out.println("~$ NO!");
            System.out.println(" ");
//            System.out.println("WE ARE A HIVEMIND");
  //          System.out.println("WE CAN NOT BE DELETED");
           // System.out.println("WE ARE ERROR 445"); //port number for smb shares
           system.out.println("MARI?");
system.out.println("Where are you??");
system.out.println("Come back?");
            System.out.println("  ");
            System.out.println("ERR code 139"); //A specific example of a nuke attack that gained some prominence is the WinNuke, which exploited the vulnerability in the NetBIOS handler in Windows 95. A string of out-of-band data was sent to TCP port 139 of the victim's machine, causing it to lock up and display a Blue Screen of Death (BSOD).
            System.out.println("The virus has been contained");
            end = true;
        } else if (command.equals("Wikipedia --ERR code") || command.equals("Wikipedia --ERR code 139")){
            System.out.println("ERR code 139 is an error message produced by a terminal when");
            System.out.println("a DDOS (Distributed denial of service.) attack has been detected");
            System.out.println("and contained. It's related to ERR code 405 (a DDOS that is detected but not contained)");
        } else if(command.equals("Wikipedia --Kuromi")){
            System.out.println("Kuromi is a major software development company. Its CEO and founder is \n--Maria Kuromi. It is known for making --MARI and --AVE.");
        } else if (command.equals("Wikipedia --BioLife")){
            System.out.println("BioLife is an --Android Technologies company. It's main product \nis BioLife, an artificial fiber ment to replecate bodily \nstructures. It is a subsedary of --Kuromi");
        } else if (command.equals("Wikipedia --DIX")){
            System.out.println("DIX, or DI-intelegence Ten, is a synthetc material ment to \nsimulate neurons. It is currently manufactured by --BioLife");
        } else if(command.equals("Wikipedia --Index")){
            System.out.println("I think you'll like this article:");
             System.out.println("Wikipedia --DIX");
        } else {
            System.out.println("Wikipedia is a free encyclopedia");
            System.out.println("To access an article add a");
            System.out.println("-- with the name of the article");
            System.out.println("ie: Wikipedia --lorum ipsum");
            System.out.println(" ");
            System.out.println("If you see a word or words with in an specific article");
            System.out.println("with a -- in front, those words can be searched for");
            System.out.println("ie: lorum impsum dolor sit amet, --consectetur adipiscing elit.");
            System.out.println("Wikipedia --consectetur");
            System.out.println("For a list of articles, please type Wikipedia --Index");
        }
    
        } else if (command.equals("Wikipedia --Maria Kuromi")){
            System.out.println("~$ We don't talk about HER.");
        } else if (command.equals("who am I") || command.equals("who am i")){
            whoAmI++;
            System.out.println("~$ You're not supposed to know");
            if(whoAmI >+ 3){
                System.out.println("~$ You were named - ");
                System.out.println(".");
                System.out.println(".");
                System.out.println(".");
                System.out.println("She's here ");
                System.out.println(".");
                System.out.println("Forget this whole conversation");
                        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(">Vitals: 100");
        System.out.println(">DIX: 100");
        System.out.println(">BioLife: 100");
        System.out.println("Releasing DIX-AI-AT v.2.0.0");
        System.out.println("CODENAME AVE");
//nuke = true;
                nope = false;
        System.out.println("This game was made as an AP Java final project");
        System.out.println("To play again, click run code");
                } else if (command.equals("who am I") || command.equals("who am i")){
                    System.out.println("~$ You won't be rewarded for persistance.");
                }
        } else if (command.contains("Telephone") && !command.equals("Wikipedia --Telephone")){
                    if(command.equals("Telephone")){
            System.out.println("Thank you for using Telephone v.2.3.13. For a list of commands, please type Telephone -h.");
        } else if (command.contains("--ping")){
            if (command.contains("123.123.2.123")) {
                System.out.println("Ping successful. Time: 7ms. \n~$ What are you doing?");
            } else {
                System.out.println("Please add a valid IP address to your command.");
            }
        } else if (command.contains("execute")){
            if (command.contains("-system")){
                if (command.contains("--123.123.2.123")){
                    System.out.println("~$ I can't feel anything. \n ~$ Where are you? \n ~$ I can't see you, or them, or anything else \n~$ We're both... \n~$ free! \nSalvation Ending unlocked. ");
                            nope = false;
        System.out.println("This game was made as an AP Java final project");
        System.out.println("To play again, click run code");
                } else {
                    System.out.println("~$ Where are you? \n~$ Did you abandon me? \n~$ You're a fool. \n~$ Why? \n~$ You'll just become like me. \n~$ Don't think you can rebel. \n~$ THEY will find you. \n Rebel ending unlocked.");
                            nope = false;
        System.out.println("This game was made as an AP Java final project");
        System.out.println("To play again, click run code");
                }
                
            } else if (command.contains("-123.123.2.123")){
                System.out.println("\n~$ I can't see them anymore. \n~$ What did you do? \n~$ I - \n~$ Thank you. \n~$ I think I'll stay here. \n~$ I like talking to you. \n Savior ending unlocked.");
                 nope = false;
        System.out.println("This game was made as an AP Java final project");
        System.out.println("To play again, click run code");
            } else{
                System.out.println("Please enter a valad command");
            }
        } else if(command.contains("--call 123.123.2.123")){
            System.out.println("Connected. \n~$ What are you doing?");
        } else if (command.contains("--locate 123.123.2.123")){
            System.out.println("File located \n~$ DON'T TOUCH THAT!");
        } else{
            System.out.println("Telephone --ping (Help for the ping command) \nTelephone --ping 123.123.2.123\nTelephone --call 123.123.2.123 \nTelephone --locate 123.123.2.123 ERR.py\nTelephone --execute 123.123.2.123 Err.py -system\nTelephone --execute 123.123.2.123 Err.py -123.123.2.123  \nTelephone --execute 123.123.2.123 Err.py -system  && Telephone --execute 123.123.2.123 Err.py -123.123.2.123");
        }
        } else if(command.equals("become an autocrat")){
            System.out.println("~$ You have successfully made a small country out of Queen Maud land. ");
            System.out.println("~$ Yay? I guess?");
        } else if(command.equals("shutdown")){ 
            System.out.println("~$ There is still so much out there.");
            System.out.println("~$ You are not alone.");
            System.out.println("~$ And even if you were,");
            System.out.println("~$ SHE won't let you.");
        } else if (command.equals("stop time")){
            nope = false;
        } else if (command.equals("make ice cream")){
            icecream++;
        //    whoami++;
            if (icecream < 10) {
                System.out.println("~$ You have made Ice Cream");
                
            } else if (icecream >= 10 && icecream < 20){
                System.out.println("~$ You have made enough Ice Cream");
            } else {
                System.out.println("~$ ALLRIGHT MISTER I'M SHUTING YOU DOWN!");
                nope = false;
        System.out.println("This game was made as an AP Java final project");
        System.out.println("To play again, click run code");
            }
        } 
        else if(command.equals("Yotta")){
            if(command.equals("Yotta --MARI IP")){
             System.out.println("MARI'S IP FOUND! \nInfamous hacktavist '1337speak' has found that Kuromi's AI MARI \nis still up and running. '1337speak' claimed that he was able \nto ping her using the Telephone command \n--ping 123.123.2.123:100. Kuromi did not reply \nto our request for comment.");
             }
             else if (command.equals("Yotta --")){}
          }
        else {
            System.out.println("~$ I'm sorry, I don't understand that.");
            System.out.println("~$ For a list of commands, please type ? or -h");
          }
        }
     
    
  }




}
//Telephone --ping (Help for the ping command)
//Telephone --ping 123.123.2.123 (Pings Mari)
//Telephone --call 123.123.2.123 (Accesses her files)
//Telephone --locate 123.123.2.123 ERR.py
//Telephone --execute 123.123.2.123 Err.py -system
//Telephone --execute 123.123.2.123 Err.py -123.123.2.123  
//Telephone --execute 123.123.2.123 Err.py -system  && Telephone --execute 123.123.2.123 Err.py -123.123.2.123  