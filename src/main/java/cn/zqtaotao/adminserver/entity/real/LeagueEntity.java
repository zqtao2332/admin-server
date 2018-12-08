package cn.zqtaotao.adminserver.entity.real;

import lombok.Getter;
import lombok.Setter;

/**
 * 团员领域模型转换
 * 由于数据库中存储的字段为  大写，以此类进行转换
 */
@Setter
@Getter
public class LeagueEntity {

    /**
     * 主键
     */
    private String leagueId;

    /**
     * 学院
     */
    private String college;
    /**
     * 专业
     */
    private String major;
    /**
     * 班级
     */
    private String className;
    /**
     * 学号
     */
    private String studentId;
    /**
     * 姓名
     */
    private String lname;
    /**
     * 性别
     */
    private String sex;
    /**
     * 出生年月
     */
    private String date;
    /**
     * 身份证号
     */
    private String idnumber;
    /**
     * 民族
     */
    private String nation;
    /**
     * 籍贯
     */
    private String nativePlace;
    /**
     * 政治面貌
     */
    private String politicalStatus;
    /**
     * 入团年月
     */
    private String years;
    /**
     * 入团地点
     */
    private String place;
    /**
     * 介绍信
     */
    private String letter;
    /**
     * 团员证
     */
    private String zheng;
    /**
     * 团员档案
     */
    private String memberProfile;
    /**
     * 联系方式
     */
    private String phone;
    /**
     * QQ
     */
    private String qq;
    /**
     * 备注
     */
    private String remark;

    /**
     * 注册
     */
    private String register;

    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 最后一次修改时间
     */
    private String lastEditTime;

    @Override
    public String toString() {
        return "LeagueEntity{" +
                "leagueId='" + leagueId + '\'' +
                ", college='" + college + '\'' +
                ", major='" + major + '\'' +
                ", className='" + className + '\'' +
                ", studentId='" + studentId + '\'' +
                ", lname='" + lname + '\'' +
                ", sex='" + sex + '\'' +
                ", date='" + date + '\'' +
                ", idnumber='" + idnumber + '\'' +
                ", nation='" + nation + '\'' +
                ", nativePlace='" + nativePlace + '\'' +
                ", politicalStatus='" + politicalStatus + '\'' +
                ", years='" + years + '\'' +
                ", place='" + place + '\'' +
                ", letter='" + letter + '\'' +
                ", zheng='" + zheng + '\'' +
                ", memberProfile='" + memberProfile + '\'' +
                ", phone='" + phone + '\'' +
                ", qq='" + qq + '\'' +
                ", remark='" + remark + '\'' +
                ", register='" + register + '\'' +
                ", createTime='" + createTime + '\'' +
                ", lastEditTime='" + lastEditTime + '\'' +
                '}';
    }

}