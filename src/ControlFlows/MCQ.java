package ControlFlows;

public class MCQ {

    public static void main(String[] args){
        char answer ='c';

        System.out.println("Who is named as the inventor of the light bulb?");
        System.out.println("You marked " + answer + ". Let's see whether you are right!");

        if (answer == 'C'){
            System.out.println("You were right. You won $1.");
        } else {
            System.out.println("Sorry, the right answer is Tomas Edison. Thanks you for coming.");
        }
    }
}
