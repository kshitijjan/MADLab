/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main{
    public static void main(String args[])
    {
        One o=new One(2);
        o.show();
        Two t=new Two(3);
        t.show();
        
    }
}
class One{
    int x;
    One(int a)
    {
        x=a;
    }
    void show()
    {
        System.out.println(x);

    }
}
 class Two extends One 
{
    Two(int x)
    {
        super(x);
    }
}