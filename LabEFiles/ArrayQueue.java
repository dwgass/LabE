/**
 * A class that implements the ADT queue by using an expandable circular array
 * with one unused location.
 * 
 */
public class ArrayQueue<T> implements QueueInterface<T> {

	protected T[] queue; // circular array of queue entries and one unused location
	protected int frontIndex;
	protected int backIndex;
	private static final int DEFAULT_INITIAL_CAPACITY = 50;

	public ArrayQueue() {
		this(DEFAULT_INITIAL_CAPACITY);
	} 

	public ArrayQueue(int initialCapacity) {
		queue = (T[]) new Object[initialCapacity + 1];
		frontIndex = 0;
		backIndex = initialCapacity;
	} 


	public void enqueue(T newEntry) {
		if (isArrayFull()) 
			doubleArray(); 

		backIndex = (backIndex + 1) % queue.length;
		queue[backIndex] = newEntry;
	} 
	
	public T getFront() {
		T front = null;

		if (!isEmpty())
			front = queue[frontIndex];

		return front;
	} 

	public T dequeue() {
		T front = null;

		if (!isEmpty()) {
			front = queue[frontIndex];
			queue[frontIndex] = null;
			frontIndex = (frontIndex + 1) % queue.length;
		} 

		return front;
	} 


	public boolean isEmpty() {
		return frontIndex == ((backIndex + 1) % queue.length);
	} 


	public void clear() {
		if (!isEmpty()) { // deallocates only the used portion
			for (int index = frontIndex; index != backIndex; index = (index + 1)
					% queue.length) {
				queue[index] = null;
			} 

			queue[backIndex] = null;
		} 

		frontIndex = 0;
		backIndex = queue.length - 1;
	} 



	protected boolean isArrayFull() {
		return frontIndex == ((backIndex + 2) % queue.length);
	} 


	protected void doubleArray() {
		T[] oldQueue = queue;
		int oldSize = oldQueue.length;

		queue = (T[]) new Object[2 * oldSize];

		for (int index = 0; index < oldSize - 1; index++) {
			queue[index] = oldQueue[frontIndex];
			frontIndex = (frontIndex + 1) % oldSize;
		} 

		frontIndex = 0;
		backIndex = oldSize - 2;
	} 
}