package com.example.webdbs.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.example.webdbs.entity.DuAnBDS;
import com.example.webdbs.service.DuAnService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ThemDuAnController {

	@Autowired
	private DuAnService duAnService;
	
	@GetMapping("/add")
	public String add(@ModelAttribute("duAnBDS") DuAnBDS duAnBDS) {
		return "ThemDuAn";
	}

	@PostMapping("/add")
	public String addDuAn(@ModelAttribute("duAnBDS") DuAnBDS duAnBDS) throws IOException {
		Map asMap = ObjectUtils.asMap("cloud_name", "haminhnhat711", "api_key", "414128439647965", "api_secret",
				"weG0sfQ2m6mxoYuL56aiCKAOIXs", "secure", true);
		Cloudinary cloudinary = new Cloudinary(asMap);
		Map upload = cloudinary.uploader().upload(convertMultiPartToFile(duAnBDS.getFile()), asMap);
		log.info("upload file {} ", upload.get("secure_url"));
		duAnBDS.setLinkImage((String)upload.get("secure_url"));
		duAnService.save(duAnBDS);
		return "List";
	}
	
	 private File convertMultiPartToFile(MultipartFile file ) throws IOException
	    {
	        File convFile = new File( file.getOriginalFilename() );
	        FileOutputStream fos = new FileOutputStream( convFile );
	        fos.write( file.getBytes() );
	        fos.close();
	        return convFile;
	    }
	 
	 @GetMapping("/showlist")
	 public String showList() {
		 return "List";
	 }
}
