package examgradingsystemproject;
class Grade
{
Sleep sleep= new Sleep();
String [] string1 = new String [1];
Questionsforoop  questionsforoop = new Questionsforoop ();
Questionsfordatastruc  questionsfordatastruc = new Questionsfordatastruc ();
Questionsfordatabase  questionsfordatabase = new Questionsfordatabase ();
Questionsformath  questionsformath = new Questionsformath ();
ExamGradingSystemProject mainobj= new ExamGradingSystemProject();
MakeExam makeexamobj = new MakeExam();
public void gradeoopexam( int j) //function that accepts the number of total question
{
int count =0;
for (int i=0; i<10; i++)
{//the choice the student has entered is compared to the teachers answer and 1 is incremented to the arbitrary value of count every time the student gets a question right
if ((questionsforoop.studchoice [i]==questionsforoop.correctchoice[i] ||  questionsforoop.studchoice [i]==Character.toUpperCase(questionsforoop.correctchoice[i]) || questionsforoop.studchoice [i]==Character.toLowerCase(questionsforoop.correctchoice[i])) && questionsforoop.studchoice[i]!= '\u0000')
count++; //the correct choice is converted to uppercase and lower case letters so that the if statement can return true if one of the characters is uppercase and the other is lowercase while both are necessariy the same letter
}
    System.out.println("You have scored "+ count + " out of " +j); //displays how much the student has scored
makeexamobj.exittomain(); //exits to main
}
public void gradedatastrucexam(int j)
{
int count =0;
for (int i=0; i<10; i++)
{
if ((questionsfordatastruc.studchoice [i]==questionsfordatastruc.correctchoice[i]   ||  questionsfordatastruc.studchoice [i]==Character.toUpperCase(questionsfordatastruc.correctchoice[i])  ||  questionsfordatastruc.studchoice [i]==Character.toLowerCase(questionsfordatastruc.correctchoice[i])       ) && questionsfordatastruc.studchoice[i]!= '\u0000')
count++;
}
    System.out.println("You have scored "+ count + " out of " +j);
makeexamobj.exittomain();   
}
public void gradedatabaseexam(int j)
{
 int count =0;
for (int i=0; i<10; i++)
{
if ((questionsfordatabase.studchoice [i]==questionsfordatabase.correctchoice[i] ||  questionsfordatabase.studchoice [i]==Character.toUpperCase(questionsfordatabase.correctchoice[i])    ||  questionsfordatabase.studchoice [i]==Character.toLowerCase(questionsfordatabase.correctchoice[i])       )&& questionsfordatabase.studchoice[i]!= '\u0000')
count++;
}
    System.out.println("You have scored "+ count + " out of " +j);
makeexamobj.exittomain();  
}
public void grademathexam(int j)
{
   int count =0;
for (int i=0; i<10; i++)
{
if ((questionsformath.studchoice [i]==questionsformath.correctchoice[i]  ||  questionsformath.studchoice [i]==Character.toUpperCase(questionsformath.correctchoice[i])   ||  questionsformath.studchoice [i]==Character.toLowerCase(questionsformath.correctchoice[i])        ) && questionsformath.studchoice[i]!= '\u0000')
count++;
}

    System.out.println("You have scored "+ count + " out of " +j);
makeexamobj.exittomain();
}
}

