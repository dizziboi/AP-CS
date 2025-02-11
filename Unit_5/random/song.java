package random;

public class song {
    public static int numVerses = 0;
    public static String littleOne;


    public static void verse(String num,String littleOne){
        System.out.println("The ants go marching " + num + " by " + num + ", huttah, hurrah");
        System.out.println("The ants go marching " + num + " by " + num + ", huttah, hurrah");
        System.out.println("The ants go marching " + num + " by " + num);
        System.out.println("The little one stops to " + littleOne);
        System.out.println("And they all go marching down to the ground");
        System.out.println("To get out of the rain, BOOM! BOOM! BOOM! BOOM!" +"\n");
        numVerses++;
    }
    public static void main(String[] args) {
        song.verse("one","suck a thumb");
        song.verse("two","tie a shoe");
        song.verse("three","climb a tree");

        System.out.println(numVerses);

    }
}
