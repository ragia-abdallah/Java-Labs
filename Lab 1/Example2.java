public class Example2 {
	public static void main(String args[]) {
		if(args.length < 1) {
			System.out.println("No arguments Provided.");
		}
		else {
			int check = 0;
			for(int i=0; i<args.length; i++) {
				if(args[i].equals("CoreJava")) {
					System.out.println("True. Value: " + args[i]);
					check = 1;
				}
			}
			if(check == 0) {
				System.out.println("False. Value expected not found.");
			}
		}
	}
}