public class QuestionService {

    Question[] questions = new Question[5];

    public QuestionService(){
        questions[0]=new Question(1,"what is java","A","B","c","D","D");questions[1]=new Question(1,"what is REACT","A","B","c","D","D");questions[2]=new Question(1,"what is OOP","A","B","c","D","A");questions[3]=new Question(1,"what is SPRING BOOT","A","B","c","D","B");questions[4]=new Question(1,"what is life","A","B","c","D","A");
    }

    public void displayQuestions() {
        for (Question q : questions) {
            System.out.println(q);
        }
    }
}
