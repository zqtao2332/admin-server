package cn.zqtaotao.adminserver.dao.mapper;

import cn.hutool.core.lang.UUID;
import cn.zqtaotao.adminserver.entity.Develop;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DevelopMapperTest {

    @Autowired
    DevelopMapper mapper;

    String DEVELOPID = UUID.randomUUID().toString();
    String COLLEGE = "计算机与信息工程";
    String MAJOR = "计算机科学与技术";
    String CLASSNAME = "计科2班";
    String STUDENTID = "1606915058";
    String LNAME = "彭超";
    String SEX = "男";
    String DATE = "1997-09-09";
    String IDNUMBER = "411524199702033333";
    String NATION = "满族";
    String NATIVEPLACE = "河南 南阳";
    String APPLYTIME = "1997-09-09";
    String TIME = "2018-08-08";
    String HONOR = "无";
    String SUM = "5";
    String PHONE = "15139081588";
    String QQ = "453395854";
    String REMARK = "无";
    String CREATETIME = "2018-05-06";
    String LASTEDITTIME = "2018-12-08";

    @Test
    public void insert() {
        Develop develop = new Develop();

        develop.setCOLLEGE(COLLEGE);
        develop.setMAJOR(MAJOR);
        develop.setCLASSNAME(CLASSNAME);
        develop.setSTUDENTID(STUDENTID);
        develop.setLNAME(LNAME);
        develop.setSEX(SEX);
        develop.setDATE(DATE);
        develop.setIDNUMBER(IDNUMBER);
        develop.setNATION(NATION);
        develop.setNATIVEPLACE(NATIVEPLACE);
        develop.setAPPLYTIME(APPLYTIME);
        develop.setTIME(TIME);
        develop.setHONOR(HONOR);
        develop.setSUM(SUM);
        develop.setPHONE(PHONE);
        develop.setQQ(QQ);
        develop.setREMARK(REMARK);
        develop.setDEVELOPID(DEVELOPID);
        develop.setCREATETIME(CREATETIME);
        develop.setLASTEDITTIME(LASTEDITTIME);

        System.out.println(develop);

        int insert = mapper.insert(develop);

        System.out.println("================================");
        System.out.println("影响行数 ： " + insert);
        System.out.println("================================");
    }

    String sid = "1606915058";
    String idnumber = "411524199702033333";

    @Test
    public void selectBySidAndIdnumber() {
        Develop develop = mapper.selectBySidAndIdnumber(sid, idnumber);
        System.out.println(develop);
    }
}