
public class Main {

	public static void main(String[] args) {

		StringStack myStack = new StringStack(20);

		myStack.push("Test");
		myStack.push("Noch ein Test");

		while (!myStack.isEmpty()) {
			System.out.println("Ausgabe: " + myStack.pop());
		}

	}

}
