//Wap to demo of  Methods of StringBuffer Class in Java
/* The main Difference between String and StringBuffer Class is that 
    the Object which is created by String class is Unmutable String Objects and
	the object which is created by StringBuffer class is mutable String Objects.
*/
class String1
{
    public static void main(String arg[])
	{
	     StringBuffer s1=new StringBuffer(" Hello");      
		 StringBuffer s2=new StringBuffer(" JavaCode");      
		 
		 //Append()
		 System.out.println(s1.append(" World"));   

		 //insert()
		 System.out.println(s1.insert(3,"Samosa"));

        //replace
		 System.out.println(s2.replace(2,5,"GOT_IT")); 

        //delete
		StringBuffer s3=new StringBuffer("FRIENDSHIP");
		 System.out.println(s3.delete(2,5)); 
		 
		 //reverse
		 StringBuffer r=new StringBuffer("AliyaBhat");
		 System.out.println(r.reverse()); 

         //capacity
		 StringBuffer sb = new StringBuffer("Bhansali");
		 System.out.println(sb.capacity() ); // EmptyString Has the Capacity of 16 ByDefault so the Output Will be 24
		
    }
}
/*
**********OUTPUT********
D:\GItHub>javac MethodsOfStringBufferClass.java

D:\GItHub>java String1
 Hello World
 HeSamosallo World
 JGOT_ITCode
FRDSHIP
tahBayilA
24

D:\GItHub>
*/