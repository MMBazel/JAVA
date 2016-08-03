Make sure you work compiles before submitting!





 Student Class:

 Wow! Very well organized~

 getters for booleans are often named starting with “is” (for example, isTuitionPaid)



 Course Class:

 setCourseCapacity should also make sure that the parameter is less than or equal to roster.length



 Roster:

 -3 roster should not be sent in as a parameter to the constructor- a Course should be created with an empty roster; if the array is  sent in as a parameter, it might not work properly with maxStudents (e.g., maxStudents could be 10 but the array could have only

 size 5)



 Course Methods:

 -2 it would be better to keep track of the number of students enrolled in the course (using an instance data variable) so that you

 would not need to figure it out each time you add/drop a student

 numStudents should have a getter so outside classes can access the number of students enrolled



 addStudent():

 -1 you should check if numberEnrolled is less than maxStudents, not roster.length
