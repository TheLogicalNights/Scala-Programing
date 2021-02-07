// Problem Statement : Program to print 5 to 1 on the screen

object PrintReverse
{
  def main(args:Array[String]) : Unit = 
  {
    for(i<-5 to (1,-1)) // for(i<- (1 to 5).reverse)
    {
      println(i);
    }
  }
}