package com.example.demo.controllers;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.IOException;

/**
 *
 *
 *
 *
 */
//Updated
@Controller
public class AddInhousePartController {
    @Autowired
    private ApplicationContext context;

    @Autowired
    private ImageService imageService;  // Add this

    @GetMapping("/showFormAddInPart")
    public String showFormAddInPart(Model theModel){
        Part part=new InhousePart();
        theModel.addAttribute("inhousepart",part);
        return "InhousePartForm";
    }

    @PostMapping("/showFormAddInPart")
    public String submitForm(@Valid @ModelAttribute("inhousepart") InhousePart part,
                             BindingResult bindingResult,
                             @RequestParam(value = "imageFile", required = false) MultipartFile imageFile,
                             Model theModel){
        theModel.addAttribute("inhousepart",part);
        if(bindingResult.hasErrors()){
            return "InhousePartForm";
        }
        else{
            InhousePartService repo = context.getBean(InhousePartServiceImpl.class);
            InhousePart ip = repo.findById((int)part.getId());
            if(ip!=null){
                part.setProducts(ip.getProducts());
                // Keep existing image if no new image uploaded
                if(imageFile == null || imageFile.isEmpty()){
                    part.setImagePath(ip.getImagePath());
                }
            }

            // Handle image upload if present
            if (imageFile != null && !imageFile.isEmpty()) {
                try {
                    String imagePath = imageService.saveImage(imageFile);
                    part.setImagePath(imagePath);

                    // Delete old image if updating
                    if(ip != null && ip.getImagePath() != null){
                        imageService.deleteImage(ip.getImagePath());
                    }
                } catch (IOException e) {
                    theModel.addAttribute("error", "Failed to upload image: " + e.getMessage());
                    return "InhousePartForm";
                }
            }

            repo.save(part);
            return "confirmationaddpart";
        }
    }
}