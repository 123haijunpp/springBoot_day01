package com.qiuzq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * program: springBoot_day01
 * Date: 2018/12/23/023 9:39
 *
 * @author: Mr.Qiu
 * Description:
 */
@Controller
@RequestMapping(value = {"/upload"},produces = {"text/plain;charset=UTF-8"})
public class UploadController {

    @GetMapping(value = {"/doUpload"})
    public ModelAndView doUpload(ModelAndView modelAndView) {
        modelAndView.setViewName("uploadFile");
        return modelAndView;
    }

    @PostMapping(value = {"upload"})
    public @ResponseBody
    String upload(HttpServletRequest request, MultipartFile file) {
        String msg = "上传成功";
        try {
            // 上传目录地址
            String uploadDir = request.getSession().getServletContext().getRealPath("/") + "upload/";
            // 如果目录不存在，则自动创建
            File dir = new File(uploadDir);
            if (!dir.exists()) {
                dir.mkdir();
            }
            // 上传文件名字
            String filename = file.getOriginalFilename();
            // 服务器保存的文件对象
            File servletFile = new File(uploadDir + filename);
            file.transferTo(servletFile);
        } catch (Exception ex) {
            msg = "上传失败";
            throw new RuntimeException(ex);
        }
        return msg;
    }

}
