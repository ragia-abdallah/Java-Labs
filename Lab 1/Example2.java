public class Example2 {
	public static void main(String args[]) {
		if(args[0] != null) {
			int check = 0;
			for(int i=0; i<args.length; i++) {
				if(args[i] == "CoreJava") {
					System.out.println("True. Value: " + args[i]);
					check = 1;
				}
			}
			if(check == 0) {
				System.out.println("False. Value expected not found.");
			}
		}
		else {
			System.out.println("No arguments Provided.");
		}
	}
}