package com.hzfc.vo;

import com.hzfc.annotation.image.Image;
import lombok.Data;

/**
 * @ClassName ImageVO
 * @DesCripion TODO
 * @Author zhaoYu
 * @Date 2024/11/18 22:02
 */
@Data
public class ImageVO {
    /**
     * 图片ID
     */
    private Long id;
    /**
     * 图片地址
     */
    @Image
    private String url;
}
