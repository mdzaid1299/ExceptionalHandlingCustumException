public class MyFirstException extends Exception{
    public MyFirstException(String message) {
        super(message);
    }
}
 /*Exception Handling

1. Define an custom exception (i.e. user defined exception) class called "MyFirstException".
This class contains a parameterized constructor which accept one argument String message.
Whenever this exception arise will print "Custom Exception Occurred". Create another class called MyMain.
This class contains main method, to perform sum of two user given values by using Scanner class.
 If the sum is less than. 150 throw user defined exception or else display sum.

input
a = 30;
b = 40: as sum is 70. then
sum = a + b.
output
Custom Exception Occurred*/