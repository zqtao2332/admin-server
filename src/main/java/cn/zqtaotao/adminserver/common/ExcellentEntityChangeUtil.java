package cn.zqtaotao.adminserver.common;

import cn.zqtaotao.adminserver.entity.Excellent;
import cn.zqtaotao.adminserver.entity.real.ExcellentEntity;

public class ExcellentEntityChangeUtil {

    public static Excellent changeExcellentEntityToExcellent(ExcellentEntity entity){
        Excellent excellent = new Excellent();

        excellent.setEXCELLENTID(entity.getExcellentId());
        excellent.setCOLLEGE(entity.getCollege());
        excellent.setMAJOR(entity.getMajor());
        excellent.setCLASSNAME(entity.getClassName());
        excellent.setSTUDENTID(entity.getStudentId());
        excellent.setLNAME(entity.getLname());
        excellent.setSEX(entity.getSex());
        excellent.setDATE(entity.getDate());
        excellent.setIDNUMBER(entity.getIdnumber());
        excellent.setNATION(entity.getNation());
        excellent.setNATIVEPLACE(entity.getNativePlace());
        excellent.setPOLITICALSTATUS(entity.getPoliticalStatus());
        excellent.setYEARS(entity.getYears());
        excellent.setADTIME(entity.getAdtime());
        excellent.setHONOR(entity.getHonor());
        excellent.setYESORNOT(entity.getYesOrNot());
        excellent.setPHONE(entity.getPhone());
        excellent.setQQ(entity.getQq());
        excellent.setSUM(entity.getSum());
        excellent.setREMARK(entity.getRemark());
        excellent.setCREATETIME(entity.getCreateTime());
        excellent.setLASTEDITTIME(entity.getLastEditTime());

        return excellent;

    }

    public static ExcellentEntity changeExcellentToExcellentEntity(Excellent excellent){

        ExcellentEntity entity = new ExcellentEntity();

        entity.setExcellentId(excellent.getEXCELLENTID());
        entity.setCollege(excellent.getCOLLEGE());
        entity.setMajor(excellent.getMAJOR());
        entity.setClassName(excellent.getCLASSNAME());
        entity.setStudentId(excellent.getSTUDENTID());
        entity.setLname(excellent.getLNAME());
        entity.setSex(excellent.getSEX());
        entity.setDate(excellent.getDATE());
        entity.setIdnumber(excellent.getIDNUMBER());
        entity.setNation(excellent.getNATION());
        entity.setNativePlace(excellent.getNATIVEPLACE());
        entity.setPoliticalStatus(excellent.getPOLITICALSTATUS());
        entity.setYears(excellent.getYEARS());
        entity.setAdtime(excellent.getADTIME());
        entity.setHonor(excellent.getHONOR());
        entity.setYesOrNot(excellent.getYESORNOT());
        entity.setPhone(excellent.getPHONE());
        entity.setQq(excellent.getQQ());
        entity.setSum(excellent.getSUM());
        entity.setRemark(excellent.getREMARK());
        entity.setCreateTime(excellent.getCREATETIME());
        entity.setLastEditTime(excellent.getLASTEDITTIME());

        return entity;
    }
}
