package cn.zqtaotao.adminserver.service;

import cn.zqtaotao.adminserver.entity.real.LeagueEntity;

public interface LeagueService {

    int addLeague(LeagueEntity LeagueEntity);
    LeagueEntity selectLeagueByStudentId(String sid);

//    int update(League league);
//
//    League selectByPrimaryKey(String key);
//
//
//    League selectByIdnumber(String IDNUMBER);
//
//    League login(League league) ;

}
