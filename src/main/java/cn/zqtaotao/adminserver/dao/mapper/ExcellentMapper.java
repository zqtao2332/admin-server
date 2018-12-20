package cn.zqtaotao.adminserver.dao.mapper;

import cn.zqtaotao.adminserver.dao.annotation.MybatisDao;
import cn.zqtaotao.adminserver.entity.Excellent;

@MybatisDao
public interface ExcellentMapper {

    // 新增
    int insert(Excellent league);

    // 通过学号查询
    Excellent selectByStudentId(String sid);

    Excellent selectBySidAndIdnumber(String sid, String idnumber);
}
