package com.yuxia.test;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.yuxia.entity.User;
import com.yuxia.mapper.UserMapper;

public class SelectUserTest {
	private static SqlSessionFactory factory;

	@Before
	public void init() {
		try {
			String res = "res/mybatis-config.xml";
			// 获取文件mybatis-config.xml的输入流
			InputStream is = new FileInputStream(res);
			// 创建SqlSessionFactory对象
			factory = new SqlSessionFactoryBuilder().build(is);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 官方推荐使用的方法 在mapper.xml中使用namespace和接口绑定
	 */
	@Test
	public void selectUsertest() {
		// 创建SqlSession对象
		SqlSession sqlSession = factory.openSession();// 可以传一个boolean的参数，autocommit,是否自动提交事务
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		mapper.selectUser(2);
		sqlSession.close();
	}

	@Test
	public void selectAll() {
		SqlSession sqlSession = null;
		sqlSession = factory.openSession();
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		mapper.selectAll();
		// 关闭sqlSession
		sqlSession.close();
	}

	/**
	 * 老版本mybatis使用的方法，不推荐使用 namespace+id
	 * 例：com.yuxia.mapper.UserMapper.selectUser
	 */
	@Test
	public void test() {
		SqlSession sqlSession = factory.openSession();
		sqlSession.selectOne("com.yuxia.mapper.UserMapper.selectUser", 2);
		// 关闭sqlSession
		sqlSession.close();
	}
}
