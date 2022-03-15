package pm;

public class TaxiTest {

	public static void main(String[] args) {
		Taxi taxi = new Taxi();

        taxi.start();
        taxi.afterMidnight();
        taxi.stop(10);
		

	}

}
