package cn.zqtaotao.adminserver.service.impl;

import cn.zqtaotao.adminserver.common.DevelopEntityChangeUtil;
import cn.zqtaotao.adminserver.dao.mapper.DevelopMapper;
import cn.zqtaotao.adminserver.entity.Develop;
import cn.zqtaotao.adminserver.entity.real.DevelopEntity;
import cn.zqtaotao.adminserver.service.DevelopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DevelopServiceImpl implements DevelopService {

    private final DevelopMapper mapper;

    @Autowired
    public DevelopServiceImpl(DevelopMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int addDevelop(DevelopEntity developEntity) {

        Develop db_develop = mapper.selectBySidAndIdnumber(developEntity.getStudentId(), developEntity.getIdnumber());
        if (db_develop != null) return 0;

        Develop develop = DevelopEntityChangeUtil.changeDevelopEntityToDevelop(developEntity);
        return mapper.insert(develop);
    }

    @Override
    public DevelopEntity selectLeagueByStudentId(String sid) {

        Develop develop = mapper.selectByStudentId(sid);
        if (develop == null) return null;
        return DevelopEntityChangeUtil.changeDevelopToDevelopEntity(develop);
    }
}
