/*
 * Name: Mikiko Bazeley
 * Term: Summer 2016
 * Class: CCSF- Java 111B
 * Project 2: Course Registration
 */


/*Write a class called Student. A student is described by:

a name
an ID (text-based, such as "A146")
whether or not tuition is paid
Write a constructor, getters and setters, and a toString method for this class.
//PRINTS THE ROSTER (BEFORE DROPPING 3RD STUDENT)
Adam Ant (S925)*/

public class Student {
// ================= > Instance Variables<====================//
	
	private String name; 
	private String studentID;
	private boolean paidTuition;
	
// ================= > Account constructor that receives two parameters<====================//
	public Student(String name, String studentID, boolean paidTuition)
	{
		//Assign name to instance variable name; 
		this.name=(name != null && !name.isEmpty())? name: null;
		this.studentID=(studentID != null && !studentID.isEmpty())? studentID: null;
		this.paidTuition=(paidTuition==true)?true:false;
	}
		
//==============> student name: getters, setters <=================//	
	
	//method that sets the name
	public void setName(String name){
		this.name=(name != null && !name.isEmpty())? name: this.name;
	}
	
	
	//method that returns the name
	public String getName(){
		return name; //give value of name back to caller
	}//end method getName
	
//==============> student id: getters, setters <=================//	

	
	//method that sets the student ID
		public void setStudentID(String studentID){
			this.studentID=(studentID != null && !studentID.isEmpty())? studentID: this.name;
		}
		
	//method that returns the student ID
		public String getStudentID(){
			return studentID;
		}
		
//==============> paid tuition: getters, setters <=================//	
		
		//method that sets the paid Tuition field
		public void setPaidTuition(boolean paidTuition){
			this.paidTuition=(paidTuition==true)?true:false;
		}
		
	//method that returns the paid Tuition field
		public boolean getPaidTuition(){
			return paidTuition;
		}
		
//==============> toString method<=================//	
		
	public String toString(){
		return (this.name+"| {"+this.studentID+")");
	}
}//endClass

