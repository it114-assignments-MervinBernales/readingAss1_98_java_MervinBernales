/**
 * 
 */
package readingAss1_98_java_MervinBernales;

/**
 * @author Mervin
 *
 */
public class MainEntryClass {
	public static void main(String[] args){
		Fan fan1 = new Fan(3, true, 10, "yellow");
		System.out.println(fan1.toString());
		Fan fan2 = new Fan(2, false, 5, "blue");
		System.out.println(fan2.toString());
	}
}
