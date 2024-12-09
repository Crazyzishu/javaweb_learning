package org.zishu.javaweb_el_jstl.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor //自动为类生成一个包含所有字段的构造函数，可以用于方便地初始化类的实例。
public class AxiosData {
    private String msg;
    private Integer code;
    private Object data;
}
