package com.hzfc.annotation.image;

import cn.hutool.core.util.StrUtil;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.hzfc.config.ImageConfig;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.IOException;
import java.util.Objects;


@EqualsAndHashCode(callSuper = true)
@Data
public class ImageSerializer extends JsonSerializer {
    private final ImageConfig imageConfig;

    @Override
    public void serialize(Object o, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if(Objects.nonNull(o)){
            String str = String.valueOf(o);
            if(StrUtil.isNotBlank(str) && StrUtil.isNotBlank(imageConfig.getImagePrefix())){
                jsonGenerator.writeString(imageConfig.getImagePrefix() + str);
            }
        }
    }
}
