
import java.util.*;

class  interLeaveQueue{

	// Function to interleave the queue
	static void interLeaveQueue(Queue<Integer> q)
	{
		// To check the even number of elements
		if (q.size() % 2 != 0)
			System.out.println(
				"Input even number of integers.");

		// Initialize an empty stack of int type
		Queue<Integer> s = new LinkedList<>();
		int halfSize = q.size() / 2;

		// Push first half elements into the stack
		// queue:16 17 18 19 20, stack: 11 12 13 14 15
		for (int i = 0; i < halfSize; i++) {
			s.add(q.remove());
		}

		// enqueue back the stack elements
        // queue: 11 16 12 17 13 18 14 19 15 20
		while (!s.isEmpty()) {
			q.add(s.remove());
            q.add(q.remove());
		}

	}

	// Driver code
	public static void main(String[] args)
	{
		Queue<Integer> q = new java.util.LinkedList<>();
		q.add(11);
		q.add(12);
		q.add(13);
		q.add(14);
		q.add(15);
		q.add(16);
		q.add(17);
		q.add(18);
		q.add(19);
		q.add(20);
		interLeaveQueue(q);
		int length = q.size();
		for (int i = 0; i < length; i++) {
			System.out.print(q.peek() + " ");
			q.poll();
		}
	}
}

// This code contributed by Rajput-Ji
