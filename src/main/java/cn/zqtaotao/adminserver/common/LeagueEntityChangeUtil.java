package cn.zqtaotao.adminserver.common;

import cn.zqtaotao.adminserver.entity.League;
import cn.zqtaotao.adminserver.entity.real.LeagueEntity;

/**
 * 由于数据库中存储的字段为  大写，以此类进行转换
 */
public class LeagueEntityChangeUtil {

    /**
     * 将LeagueEntity 转换成  League
     */
    public static League changeLeagueEntityToLeague(LeagueEntity entity){
        League league = new League();

        league.setLEAGUEID(entity.getLeagueId());
        league.setCOLLEGE(entity.getCollege());
        league.setMAJOR(entity.getMajor());
        league.setCLASSNAME(entity.getClassName());
        league.setSTUDENTID(entity.getStudentId());
        league.setLNAME(entity.getLname());
        league.setSEX(entity.getSex());
        league.setDATE(entity.getDate());
        league.setIDNUMBER(entity.getIdnumber());
        league.setNATION(entity.getNation());
        league.setNATIVEPLACE(entity.getNativePlace());
        league.setPOLITICALSTATUS(entity.getPoliticalStatus());
        league.setYEARS(entity.getYears());
        league.setPLACE(entity.getPlace());
        league.setLETTER(entity.getLetter());
        league.setZHENG(entity.getZheng());
        league.setMEMBERPROFILE(entity.getMemberProfile());
        league.setPHONE(entity.getPhone());
        league.setQQ(entity.getQq());
        league.setREMARK(entity.getRemark());
        league.setREGISTER(entity.getRegister());
        league.setCREATETIME(entity.getCreateTime());
        league.setLASTEDITTIME(entity.getLastEditTime());

        return league;
    }


    /**
     *  League  转换成   将LeagueEntity
     */
    public static LeagueEntity changeLeagueToLeagueEntity(League league){
        LeagueEntity entity = new LeagueEntity();

        entity.setLeagueId(league.getLEAGUEID());
        entity.setCollege(league.getCOLLEGE());
        entity.setMajor(league.getMAJOR());
        entity.setClassName(league.getCLASSNAME());
        entity.setStudentId(league.getSTUDENTID());
        entity.setLname(league.getLNAME());
        entity.setSex(league.getSEX());
        entity.setDate(league.getDATE());
        entity.setIdnumber(league.getIDNUMBER());
        entity.setNation(league.getNATION());
        entity.setNativePlace(league.getNATIVEPLACE());
        entity.setPoliticalStatus(league.getPOLITICALSTATUS());
        entity.setYears(league.getYEARS());
        entity.setPlace(league.getPLACE());
        entity.setLetter(league.getLETTER());
        entity.setZheng(league.getZHENG());
        entity.setMemberProfile(league.getMEMBERPROFILE());
        entity.setPhone(league.getPHONE());
        entity.setQq(league.getQQ());
        entity.setRemark(league.getREMARK());
        entity.setRegister(league.getREGISTER());
        entity.setCreateTime(league.getCREATETIME());
        entity.setLastEditTime(league.getLASTEDITTIME());

        return entity;
    }
}
