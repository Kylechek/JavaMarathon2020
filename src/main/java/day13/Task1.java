package day13;

public class Task1 {
    public static void main(String[] args) {
        User userOne = new User("Ivan");
        User userTwo = new User("Jon");
        User userThree = new User("Bin");

        userOne.sendMessage(userTwo, "Привет");
        userOne.sendMessage(userTwo, "Как дела?");
        userTwo.sendMessage(userOne, "Норм");
        userTwo.sendMessage(userOne, "А у тебя");
        userTwo.sendMessage(userOne, "?");
        userThree.sendMessage(userOne, "Ты где?");
        userThree.sendMessage(userOne, "Ты где?");
        userThree.sendMessage(userOne, "Ты где?");
        userOne.sendMessage(userThree, "Я тут");
        userOne.sendMessage(userThree, "Я тут");
        userOne.sendMessage(userThree, "Я тут");
        userThree.sendMessage(userOne, "Позвони");

        MessageDatabase.showDialog(userThree, userOne);
    }
}
