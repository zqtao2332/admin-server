package cn.zqtaotao.adminserver.service;

import cn.zqtaotao.adminserver.entity.real.DevelopEntity;

public interface DevelopService {

    int addDevelop(DevelopEntity developEntity);

    DevelopEntity selectLeagueByStudentId(String sid);
}
