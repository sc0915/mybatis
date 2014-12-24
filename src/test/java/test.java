import com.shinowit.dao.mapper.SexInfoMapper;
import com.shinowit.dao.mapper.StuInfoMapper;
import com.shinowit.dao.mapper.TeaInfoMapper;
import com.shinowit.model.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by SC on 2014/12/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:application-context.xml" })
public class test extends AbstractJUnit4SpringContextTests {

    @Resource
    private TeaInfoMapper tea_dao;

    @Resource
    private StuInfoMapper stu_dao;

    @Resource
    private SexInfoMapper sex_dao;

    @Test
    public void test1(){
        TeaInfo tea=new TeaInfo();

        tea.setTeaId("004");

        tea.setTeaName("王老师");

        tea_dao.insert(tea);

       // Assert.assertTrue(i==1);
    }

    @Test
    public void test2(){
        TeaInfoExample ex=new TeaInfoExample();
        TeaInfoExample.Criteria tc=ex.createCriteria();
        tc.andTeaIdEqualTo("001");
        List<TeaInfo> tea=tea_dao.selectByExample(ex);
        for(TeaInfo t:tea){
            System.out.println(t.getTeaName());
        }
    }

    @Test
    public void test3(){
        StuInfo stu=stu_dao.selectByPrimaryKey("1");
        System.out.println(stu.getSexInfo().getSexType());
    }

    @Test
    public void test4(){
        SexInfo sex=sex_dao.selectByPrimaryKey("1");
        for (StuInfo stu:sex.getStuList()){
            System.out.println(stu.getStuName());
        }
    }

    @Test
    public void test5(){
        StuInfoExample se=new StuInfoExample();
        se.createCriteria().andSexIdEqualTo("1");
        List<StuInfo> stulist=stu_dao.selectStuWithSexTypeByPrimaryKey(se);
        System.out.println(stulist.get(0).getSexInfo().getSexType());
    }



}
