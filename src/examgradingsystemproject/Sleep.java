package examgradingsystemproject;
class Sleep//sleep class with multiple methods based on time
{
public void sleepfor1sec()
{
try
  {
  Thread.sleep (1000); //delays for 1000ms or 1sec
  }
  catch (InterruptedException e)
  {
      System.out.println(e); //displays exception e
  }
  
}

public void sleepfor2sec()
{
try
  {
  Thread.sleep (2000);//delays for 2000ms or 2sec
  }
  catch (InterruptedException e)
  {
      System.out.println(e);
  }
  
}
}