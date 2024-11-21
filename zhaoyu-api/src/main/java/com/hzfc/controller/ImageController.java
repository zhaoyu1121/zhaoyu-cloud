package com.hzfc.controller;

import com.hzfc.service.ImageService;
import com.hzfc.vo.ImageRep;
import com.hzfc.vo.ImageVO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: zhaoYu
 * Date: 2024/11/21
 * Description:
 */
@RestController
@AllArgsConstructor
public class ImageController {

    private final ImageService imageService;
    @PostMapping("/image")
    public ImageVO getImage(@RequestBody ImageRep req){
        return imageService.getImage(req);
    }
}
