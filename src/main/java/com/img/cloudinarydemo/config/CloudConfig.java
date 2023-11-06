package com.img.cloudinarydemo.config;


import com.cloudinary.Cloudinary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class CloudConfig {

    @Bean
    public Cloudinary cloudinary() {
        Map config = new HashMap();
        config.put("cloud_name", "db7bu5thk");
        config.put("api_key", "954482368452798");
        config.put("api_secret", "U3rsJJLE6dZ1-V6e26Hb5zQy2hE");
        config.put("secure",true);
        return new Cloudinary(config);
    }
}
