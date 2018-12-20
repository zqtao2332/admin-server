package cn.zqtaotao.adminserver.service;

import cn.zqtaotao.adminserver.entity.real.ExcellentEntity;

public interface ExcellentService {

    int addExcellent(ExcellentEntity ExcellentEntity);

    ExcellentEntity selectExcellentByStudentId(String sid);
}
