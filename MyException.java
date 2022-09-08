class MyException extends Exception
{
    public MyException(String s)
    {
        // Calling constructor of super class Exception
        super(s);
    }


   void productCheck(int weight) throws MyException{
	if(weight<100)
		throw new MyException("Product Invalid");
   }
   
    public static void main(String args[])
    {
    	MyException obj = new MyException("Hello World");
        try
        {
            obj.productCheck(60);
        }
        catch (MyException ex)
        {
            System.out.println("Caught the exception");
            System.out.println(ex.getMessage());
        }
    }

}