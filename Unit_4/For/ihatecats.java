

public class ihatecats {
    public static void main(String[] args) {
        String message =
                "I love cats! I have a cat named Coco. My cat's very smart!";

        while (message.indexOf("cats") <= 0) //sees if the word cat is in the sentence  
        {
            message = message.replaceAll("1","dog");
            
        }
        
    }
}
