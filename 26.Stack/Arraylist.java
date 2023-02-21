import java.util.ArrayList;

public class Arraylist {
    class Stack {
        static ArrayList<Integer> s = new Arraylist<>();

        // check empty
        public static boolean isEmpty() {
            return s.size() == 0;
        }

        // push
        public static void push(int data) {
            s.addLast(data);
        }

        // pop
        public static int pop() {
            if (s.isEmpty()) {
                return -1;
            }
            int value = s.get(s.size() - 1);
            s.remove(s.size() - 1);
            return value;
        }

        //peak
        public static int peak() {
            if (s.isEmpty()) {
                return -1;
            }
            return s.get(s.size() - 1);
        }

    }

    public static void main(String[] args) {
      Stack s=new Stack();
      s.push(5);
      s.push(8);
      s.push(10);
      s.push(4);
    }
}
