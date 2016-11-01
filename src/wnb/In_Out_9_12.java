package wnb;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Properties;
import java.util.stream.Stream;

public class In_Out_9_12 {
public static void main(String args[]){
	try{
		InputStream fi=In_Out_9_12.class.getResourceAsStream("config.cfg") ;
		
		
	Properties prop=new Properties();
		prop.load(fi);
		String username=prop.getProperty("password");
		System.out.println(username);
	InputStream in=new FileInputStream
			("C:/Users/zoe/workspace/wnb/src/wnb/config.cfg");
	Reader ri=new  InputStreamReader(in);
	BufferedReader buf=new BufferedReader(ri);
	String a = buf.readLine();
	//System.out.println(ri.read());
	//System.out.println(buf.read());
	//ri.read();
	//int s=ri.read();
	//String s=ri.toString();
	//System.out.println(buf);
	//Stream<String> s1=buf.lines();
	//System.out.println(s1);
	//buf.lines();
	String[] s2=a.split("=");
	System.out.println(s2[1]);
	System.out.println(a);
	}catch(IOException e){
		e.printStackTrace();
		
	}
}

}
