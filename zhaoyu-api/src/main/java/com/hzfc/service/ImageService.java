package com.hzfc.service;

import com.hzfc.vo.ImageRep;
import com.hzfc.vo.ImageVO;
import org.springframework.stereotype.Service;

/**
 *
 * Author: zhaoYu
 * Date: 2024/11/21
 * Description: 图片服务
 */
@Service
public class ImageService {

    /**
     * 获取图片
     * @param req 请求参数
     * @return 图片
     */
    public ImageVO getImage(ImageRep req){
        ImageVO vo = new ImageVO();
        vo.setId(req.getId());
        vo.setUrl(req.getUrl());
        return vo;
    }
}
