package cn.zqtaotao.adminserver.web.controller;

import cn.zqtaotao.adminserver.common.DateUtils;
import cn.zqtaotao.adminserver.common.UuidUtil;
import cn.zqtaotao.adminserver.entity.RespBean;
import cn.zqtaotao.adminserver.entity.real.DevelopEntity;
import cn.zqtaotao.adminserver.service.DevelopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/develop")
public class DevelopController {

    private final DevelopService service;

    @Autowired
    public DevelopController(DevelopService service) {
        this.service = service;
    }

    @RequestMapping(value = "/selectdevelopbysid")
    public RespBean selectDevelopById(String sid){

        DevelopEntity entity = service.selectDevelopByStudentId(sid);

        if (entity == null){
            return RespBean.error("false");
        }
        return RespBean.ok("success", entity);
    }

    @RequestMapping(value = "/addnewdevelop", method = RequestMethod.POST)
    public RespBean addNewDevelop(@RequestBody DevelopEntity entity) {

        // 设置ID
        entity.setDevelopId(UuidUtil.get32UUID());
        entity.setCreateTime(DateUtils.getDate());
        entity.setLastEditTime(DateUtils.getDate());

        int effectNum = service.addDevelop(entity);
        if (effectNum == 1) {
            return RespBean.ok("添加成功", effectNum);
        }
        return RespBean.error("添加失败!");
    }

}
