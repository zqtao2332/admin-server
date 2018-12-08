package cn.zqtaotao.adminserver.entity.real;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DevelopEntity {

    private String college;
    private String major;
    private String className;
    private String studentId;
    private String lname;
    private String sex;
    private String date;
    private String idnumber;
    /**
     * 原字段为native
     * native可能是关键字，无法使用
     */
    private String nation;
    private String nativePlace;
    private String applyTime;
    private String time;
    private String honor;
    private String sum;
    private String phone;
    private String qq;
    private String remark;
    private String developId;
    private String createTime;
    private String lastEditTime;

}
