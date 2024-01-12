package com.example.basicspringbootandjsp_intellij.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class FileUploadController {

    @RequestMapping(value = "/fileUpload", method = RequestMethod.GET)
    public String displayForm() {
        return "fileUploadForm";
    }

    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    public String submit(@RequestParam("file") final MultipartFile file, final ModelMap modelMap) throws IOException {

        file.transferTo(new File("D:\\upload\\" + file.getOriginalFilename()));
        modelMap.addAttribute("file", file);
        return "fileUploadView";
    }
}
