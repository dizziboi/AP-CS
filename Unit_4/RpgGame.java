package Unit_4;

import java.util.Scanner;

public class RpgGame {
    static String name = " ";
    static String race = " ";  
    static String job = " ";
    static int level = 1;
    static int strenght = 1; 
    static int agility = 1;
    static int intelligence = 1;
    static int hit_points = 1;
    static int armor_class = 1;
    static int mana_power = 1;
    
        public static double rpgGame(){
            Scanner character_Name = new Scanner(System.in); //makes the scanner object for the *scanner* input
            System.out.println("What is your name ");
              name = character_Name.nextLine(); //reads the scanner 
            
            Scanner character_Race = new Scanner(System.in); //makes the scanner object for the *scanner* input
            System.out.println("What is your race ");
              race = character_Race.nextLine(); //reads the scanner
            
            Scanner character_Job = new Scanner(System.in); //makes the scanner object for the *scanner* input
            System.out.println("What is your job/class ");
              job = character_Job.nextLine(); //reads the scanner
            
            
      
            return 0;
            
        }
        public static int roll(int dieSides){ // rolls a dice with the number of sides determined by dieSides
            int rollnum = (int) (dieSides * Math.random()) + 1;
            //System.out.println(rollnum);
            return rollnum;
        }
        public static int dieRollsStats(){
            int roll1 = roll(6);
            int roll2 = roll(6);
            int roll = roll1 + roll2 + 6;
            //System.out.println(roll);
            return roll;
        }
        public static int setStats(){ //this will sets the stats for your character
        strenght = level + dieRollsStats();
        agility = level + dieRollsStats();
        intelligence = level + dieRollsStats();
        hit_points = strenght + roll(10);
        armor_class = agility + roll(4);
        mana_power = roll(20) + roll(20) + 10*intelligence;
        
        return 0;
    }
    public static String printStats(){
        System.out.println("Name: " + name + "\r\n" + "Race: " + race + "\r\n" + "Job/Class: " + job + "\r\n"); //prints your name, race, and class 

        System.out.println("Stats" + "\r\n" +"Level: " + level + "\r\n" + "Strength: " + strenght + "\r\n" + "Agility: " + agility + "\r\n" + "Intelligence: " + intelligence + "r\n"); //prints your level, strenght, agility, and inelelligence

        System.out.println("Resources" + "\r\n" + "HP: " + hit_points + "\r\n" + "AC: " + armor_class + "\r\n" + "MP: " + mana_power);
        return null;
    }

    public static int levelUp(){
        int oldLevel = level;
        int rand_hitPoints = (int) (Math.random()* (2 - (-2)) + -2); // makes a random number from -1 to 1
        int rand_manaPower = (int) (Math.random()* (11 - (-11)) + -11); // makes a random number from -10 to 10

        level++;
        strenght++;
        agility++;
        intelligence++;
        hit_points =  hit_points + strenght / 2 + rand_hitPoints;
        System.out.println("Ding! Level increased from " + oldLevel + " to " + level); 
        armor_class = armor_class + agility /8;
        mana_power = (int) (intelligence * 2 + rand_manaPower);
        return 0;
    }
    public static void main(String[] args) {
    //roll(10);
    //dieRollsStats();
    rpgGame();
    levelUp();
    printStats();
    
    

}
    
}
