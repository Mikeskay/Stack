package stack.test;

import stack.base.*;
import java.io.*;
import java.util.*;


public class StackDemoTest {
    public static void main(String[] args) {

        StackDemo<String> games = new StackDemo <String>();

        String game1 = "Fifa 21";
        String game2 = "Fifa 22";
        String game3 = "Fifa 23";

        games.push(game1);
        games.push(game2);
        games.push(game3);

        System.out.println(games);
        System.out.println( games.peek());
        games.pop();
        System.out.println(games);

        StackDemo<Integer> numbers = new StackDemo <Integer>();

        Integer numbers1 = 1;
        Integer numbers2 = 2;
        Integer numbers3 = 3;

        numbers.push(numbers1);
        numbers.push(numbers2);
        numbers.push(numbers3);

        System.out.println(numbers);
        System.out.println( numbers.peek());
        numbers.pop();
        System.out.println(numbers);

        try {
        

            File fileTest = new File("/Users/unistuff/Desktop/Lab/src/stack/test/StackDemoTest.java");
            BracketCheck test = new BracketCheck(fileTest);
            
            System.out.println(fileTest.getName());
    
            test.pushBrackets();
            System.out.println(test.Bracketlist.size());
            System.out.println(test.Bracketlist);
            test.popBrackets();
            System.out.println(test.Bracketlist.empty());
            System.out.println(test.Bracketlist);
            
          //  System.out.println(test.Bracketlist.size());
    
    
            String[] fileList = fileTest.list();
    
    
          /*  if(fileTest.exists()){
    
                System.out.println("yes!! exists");
               
           }
           else{
                System.out.println("don't exist");
    
           } */
            
        } catch (EmptyStackException e) {
            System.out.println();
            System.out.println("Stack is empty");
            e.printStackTrace();
        }
        catch (Exception e) {
            System.out.println("Oops an error occurred");
            e.printStackTrace();
        }


    
    }
    
}
