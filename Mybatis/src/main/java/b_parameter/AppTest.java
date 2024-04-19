package b_parameter;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class AppTest {
	@Test
	public void testSave() throws Exception {
	
		SqlSession  s=MybatisUtil.openSession();
//		User user=new User();
//		user.setName("≈›‚…");
//		user.setBirthday(new Date());
//		user.setMoney(555d);
		//Foo foo=new Foo(11,"ÀÆ≈Ë",new Date(),25d);
		Map<String,Object> map=new HashMap<>();
		map.put("id",14);
		map.put("name","÷©÷Îœ¿");
		map.put("birthday",new Date());
		map.put("money",87d);
		s.insert("a_hello.UserMapper.save",map);
		//s.commit();
		s.close();
		
	}
	@Test
	public void testUpdate() throws Exception {
		
		SqlSession  s=MybatisUtil.openSession();
		User user=new User();
		user.setId(91);
		user.setName("–°∫Ï");
		user.setBirthday(new Date());
		user.setMoney(999d);
		s.update("a_hello.UserMapper.update",user);
		s.commit();
		s.close();
		
	}
	@Test
	public void testDelete() throws Exception {
	
		
		SqlSession  s=MybatisUtil.openSession();
		s.delete("a_hello.UserMapper.delete",1);
		s.commit();
		s.close();
	}
	
	@Test
	public void testFindAll() throws Exception {
		SqlSession  s=MybatisUtil.openSession();
		List<User> list=s.selectList("a_hello.UserMapper.findAll");
		  for (User user : list) {
			System.out.println(user);
		}
		s.commit();
		s.close();
	}
	@Test
	public void testFindOne() throws Exception {
		
		SqlSession  s=MybatisUtil.openSession();
		User user=(User) s.selectOne("a_hello.UserMapper.findOne",3);
		  System.out.println(user);
		s.commit();
		s.close();
	}
}
