package com.lyh.itms;

import java.util.Date;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lyh.itms.dao.UserDao;
import com.lyh.itms.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring.xml")
public class UserDaoTest {

	@Autowired
	private UserDao userdao;
	
	@Test
	public void testInsert() {
		User user = new User();
		user.setId(UUID.randomUUID().toString());
		user.setName("name");
		user.setAge(22);
		user.setAddr("通州");
		user.setTel("123456");
		user.setCreateTime(new Date());
		
		userdao.insert(user);
	}

}
