package week5_Coding_Assignment;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String i) {
		String inputStr = i;
		String spacedStr = inputStr.replace("", " ").trim();
		
		System.out.println(spacedStr + "\n");
	}

	@Override
	public void Error(String i) {
		String inputStr = i;
		String spacedStr = inputStr.replace("", " ").trim();
		
		System.out.println("ERROR:" + spacedStr + "\n");		
	}

}