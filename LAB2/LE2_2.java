/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main{
    public static void main(String args[])
    {
        One o=new One();
        o.show();
        Two t=new Two();
        t.show();
        
    }
}
class One{
   
    void show()
    {
        System.out.println("Hello World");

    }
}
 class Two extends One 
{
    void show()
    {
        System.out.println("Hello Juet ");

    }
}