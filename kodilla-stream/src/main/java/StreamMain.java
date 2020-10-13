import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.forumuser.ForumUsersDirectory;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.person.People;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.time.LocalDate.*;

public class StreamMain {
    public static void main(String[] args) {
        //System.out.println("Welcome to module 7 - Stream");
        //SaySomething saySomething=new SaySomething();
        //saySomething.say();
        //Processor processor= new Processor();
        //ExecuteSaySomething executeSaySomething=new ExecuteSaySomething();
        //processor.execute(executeSaySomething);
        //ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        //expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        //expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        //expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        //expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
        //System.out.println("Calculating expressions with method references");
        //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        //System.out.println("--------------------------------");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Text1", text -> text.toUpperCase());
        poemBeautifier.beautify("Text2", text -> "ABC" + text + "ABC");
        poemBeautifier.beautify("Text3    ", text -> text.trim());
        poemBeautifier.beautify("aaaText4bbb", text -> text.substring(3, 8));
        poemBeautifier.beautify("TEXT5", text -> text.toLowerCase());

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

        System.out.println("-------------------------------");
        People.getList().stream()
                .forEach(System.out::println);

        System.out.println("----------------------");
        People.getList().stream().map(e -> e.toUpperCase()).forEach(System.out::println);

        System.out.println("-----------------");
        People.getList().stream()
                .filter(s -> s.length() > 11)
                .forEach(System.out::println);

        System.out.println("-----------------------------");
        BookDirectory theBookDirectory = new BookDirectory();
        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toList());

        System.out.println("# elements: " + theResultListOfBooks.size());
        theResultListOfBooks.stream()
                .forEach(System.out::println);

        System.out.println("---------------------------");
        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

        System.out.println("7.3--------------------------------------------7.3");
        ForumUsersDirectory forumUsersDirectory=new ForumUsersDirectory();
        LocalDate forumDate=LocalDate.of(2000,10,12);

        Map<Integer, ForumUser> theResultOfUsers=forumUsersDirectory.getUserList().stream().
                filter(ForumUser->ForumUser.getSex()=='M').filter(ForumUser-> ForumUser.getBirthDate().isBefore(forumDate)).
                filter(ForumUser->ForumUser.getPostCount()>=1).collect(Collectors.toMap(ForumUser::getId,ForumUser->ForumUser));


        theResultOfUsers.entrySet().stream().map(entry->entry.getKey()+": "+entry.getValue()).forEach(System.out::println);
    }
}



