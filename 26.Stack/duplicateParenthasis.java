import java.util.Stack;

public class duplicateParenthasis {
    public static boolean duplicateParenthasis(String expr) {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<expr.length();i++){
            char ch=expr.charAt(i);
            if(ch!=')'){
                s.push(ch);
                continue;   //because element add thay pachi niche na javu joie
            }

            int counter=0;
            while(s.peek()!='('){
                s.pop();
                counter++;
            }
            if(counter==0){return false;}
            s.pop();
        }

        return true;
    }
    public static void main(String[] args)
	{
		String expr = "((a+b))";

		// Function call
		if (duplicateParenthasis(expr))
			System.out.println("No duplicate");
		else
			System.out.println("Duplicate present");
	}
}
