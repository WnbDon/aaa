package test.cn;

public class SqlDriver implements DataDriver {

	@Override
	public boolean connect() {
		// TODO Auto-generated method stub
		System.out.println("connect to sql database");
		return false;
	}

	@Override
	public boolean connect(Double time, String user, String pwd) {
		// TODO Auto-generated method stub
		return false;
	}

	public SqlDriver() { 
		System.out.println("construct sqlDriver...");
		// TODO Auto-generated constructor stub
	}

}
