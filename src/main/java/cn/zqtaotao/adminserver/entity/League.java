package cn.zqtaotao.adminserver.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 团员领域模型
 *
 * @author zqtao
 */
@Getter
@Setter
@ToString
public class League {

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
}