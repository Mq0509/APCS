public class StatsDriver {
	public static void main(String[] args){
		Stats math= new Stats();
		System.out.println("Int Mean = " + math.mean(2,4));
		System.out.println("Double Mean = " + math.mean(2.0,4.0));
		System.out.println("Int Max = " + math.max(2,3));
		System.out.println("Double Max = " + math.max(2.0,3.0));
		System.out.println("Int geoMean = " + math.geoMean(2,4));
		System.out.println("Double geoMean = " + math.geoMean(2.0,4.0));
		System.out.println("Int Max = " + math.max(1,2,3));
		System.out.println("Double Max = " + math.max(1.0,2.0,3.0));
		System.out.println("Int geoMean = " + math.geoMean(2,4,6));
		System.out.println("Double geoMean = " + math.geoMean(2.0,4.0,6.0));
    }
}
