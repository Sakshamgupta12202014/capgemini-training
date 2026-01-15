// package topbrains;

import java.util.Scanner;
import java.util.Stack;

public class TextEditor {
	private static StringBuilder document = new StringBuilder("");
	private static Scanner sc = new Scanner(System.in);
	private static Stack<String> undoStack= new Stack();
	private static Stack<String> redoStack = new Stack();
	
	public static void main(String []args) {
		System.out.println("=== MINI TEXT EDITOR ===");
		System.out.println("1. Add Text\r\n"
					+ "2. Delete Text\r\n"
							+ "3. Search Word\r\n"
							+ "4. Replace Word\r\n"
							+ "5. Undo\r\n"
							+ "6. Redo\r\n"
							+ "7. Display Document\r\n"
							+ "8. Exit");
		boolean active = true;
		do {
			System.out.print("Choose: ");
			int choice = sc.nextInt();

			sc.nextLine();
			
			switch(choice) {
				case 1: {
					System.out.print("Enter text: ");
					String text = sc.nextLine();
					
					addText(text);
					break;
				}
				case 2: {
					System.out.print("Enter number of characters to delete: ");
					int n = sc.nextInt();
					deleteText(n);
					break;
				}
				case 3: {
					System.out.print("Enter word to search: ");
					String word = sc.next();
					searchWord(word);
					break;
				}
				case 4 : {
					System.out.print("Enter word to replace: ");
					String oldWord = sc.next();
					System.out.print("Enter replacement: ");
					String newWord = sc.next();
					
					replaceWord(oldWord, newWord);
					break;
				}
				case 5: {
					undo();
					break;
				}
				case 6: {
					redo();
					break;
				}
				case 7: {
					display();
					break;
				}
				case 8: {
					System.out.println("Exiting editor...");
					active = false;
					break;
				}
			}
		}while(active);
	}
	
	private static void saveStateForUndo() {
		undoStack.push(document.toString());
	}
	
	public static void addText(String text) {
		saveStateForUndo();
		
		document.append(text);
		
		System.out.println("Text added successfully!");
	}
	
	public static void deleteText(int n) {
		saveStateForUndo();
		
		document.delete(document.length()-n, document.length());
		System.out.println("Text deleted successfully!");
	}
	
	public static void searchWord(String word) {
		boolean isWordPresent = false;
		
		String wordsArr[] = document.toString().split(" ");
		
		for(String str : wordsArr) {
			if(str.equals(word)) {
				isWordPresent = true;
				break;
			}
		}
		
		if(isWordPresent) {
			System.out.println("Word found!");
		}else {
			System.out.println("Word not found!");
		}
	}
	
	public static void replaceWord(String oldWord, String newWord) {
		if(document.indexOf(oldWord) == -1) {
			System.out.println("Word not found!");
			return;
		}
		while(document.indexOf(oldWord) != -1) {
			int idx = document.indexOf(oldWord);
			int len = oldWord.length();
			document.replace(idx, idx + len, newWord);
		}
	}
	
	public static void undo() {
		if(!undoStack.empty()) {
			redoStack.push(document.toString());
			document.setLength(0);
			document.append(undoStack.peek());
			undoStack.pop();
			
			System.out.println("Undo successful!");
		}
	}
	
	public static void redo() {
		if(!redoStack.empty()) {
			undoStack.push(document.toString());
			document.setLength(0);
			document.append(redoStack.peek());
			redoStack.pop();
			
			System.out.println("Redo successfully!");
		}
	}
	
	public static void display() {
		System.out.println("Current Document:");
		System.out.println(document);
	}
}
