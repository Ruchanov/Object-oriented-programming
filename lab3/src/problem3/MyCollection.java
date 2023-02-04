package problem3;

public interface MyCollection {
	int getSize();
	boolean isEmpty();
	boolean add(Object o);
	void clear();
	boolean remove(Object o);
	void print(Object o);
	void addAll(MyCollection e);
}
