package com.hzfc.vo;

import com.hzfc.annotation.image.Image;
import lombok.Data;

/**
 * @ClassName ImageRep
 * @DesCripion TODO
 * @Author zhaoYu
 * @Date 2024/11/17 22:19
 */
@Data
public class ImageRep {
    /**
     * id
     */
    private Long id;
    /**
     * 图片地址
     */
    @Image
    private String url;
}
