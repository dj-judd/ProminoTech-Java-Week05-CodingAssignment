package week5_Coding_Assignment;

public class App {

	public static void main(String[] args) {

		String testString = "Testing123";
		
		AsteriskLogger aLogger = new AsteriskLogger();
		
		aLogger.Log(testString);
		aLogger.Error(testString);
		
		
		SpacedLogger sLogger = new SpacedLogger();

		sLogger.Log(testString);
		sLogger.Error(testString);


		
	}


}
