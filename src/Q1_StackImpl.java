import java.util.Stack;

public class Q1_StackImpl {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();
		stack.push(2);
		stack.push(9);
		stack.push(7);
		stack.push(3);
		stack.push(1);
		stack.push(5);
		stack.push(4);
		
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		int stackSize = stack.size();
		for(int i=0;i<stackSize;i++)
		{
			System.out.println(stack.pop());
		}
		

	}

}
