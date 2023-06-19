package June12th;

public class MyProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String myStat = "Welcome to my Class [Pargolteacher.com]";
		
		int startWord = myStat.indexOf("Pargol") + "Pargol".length();
		int endWord = myStat.lastIndexOf(".com");
		
		String outsts = myStat.substring(startWord, endWord);
		
		System.out.println(outsts);
		
		// indexOf vs. lastIndexOf

	}

}
