package test;

import junit.framework.TestCase;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisTest extends TestCase {

    public void testMybatis0001() throws IOException {
        String sqlPath = "mybatis.xml";
        SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
        InputStream is = Resources.getResourceAsStream(sqlPath);
        SqlSessionFactory sessionFactory = sfb.build(is);
        SqlSession sqlSession = sessionFactory.openSession();

//        System.out.println(sqlSession);
        Object one = sqlSession.selectOne("suibian.selectUserById",1);
        System.out.println(one);

    }
}
