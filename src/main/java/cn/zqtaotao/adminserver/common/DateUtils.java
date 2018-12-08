package cn.zqtaotao.adminserver.common;

import cn.hutool.core.date.DateUtil;

import java.util.Date;

public class DateUtils {

    /**
     * 日期格式
     * 2018-02-03
     */
    public static String getDate() {
        return DateUtil.formatDate(new Date());
    }
}
