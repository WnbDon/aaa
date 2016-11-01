package wnb;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Reader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

import test.cn.Db2lDriver;
import test.cn.Person;

public class HelloWorld_13 {
public static void main(String args[]) 
		throws IOException, InstantiationException, IllegalAccessException,
ClassNotFoundException, NoSuchMethodException,
SecurityException, IllegalArgumentException, 
InvocationTargetException, NoSuchFieldException
{
//	System.out.println("Hello World");
	InputStream in=new FileInputStream
			("C:/Users/zoe/workspace/wnb/src/wnb/config.cfg");
	//此函数需要绝对路径
	/*InputStream in=new FileInputStream("config.cfg");
	//相对路径会报错
*/	
	//注意双引号内路径不能有空格，不然会报文件路径不对。
	Reader r=new InputStreamReader(in);
	BufferedReader buf=new BufferedReader(r);
	System.out.println(buf.read());
	 buf.mark(0);
	//System.out.println()
	String[] s=buf.readLine().split("=");
	/*split() 方法 将一个字符串分割为子字符串，
	然后将结果作为字符串数组返回
*/	
	System.out.println(s[1]);
	buf.reset();
	//mark（） 与rest（）是一对，mark 做好标记，rest回到标记处
	System.out.println(buf.readLine());
	
	//下面方法是利用属性文件来查找所需的内容
	InputStream fi=HelloWorld_13.
			class.getResourceAsStream("config.cfg");
	//getResourceAsStream("config.cfg");函数用相对路径
	Properties prop=new Properties();
	prop.load(fi);
    String password=prop.getProperty("password");	
	System.out.println(password);
	
	/*String className  = prop.getProperty("userName");
	DataDriver_13 driver = (DataDriver_13) 
			Class.forName(className).newInstance();
	Class cls =Class.forName(className);
	Constructor con = cls.getConstructor(Integer.class);
	DataDriver_13 dr = (DataDriver_13) con.newInstance(10);
	Method method =cls.getMethod(""
	+ "connect",Double.class,String.class,String.class);
	method.invoke(dr, 20.0,"sa","sa");
	DataDriver_13 dr1 = new SqlDriver_13();
	*/
	Db2lDriver d1=new Db2lDriver(10);
	Person p=new Person("tommy",20);
	d1.setPs(p);
	
	Field fd = Person.class.getDeclaredField("age");
	fd.setAccessible(true);
	fd.setDouble(p, 200.0);;
	System.out.println(fd.getDouble(p));
	byte[] buff=new byte[1024];
	
	ByteArrayOutputStream bi =new ByteArrayOutputStream();
	
	ObjectOutputStream oi =new ObjectOutputStream(bi);
	
	oi.writeObject(d1);
	InputStream in_1 = new ByteArrayInputStream(bi.toByteArray());
	ObjectInputStream ois= new ObjectInputStream(in_1);
	Db2lDriver d2 = (Db2lDriver) ois.readObject();
	System.out.println(d2.getPs().getName());
	d2.getPs().setName("jerry");
	System.out.println(d1.getPs().getName());
}
}
