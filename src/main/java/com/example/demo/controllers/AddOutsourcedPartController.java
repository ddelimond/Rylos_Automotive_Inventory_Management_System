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
public class AddOutsourcedPartController {
    @Autowired
    private ApplicationContext context;

    @Autowired
    private ImageService imageService;  // Add this

    @GetMapping("/showFormAddOutPart")
    public String showFormAddOutsourcedPart(Model theModel){
        Part part=new OutsourcedPart();
        theModel.addAttribute("outsourcedpart",part);
        return "OutsourcedPartForm";
    }

    @PostMapping("/showFormAddOutPart")
    public String submitForm(@Valid @ModelAttribute("outsourcedpart") OutsourcedPart part,
                             BindingResult bindingResult,
                             @RequestParam(value = "imageFile", required = false) MultipartFile imageFile,
                             Model theModel){
        theModel.addAttribute("outsourcedpart",part);
        if(bindingResult.hasErrors()){
            return "OutsourcedPartForm";
        }
        else{
            OutsourcedPartService repo=context.getBean(OutsourcedPartServiceImpl.class);
            OutsourcedPart op=repo.findById((int)part.getId());
            if(op!=null){
                part.setProducts(op.getProducts());
                // Keep existing image if no new image uploaded
                if(imageFile == null || imageFile.isEmpty()){
                    part.setImagePath(op.getImagePath());
                }
            }

            // Handle image upload if present
            if (imageFile != null && !imageFile.isEmpty()) {
                try {
                    String imagePath = imageService.saveImage(imageFile);
                    part.setImagePath(imagePath);

                    // Delete old image if updating
                    if(op != null && op.getImagePath() != null){
                        imageService.deleteImage(op.getImagePath());
                    }
                } catch (IOException e) {
                    theModel.addAttribute("error", "Failed to upload image: " + e.getMessage());
                    return "OutsourcedPartForm";
                }
            }

            repo.save(part);
            return "confirmationaddpart";
        }
    }
}