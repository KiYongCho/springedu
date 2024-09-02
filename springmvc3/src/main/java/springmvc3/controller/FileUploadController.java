package springmvc3.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import springmvc3.domain.UploadFile;

@Controller
@RequestMapping(value="/fileUpload")
public class FileUploadController {
	
	@RequestMapping(value="/fileUploadForm.do", method=RequestMethod.GET)
	public String fileUploadForm() {
		return "/fileUploadForm";
	}
	
	@RequestMapping(value="/fileUploadProc.do", method=RequestMethod.POST)
	public String fileUploadProc(UploadFile uploadFile, Model model) throws IOException {
		
		MultipartFile multipartFile = uploadFile.getUploadFile();
		
		if (!multipartFile.isEmpty()) {
			
			String originalFileName = multipartFile.getOriginalFilename();
			model.addAttribute("title", uploadFile.getTitle());
			model.addAttribute("originalFileName", originalFileName);
			model.addAttribute("fileSize", multipartFile.getSize());
			
			multipartFile.transferTo(new File("D:/upload/" + originalFileName));
		}
		
		return "/fileUploadResult";
		
	}

} // class




























