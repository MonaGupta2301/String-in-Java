//Wap to demo of  Methods of String in Java
class String1
{
    public static void main(String arg[])
	{
	     String s1=" Hello";      
		 String s2 = new String(" World");   
     
	     String e1="Mona";
		 String e2=new String("Mona");

          String t="           Coder           ";
		  
	    // concat();
		String s =s1.concat(s2);
		System.out.println(s);
		
		//equals();
		System.out.println(e1.equals(e2));  //It Returns True if both The Strings are Same.
		
		//compareTo();
		System.out.println(s1.compareTo(s1));  /* It returns integer value i.e positive,negative or zero on the Basis of difference of  number of character between s1 and s2 */
		
		//upperCase()
		System.out.println(s2.toUpperCase());
		
		//lowerCase()
		System.out.println(s1.toLowerCase());
		
		//charAt(int index)
		System.out.println(s2.charAt(4));
		
		//length()
		System.out.println(s2.length());

		//trim()
		System.out.println(t);
		System.out.println(t.trim());

		
	}
}
/*
***************OUTPUT************


D:\GItHub>javac MethodOfStringClass.java

D:\GItHub>java String1
 Hello World
true
0
 WORLD
 hello
l
6
           Coder
Coder

D:\GItHub>
*/