import java.util.Iterator;

//Testing
public class MyALDAList<T> implements ALDAList<T> {

	private static class Node<T> {
		T data;
		Node<T> next;
		
		public Node(T data) {
			this.data = data;
		}
	}
	
	private Node<T> first;
	private Node<T> last;
	private int sizeOfList = 0;
	
	@Override
	public Iterator iterator() {
		return new MyALDAListIterator();
	}

	@Override
	public void add(T data) {
		if(first == null){
			first = new Node<T>(data);
			last = first;
		}else{
			last.next = new Node<T>(data);
			last = last.next;
		}
		sizeOfList++;
	}

	@Override
	public void add(int index, Object element) {
		
	}

	@Override
	public T remove(int index) {
		
		return null;
	}

	@Override
	public boolean remove(Object element) {
		return false;
	}

	@Override
	public T get(int index) {
		return null;
	}

	@Override
	public boolean contains(Object element) {
		return false;
	}

	@Override
	public int indexOf(Object element) {
		return 0;
	}

	@Override
	public void clear() {
		first = new Node<T>(null);
		last = new Node<T>(null);
		first.next = last;
		sizeOfList = 0;
	}

	@Override
	public int size() {
		return sizeOfList;	
	}
	
	private class MyALDAListIterator implements java.util.Iterator<T>{
		
		private Node<T> current = first.next;
		
		@Override
		public boolean hasNext() {
			return current != last;
		}

		@Override
		public T next() {
			if(!hasNext()){
				throw new java.util.NoSuchElementException();
			}
			
			T nextElement = current.data;
			current = current.next;
			
			return nextElement;
		}

		@Override
		public void remove() {
			
		}
		
	}

}
