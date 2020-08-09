package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[] array;
	public ArrayList() {
	 array = (T[]) new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		return array[loc];
	}
	
	public void add(T val) {
		
		T[] NA = (T[]) new Object[array.length+1];
		for (int i = 0; i < array.length; i++) {
			NA[i] = array[i];
		}
		NA[NA.length-1] = val;
		array=NA;
		
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] NA = (T[]) new Object[array.length+1];
		for (int i = 0; i < NA.length; i++) {
			if(i<loc) {
				NA[i] = array[i];
			}else if(i==loc) {
				NA[loc] = val;
			}else {
				NA[i] = array[i-1];
			}
		}
		array = NA;
	
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		array[loc]=val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] NA = (T[]) new Object[array.length-1];
	for (int i = 0; i < array.length; i++) {
		if(i<loc) {
			NA[i] = array[i];
		}else if(i>loc) {
			NA[i-1] = array[i];
		}
	}
	array=NA;
}
	
	public boolean contains(T val) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(val)) {
				return true;
			}
		}
		return false;
	}
	
	public int size() {
		return array.length;
	}
}