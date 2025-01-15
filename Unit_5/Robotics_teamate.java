

public class Robotics_teamate {
    private static String name;
    private static int rank;
    private static String role;
    private static int attandance;
    private static boolean coach;
    private static int dues;
        
        public Robotics_teamate(String teammate_name, int teammate_rank, String teammate_role, int teammate_attandance, boolean teammate_coach, int teammate_dues){ //construstor for the teammates
            name = teammate_name;
            rank = teammate_rank;
            role = teammate_role;
            attandance = teammate_attandance;
            coach = teammate_coach;
            dues = teammate_dues;
        }
        
        public void printStats(){ //prints all stats about that team mate
            printRank();
            System.out.println("Role: " + role);
            System.out.println("Attandance: "+ attandance);
            System.out.println("Are they a coach: " + coach);
            duesAmmount();
        }
        public void printName(){ //prints that person name 
        System.out.println("Name: " + name);
        }
        public void setName(String n){ //if they wanted to change their name 
            name = n;
        }
        public String printRank(){ // dectects your rank
            System.out.print("Rank: ");
            if (coach){
                System.out.println("coach"); //overrides rank if they are a coach
            } else if(rank == 1){
                System.out.println("student"); //1 - student 
            } else if(rank == 2){
                System.out.println("Sargent at Arms"); //2 - Sargent at Arms 
            }else if(rank == 3){
                System.out.println("Treasurer"); //3 - Treasurer 
            }else if(rank == 4){
                System.out.println("Secretary"); //4 - Secretary
            }else if(rank == 5){
                System.out.println("2nd Vice President"); //5 - 2nd Vice President
            }else if(rank == 6){
                System.out.println("1st Vice President"); //6 - 1st Vice President
            }else if(rank == 7){
                System.out.println("President"); //7 - President
            } else {
                System.out.println("Invalid Rank"); //If their rank is above 7
            }
            return null;
        }
        public String duesAmmount(){// shows if dues are paid or how much they owe
            if (dues == 0){
                System.out.println("All dues are paid");
            }else {
                System.out.println("Needs to pay $" + dues + " for dues");
            }
            return null;
        }
        public void paidDues(){ //sets their due ammount to 0
            dues = 0;
        }
        public void setDues(int d){ //sets their dues up by a predetermined number
            dues = d;
        }
        public void printRole(){ //only prints their role on the team
            System.out.println(role);
        }
        public void printAttandance(){ //how many days they can show up a week
            System.out.println(attandance);
        }
        public void areTheyCoach(){ //shows if they are a coach or not
            System.out.print(coach);
        }
        public void setRole(String r){ //changes that person role 
            role = r;
        }
        public void setAttandance(int a){ //changes their attandace
            attandance = a;
        }
        public void setCoach(boolean c){//changes their coach status 
            coach = c;
        }
        public int attandaceUp(){//sets their attendance up by one 
           return attandance++;
        }
        public int attandaceDown(){//sets their attendance down by one 
            return attandance--;
        }
        public void setRank(int r){//sets their rank up by a predetermined number
            rank = r;
        }
        public void rankUp(){//sets rank up by one
            rank++;
        }
        public void rankDown(){//sets rank down by one
            rank++;
        }

            public static void main(String[] args) {
                Robotics_teamate dylan = new Robotics_teamate("dylan",5,"builder",1,false,5);
                dylan.printStats();

                //Robotics_teamate caleb = new Robotics_teamate(1,"programer",1,false);
               // caleb.setAttandance(5);
               // caleb.areTheyCoach(); 

    }

}
