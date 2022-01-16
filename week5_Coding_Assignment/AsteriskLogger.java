package week5_Coding_Assignment;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String i) {
		String inputStr = i;
		System.out.println("***" + inputStr + "***\n");
	}

	@Override
	public void Error(String i) {
		String inputStr = i;
		int stringLength =  inputStr.length();
		
		System.out.println("*********" + "*".repeat(stringLength) + "***");
		System.out.println("***ERROR:" + inputStr + "***");
		System.out.println("*********" + "*".repeat(stringLength) + "***\n");
		
	}

}
