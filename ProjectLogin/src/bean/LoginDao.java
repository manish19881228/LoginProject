package bean;  
public class LoginDao {  
  
public static boolean validate(LoginBean bean){  
System.out.println(bean.getEmail());
System.out.println(bean.getPass());
if("manish".equals(bean.getEmail()) && "password".equals(bean.getPass()))
{
	System.out.println("true");
return true;	
}
else
{
	System.out.println("false");
	return false;
}
}
}