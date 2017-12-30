package com.ting.demo1.weixin.code;

import com.ting.demo1.weixin.util.PathUtil;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@RestController
public class ImgController {
    private Logger logger = LoggerFactory.getLogger(CheckController.class);

    @ResponseBody
    @RequestMapping(value = "/img/{picname}", method = RequestMethod.GET)
    public void getImg(HttpServletRequest request, HttpServletResponse response, @PathVariable String picname) {
        logger.info("=============para======" + picname);
        response.setContentType("image/png");
        String separator = File.separator;

        String url = ImgController.class.getResource("/").getPath().toString().substring(1);
        String filePath = url + "static/img";
        if (picname.endsWith("\\") || picname.endsWith("/")) {
            filePath = filePath + picname + ".jpg";
        } else {
            filePath = filePath + File.separator + picname + ".jpg";
        }
//        filePath = filePath.replaceAll("\\\\", separator);
        filePath = PathUtil.getRealFilePath(filePath);
        File file = new File(filePath);
        InputStream in = null;
        try {
            in = new FileInputStream(file);
            try {
                IOUtils.copy(in, response.getOutputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
