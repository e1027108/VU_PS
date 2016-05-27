package aufgabe1;

import java.util.ArrayDeque;
import java.util.Deque;

public abstract class Operation {

	private Deque<String> stack;
	
	public Operation(){
		this.setStack(new ArrayDeque<String>());
	}

	public Deque<String> getStack() {
		return stack;
	}

	public void setStack(Deque<String> stack) {
		this.stack = stack;
	}
	
}
