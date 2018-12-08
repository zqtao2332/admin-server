package cn.zqtaotao.adminserver.common;

import cn.zqtaotao.adminserver.entity.Develop;
import cn.zqtaotao.adminserver.entity.real.DevelopEntity;

public class DevelopEntityChangeUtil {

    public static Develop changeDevelopEntityToDevelop(DevelopEntity entity){
        Develop develop = new Develop();
        if (entity == null) return null;

        develop.setCOLLEGE(entity.getCollege());
        develop.setMAJOR(entity.getMajor());
        develop.setCLASSNAME(entity.getClassName());
        develop.setSTUDENTID(entity.getStudentId());
        develop.setLNAME(entity.getLname());
        develop.setSEX(entity.getSex());
        develop.setDATE(entity.getDate());
        develop.setIDNUMBER(entity.getIdnumber());
        develop.setNATION(entity.getNation());
        develop.setNATIVEPLACE(entity.getNativePlace());
        develop.setAPPLYTIME(entity.getApplyTime());
        develop.setTIME(entity.getTime());
        develop.setHONOR(entity.getHonor());
        develop.setSUM(entity.getSum());
        develop.setPHONE(entity.getPhone());
        develop.setQQ(entity.getQq());
        develop.setREMARK(entity.getRemark());
        develop.setDEVELOPID(entity.getDevelopId());
        develop.setCREATETIME(entity.getCreateTime());
        develop.setLASTEDITTIME(entity.getLastEditTime());

        return develop;
    }

    public static DevelopEntity changeDevelopToDevelopEntity(Develop develop){
        DevelopEntity entity = new DevelopEntity();
        if (develop == null) return null;

        entity.setCollege(develop.getCOLLEGE());
        entity.setMajor(develop.getMAJOR());
        entity.setClassName(develop.getCLASSNAME());
        entity.setStudentId(develop.getSTUDENTID());
        entity.setLname(develop.getLNAME());
        entity.setSex(develop.getSEX());
        entity.setDate(develop.getDATE());
        entity.setIdnumber(develop.getIDNUMBER());
        entity.setNation(develop.getNATION());
        entity.setNativePlace(develop.getNATIVEPLACE());
        entity.setApplyTime(develop.getAPPLYTIME());
        entity.setTime(develop.getTIME());
        entity.setHonor(develop.getHONOR());
        entity.setSum(develop.getSUM());
        entity.setPhone(develop.getPHONE());
        entity.setQq(develop.getQQ());
        entity.setRemark(develop.getREMARK());
        entity.setDevelopId(develop.getDEVELOPID());
        entity.setCreateTime(develop.getCREATETIME());
        entity.setLastEditTime(develop.getLASTEDITTIME());


        return entity;
    }
}
