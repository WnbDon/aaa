package test.cn;

import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;
 
public class HelloWorld {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub 
	try {
		InputStream fi =HelloWorld.class.getResourceAsStream("config.cfg");
		Properties prop = new Properties();
		prop.load(fi); 
		String className  = prop.getProperty("userName"); 
		System.out.println(className);
		/*
		DataDriver driver = (DataDriver) Class.forName(className).newInstance();
		Class cls =Class.forName(className);
		Constructor con = cls.getConstructor(Integer.class); 
		DataDriver dr = (DataDriver) con.newInstance(10);
		
		Method method =cls.getMethod("connect",Double.class,String.class,String.class);
		method.invoke(dr, 20.0,"sa","sa");//dr.connect(20,"sa","sa");
		DataDriver dr1 = new SqlDriver();
		
		DataDriver dr2 ;
		dr2=dr1; */
		
		
    	/*Db2lDriver d1 =new Db2lDriver(10);
		Person p=new Person("tommy",20);
		d1.setPs(p);
		
		Field fd = Person.class.getDeclaredField("age");
		fd.setAccessible(true);
		fd.setDouble(p, 200.0);;
		System.out.println(fd.getDouble(p));
		
		byte[] buff=new byte[1024];
		
		ByteArrayOutputStream bi =new ByteArrayOutputStream();
		
		ObjectOutputStream oi = new ObjectOutputStream(bi);
		
		oi.writeObject(d1);
		InputStream in = new ByteArrayInputStream(bi.toByteArray());
		ObjectInputStream ois= new ObjectInputStream(in);
		Db2lDriver d2 = (Db2lDriver) ois.readObject();
		System.out.println(d2.getPs().getName());
		d2.getPs().setName("jerry");
		System.out.println(d1.getPs().getName());*/
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	} 
	 
	public   static void fn(double b,int  ...a){
		System.out.println(a[1]); 
	}
	@Test
	public void testList(){
		List<Person> ls = new LinkedList<Person>();
		ls.add(new Person("jimmy",33));
		ls.add(new Person("clinton",55));
		for(Person p:ls){
			if(p.getName().equals("jimmy")){
				System.out.println(p.getAge());
			}
		}
	}
	@Test
	public void testMap(){
		Map<String,Person> mp = new HashMap<String,Person>();
		Person p1 =new Person("jimmy",20);
		Person p2 = new Person("mary",28);
		try {
			System.out.println(BeanUtils.getProperty(p1, "age"));
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mp.put("jimmy", p1); 
		mp.put("mary", p2);
		mp.get("jimmy");
	}
}
