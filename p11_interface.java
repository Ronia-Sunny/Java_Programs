package Day3programs;
//in interface everything has to be abstract methods

interface customer
{
	int a = 10;
	static final int b= 10;
	public void deposit();
}

interface transaction
{
	public void withdraw();
}

class bank implements customer, transaction
{
	public void withdraw()
	{
		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}
}
public class p11_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
