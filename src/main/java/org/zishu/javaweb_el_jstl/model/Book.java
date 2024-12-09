package org.zishu.javaweb_el_jstl.model;

import lombok.Data;

/**
 * 图书类，用于存储图书信息
 */
@Data
public class Book {
    private int id;
    private String title;
    private String author;
    private String pages;
    private String picture;
    private String day;
    private boolean restitution; // 是否可借
    private String description;
    private String price;
    /*
      @param id 图书id
     * @param title 图书标题
     * @param author 图书作者
     * @param pages 图书页数
     * @param picture 图书图片
     * @param day 图书借阅日期
     * @param restitution 图书是否可借
     * @param description 图书描述
     */
}
