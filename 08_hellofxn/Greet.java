/*
May Qiu
APCS
HW 08 Refactor Freshie Zero/Greetings/Made greeting functions with three different greeting 
2021-09-30
*/

public class Greet{
	public static  void main (String [] args){
		greet ("Ducky :) !");
   	        greet ("Faiyaz!");
    		greet("Salaj.");
	}
static void greet(String hi){
	System.out.println("Nice to meet you, " + hi);
}
}

/* Discoveries
There wasn't really anything new that I discovered. 

Unresolved Questions
How does the greet function make the greetings efficient?
*/
