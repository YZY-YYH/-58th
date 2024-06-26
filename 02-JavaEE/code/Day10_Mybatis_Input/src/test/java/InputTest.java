import com.cskaoyan.th58.bean.Account;
import com.cskaoyan.th58.bean.Salary;
import com.cskaoyan.th58.mapper.SalaryMapper;
import com.cskaoyan.th58.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class InputTest {

    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SalaryMapper salaryMapper = sqlSession.getMapper(SalaryMapper.class);
        Salary salary = salaryMapper.selectOneById(4);
        System.out.println(salary);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SalaryMapper salaryMapper = sqlSession.getMapper(SalaryMapper.class);
        Salary salary = salaryMapper.selectOneById2(4);
        System.out.println(salary);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test3(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SalaryMapper salaryMapper = sqlSession.getMapper(SalaryMapper.class);
        Salary salary = salaryMapper.selectByNameAndSalary("空灵", 12000.0);
        System.out.println(salary);
        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void test4(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SalaryMapper salaryMapper = sqlSession.getMapper(SalaryMapper.class);
        Salary salary = new Salary();
        salary.setName("阿齐");
        salary.setSalary(12000.0);
        salaryMapper.insertOne(salary);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test5(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SalaryMapper salaryMapper = sqlSession.getMapper(SalaryMapper.class);
        Salary salary = new Salary();
        salary.setName("阿齐");
        salary.setSalary(12000.0);
        salaryMapper.insertOne2(salary);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test6(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SalaryMapper salaryMapper = sqlSession.getMapper(SalaryMapper.class);
        Salary salary = new Salary();
        salary.setName("阿齐");
        Account account = new Account();
        account.setMoney(20000.0);
        salaryMapper.insertOne3(salary, account);
        sqlSession.commit();
        sqlSession.close();
    }

    //map维护起来会非常的艰难，建议大家不要去使用map
    @Test
    public void test7(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SalaryMapper salaryMapper = sqlSession.getMapper(SalaryMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("username", "admin123");
        map.put("money", 2000.0);
        salaryMapper.insertOne4(map);
        sqlSession.commit();
        sqlSession.close();
    }
}
