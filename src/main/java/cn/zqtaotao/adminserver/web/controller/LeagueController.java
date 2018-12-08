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
     * @param sid
     * @return
     */
    @RequestMapping(value = "/selectleaguebyid")
    public RespBean selectLeagueById(String sid){

        LeagueEntity entity = leagueService.selectLeagueByStudentId(sid);

        if (entity != null){
            return RespBean.ok("success", entity);
        }
        return RespBean.error("false");
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

   /* @RequestMapping(value = "/emp", method = RequestMethod.POST)
    public RespBean addEmp(Employee employee) {
        if (empService.addEmp(employee) == 1) {
            List<Position> allPos = positionService.getAllPos();
            for (Position allPo : allPos) {
                if (allPo.getId() == employee.getPosId()) {
                    employee.setPosName(allPo.getName());
                }
            }
            executorService.execute(new EmailRunnable(employee,
                    javaMailSender, templateEngine));
            return RespBean.ok("添加成功!");
        }
        return RespBean.error("添加失败!");
    }*/
    @RequestMapping(value = "/test")
    public RespBean test(@RequestBody LeagueEntity entity){
        System.out.println(entity);
        return RespBean.ok("success");
    }


//    /**
//     * 新增
//     */
//    @RequestMapping(value="/insert")
//    public ModelAndView insert(League league){
//        ModelAndView mv = new ModelAndView();
//
//        league.setLEAGUEID(UuidUtil.get32UUID());
//        System.out.println(league);
//
//        try {
//            leagueService.insert(league);
//            mv.addObject("msg","保存成功！！！！");
//        }catch (RuntimeException e){
//            mv.addObject("msg",e.getMessage());
//        }
//
//        mv.setViewName("test");
//        return mv;
//    }
//


//
//    /**
//     * 修改信息
//     */
//    @RequestMapping(value="/update")
//    public ModelAndView update(League league){
//        ModelAndView mv = new ModelAndView();
//        System.out.println(league);
//
//        try {
//            leagueService.update(league);
//            mv.addObject("msg","修改成功！！！！");
//        }catch (RuntimeException e){
//            mv.addObject("msg",e.getMessage());
//        }
//
//        mv.setViewName("test");
//        return mv;
//    }


//    /**
//     * 登陆
//     */
//    @RequestMapping(value="/login")
//    public ModelAndView login(League league, @RequestParam(value = "to") String to){
//        ModelAndView mv = new ModelAndView();
//
//        System.out.println("身份证"+league.getIDNUMBER());
//        System.out.println("用户名"+league.getLNAME());
//        System.out.println("跳转的页面" + to);
//        try {
//            League db_league = leagueService.login(league);
//            mv.addObject("db_league",db_league);
//            mv.addObject("msg","登陆成功");
//            System.out.println("LeagueController.login");
//            mv.setViewName(to);
//            System.out.println("走了");
//        }catch (RuntimeException e){
//            System.out.println("错误："+ e.getMessage());
//            if (e.getMessage() != null){
//                mv.addObject("msg",e.getMessage());
//            }else {
//                mv.addObject("msg","something wrong");
//            }
//
//            mv.setViewName("test");
//            System.out.println("错误走了");
//        }
//
//        return mv;
//    }

}
