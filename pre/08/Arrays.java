import java.lang.Math;

public class Arrays {
  public static double[] powArray (double[] a, int b){
    double[] c = new double[a.length];
    for (int i=0; i<a.length;i++) {
        c[i]=Math.pow(a[i],b);
      }
      return c;
}
