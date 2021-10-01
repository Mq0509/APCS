/*
May Qiu
APCS
HW 08 Refactor Freshie Zero/Greetings/Made greeting functions with three different greeting 
2021-09-30
*/

public class Greet{
	public static  void main (String [] args){
		greet ("Hola! How are you doing, Ducky?");
   	        greet ("Hello, nice to meet you, Faiyaz!");
    		greet("Hi, long time no see, Salaj.");
	}
}
static void greet(String hi){
	System.out.println(hi);
}

/* Discoveries
There wasn't really anything new that I discovered. 

Unresolved Questions
How does the greet function make the greetings efficient?
*/
