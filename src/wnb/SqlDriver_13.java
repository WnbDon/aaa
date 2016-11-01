package wnb;

public class SqlDriver_13 implements DataDriver_13{

	@Override
	public boolean connect() {
		// TODO Auto-generated method stub
		System.out.println("connect to sql database");
		return false;
	}

	@Override
	public boolean connect(double time, String user, String pwd) {
		// TODO Auto-generated method stub
		return false;
	}
	public SqlDriver_13() { 
		System.out.println("construct sqlDriver...");
		// TODO Auto-generated constructor stub
	}


}
