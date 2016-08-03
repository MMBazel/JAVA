/*
 * Name: Mikiko Bazeley
 * Term: Summer 2016
 * Class: CCSF- Java 111B
 * Project 2: Course Registration
 */


class DriverProgram {

	public static void main(String[] args) {
		/*
		 * 
		 * Write a driver program that does the following (in this order). Note that your driver program is not interactive with the user.
		 * creates six students
		 * creates a course that can hold five students
		 * prints the course
		 * prints the roster
		 * adds the first five students to the course
		 * tries to add the sixth student and prints a message if any add fails
		 * prints the roster
		 * drops the third student from the course
		 * prints the roster
		 * tries again to add the sixth student to the course
		 * prints the roster
		 * 
		 */
		
		 //creates six students
		//Student(String name, String studentID, boolean paidTuition)
		Student adamAnt = new Student("Adam Ant","S925",true);
		Student bobBarker = new Student("Bob Barker","S713",true);
		Student chevyChase = new Student("Chevy Chase","S512",false);
		Student dorisDay = new Student("Doris Day","S513",true);
		Student emilioEstevez = new Student("Emilio Estevez","S516",false);
		Student farrahFawcet = new Student("Farrah Fawcet","S956",false);
		
		

		
		
		 //* creates a course that can hold five students
		//Media Studies (5 student capacity
		Course media = new Course("Media Studies", 5);

		// * prints the course
		System.out.println(media);

		
		// * prints the roster
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
		System.out.println("Class Roster:");
		media.printRoster();

		
		//* adds the first five students to the course
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
		System.out.println("Adding students:");
		media.addStudent(adamAnt);
		media.addStudent(bobBarker);
		media.addStudent(chevyChase);
		media.addStudent(dorisDay);
		media.addStudent(emilioEstevez);
		
		// * tries to add the sixth student and prints a message if any add fails
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
		System.out.println("Attempting to add 6th student:");
		media.addStudent(farrahFawcet); 
		
		//* prints the roster
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
		System.out.println("Class Roster:");
		media.printRoster();
		
		// * drops the third student from the course
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
		System.out.println("Dropping student: ");
		media.dropStudent(chevyChase);
		
		//* prints the roster
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
		System.out.println("Class Roster:");
		media.printRoster();
		
		
		// * tries again to add the sixth student to the course
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
		System.out.println("Attempt to add 6th Student:");
		media.addStudent(farrahFawcet);
		
		 //* prints the roster
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
		System.out.println("Class Roster:");
		media.printRoster();

	}

}
