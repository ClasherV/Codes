class Twin1
{
	public static void main(String[] xyz)
	{
		System.out.println("Hello World");
	}
}

class Twin2
{
    {
        System.out.print("No main");

    }
}

// Error: Error: Could not find or load main class TwinClass2
//        Caused by: java.lang.ClassNotFoundException: TwinClass2