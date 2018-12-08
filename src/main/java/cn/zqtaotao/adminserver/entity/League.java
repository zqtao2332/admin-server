package cn.zqtaotao.adminserver.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 团员领域模型
 *
 * @author zqtao
 */
public class League implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String LEAGUEID;

    /**
     * 学院
     */
    private String COLLEGE;
    /**
     * 专业
     */
    private String MAJOR;
    /**
     * 班级
     */
    private String CLASSNAME;
    /**
     * 学号
     */
    private String STUDENTID;
    /**
     * 姓名
     */
    private String LNAME;
    /**
     * 性别
     */
    private String SEX;
    /**
     * 出生年月
     */
    private String DATE;
    /**
     * 身份证号
     */
    private String IDNUMBER;
    /**
     * 民族
     */
    private String NATION;
    /**
     * 籍贯
     */
    private String NATIVEPLACE;
    /**
     * 政治面貌
     */
    private String POLITICALSTATUS;
    /**
     * 入团年月
     */
    private String YEARS;
    /**
     * 入团地点
     */
    private String PLACE;
    /**
     * 介绍信
     */
    private String LETTER;
    /**
     * 团员证
     */
    private String ZHENG;
    /**
     * 团员档案
     */
    private String MEMBERPROFILE;
    /**
     * 联系方式
     */
    private String PHONE;
    /**
     * QQ
     */
    private String QQ;
    /**
     * 备注
     */
    private String REMARK;

    /**
     * 注册
     */
    private String REGISTER;

    /**
     * 创建时间
     */
    private String CREATETIME;
    /**
     * 最后一次修改时间
     */
    private String LASTEDITTIME;

    @Override
    public String toString() {
        return "League{" +
                "LEAGUEID='" + LEAGUEID + '\'' +
                ", COLLEGE='" + COLLEGE + '\'' +
                ", MAJOR='" + MAJOR + '\'' +
                ", CLASSNAME='" + CLASSNAME + '\'' +
                ", STUDENTID='" + STUDENTID + '\'' +
                ", LNAME='" + LNAME + '\'' +
                ", SEX='" + SEX + '\'' +
                ", DATE='" + DATE + '\'' +
                ", IDNUMBER='" + IDNUMBER + '\'' +
                ", NATION='" + NATION + '\'' +
                ", NATIVEPLACE='" + NATIVEPLACE + '\'' +
                ", POLITICALSTATUS='" + POLITICALSTATUS + '\'' +
                ", YEARS='" + YEARS + '\'' +
                ", PLACE='" + PLACE + '\'' +
                ", LETTER='" + LETTER + '\'' +
                ", ZHENG='" + ZHENG + '\'' +
                ", MEMBERPROFILE='" + MEMBERPROFILE + '\'' +
                ", PHONE='" + PHONE + '\'' +
                ", QQ='" + QQ + '\'' +
                ", REMARK='" + REMARK + '\'' +
                ", REGISTER='" + REGISTER + '\'' +
                ", CREATETIME='" + CREATETIME + '\'' +
                ", LASTEDITTIME='" + LASTEDITTIME + '\'' +
                '}';
    }


    public String getLEAGUEID() {
        return LEAGUEID;
    }

    public void setLEAGUEID(String LEAGUEID) {
        this.LEAGUEID = LEAGUEID;
    }

    public String getCOLLEGE() {
        return COLLEGE;
    }

    public void setCOLLEGE(String COLLEGE) {
        this.COLLEGE = COLLEGE;
    }

    public String getMAJOR() {
        return MAJOR;
    }

    public void setMAJOR(String MAJOR) {
        this.MAJOR = MAJOR;
    }

    public String getCLASSNAME() {
        return CLASSNAME;
    }

    public void setCLASSNAME(String CLASSNAME) {
        this.CLASSNAME = CLASSNAME;
    }

    public String getSTUDENTID() {
        return STUDENTID;
    }

    public void setSTUDENTID(String STUDENTID) {
        this.STUDENTID = STUDENTID;
    }

    public String getLNAME() {
        return LNAME;
    }

    public void setLNAME(String LNAME) {
        this.LNAME = LNAME;
    }

    public String getSEX() {
        return SEX;
    }

    public void setSEX(String SEX) {
        this.SEX = SEX;
    }

    public String getDATE() {
        return DATE;
    }

    public void setDATE(String DATE) {
        this.DATE = DATE;
    }

    public String getIDNUMBER() {
        return IDNUMBER;
    }

    public void setIDNUMBER(String IDNUMBER) {
        this.IDNUMBER = IDNUMBER;
    }

    public String getNATION() {
        return NATION;
    }

    public void setNATION(String NATION) {
        this.NATION = NATION;
    }

    public String getNATIVEPLACE() {
        return NATIVEPLACE;
    }

    public void setNATIVEPLACE(String NATIVEPLACE) {
        this.NATIVEPLACE = NATIVEPLACE;
    }

    public String getPOLITICALSTATUS() {
        return POLITICALSTATUS;
    }

    public void setPOLITICALSTATUS(String POLITICALSTATUS) {
        this.POLITICALSTATUS = POLITICALSTATUS;
    }

    public String getYEARS() {
        return YEARS;
    }

    public void setYEARS(String YEARS) {
        this.YEARS = YEARS;
    }

    public String getPLACE() {
        return PLACE;
    }

    public void setPLACE(String PLACE) {
        this.PLACE = PLACE;
    }

    public String getLETTER() {
        return LETTER;
    }

    public void setLETTER(String LETTER) {
        this.LETTER = LETTER;
    }

    public String getZHENG() {
        return ZHENG;
    }

    public void setZHENG(String ZHENG) {
        this.ZHENG = ZHENG;
    }

    public String getMEMBERPROFILE() {
        return MEMBERPROFILE;
    }

    public void setMEMBERPROFILE(String MEMBERPROFILE) {
        this.MEMBERPROFILE = MEMBERPROFILE;
    }

    public String getPHONE() {
        return PHONE;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE;
    }

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ;
    }

    public String getREMARK() {
        return REMARK;
    }

    public void setREMARK(String REMARK) {
        this.REMARK = REMARK;
    }

    public String getREGISTER() {
        return REGISTER;
    }

    public void setREGISTER(String REGISTER) {
        this.REGISTER = REGISTER;
    }

    public String getCREATETIME() {
        return CREATETIME;
    }

    public void setCREATETIME(String CREATETIME) {
        this.CREATETIME = CREATETIME;
    }

    public String getLASTEDITTIME() {
        return LASTEDITTIME;
    }

    public void setLASTEDITTIME(String LASTEDITTIME) {
        this.LASTEDITTIME = LASTEDITTIME;
    }
}