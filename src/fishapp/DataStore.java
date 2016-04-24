package fishapp;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;


public class DataStore {
    
    //variables to store the number of animals
    private int dugongCount = 0;
    private int humpBackedWhaleCount = 0;
    private int bandedSeaKraitCount = 0;
    private int greenSeaTurtleCount = 0;
    private int oliveRidelyTurtleCount = 0;
    private int whaleSharkCount = 0;
    private int hammerheadSharkCount = 0;
    private int tigerSharkCount = 0;
    private int lemonSharkCount = 0;    
    private int troutCount = 0;
    private int codCount = 0;
    private int parrotFishCount = 0;
    private int wrasseCount = 0;  
    private int octopusCount = 0;
    private int cuttlefishCount = 0;
    private int squidCount = 0;
    
   
    //create fish objects from the Fish class. 
        private final Fish dugong = new Fish("Dugong", "Weird hippo-lookin thing");
    private final Fish humpBackedWhale = new Fish("Hump Backed Whale", "The humpback whale is a \n" +
                                                                       "species of baleen whale.");
    
    private final Fish bandedSeaKrait = new Fish("Banded Sea Krait", "Looks like Beetlejuice");
    private final Fish greenSeaTurtle = new Fish("Green Sea Turtle", "Winner of 'Most Original \n" +
                                                                     "Name Award'.");
    private final Fish oliveRidelyTurtle = new Fish("Olive Ridely Turtle", "AKA 'Pacific ridley \n" +
                                                                           "sea turtle.");
    
    private final Fish whaleShark = new Fish("Whale Shark", "A slow-moving filter \n" +
                                                            "feeding shark.");
    private final Fish hammerheadShark = new Fish("Hammerhead Shark", "Useless at DIY.");
    private final Fish tigerShark = new Fish("Tiger Shark", "AKA 'The Sea Tiger' yet \n" +
                                                            "looks nothing like one.");
    private final Fish lemonShark = new Fish("Lemon Shark", "Actually does taste like \n" +
                                                            "lemons, suprisingly.");
    
    private final Fish cod = new Fish("Cod", "Tastey with chips");
    private final Fish trout = new Fish("Trout", "In a limpid brook \n" +
                                        "the capricious trout \n" +
                                        "in joyous haste \n" +
                                        "darted by like an arrow.");
    private final Fish parrotFish = new Fish("Parrot Fish", "Apparently can't fly... \n" +
                                                            "...Dissappointing...");
    private final Fish wrasse = new Fish("Wrasse", "A brightly coloured fish.");
    
    private final Fish octopus = new Fish("Octopus", "Has two eyes and \n" +
                                                     "four pairs of arms.");
    private final Fish cuttlefish = new Fish("Cuttlefish", "Cuttlefish are marine \n" +
                                                           "animals of the order \n" +
                                                           "Sepiida.");
    private final Fish squid = new Fish("Squid", "I hate these, I am allergic to them :(");

    //the constructor is empty as there is nothing to initialise.
    public DataStore() {

    }

