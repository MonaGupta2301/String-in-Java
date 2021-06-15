//Wap to demo of String in Java
//There are two ways to create a String in java
class String1
{
    public static void main(String arg[])
	{
	     String s1=" Hello";       // Creating String Using String Literal <It stores in Constant Pool>
		 String s2 = new String(" World");   // Creating String with new Keyword <It stores in Normal Pool>
		 
		 System.out.println(s1);
		 System.out.println(s2);
	}
}
/*
*********OUTPUT*********

D:\GItHub>javac Two_Ways_Of_String.java

D:\GItHub>java String1
 Hello
 World

D:\GItHub>*/