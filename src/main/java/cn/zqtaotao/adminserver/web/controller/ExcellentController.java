package cn.zqtaotao.adminserver.web.controller;

import cn.zqtaotao.adminserver.common.DateUtils;
import cn.zqtaotao.adminserver.common.UuidUtil;
import cn.zqtaotao.adminserver.entity.RespBean;
import cn.zqtaotao.adminserver.entity.real.ExcellentEntity;
import cn.zqtaotao.adminserver.service.ExcellentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/excellent")
public class ExcellentController {

    private final ExcellentService service;

    @Autowired
    public ExcellentController(ExcellentService service) {
        this.service = service;
    }

    @RequestMapping(value = "/selectexcellentbysid", method = RequestMethod.GET)
    public RespBean selectExcellentBySid(String sid){

        ExcellentEntity entity = service.selectExcellentByStudentId(sid);

        if (entity == null){
            return RespBean.error("false");
        }
        return RespBean.ok("success", entity);
    }

    @RequestMapping(value = "/addnewexcellent", method = RequestMethod.POST)
    public RespBean addNewExcellent(@RequestBody ExcellentEntity entity) {

        // 设置ID
        entity.setExcellentId(UuidUtil.get32UUID());
        entity.setCreateTime(DateUtils.getDate());
        entity.setLastEditTime(DateUtils.getDate());

        int effectNum = service.addExcellent(entity);
        if (effectNum == 1) {
            return RespBean.ok("添加成功", effectNum);
        }
        return RespBean.error("添加失败!");
    }

}
