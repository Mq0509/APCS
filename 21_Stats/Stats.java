/**
   Trio number int x(Orion Roven, May Qiu, Lawrence Joa)
   APCS
   HW21 -- STAtisTically Speaking / Creating stats and statsdriver files
   2021-10-21
   DISCO
   The Math methods only returns a specific type
   Math.pow and Math.sqrt returns doubles, Math.round returns longs
   QCC
   Why does typecasting for int round down
   We imported java.util.* to use Math methods
 **/
import java.util.*;
public class Stats {
  public static int mean(int a, int b) {
    return (a+b)/2;
  }

  public static double mean(double a, double b) {
    return (a+b)/2.0;
  }

  public static int max(int a, int b) {
    if(a>=b){
      return a;
    } else {
      return b;
    }
  }

  public static double max(double a, double b) {
    if(a>=b){
      return a;
    } else {
      return b;
    }
  }

  public static int geoMean(int a, int b) {
    return (int)(Math.sqrt(a*b)); //had to typecast, not sure any other way
  }

  public static double geoMean(double a, double b) {
    return Math.sqrt(a*b);
  }

  public static int max(int a, int b, int c) {
    return(max(max(a,b),c));
  }

  public static double max(double a, double b, double c) {
    return(max(max(a,b),c));
  }

  public static int geoMean(int a, int b, int c) {
    return (int)(Math.pow((a*b*c),(1.0/3.0)));
  }

  public static double geoMean(double a, double b, double c) {
    return Math.pow((a*b*c),(1.0/3.0));
  }
  
}//end class
