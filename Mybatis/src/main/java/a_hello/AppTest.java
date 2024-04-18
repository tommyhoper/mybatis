package a_hello;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class AppTest {
	@Test
	public void testSave() throws Exception {
		//加载主配置
		InputStream in=AppTest.class.getResourceAsStream("mybatis-config.xml");
		//创建工厂
		SqlSessionFactory sf=new SqlSessionFactoryBuilder().build(in);
		
		SqlSession s=sf.openSession(true);
		
		User user=new User();
		user.setName("小笼包");
		user.setBirthday(new Date());
		user.setMoney(222d);
		s.insert("a_hello.UserMapper.save",user);
		//s.commit();
		s.close();
		
	}
	@Test
	public void testUpdate() throws Exception {
		//加载主配置
		InputStream in=AppTest.class.getResourceAsStream("mybatis-config.xml");
		//创建工厂
		SqlSessionFactory sf=new SqlSessionFactoryBuilder().build(in);
		
		SqlSession s=sf.openSession();
		
		User user=new User();
		user.setId(91);
		user.setName("小红");
		user.setBirthday(new Date());
		user.setMoney(999d);
		s.update("a_hello.UserMapper.update",user);
		s.commit();
		s.close();
		
	}
	@Test
	public void testDelete() throws Exception {
		//加载主配置
		InputStream in=AppTest.class.getResourceAsStream("mybatis-config.xml");
		//创建工厂
		SqlSessionFactory sf=new SqlSessionFactoryBuilder().build(in);
		
		SqlSession s=sf.openSession();
		
	
		s.delete("a_hello.UserMapper.delete",1);
		s.commit();
		s.close();
	}
	
	@Test
	public void testFindAll() throws Exception {
		InputStream in=AppTest.class.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sf=new SqlSessionFactoryBuilder().build(in);
		SqlSession s=sf.openSession();
		List<User> list=s.selectList("a_hello.UserMapper.findAll");
		  for (User user : list) {
			System.out.println(user);
		}
		s.commit();
		s.close();
	}
	@Test
	public void testFindOne() throws Exception {
		InputStream in=AppTest.class.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sf=new SqlSessionFactoryBuilder().build(in);
		SqlSession s=sf.openSession();
		
		User user=(User) s.selectOne("a_hello.UserMapper.findOne",3);
		  System.out.println(user);
		s.commit();
		s.close();
	}
}
