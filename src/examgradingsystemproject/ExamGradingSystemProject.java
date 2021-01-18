// password is "java" for all administrative privelages
package examgradingsystemproject;
import java.util.Scanner;
public class ExamGradingSystemProject
{

static int k=0;
static Scanner input= new Scanner (System.in);
static ExamGradingSystemProject mainobj = new ExamGradingSystemProject();
static Sleep sleep= new Sleep();
public static void main(String[] args)
{
 String [] string1 = new String [1]; //a string with no content used as an argument to call the main method later on
if (k==0)
{
System.out.println("---------------Exam Grading System---------------");// The header is only displayed once when opening the program for the first time
k++;
}
else {
System.out.println("-------------------------------------------------");}//separator for visual purposes
sleep.sleepfor1sec();// delays the next step for 1 sec
System.out.println("1.Make Exam\n2.Take Exam");
    MakeExam makeexamobj= new MakeExam(); 
    TakeExam takeexamobj= new TakeExam();
    int n=input.nextInt();
    if (n==1)
        makeexamobj.auth();
    else if (n==2)
      takeexamobj.studtakeexam();
    else
    { System.out.println("Wrong Input! Try Again");}
   mainobj.main(string1);  }  // prompts the user to enter the choice again after directing to the main method
}   
