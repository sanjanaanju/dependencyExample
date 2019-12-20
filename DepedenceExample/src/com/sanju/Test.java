package com.sanju;
import com.sanju.TextEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
	public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("NewFile.xml");
	      
	      TextEditor td=  (TextEditor) context.getBean("textEditor");
	   }
	}