Project 1: Bank Account
For this and all projects, you are strongly encouraged to work in groups of up to four students. Note that you must work in groups for at least one project.

Programming in the real world is almost always done with others. It's good to get into the habit of programming in a group early on! So start now! See the notes below about submitting as a group.

If you don't know anyone else in the class, use the forums to form a group!

Part I- BankAccount Class
Write a class to describe a BankAccount object. A bank account is described by:

the account owner's name
an account ID (stored as text)
the balance in the account
In your class, include:

instance data variables (10 points)
a constructor (10 points)
getters and setters (with appropriate value checks, when applicable) (20 points)
a toString method (you can decide the output) (10 points)
a deposit method (with appropriate value checks; output an error message to the user when appropriate) (10 points)
a withdraw method (with appropriate value checks; output an error message to the user when appropriate) (10 points)
Part II- Driver Program
Write an interactive driver program for the user to create and modify bank account objects. (30 points)

The user should first create a bank account with an initial balance. The user can then repeatedly make a deposit, a withdrawal, check the balance, or quit.

Extra Credit
Include an interest rate as part of what describes a bank account. (20 points)

Update the BankAccount as necessary.
Include adding interest as a choice in the driver program. The user should enter, for example, 5 to indicate 5% interest (the user should not be required to enter 0.05).
Notes
To read double values from the user, use the following code. This code will avoid difficulties that you might encounter with the nextDouble method of the Scanner class.
double amount = Double.parseDouble(scan.nextLine());

I have provided a sample program you can run to see how the driver program works. The sample program includes the extra credit. To run the program:
Download the JAR file.
On a Mac, use a terminal window. On a PC, type "cmd" into the search box to use a command window.
Navigate to the same directory where you downloaded the JAR file.
Use the following command:
java -jar BankOfJess.jar

To submit your program, zip your BankAccount and driver classes together (the .java files) and upload the zip file.
If submitting as a group, submit one assignment only through one group member's Insight account. Put the names of all group members in Java comments at the top of each Java file.
