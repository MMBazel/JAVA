/*
 * Name: Mikiko Bazeley
 * Term: Summer 2016
 * Class: CCSF- Java 111B
 * Project 2: Course Registration
 */


/*Write a class called Course to represent a college class. A course is described by:

a courseName
the maximum students that can be enrolled in the course

Write a constructor, getters and setters (using appropriate validity checks), and a toString method.
// PR//S THE COURSE
Media Studies (5 student capacity)
*/

public class Course {
// ================= > Instance Variables<====================//

	private String courseName;
	private int maxCapacity; 
	private Student[] roster;
	
// ================= > Course constructor that receives two parameters<====================//
	/*if some of the parameters are invalid, you need to still initialize the others
	 *  and then also use default values; otherwise, you can end up with an 
	 *  object that is only partially set up
	 *  --be sure to check that 
	 *  ex: if (balance >0.0), this.balance=balance;*/
	Scanner input = new Scanner(System.in);
	
	public Course(String courseName, int maxCapacity)
	{
		//Setting to null if no values
		this.courseName=(courseName != null && !courseName.isEmpty())? courseName: null;
		this.maxCapacity=(maxCapacity>0)? maxCapacity:null;
		//Initializing array with length of max capacity
		this.roster=(maxCapacity>0)? (new Student[maxCapacity]):null;		
		}

//Overloaded methods as wasn't initially sure whether list of students would be added sequentially
		//or if added as existing array
		//Set so that array list should match with max capacity
	public Course(String courseName, int maxCapacity, Student[] roster)
	{
		this.courseName=(courseName != null && !courseName.isEmpty())? courseName: null;
		this.maxCapacity=(maxCapacity>0)? maxCapacity:null;
		this.roster=(maxCapacity==roster.length)?roster:(new Student[maxCapacity]);
		
		}

	
//==============> course name: getters, setters <=================//	
	
	
	//method that sets the courseName
	public void setcourseName(String courseName){
		this.courseName=(courseName != null && !courseName.isEmpty())? courseName: null;
	}
	
	
	//method that returns the courseName
	public String getcourseName(){
		return courseName; //give value of courseName back to caller
	}//end method getcourseName
	
//==============> max capacity: getters, setters <=================//	

	
		//method that returns the Course maxCapacity
		public int getmaxCapacity(){
			return maxCapacity;
		}
	
		
		
		//method that sets the courseName
		public void setCourseCapacity(int maxCapacity){
			this.maxCapacity=(maxCapacity>0)? maxCapacity:null;
		}

		
//==============> student specific methods <=================//	
		public boolean addStudent(Student s){
/*if there is room for the student, add the student to the roster and return true
		return false otherwise
		*/
			//Count elements in roster
			int counter=0;
			for (int i = 0; i < roster.length; i++){
			    if (roster[i] != null)
			        counter ++;
			}
			
			//Compare number of elements to roster length
			//If less than, then add 
			
			if(counter<roster.length){
				counter++;
				roster[counter-1]=s;
				System.out.println(s+" has been added.");
				return true;
			}
			else{
				System.out.println("Cannot add "+s);
				return false;
			}
			
			
		}

		public boolean dropStudent(Student s){
/*if the student is currently in the roster, remove them from the roster and return true
		return false otherwise
		Note: There are different approaches to implementing this method. 
		Any approach is fine, but be sure to test your method thoroughly 
		considering lots of different possible cases. (Use your driver program for this!)
		*/
			
			//Count elements in roster
			int counter=0;
			for (int i = 0; i < roster.length; i++){
			    if (roster[i] != null)
			        counter ++;
			}
			
			//Check if student is there
			boolean flag=false;
			int removalIndex=0;
			for (int j = 0; j < roster.length; j++){
			    if (roster[j].equals(s)){
			        removalIndex=j;
			        flag=true;
			    }
			    
			}
			
			//Switch students
			if(flag==true){
				roster[removalIndex]=roster[counter-1];
				roster[counter-1]=null;
				System.out.println("Student "+s.getName()+" has been dropped.");
			}
			else{
				System.out.println("Student"+s.getName()+" was not dropped.");
			}
			
			return flag;
		}
			
			
			
			
		

		public void printRoster(){
/*print how many students are enrolled in the course;
 *  print an appropriate message 
 * if there are no students yet enrolled
 * print the list of each student on a single line 
 * (use good object-oriented principles to access a text representation of each student!)
 */
			//To get a count of the students
			int counter=0;
			for (int i = 0; i < roster.length; i++){
			    if (roster[i] != null)
			        counter ++;
			}
			
			//Only print if there are students
			if(counter>0){
				System.out.println("Enrollment: "+counter);
				for(Student each:roster){
					if(each!=null){
						System.out.println(each);
						}
				}
			}
			else{
				System.out.println("No students enrolled");
			}
			
		
		
		}

		
		
		
//==============> toString method<=================//
/*// PRINTS THE COURSE
Media Studies (5 student capacity)*/		
	
	public String toString(){
		return ("Course: "+this.courseName+" | ( "+this.maxCapacity+" student capacity)" );
	}
}//endClass
