import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuestionService questionService = new QuestionService();
        Question[] questions = questionService.getQuestions();

        int score = 0;

        System.out.println("Welcome to the Java Quiz!\n");

        for (Question q : questions) {
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            System.out.print("Your answer (A/B/C/D): ");
            String userAnswer = scanner.nextLine().toUpperCase();

            if (userAnswer.equals(q.getAnswer())) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! Correct answer: " + q.getAnswer() + "\n");
            }
        }

        System.out.println("Quiz finished!");
        System.out.println("Your score: " + score + " out of " + questions.length);
    }
}
