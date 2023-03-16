public class ArrayQueueImpl {
	private int[] arr = new int[10];
	private int size = 0;
	private int front = -1;
	private int rear = 0;

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	public void enqueue(int element) {
		if (size == arr.length) {
			resize(2 * arr.length);
		}
		arr[rear] = element;
		rear++;
		if (front == -1) {
			front = 0;
		}
		size++;
	}

	public int dequeue() {
		if (isEmpty()) {
			throw new IllegalStateException("Cannot dequeue because Queue is empty!");
		}
		int element = arr[front];
		arr[front] = 0;
		front++;
		size--;

		return element;
	}

	public int peek() {
		if (isEmpty()) {
			throw new IllegalStateException("Cannot peek because Queue is empty!");
		}
		return arr[front];
	}

	private void resize(int capacity) {
		int[] newArr = new int[capacity];
		for (int i = 0; i < size; i++) {
			newArr[i] = arr[front + i];
		}
		arr = newArr;
		rear = size;
		front = 0;
	}
	public static void main(String[] args) {
		ArrayQueueImpl q = new ArrayQueueImpl();
		
		//uncomment when ready
		for(int i = 0; i < 15; i ++)
			q.enqueue(i);
		for(int i = 0; i < 14; i ++)
			q.dequeue();
		System.out.println(q.size());
		System.out.println(q.peek());
	}
}

