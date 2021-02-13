// Problem Statement : Accept one character from user and convert case of that character.  
//                     Input : a   Output : A  
//                     Input : D   Output : d  

object Test
{
    def main(args:Array[String]) : Unit = 
    {
        var cCh:Char = '0';
        println("Enter character");
        cCh = scala.io.StdIn.readChar();
        if(cCh>='A' && cCh<='Z')
        {
            cCh = cCh.toLower;
        }
        else
        {
          if(cCh>='a' && cCh<='z')
          {
              cCh = cCh.toUpper;
          }
        }
        println(s"$cCh");
    }
}
