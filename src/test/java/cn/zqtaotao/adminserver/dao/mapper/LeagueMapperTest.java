package cn.zqtaotao.adminserver.dao.mapper;

import cn.zqtaotao.adminserver.common.LeagueEntityChangeUtil;
import cn.zqtaotao.adminserver.entity.League;
import cn.zqtaotao.adminserver.entity.real.LeagueEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LeagueMapperTest {


    String leagueId = "5";
    String college = "计算机与信息工程";
    String major = "计算机科学与技术";
    String className = "计科2班";
    String studentId = "1606915055";
    String lname = "恩超";
    String sex = "女";
    String date = "1997-10-12";
    String idnumber = "411524133202033612";
    String nation = "汉族·";
    String nativePlace = "北京 东城区";
    String politicalStatus = "团员";
    String years = "2018-01-02";
    String place = "南阳理工学院";
    String letter = "有";
    String zheng = "有";
    String memberProfile = "有";
    String phone = "15139081588";
    String qq = "453395685";
    String remark = "班长";
    String register = "是";
    String createTime = "2018-09-09";
    String lastEditTime = "2018-10-10";


    @Autowired
    LeagueMapper mapper;


//    @Test
//    public void insert() {
//
//        League league = new League();
//        league.setCOLLEGE("ggddd");
//        int insert = mapper.insert(league);
//
//
//        System.out.println("================================");
//        System.out.println("影响行数 ： " + insert);
//        System.out.println("================================");
//    }


    @Test
    public void insert() {
        LeagueEntity entity = new LeagueEntity();
        entity.setLeagueId(leagueId);
        entity.setCollege(college);
        entity.setMajor(major);
        entity.setClassName(className);
        entity.setStudentId(studentId);
        entity.setLname(lname);
        entity.setSex(sex);
        entity.setDate(date);
        entity.setIdnumber(idnumber);
        entity.setNation(nation);
        entity.setNativePlace(nativePlace);
        entity.setPoliticalStatus(politicalStatus);
        entity.setYears(years);
        entity.setPlace(place);
        entity.setLetter(letter);
        entity.setZheng(zheng);
        entity.setMemberProfile(memberProfile);
        entity.setPhone(phone);
        entity.setQq(qq);
        entity.setRemark(remark);
        entity.setRegister(register);
        entity.setCreateTime(createTime);
        entity.setLastEditTime(lastEditTime);

        League league = LeagueEntityChangeUtil.changeLeagueEntityToLeague(entity);
        int insert = mapper.insert(league);

        System.out.println("================================");
        System.out.println("影响行数 ： " + insert);
        System.out.println("================================");

    }

}