public class QuestionService {
    private Question[] questions = new Question[5];

    public QuestionService() {
        questions[0] = new Question(1, "What is Java?", "A. Programming Language", "B. Snake", "C. Bird", "D. Coffee", "A");
        questions[1] = new Question(2, "What is React?", "A. Backend Tool", "B. JavaScript Library", "C. Database", "D. OS", "B");
        questions[2] = new Question(3, "What does OOP stand for?", "A. Out Of Print", "B. Object Oriented Programming", "C. Only One Program", "D. Open Office Project", "B");
        questions[3] = new Question(4, "Which framework is used for Java backend?", "A. Django", "B. Spring Boot", "C. Laravel", "D. Flask", "B");
        questions[4] = new Question(5, "Which one is a relational database?", "A. MongoDB", "B. Firebase", "C. PostgreSQL", "D. Redis", "C");
    }

    public Question[] getQuestions() {
        return questions;
    }
}
