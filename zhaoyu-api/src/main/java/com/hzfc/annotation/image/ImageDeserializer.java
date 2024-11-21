package com.hzfc.annotation.image;

import cn.hutool.core.util.StrUtil;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.hzfc.config.ImageConfig;
import lombok.AllArgsConstructor;

import java.io.IOException;

/**
 * @ClassName ImageDeserializer
 * @DesCripion TODO
 * @Author zhaoYu
 * @Date 2024/11/21 20:39
 */
@AllArgsConstructor
public class ImageDeserializer extends JsonDeserializer {
    private final ImageConfig imageConfig;
    @Override
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        if(StrUtil.isNotBlank(jsonParser.getText())){
            if(jsonParser.getText().startsWith(imageConfig.getImagePrefix())){
                return jsonParser.getText().replace(imageConfig.getImagePrefix(), "");
            }else{
                return jsonParser.getText();
            }
        }
        return null;
    }
}
