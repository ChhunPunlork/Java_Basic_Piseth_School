package Com.piseth.School.test;

public class ConstructorReferenceDemo {

	public static void main(String[] args) {
//		Student student = new Student("Dara", 21);
//		StudentService studentService = (n, a) -> new Student(n, a);
//		StudentService studentService = Student::new;
//		Student st1 = studentService.createStudent("Dara", 21);
//		System.out.println(st1.getName());
		
//		StringGenerator generator = a -> new String(a);
		
		StringGenerator generator = String::new;
		char[] ar = {'a', 'b', 'c'};
		String myString = generator.createString(ar);
		System.out.println(myString);
		
	}

}
