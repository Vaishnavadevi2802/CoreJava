package Methods;

public class Counter {
      static int staticCount=0;
      int nonstaticCount=1;
	public static void incrementStatic() {
		staticCount++;
		System.out.println("Static Count:"+staticCount);
		
	}
	public void incrementNonStatic() {
		nonstaticCount++;
		System.out.println("NonStatic Count:"+nonstaticCount);
		

}
	
}
