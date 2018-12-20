package cn.zqtaotao.adminserver.service.impl;

import cn.zqtaotao.adminserver.common.ExcellentEntityChangeUtil;
import cn.zqtaotao.adminserver.dao.mapper.ExcellentMapper;
import cn.zqtaotao.adminserver.entity.Excellent;
import cn.zqtaotao.adminserver.entity.real.ExcellentEntity;
import cn.zqtaotao.adminserver.service.ExcellentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ExcellentServiceImpl implements ExcellentService {

    private final ExcellentMapper mapper;

    @Autowired
    public ExcellentServiceImpl(ExcellentMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public int addExcellent(ExcellentEntity excellentEntity) {

        Excellent db_excellent = mapper.selectBySidAndIdnumber(excellentEntity.getStudentId(), excellentEntity.getIdnumber());
        if (db_excellent != null) return 0;
        Excellent excellent = ExcellentEntityChangeUtil.changeExcellentEntityToExcellent(excellentEntity);
        return mapper.insert(excellent);
    }

    @Override
    public ExcellentEntity selectExcellentByStudentId(String sid) {
        Excellent excellent = mapper.selectByStudentId(sid);
        if (excellent == null) return null;
        return ExcellentEntityChangeUtil.changeExcellentToExcellentEntity(excellent);
    }
}
