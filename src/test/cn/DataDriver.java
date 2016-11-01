package test.cn;

public interface DataDriver {
	boolean connect();
	boolean connect(Double time,String user,String pwd);
}
