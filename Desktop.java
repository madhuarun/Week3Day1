package Week3Day1;

public class Desktop extends Computer {
	
	public void desktopSize()
	{
		System.out.println("my desktop size is big");
	}
	
	public static void main(String[] args)
	{
		Desktop desktop=new Desktop(); 
		desktop.computerModel();
		desktop.desktopSize();
}
}

