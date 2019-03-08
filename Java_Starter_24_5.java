import java.io.File;

public class Java_Starter_24_5 
{
	public static void showInfo(File f)
	{
		File[] lf = f.listFiles();
		
		for(int i=0;i<lf.length;i++)
		{
			System.out.println(lf[i].getName());
			if(lf[i].isDirectory())
				System.out.println("\t \t Directory");
			else
				System.out.println("\t \t File");
		}
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String workingDir = System.getProperty("user.dir");
		System.out.println(workingDir);
		
		File currentFile = new File(workingDir);
		System.out.println("현재 디렉터리 : "+currentFile.getName());
		
		File upperFile = new File(currentFile.getParent());
		System.out.println("상위 디렉터리 : "+upperFile.getName());
		
		showInfo(currentFile);
		showInfo(upperFile);
	}
}
