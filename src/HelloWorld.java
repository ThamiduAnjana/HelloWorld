
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		if(args.length <= 0) return;
		for(int i = 0; i < args.length; i++) {
			System.out.printf("The given argument at position %s was %s.", Integer.toString(i), args[i]);
		}
	}
}
