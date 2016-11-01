package test.cn;

import java.io.Serializable;

public class Db2lDriver implements Serializable,DataDriver {
	private int time;
	private Person ps;
	@Override
	public boolean connect(Double time,String user,String pwd) {
		// TODO Auto-generated method stub
		System.out.println("connect to db2 database");
		return false;
	}
	public Db2lDriver(Integer time) {
		System.out.println(time);
		this.time = time;
	}
	@Override
	public boolean connect() {
		// TODO Auto-generated method stub
		return false;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	public Person getPs() {
		return ps;
	}
	public void setPs(Person ps) {
		this.ps = ps;
	}
	

}
