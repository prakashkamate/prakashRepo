




public class LambadaRun{

	static int st;
	static int end;
	
	public LambadaRun(int st,int end)
	{
		this.st=st;
		this.end=end;
	}
	public static void main(String[] args) {
		
		Runnable r=()->{
			
			for(int i=st;i<=end;i++)
			{
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i);
				i++;
			}
			
		};
		
		
		 LambadaRun lr=new LambadaRun(51,75);
		 LambadaRun lr1=new LambadaRun(1,25);
		
		Thread t=new Thread(r);
		//Thread t1=new Thread(r));
		
		t.start();
		
		//t1.start();
		
		// TODO Auto-generated method stub

	}

}
