package bank;

public class BankAccounts {

	private String name;
	private long accno;
	private long balance;
	private String aType;
	private static long totalDeposit;
	private static long totalWithdrawl;

	public BankAccounts() {
		
	}

	public BankAccounts(String name, long accno, long balance, String aType) {
	
		this.name = name;
		this.accno = accno;
		this.balance = balance;
		this.aType = aType;
	}
	public void bankAcc(String name, long accno, long balance, String aType) {
		
		this.name = name;
		this.accno = accno;
		this.balance = balance;
		this.aType = aType;
	}
	
	@Override
	public String toString() {
		return "Account Details [name=" + name + ", account no.=" + accno + ", balance=" + balance + ", account Type=" + aType + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAccno() {
		return accno;
	}

	public void setAccno(long accno) {
		this.accno = accno;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public String getaType() {
		return aType;
	}

	public void setaType(String aType) {
		this.aType = aType;
	}
	public void display(){
	System.out.println(this);
	}
	public void withdrawl(int a){
		balance=balance-a;
		totalWithdrawl=totalWithdrawl+a;
		System.out.println("Withdrawl amount is: "+a);
		System.out.println("Updated Amount is: "+balance);
	}
	public void deposit(int a){
		balance=balance+a;
		totalDeposit=totalDeposit+a;
		System.out.println("Deposited amount is: "+a);
		System.out.println("Updated Amount is: "+balance);
	}
	public void totalDep(){
		System.out.println("Total Deposited amount: "+totalDeposit);
		
	}
	public void totalWd(){
		System.out.println("Total Withdrawl amount: "+totalWithdrawl);
	}
	public void avgBal(BankAccounts...v){
		long sum=0;
		for(BankAccounts temp:v){
			sum=sum+(temp.balance);
		}
		System.out.println("Average Balance is: "+(sum/v.length));
	}
	

	public static void main(String[] args) {
	 BankAccounts ba1=new BankAccounts();
	 BankAccounts ba2=new BankAccounts("Kartikey Gupta",1234567890,1234567457,"Current");

	 ba2.display();
	 ba1.avgBal(ba2,ba1);
	 ba2.withdrawl(5000000);
	 ba2.deposit(5000000);
	 ba1.totalDep();
	 ba1.totalWd();
	}

}
