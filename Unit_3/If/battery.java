package Unit_3.If;

public class battery {
    public static void main(String[] args) {
        int battery = 49;
        if (battery == 100){
            System.out.println("Unplug your phone!");
        } else {
        if (battery <= 50){
            System.out.println("Plug in your phone!");
        } else {
            System.out.println("All okay!");
            }   
        }
    }
}
