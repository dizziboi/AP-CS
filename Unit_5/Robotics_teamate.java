package Unit_5;

public class Robotics_teamate {
    private String role;
    private int attandance;
    private boolean coach;
    
    public Robotics_teamate(String role1, int attandance1, boolean coach1){ //construstor for the teammates
        role = role1;
        attandance = attandance1;
        coach = coach1;
    }
    public void printStats(){ //prints all stats about that team mate
        System.out.println(role);
        System.out.println(attandance);
        System.out.println(coach);
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
    public static void main(String[] args) {
        Robotics_teamate dylan = new Robotics_teamate("programer",1,true);
        dylan.printStats();
        dylan.setRole("driver");
        dylan.printRole();
    }

}
