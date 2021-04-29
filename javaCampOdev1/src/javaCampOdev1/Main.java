package javaCampOdev1;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Gürkan");
		student1.setLastName("Çalışır");
		student1.setEmail("gurkan01c@gmail.com");
		student1.setIdentityNumber("11111111");
		student1.setPassword("12345");
		student1.setCourseCount(2);
		student1.setStudentNumber("1469");
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(2);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setIdentityNumber("2222222");
		instructor1.setPassword("123456789");
		instructor1.setSalary(3000);
		instructor1.setStudentCount(3800);
		
		UserManager userManager = new UserManager(new FileLogger());
		userManager.add(student1);
		userManager.add(instructor1);
		System.out.println("*****************************");
		userManager.delete(student1);
		userManager.delete(instructor1);
		System.out.println("*****************************");
		userManager.update(student1);
		userManager.update(instructor1);
		System.out.println("*****************************");
		
		
		
	}

}
