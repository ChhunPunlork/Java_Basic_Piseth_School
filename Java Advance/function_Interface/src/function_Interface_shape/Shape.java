package function_Interface_shape;

@FunctionalInterface
public interface Shape {
	double getArea();

	default void show() {
		System.out.println("This is new feature");
	}
	default void show1() {
		System.out.println("This is new feature");
	}
	default void show2() {
		System.out.println("This is new feature");
	}
}
