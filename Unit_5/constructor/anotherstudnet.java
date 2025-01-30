package constructor;

public class anotherstudnet {
    private String name;
    private int grade;
    private double GPA;

    //default constructor
    public Object student(){
            name = "";
            grade = 0;
            GPA = 0.0;
            return null;
        }
    
        public anotherstudnet(String n){
            name = n;
            grade = 0;
            GPA = 0.0;
        }
    
        public void setstudnetnameandgrade(String n, int g){
            name = n;
            grade = g;
        }
    
        public void Student(String n, int g, double gp){
            name = n;
            grade = g;
            GPA = gp;
        }
        public static void main(String[] args) {
 /*            anotherstudnet student1 = new anotherstudnet();
            anotherstudnet student2 = new setstudnet("name");
            anotherstudnet student3 = new anotherstudnet();
            anotherstudnet student4 = new anotherstudnet(); */

    }
}
