package com.xiaoer.freemaker;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

/**
 * workflowName:
 * description:
 * date: 2021/1/26 15:23
 * author qiangjin.wang
 *
 * @since JDK1.8
 */
public class HtmlTest {
    @Test
    public void testGenerateHtml() throws IOException, TemplateException {
        Configuration configuration = new Configuration(Configuration.getVersion());
        String classPath = this.getClass().getResource("/").getPath();
        configuration.setDirectoryForTemplateLoading(new File("D:\\03 workspace\\freemaker\\src\\main\\resources\\templates"));
        configuration.setDefaultEncoding("utf-8");
        Template template = configuration.getTemplate("test1.ftlh");
        Map<String, Object> map = new HashMap<>();
        map.put("name", "xiao xiao bao");
        String content = FreeMarkerTemplateUtils.processTemplateIntoString(template, map);
        System.out.println(content);
        Files.write(Paths.get("d://test2.html"), content.getBytes());
    }
}
