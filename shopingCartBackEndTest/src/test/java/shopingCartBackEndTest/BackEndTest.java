package shopingCartBackEndTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shopingcart.dao.CategoryDAO;
import com.niit.shopingcart.dao.UserDAO;

public class BackEndTest {

	AnnotationConfigApplicationContext context;
	UserDAO userDAO;
	CategoryDAO categoryDAO;
	
@Before
	public void init()
	{System.out.println("haii");
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shopingcart");
		context.refresh();
		System.out.println("hello");
		userDAO =(UserDAO)context.getBean("userDAO");
		categoryDAO= (CategoryDAO) context.getBean("categoryDAO");
		
		System.out.println("in");
		System.out.println(userDAO.hashCode());
		
	}

	@Test
	public void isValidUserTestCase()
	{
		assertEquals("Valid user TestCase",true,
		userDAO.isValidUser("NIIT","NIIT",true));
	}
	@Test
	public void listAllUserTestCase()
	{
		assertEquals("List Users" ,  2   ,userDAO.list().size());
	}
	@Test
	public void listAllCategoryTestCase()
	{
		assertEquals("List Categories" ,  4   ,categoryDAO.list().size());
	}

}
