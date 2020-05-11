package bean;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoginDaoTest {
	@Test
	public void validateTest() {
		LoginBean bean=new LoginBean();
		bean.setEmail("manish");
		bean.setPass("password");
		assertEquals("manish",bean.getEmail());
		assertEquals("password", bean.getPass());
	}

}
