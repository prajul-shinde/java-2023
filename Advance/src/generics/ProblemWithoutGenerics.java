package generics;

public class ProblemWithoutGenerics {

    public static void main(String[] args) {
        List items = new List();
        items.add(1);

        //problem suppose we want to have we cannot add User into this List 

        //solution 1: poor solution 
        // make List class array of objects
        // casting will be problem each time

        items.add(new User());
        User item= (User) items.get(0);
    }
    
}
