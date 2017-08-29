

/**
 * Write a description of class LLRE15_10 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.*;
public class LLRE15_10
{
    
    public static void main(String[] args)
    {
        LinkedList<String> people = new LinkedList<>();
        people.add("Thomas");
        people.add("Ed");
        people.add("Charlie");
        people.add("Andrew");
        people.add("Sue");
        people.add("Si");
        ListIterator<String> iterator = people.listIterator();
        while(iterator.hasNext()){ 
            if(iterator.next().length() <= 3) {iterator.remove();}
            }
        System.out.println(people); 
    }
    }



    