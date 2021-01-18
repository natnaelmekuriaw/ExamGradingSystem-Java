package examgradingsystemproject;
import java.util.Scanner;
class TakeExam extends MakeExam
{
Sleep sleep= new Sleep();
Scanner input = new Scanner (System.in);
Questionsforoop  questionsforoop = new Questionsforoop ();
Questionsfordatastruc  questionsfordatastruc = new Questionsfordatastruc ();
Questionsfordatabase  questionsfordatabase = new Questionsfordatabase ();
Questionsformath  questionsformath = new Questionsformath ();
Grade grade = new Grade();
public void studtakeexam()
{//directs the student to whatever subject he desires based on his choice in the choosecourse method;
int n=choosecourse();
if (n==1)
    takeoopexam();
else if (n==2)
    takedatastrucexam();
else if (n==3)
    takedatabaseexam();
else if (n==4)
    takemathexam();
else
{
    System.out.println("Wrong Input");
    studtakeexam();         //if the user enters an invalid id for a subject he is asked to enter again
}
}

public void takeoopexam()
{   int j=0;
    System.out.println("\nTrying to retrieve exam...\n");
    sleep.sleepfor2sec();
 try{if (questionsforoop.questions [0].charAt(0)=='\u0000') //if question number 1 is null throws an exception saying that no exam havenot been added yet
  { 
 }}
 catch (Exception e){System.out.println("Error!!!! There are no available exams for this subject. Please proceed to other subjects");studtakeexam();}// prompts the student to choose another subject

for (int i=0;i<10;i++)
{
if (questionsforoop.questions [i]!=null && questionsforoop.choicea [i]!=null && questionsforoop.choiceb [i]!=null && questionsforoop.choicec [i]!=null&& questionsforoop.choiced [i]!=null) //stops displaying whenever a null value is encountered which otherwise may result in empty space on the console
{
System.out.println((i+1)+"."+questionsforoop.questions [i]);
System.out.println(" A."+questionsforoop.choicea [i]);
System.out.println(" B."+questionsforoop.choiceb [i]);
System.out.println(" C."+questionsforoop.choicec [i]);
System.out.println(" D."+questionsforoop.choiced[i]);
System.out.println("Enter your Answer");
for (int z=0;z<100;z++)
{
questionsforoop.studchoice [i]= input.next().charAt(0);
if (questionsforoop.studchoice [i]=='a' || questionsforoop.studchoice [i]=='A' ||questionsforoop.studchoice [i]=='b'  ||questionsforoop.studchoice [i]=='B'     ||questionsforoop.studchoice [i]=='c'   || questionsforoop.studchoice [i]=='C'  ||questionsforoop.studchoice [i]=='d'
     ||questionsforoop.studchoice [i]=='D')
    break;
else
        System.out.println("Invalid Input! Please try again");
}
j++;
}//accepts the students answer for that specific question
}
    System.out.println("You have completed your exam!");
    sleep.sleepfor2sec();
    
    System.out.println("Press the Enter Key to grade your exam"); //the student has to press the enter key to proceed to his grade report
   try{
       System.in.read();
   }
    catch (Exception e){
        e.printStackTrace();} 
   grade.gradeoopexam(j); //calls the grading function for desired subject and passes j which counts how many times the for loop was executed (how many questions there are)
    
}

public void takedatastrucexam ()
{   int j=0;
    System.out.println("\nTrying to retrieve the exam...\n");
    sleep.sleepfor2sec();
  try{if (questionsfordatastruc.questions [0].charAt(0)=='\u0000')
 { 
 }}
 catch (Exception e){System.out.println("Error!!!! There are no available exams for this subject. Please proceed to other subjects");studtakeexam();}  
for (int i=0;i<10;i++)
{
if (questionsfordatastruc.questions [i]!=null && questionsfordatastruc.choicea [i]!=null && questionsfordatastruc.choiceb [i]!=null && questionsfordatastruc.choicec [i]!=null&& questionsfordatastruc.choiced [i]!=null)
{
System.out.println((i+1)+"."+questionsfordatastruc.questions [i]);
System.out.println(" A."+questionsfordatastruc.choicea [i]);
System.out.println(" B."+questionsfordatastruc.choiceb [i]);
System.out.println(" C."+questionsfordatastruc.choicec [i]);
System.out.println(" D."+questionsfordatastruc.choiced[i]);
System.out.println("Enter your Answer");
for (int z=0;z<100;z++)
{
questionsfordatastruc.studchoice [i]= input.next().charAt(0);
if (questionsfordatastruc.studchoice [i]=='a' || questionsfordatastruc.studchoice [i]=='A' ||questionsfordatastruc.studchoice [i]=='b'  ||questionsfordatastruc.studchoice [i]=='B'     ||questionsfordatastruc.studchoice [i]=='c'   || questionsfordatastruc.studchoice [i]=='C'  ||questionsfordatastruc.studchoice [i]=='d'
     ||questionsfordatastruc.studchoice [i]=='D')
    break;
else
        System.out.println("Invalid Input! Please try again");
}
j++;
}
System.out.println("Press the Enter Key to grade your exam");
   try{
       System.in.read();
   }
    catch (Exception e){
        e.printStackTrace();}
   grade.gradedatastrucexam(j);
}
}
public void takedatabaseexam ()
{   int j=0;
    System.out.println("\nTrying to retrieve the exam...\n");
    sleep.sleepfor2sec();
try{if (questionsfordatabase.questions [0].charAt(0)=='\u0000')
 { 
 }}
 catch (Exception e){System.out.println("Error!!!! There are no available exams for this subject. Please proceed to other subjects");studtakeexam();}  
 
for (int i=0;i<10;i++)
{
if (questionsfordatabase.questions [i]!=null && questionsfordatabase.choicea [i]!=null && questionsfordatabase.choiceb [i]!=null && questionsfordatabase.choicec [i]!=null&& questionsfordatabase.choiced [i]!=null)
{
System.out.println((i+1)+"."+questionsfordatabase.questions [i]);
System.out.println(" A."+questionsfordatabase.choicea [i]);
System.out.println(" B."+questionsfordatabase.choiceb [i]);
System.out.println(" C."+questionsfordatabase.choicec [i]);
System.out.println(" D."+questionsfordatabase.choiced[i]);
System.out.println("Enter your Answer");
for (int z=0;z<100;z++)
{
questionsfordatabase.studchoice [i]= input.next().charAt(0);
if (questionsfordatabase.studchoice [i]=='a' || questionsfordatabase.studchoice [i]=='A' ||questionsfordatabase.studchoice [i]=='b'  ||questionsfordatabase.studchoice [i]=='B'     ||questionsfordatabase.studchoice [i]=='c'   || questionsfordatabase.studchoice [i]=='C'  ||questionsfordatabase.studchoice [i]=='d'
     ||questionsfordatabase.studchoice [i]=='D')
    break;
else
        System.out.println("Invalid Input! Please try again");
}
j++;
}
}
System.out.println("Press the Enter Key to grade your exam");
   try{
       System.in.read();
   }
    catch (Exception e){
        e.printStackTrace();}
   grade.gradedatabaseexam(j);
}

public void takemathexam ()
{   int j=0;
    System.out.println("\nTrying to retrieve the exam...\n");
    sleep.sleepfor2sec();
try{if (questionsformath.questions [0].charAt(0)=='\u0000')
 { 
 }}
 catch (Exception e){System.out.println("Error!!!! There are no available exams for this subject. Please proceed to other subjects");studtakeexam();} 
for (int i=0;i<10;i++)
{
if (questionsformath.questions [i]!=null && questionsformath.choicea [i]!=null && questionsformath.choiceb [i]!=null && questionsformath.choicec [i]!=null&& questionsformath.choiced [i]!=null)
{
System.out.println((i+1)+"."+questionsformath.questions [i]);
System.out.println(" A."+questionsformath.choicea [i]);
System.out.println(" B."+questionsformath.choiceb [i]);
System.out.println(" C."+questionsformath.choicec [i]);
System.out.println(" D."+questionsformath.choiced[i]);
System.out.println("Enter your Answer");
for (int z=0;z<100;z++)
{
questionsformath.studchoice [i]= input.next().charAt(0);
if (questionsformath.studchoice [i]=='a' || questionsformath.studchoice [i]=='A' ||questionsformath.studchoice [i]=='b'  ||questionsformath.studchoice [i]=='B'     ||questionsformath.studchoice [i]=='c'   || questionsformath.studchoice [i]=='C'  ||questionsformath.studchoice [i]=='d'
     ||questionsformath.studchoice [i]=='D')
    break;
else
        System.out.println("Invalid Input! Please try again");
}
j++;
}
}
System.out.println("Press the Enter Key to grade your exam");
   try{
       System.in.read();
   }
    catch (Exception e){
        e.printStackTrace();}
   grade.grademathexam(j);
}


}