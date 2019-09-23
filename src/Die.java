// Die class definition
/*
* Contains a range of methods used to define the properties of objects sharing this class
* in this case we want to be able to:
* create a new object - constructor
* set face value - mutator
* roll the die -
* output to string - always include using toString
* read the value - accessor
* */

// public means they can be called outside of the class
// These are called "Service Methods"
public class Die {
    // private variables cannot be called from outside of the class
    // all methods can call these variables
    // These two are called the instance data and is not created until an object
    // is created and a new one is created for each instance of the object.
    private final int MAX = 6; // defines a six sided die
    // This variable is defined as private so that it cannot be changed
    // from another class. This is encapsulation.
    private int faceValue; // has a property of the number rolled

    // When the object is created it sets a default face value
    // This is called the "Constructor"
    public Die(){ // The constructor has the same name as the class and no type return
        faceValue = 1;
    }

    // "Rolls" the die, by using the random function from 1-6
    public int roll(){
        faceValue = (int)(Math.random()*MAX) + 1;
        return faceValue;
    }

    // Calling a method: scope type name(parameters){}
    // Mutates the face value variable to the supplied argument
    // the use of "int" in the argument means it will not accept anything else.
    // mutators should use "set" to start to make it clear their function.
    public void setFaceValue(int value){
        // This changes the value of the private variable but it controls
        // how it is changed. Better control would also cover numeric ranges.
        faceValue = value;

    }

    // Retrieves the value of the Die object in question as an int as defined at the top
    // accessor methods should start with "get" to make it clear.
    public int getFaceValue(){
        return faceValue;
    }

    // Outputs the string version of the face value
    // Always include this method, it allows the concatenation of your variable
    // inside of string outputs and for troubleshooting.
    // Will be called toString in every class you write
    public String toString(){
        String result = Integer.toString(faceValue);
        return result;
    }
}
