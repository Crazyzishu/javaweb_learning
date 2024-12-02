package org.zishu.javaweb_el_jstl.model;

import lombok.Data;

/**
 * 图书类，用于存储图书信息
 */
@Data
public class Book {
    private String title;
    private String author;
    private String pages;
    private String picture;
    private String price;
}
