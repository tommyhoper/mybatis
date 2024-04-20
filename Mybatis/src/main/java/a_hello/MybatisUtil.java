package b_parameter;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import a_hello.AppTest;

public class MybatisUtil {
	
	private static SqlSessionFactory sf;
	static {
		//加载主配置
		InputStream in=AppTest.class.getResourceAsStream("mybatis-config.xml");
		//创建工厂
		 sf=new SqlSessionFactoryBuilder().build(in);
		
	}
	public static SqlSession openSession() {
	
		return sf.openSession(true);
	}
	
}
