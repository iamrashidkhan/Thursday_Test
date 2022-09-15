import java.lang.Thread;

//Creating a thread class by extending super thread class
class MyThread extends Thread{
	String message[]={"Java", "is","purely","OOP","language"};
	public void run()
	{
		String name=getName();
		for(int i=0; i<message.length; i++){
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(name + message[i]);
		}
	}

	public static void main(String args[]){
		//Creating the object of thread
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();
	}
}

	
