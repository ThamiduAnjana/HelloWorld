public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		if(args.length <= 0) return;
		System.out.printf("Hello! The first argument you gave to this method was %s!", args[0]);
	}
}
