package stack.base;

import java.io.*;
import java.util.*;


public class BracketCheck {

    public File fileName;
    public StackDemo <String> Bracketlist;

    public BracketCheck(File fileName){

        this.fileName = fileName;
        Bracketlist = new StackDemo <String>();
        
    }


    public StackDemo<String> pushBrackets(){

        try {

            Scanner fileReader = new Scanner(fileName);

            while(fileReader.hasNextLine()){
               
                String lineFromFile = fileReader.nextLine();
                
                if (lineFromFile.contains("{")){
                    Bracketlist.push("{");
                }
    
                else if(lineFromFile.contains("[")){
                    Bracketlist.push("[");
    
                }
    
                else if(lineFromFile.contains("(")){
                    Bracketlist.push("(");
    
                }
    
                else if(lineFromFile.contains("<")){
                    Bracketlist.push("<");
    
                }
                
        
            }
            
        } catch (FileNotFoundException e) {

            System.out.println("No File");
            //TODO: handle exception
        }

       

        return Bracketlist;

    }

    public StackDemo <String> popBrackets(){

        try {

            Scanner fileReader = new Scanner(fileName);

            while(fileReader.hasNextLine()){
                
                String lineFromFile = fileReader.nextLine();
                
                if (lineFromFile.contains("}")){
                    Bracketlist.pop();
                    System.out.println(Bracketlist.empty());
                }
    
                else if(lineFromFile.contains("]")){
                    Bracketlist.pop();
                    System.out.println(Bracketlist.empty());
    
                }
    
                else if(lineFromFile.contains(")")){
                    Bracketlist.pop();
                    System.out.println(Bracketlist.empty());
    
                }
    
                else if(lineFromFile.contains(">")){
                    Bracketlist.pop();
                    System.out.println(Bracketlist.empty());
    
                }
    
                
            }
            
        } catch (FileNotFoundException e) {

            System.out.println("No File");
            //TODO: handle exception
        }

       

        return Bracketlist;

    }


    
    
}
