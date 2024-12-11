package schoolApp;

public class School_App {

	public static void main(String[] args) {
		School school = new School();
		school.setName("===================Lork App==================".toUpperCase());
		System.out.println(school.getName());
		
		Student st1 = new Student(1, "Chhun Punlork".toUpperCase(), Gender.M);
		Student st2 = new Student(2, "Chan Vatanaka".toUpperCase(), Gender.M);
		Student st3 = new Student(3, "Keo Sopheng".toUpperCase(), Gender.M);
		Student st4 = new Student(4, "Lim Panhasak".toUpperCase(), Gender.M);
		Student st5 = new Student(5, "Ngoun Soben".toUpperCase(), Gender.M);
		
		school.register(st1);
		school.register(st2);
		school.register(st3);
		school.register(st4);
		school.register(st5);
		
		school.display();
		System.out.println("=================After sort==================".toUpperCase());
		school.sortbyname();
		school.display();
		
		System.out.println("=================Find by Id==================".toUpperCase());
		Student foundStudent = school.findbyId(2);
		if(foundStudent != null) {
			System.out.println(foundStudent);
		}else {
			System.out.println("Not found student!");
		}
		
		System.out.println("=================Remove by id==================".toUpperCase());
		school.RemoveById(1);
		school.display();
		
		System.out.println("=================Update by id==================".toUpperCase());
		Student studentToUpdate = new Student("Ny Kimhab".toUpperCase(), Gender.M);
		school.UpdateById(2, studentToUpdate);
		school.display();
	}	
}
