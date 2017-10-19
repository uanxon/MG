package mytest;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import com.cn.moin.pojo.User;
//import com.cn.moin.service.UserService;

import com.cn.moin.pojo.DrMember;
import com.cn.moin.service.DrMemberService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class MyTest {

	private static Logger logger = Logger.getLogger(MyTest.class);
	@Autowired
	private DrMemberService drMemberService;

	@Test
	public void test() {
		DrMember drMember = drMemberService.getDrMember();
		logger.info(drMember.getMobilephone());
	}
}