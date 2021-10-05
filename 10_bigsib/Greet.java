/*
May Qiu, Salaj, Faiyaz, Atlas, Pivot, George, and Perry Jr.
APCS
HW10 -- Refactor Big Sib One/Returning a String/Returned a String to Print in another file
2021-10-04
*/

/*
DISCOVERIES
Printing and returning are different. You cannot print a print, so the previous BigSib method from the previous homework would not work.
When returning a different type of value, the name of the type needs to replace void. 
UNRESOLVED QUESTIONS
No questions
*/


    public class Greet {
    public static void main( String[] args ){
        System.out.println( BigSib.greet("George"));
        System.out.println( BigSib.greet("Atlas"));
        System.out.println( BigSib.greet("Perry.Jr"));
}
}
