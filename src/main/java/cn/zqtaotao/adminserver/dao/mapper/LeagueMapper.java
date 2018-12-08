package cn.zqtaotao.adminserver.dao.mapper;

import cn.zqtaotao.adminserver.dao.annotation.MybatisDao;
import cn.zqtaotao.adminserver.entity.League;

@MybatisDao
public interface LeagueMapper {

    // 新增
    int insert(League league);

    // 通过学号查询
    League selectByStudentId(String sid);

    League selectBySidAndIdnumber(String sid, String idnumber);


    // 通过身份证查询
//    League selectByIdnumber(String idnumber);

//    int update(LeagueEntity record);
//

//
//    League selectByPrimaryKey(String key);


}
