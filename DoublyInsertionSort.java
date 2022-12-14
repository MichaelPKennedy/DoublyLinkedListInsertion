import java.util.Scanner;

public class DoublyInsertionSort {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		DoublyLinkedList<String> names = new DoublyLinkedList<String>();
		
		System.out.println("Enter a list of names one by one, hitting enter after each name. After you have finished entering names, enter the word 'exit' and hit enter.");
		System.out.println("Enter the first name on your list: ");
		
		String input = "";
		while (! input.equals("exit") ) {
			input = keyboard.nextLine();
			if (input.equals("exit"))break;
			names.insertionSort(input);
			System.out.println("Enter the next name: ");
		}
		
		System.out.println("Here is the list of names in alphebetical order: ");
		System.out.println();
		System.out.println(names.printList());
		
	}

}
