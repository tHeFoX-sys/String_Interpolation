import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Today's topic is string interpolation and how to a list of strings
        //So let's say that we got a list of strings

        List<String> text = new ArrayList<>();

        text.add("Tomas");
        text.add("25");
        text.add("nice to meet you");

        //Method 1
        //Called String Concatenation
        System.out.println("Hello " + text.getFirst() + " " + text.get(2));

        //Method 2
        //Using the String format method
        System.out.println(String.format(text.get(1)));

        //In other languages goes some examples go as follows
        //echo "{$_POST['username']}"; PHP
        //document.write($"<h2>username</h2>"); in order to display though on the console we must do this console.log($"username"); JS
        //print(str(name)) Python
        //In Python there is also the f string, which goes like this print(f"Hello there {name}")
        //The first method in Python was more of a type casting rather than string interpolation but everyone can use whatever he or she likes.

        //And so in order to actually sort a list of strings is very easy

        Collections.sort(text);

        System.out.println(text);




    }
}
