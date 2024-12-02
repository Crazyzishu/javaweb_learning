package org.zishu.javaweb_el_jstl.model;

import lombok.Data;
/**
 * 关于我们类，用于存储关于我们的信息
 */
@Data
public class About {
    private int id;
    private String name;
    private String team;
    private String email;
    private String ph;
}
