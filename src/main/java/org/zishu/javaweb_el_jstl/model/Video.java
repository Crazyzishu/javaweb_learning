package org.zishu.javaweb_el_jstl.model;

import lombok.Data;

/**
 *    视频类，用于存储视频信息
 */
@Data
public class Video {
    private int id;
    private String title;
    private String description;
    private String time;
    private String author;
    private String src;
}
