package cn.zqtaotao.adminserver.dao.mapper;

import cn.zqtaotao.adminserver.dao.annotation.MybatisDao;
import cn.zqtaotao.adminserver.entity.Develop;

@MybatisDao
public interface DevelopMapper {

    // 新增
    int insert(Develop develop);
    Develop selectBySidAndIdnumber(String sid, String idnumber);
    // 通过学号查询
    Develop selectByStudentId(String sid);
}
