package cn.zqtaotao.adminserver.dao.mapper;

import cn.zqtaotao.adminserver.common.UuidUtil;
import cn.zqtaotao.adminserver.entity.Excellent;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Ignore
@RunWith(SpringRunner.class)
@SpringBootTest
public class ExcellentMapperTest {

    @Autowired
    ExcellentMapper mapper;

    String EXCELLENTID = UuidUtil.get32UUID();
    String COLLEGE = "计算机与信息工程";


    @Test
    public void insert() {

        Excellent excellent = new Excellent();

        excellent.setCOLLEGE(COLLEGE);
        excellent.setEXCELLENTID(EXCELLENTID);

        System.out.println(excellent);

        int insert = mapper.insert(excellent);

        System.out.println("================================");
        System.out.println("影响行数 ： " + insert);
        System.out.println("================================");
    }

    @Test
    public void selectBySidAndIdnumber() {
        String sid = "1606915058";
        String idnumber = "411524199702033333";

        Excellent excellent = mapper.selectBySidAndIdnumber(sid, idnumber);
        System.out.println("================================");
        System.out.println(excellent);
        System.out.println("================================");
    }

}