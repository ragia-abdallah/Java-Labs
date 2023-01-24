public class Example3 {
	public static void main(String args[]) {
		if(args[1] == null) {
			System.out.println("Not enough arguments provided");
			return;
		}
//		try {
			int loops = Integer.parseInt(args[0]);
			if(args[1] == "CoreJava") {
				for(int i=0; i<loops; i++) {		
					System.out.println(args[i]);
				}
			}
			else {
				System.out.println("False. Keyword not as expected.");
			}
//		}
//		catch (NumberFormatException) {
//			System.out.println("False. Value not as expected.");
//		}
	}
}
		