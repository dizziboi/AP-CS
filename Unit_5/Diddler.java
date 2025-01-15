public class Diddler
{
    // write 2 instance variables for Riddle's question and answer: private type
    // variableName;
    private String riddle_question;
    private String riddle_answer;
    // constructor
    public Diddler(String initQuestion, String initAnswer)
    {
        // set the instance variables to the init parameter variables
        riddle_question = initQuestion;
        riddle_answer = initAnswer;

    }

    // Print riddle question
    public void printQuestion()
    {
        // print out the riddle question with System.out.println
        System.out.println(riddle_question);
        
    }

    // Print riddle answer
    public void printAnswer()
    {
        // print out the riddle answer with System.out.println
        System.out.println(riddle_answer);

    }

    // main method for testing
    public static void main(String[] args)
    {
        // call the Riddle constructor to create 2 new Riddle objects
        // with the arguments for the riddle question and answer.
        Diddler r1 = new Diddler("riddle 1 q","riddle 1 a");
        Diddler r2 = new Diddler("riddle 2 q","riddle 2 a");

        // call the riddle objects' printQuestion() and printAnswer methods
        r1.printQuestion();
        r1.printAnswer();
        r2.printQuestion();
        r2.printAnswer();

    }
}
