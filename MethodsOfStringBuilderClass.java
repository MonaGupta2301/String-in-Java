//Wap to demo of  Methods of StringBuilder Class in Java
/* The main Difference between String and StringBilder Class is that 
    the Object which is created by String class is Unmutable String Objects and
	the object which is created by StringBuilder class is mutable String Objects.
*/
/* The main Difference between StringBuffer and StringBilder Class is that 
    the Object which is created by StringBuffer class is not Thread Safe and
	the object which is created by StringBuilder class is Thread Safe.
*/
class String1
{
    public static void main(String arg[])
	{
	     StringBuilder s1=new StringBuilder(" Hello");      
		 StringBuilder s2=new StringBuilder(" JavaCode");      
		
         //Append()
		 System.out.println(s1.append(" World"));   

		 //insert()
		 System.out.println(s1.insert(3,"Samosa"));

        //replace
		 System.out.println(s2.replace(2,5,"GOT_IT")); 

        //delete
		StringBuilder s3=new StringBuilder("FRIENDSHIP");
		 System.out.println(s3.delete(2,5)); 
		 
		 //reverse
		 StringBuilder r=new StringBuilder("AliyaBhat");
		 System.out.println(r.reverse()); 

         //capacity
		 StringBuilder sb = new StringBuilder("Bhansali");
		 System.out.println(sb.capacity() ); // EmptyString Has the Capacity of 16 ByDefault so the Output Will be 24
				
	}
	
}
/*
************OUTPUT*********


D:\GItHub>javac MethodsOfStringBuilderClass.java

D:\GItHub>java String1
 Hello World
 HeSamosallo World
 JGOT_ITCode
FRDSHIP
tahBayilA
24

D:\GItHub>*/