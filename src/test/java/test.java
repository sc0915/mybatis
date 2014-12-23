import com.shinowit.dao.mapper.TeaInfoMapper;
import com.shinowit.model.TeaInfo;
import com.shinowit.model.TeaInfoExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by SC on 2014/12/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:application-context.xml" })
public class test extends AbstractJUnit4SpringContextTests {

    @Resource
    private TeaInfoMapper tea_dao;

    @Test
    public void test1(){
        TeaInfo tea=new TeaInfo();

        tea.setTeaId("003");

        tea.setTeaName("王老师");

        tea_dao.insert(tea);

       // Assert.assertTrue(i==1);
    }
}
