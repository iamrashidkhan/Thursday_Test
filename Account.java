class Account{
	private long acc_no;
	private String name;
	private String email;
	private float amount;
	
	public long getAcc_no();{
		return acc_no;
	}
	public void setAcc_no(long a_no){
		this.acc_no=a_no;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public string getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public float getAmount(){
		return Amount;
	}
	public void setAmount(float amount){
		this.amount=amount;
	}
	public static void main(String args[])
	{
		Account myAccount = new Account();
		myAccount.setAcc_no(483302);
		myAccount.setName("Pathan Rashidkhan");
		myAccount.setEmail("the.rashid.khans@gmail.com");
		myAccount.setAmount(49999);
		System.out.println("Account no:"+myAccount.getAcc_no()+" "+"Account name:"
		      +myAccount.getName()+"Account holder email:"+myAccount.getEmail()+"Amount in account"
			  +myAccount.getAmount());
	}
}