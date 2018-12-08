package cn.zqtaotao.adminserver.service.impl;

import cn.zqtaotao.adminserver.common.LeagueEntityChangeUtil;
import cn.zqtaotao.adminserver.dao.mapper.LeagueMapper;
import cn.zqtaotao.adminserver.entity.League;
import cn.zqtaotao.adminserver.entity.real.LeagueEntity;
import cn.zqtaotao.adminserver.service.LeagueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LeagueServiceImpl implements LeagueService {

    private final LeagueMapper leagueMapper;

    @Autowired
    public LeagueServiceImpl(LeagueMapper leagueMapper) {
        this.leagueMapper = leagueMapper;
    }

    @Override
    public int addLeague(LeagueEntity LeagueEntity) {

        League db_league = leagueMapper.selectBySidAndIdnumber(LeagueEntity.getStudentId(), LeagueEntity.getIdnumber());
        System.out.println("数据库查询结果：" + db_league);
        if (db_league != null) return 0;
        League league = LeagueEntityChangeUtil.changeLeagueEntityToLeague(LeagueEntity);
        int effectedNum = leagueMapper.insert(league);
        return effectedNum;
    }

    @Override
    public LeagueEntity selectLeagueByStudentId(String sid) {
        League db_league = leagueMapper.selectByStudentId(sid);

        System.out.println(db_league);

        if (db_league == null) return null;
        return LeagueEntityChangeUtil.changeLeagueToLeagueEntity(db_league);
    }

}
