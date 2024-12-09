package org.zishu.javaweb_el_jstl.model;

import lombok.Data;
/**
 * 文章类，用于存储文章信息
 */
@Data
public class Article {
    private int id;
    private String title;
    private String author;
    private String time;
    private String content;
}
