import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;

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
        PoemBeautifier poemBeautifier=new PoemBeautifier();
        poemBeautifier.beautify("Text1",text -> text.toUpperCase());
        poemBeautifier.beautify("Text2",text -> "ABC"+text+"ABC");
        poemBeautifier.beautify("Text3    ",text -> text.trim());
        poemBeautifier.beautify("aaaText4bbb",text -> text.substring(3,8));
        poemBeautifier.beautify("TEXT5", text ->text.toLowerCase());

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}

