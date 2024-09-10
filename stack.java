
import java.util.Scanner;
import java.util.Stack;

public class stack {
  
  public static String findNGE(String array) {
    Stack<Character> stack = new Stack<>();

    for (int i=0; i<array.length(); i++) {
      char c = array.charAt(i);

      if (c == '(') stack.push(c);
      else if (stack.empty()) return "NO";
      else stack.pop();
    }
    if (stack.empty()) return "YES";
    else return "NO";
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int T = scanner.nextInt();

    for (int i=0; i<T; i++) {
      System.out.println(findNGE(scanner.next()));
    }
    scanner.close();
  }


}