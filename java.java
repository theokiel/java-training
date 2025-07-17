// Class VS Public, Void


// functions for Class - printing

Class Greeting {
    String getGreeting(){
        return "Hello, World!";
    }
}

// function for Public without void - printing
Public String greet() {
    return "Hello from the Public function!";
}


// function for Void - printing 
// when you use void there's no return type, you cannot call it bactemk to the caller
 Public void sayHello() {
    System.out.printIn("Hello from the Void function!");
 }

 // Public with return
Public String getMessage(String timeofDay){
    return "Good "+ timeofDay + "!";
}