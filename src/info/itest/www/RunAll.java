package info.itest.www;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import info.itest.www.*;


@RunWith(Suite.class)
//ָ��������
@Suite.SuiteClasses({
	TestCreatePost.class,
	TestDeletePost.class,
	TestLogin.class
})

public class RunAll 
{

}
