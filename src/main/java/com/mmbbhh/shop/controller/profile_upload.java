package com.mmbbhh.shop.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@RestController
public class profile_upload {
    //SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
    @PostMapping("/profile_upload")
    public JSONObject upload(MultipartFile uploadFile, HttpServletRequest req, String user) {
        JSONObject json = new JSONObject();
        //在实际运行位置创建新目录
        String realPath = req.getSession().getServletContext().getRealPath("/profile_img/");
        //String format = sdf.format(new Date());
        File folder = new File(realPath + user);
        if (!folder.isDirectory()) {
            if (folder.mkdirs()) {
                System.out.println(user + "的头像目录创建成功");
            };
        }
        //String oldName = uploadFile.getOriginalFilename();
        String name = user + ".jpg";
        try {
            //改名防重名并保存到该目录
            uploadFile.transferTo(new File(folder, name));
            json.put("state", 1);
            json.put("url", req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort() + "/profile_img/" + user + "/" + name);
            return json;
        } catch (IOException e) {
            e.printStackTrace();
        }
        json.put("state", 0);
        return json;
    }
}