    /**
     *
     * @param s
     * @return
     */
    /*This method takes a string from the event handlers in the MainFrame class
    When a button is clicked, a string is passed to the method
    */
    public String increment(String s) {
        
        String animalString;
        
        animalString = s;
        
        //we use a switch/case block instead of an if/else block, as there will be many conditions.
        switch (animalString) {
            
            case "cod":
                codCount ++; //when the cod button is pressed, add 1 to the codCount variable
                //assign the codCount to the animal string. We need to convert the integer to a string to do this
                animalString = Integer.toString(codCount) + " ";
                //call the methods of the cod object to return their attributes and append them to the animal string
                animalString += cod.getGenus()+ " " + cod.getInfo();  
                
                break;
                
        case "dugong":
                dugongCount ++;
                animalString = Integer.toString(dugongCount) + " ";
                animalString += dugong.getGenus() + " "+ dugong.getInfo();
                
                break;
           
            case "humpBackedWhale":
                humpBackedWhaleCount ++;
                animalString = Integer.toString(humpBackedWhaleCount) + " ";
                animalString += humpBackedWhale.getGenus() + " "+ humpBackedWhale.getInfo();             
                
                break;  
            
            case "bandedSeaKrait":
                bandedSeaKraitCount ++;
                animalString = Integer.toString(bandedSeaKraitCount) + " ";
                animalString += bandedSeaKrait.getGenus() + " "+ bandedSeaKrait.getInfo();             
                
                break;    
                
            case "greenSeaTurtle":
                greenSeaTurtleCount ++;
                animalString = Integer.toString(greenSeaTurtleCount) + " ";
                animalString += greenSeaTurtle.getGenus() + " "+ greenSeaTurtle.getInfo();             
                
                break;  
                
            case "oliveRidelyTurtle":
                oliveRidelyTurtleCount ++;
                animalString = Integer.toString(oliveRidelyTurtleCount) + " ";
                animalString += oliveRidelyTurtle.getGenus() + " "+ oliveRidelyTurtle.getInfo();             
                
                break; 
                
            case "whaleShark":
                whaleSharkCount ++;
                animalString = Integer.toString(whaleSharkCount) + " ";
                animalString += whaleShark.getGenus() + " "+ whaleShark.getInfo();             
                
                break;    
                
            case "hammerheadShark":
                hammerheadSharkCount ++;
                animalString = Integer.toString(hammerheadSharkCount) + " ";
                animalString += hammerheadShark.getGenus() + " "+ hammerheadShark.getInfo();             
                
                break;    
                
            case "tigerShark":
                tigerSharkCount ++;
                animalString = Integer.toString(tigerSharkCount) + " ";
                animalString += tigerShark.getGenus() + " "+ tigerShark.getInfo();             
                
                break;     
                
            case "lemonShark":
                lemonSharkCount ++;
                animalString = Integer.toString(lemonSharkCount) + " ";
                animalString += lemonShark.getGenus() + " "+ lemonShark.getInfo();             
                
                break;      

            case "trout":
                troutCount ++;
                animalString = Integer.toString(troutCount) + " ";
                animalString += trout.getGenus() + " "+ trout.getInfo();             
                
                break;
                
            case "parrotFish":
                parrotFishCount ++;
                animalString = Integer.toString(parrotFishCount) + " ";
                animalString += parrotFish.getGenus() + " "+ parrotFish.getInfo();             
                
                break;
            
            case "wrasse":
                wrasseCount ++;
                animalString = Integer.toString(wrasseCount) + " ";
                animalString += wrasse.getGenus() + " "+ wrasse.getInfo();             
                
                break;
                
            case "octopus":
                octopusCount ++;
                animalString = Integer.toString(octopusCount) + " ";
                animalString += octopus.getGenus() + " "+ octopus.getInfo();             
                
                break;
                
            case "cuttlefish":
                cuttlefishCount ++;
                animalString = Integer.toString(cuttlefishCount) + " ";
                animalString += cuttlefish.getGenus() + " "+ cuttlefish.getInfo();             
                
                break;  
                
            case "squid":
                squidCount ++;
                animalString = Integer.toString(squidCount) + " ";
                animalString += squid.getGenus() + " "+ squid.getInfo();             
                
                break;     
                
            case "reset":                               
                dugongCount = 0;
                humpBackedWhaleCount = 0;
                bandedSeaKraitCount = 0;
                greenSeaTurtleCount = 0;
                oliveRidelyTurtleCount = 0;
                whaleSharkCount = 0;
                hammerheadSharkCount = 0;
                tigerSharkCount = 0;
                lemonSharkCount = 0;    
                troutCount = 0;
                codCount = 0;
                parrotFishCount = 0;
                wrasseCount = 0;  
                octopusCount = 0;
                cuttlefishCount = 0;
                squidCount = 0;
                animalString = ("Values have been reset.");
                
                break;    
                
        }
            
    String dugongCountFile = Integer.toString(dugongCount);
    String humpBackedWhaleCountFile = Integer.toString(humpBackedWhaleCount);        
    String bandedSeaKraitCountFile = Integer.toString(bandedSeaKraitCount);
    String greenSeaTurtleCountFile = Integer.toString(greenSeaTurtleCount);
    String oliveRidelyTurtleCountFile = Integer.toString(oliveRidelyTurtleCount);
    String whaleSharkCountFile = Integer.toString(whaleSharkCount);
    String hammerheadSharkCountFile = Integer.toString(hammerheadSharkCount);
    String tigerSharkCountFile = Integer.toString(tigerSharkCount);
    String lemonSharkCountFile = Integer.toString(lemonSharkCount);
    String codCountFile = Integer.toString(codCount);
    String parrotFishCountFile = Integer.toString(parrotFishCount);
    String wrasseCountFile = Integer.toString(wrasseCount);
    String octopusCountFile = Integer.toString(octopusCount);
    String cuttlefishCountFile = Integer.toString(cuttlefishCount);
    String squidCountFile = Integer.toString(squidCount);
     
    
    String[] fishQuantityArray ={"Dugongs seen: " + dugongCountFile,
                                 "Hump backed whales seen: " + humpBackedWhaleCountFile, 
                                 "Banded Sea Kraits seen: " + bandedSeaKraitCountFile, 
                                 "Green sea turtles seen: " + greenSeaTurtleCountFile, 
                                 "Olive ridely turtles seen: " + oliveRidelyTurtleCountFile, 
                                 "Whale sharks seen: " + whaleSharkCountFile, 
                                 "Hammerhead sharks seen: " + hammerheadSharkCountFile,
                                 "Tiger sharks seen: " + tigerSharkCountFile, 
                                 "Lemon sharks seen: " + lemonSharkCountFile, 
                                 "Cod's seen: " + codCountFile, 
                                 "Parrot fish seen: " + parrotFishCountFile, 
                                 "Wrasse's seen: " + wrasseCountFile, 
                                 "Octopus seen: " + octopusCountFile, 
                                 "Cuttle fish seen: " + cuttlefishCountFile,
                                 "Squid seen: " + squidCountFile};
    
        List<String> lines = Arrays.asList(fishQuantityArray);
        
        try
        {
            Path file = Paths.get("Fish_Quantity.txt");
            Files.write(file, lines, Charset.forName("UTF-8"));
        } 
        catch (Exception e) 
        {
            System.out.println("Failed to write to file.");
        }
          
        return animalString;//retrn the animal string to the button event handler method.
    }

}
