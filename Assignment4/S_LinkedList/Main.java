package S_LinkedList;

public class Main {
	public static void main(String[] args) {
		LinkedList numbers = new LinkedList();
		numbers.create();
		numbers.display();
		System.out.println("Total numbers stored: "+numbers.count());
	}
}
