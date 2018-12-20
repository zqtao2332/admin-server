package cn.zqtaotao.adminserver.web.controller;


import cn.zqtaotao.adminserver.common.DateUtils;
import cn.zqtaotao.adminserver.common.UuidUtil;
import cn.zqtaotao.adminserver.entity.RespBean;
import cn.zqtaotao.adminserver.entity.real.LeagueEntity;
import cn.zqtaotao.adminserver.service.LeagueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/league")
public class LeagueController {

    private final LeagueService leagueService;

    @Autowired
    public LeagueController(LeagueService leagueService) {
        this.leagueService = leagueService;
    }

    /**
     * 根据学号查询
     */
    @RequestMapping(value = "/selectleaguebyid")
    public RespBean selectLeagueById(String sid){

        LeagueEntity entity = leagueService.selectLeagueByStudentId(sid);

        if (entity != null){
            return RespBean.ok("success", entity);
        }
        return RespBean.error("抱歉亲，为查到您的信息噢！");
    }

    /**
     * 新增团员
     */
    @RequestMapping(value = "/addnewleague", method = RequestMethod.POST)
    public RespBean addNewLeague(@RequestBody LeagueEntity entity) {

        // 设置ID
        entity.setLeagueId(UuidUtil.get32UUID());
        entity.setCreateTime(DateUtils.getDate());
        entity.setLastEditTime(DateUtils.getDate());

        int effectNum = leagueService.addLeague(entity);
        if (effectNum == 1) {
            return RespBean.ok("添加成功", effectNum);
        }
        return RespBean.error("添加失败!");
    }


    @RequestMapping(value = "/test")
    public RespBean test(@RequestBody LeagueEntity entity){
        System.out.println(entity);
        return RespBean.ok("success");
    }


}
