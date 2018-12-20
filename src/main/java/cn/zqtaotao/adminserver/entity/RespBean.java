package cn.zqtaotao.adminserver.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * 封装响应信息
 */
@Setter
@Getter
public class RespBean {
    private Integer status;
    private Boolean success;
    private String msg;
    private Object data;

    private RespBean() {
    }

    // 获取实例对象
    public static RespBean build() {
        return new RespBean();
    }

    // 成功返回, 状态码，是否成功，信息，数据
    public static RespBean ok(String msg, Object data) {
        return new RespBean(200,true, msg, data);
    }

    // 成功返回，无msg
    public static RespBean ok(String msg) {
        return new RespBean(200,true, msg, null);
    }

    public static RespBean error(String msg, Object obj) {
        return new RespBean(500,false, msg, obj);
    }

    public static RespBean error(String msg) {
        return new RespBean(500,false, msg, null);
    }

    private RespBean(Integer status, Boolean success, String msg, Object data) {
        this.status = status;
        this.success = success;
        this.msg = msg;
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

}
