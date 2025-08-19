import java.io.File;

class demo5
{
    public static void main(String asd[]) throws Exception
	{
	  File f=new File("C:/Users/moksha.bhandari/Desktop/JAVA/Day 6 (11.08.25)/sample.");
	  f.createNewFile();
	  System.out.println(f.isAbsolute());
	  System.out.println(f.getAbsolutePath());
	  boolean ex=f.exists();
	  System.out.println(ex);
	  if(ex)
		{
		   System.out.println("can Read?"+f.canRead());
		   System.out.println("can Write?"+f.canWrite());
		}
 
	  f.delete();
	  System.out.println("is file is available after deletion?\t"+f.exists());
	}
}