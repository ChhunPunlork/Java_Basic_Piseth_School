package Lork.java;

public interface test {
	void Show();
	default void Show1(String name){

	}
	static int getNumber() {
		return 2;
	}
}
