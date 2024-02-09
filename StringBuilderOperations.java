import java.util.Scanner;

public class StringBuilderOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string of at least 10 characters: ");
        String input = scanner.nextLine();

        // Ensure the input string has at least 10 characters
        if (input.length() < 10) {
            System.out.println("Error: Input string must have at least 10 characters.");
            return;
        }

        StringBuilder sb = new StringBuilder(input);

        // 1. Print the length of the string.
        System.out.println("Length of the string: " + sb.length());

        // 2. Print the first character of the string.
        System.out.println("First character of the string: " + sb.charAt(0));

        // 3. Print the last character of the string.
        System.out.println("Last character of the string: " + sb.charAt(sb.length() - 1));

        // 4. Print the index of the first occurrence of the letter 'a' in the string.
        int indexOfA = sb.indexOf("a");
        if (indexOfA != -1) {
            System.out.println("Index of the first occurrence of 'a': " + indexOfA);
        } else {
            System.out.println("'a' is not found in the string.");
        }

        // 5. Print the substring of the string from index 3 to index 6.
        System.out.println("Substring from index 3 to index 6: " + sb.substring(3, 7));

        // 6. Append the string "123" to the end of the string.
        sb.append("123");
        System.out.println("String after appending '123': " + sb);

        // 7. Insert the string "xyz" at index 4.
        sb.insert(4, "xyz");
        System.out.println("String after inserting 'xyz' at index 4: " + sb);

        // 8. Delete the substring from index 2 to index 4.
        sb.delete(2, 5);
        System.out.println("String after deleting substring from index 2 to index 4: " + sb);

        // 9. Delete the character at index 8.
        sb.deleteCharAt(8);
        System.out.println("String after deleting character at index 8: " + sb);

        // 10. Reverse the string and print it.
        sb.reverse();
        System.out.println("Reversed string: " + sb);

        scanner.close();
    }
}
