package com.capsule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.capsule.entity.EducationDetails;
import com.capsule.service.EducationalDeatails;

@Controller
public class EducationController {

	@Autowired
	private EducationalDeatails educationalDetailsService;

	@RequestMapping(value = "/")
	public String getHome() {
		return "education";

	}

	@PostMapping("/edu")
	public String saveEducation(@RequestBody List<EducationDetails> educationDetails) {
		for (EducationDetails details : educationDetails) {
			educationalDetailsService.saveData(details);
			System.out.println("Received data: " + details);
		}
		// Perform operations with the educationDetails data, such as saving to a
		// database
		return "redirect:/gethome"; // Assuming "home" is the name of the view you want to navigate to
	}

	@GetMapping("/gethome")
	public String confirmationPage() {
		// Return the name of the confirmation page
		return "sucess";
	}

	@GetMapping("/getDetailsById/{id}")
	public String getDetailsById(@PathVariable("id") long id, Model model) {
		EducationDetails details = educationalDetailsService.getDetailsById(id);
		if (details != null) {
			model.addAttribute("details", details); // Add the retrieved details to the model
		}
		return "details"; // Assuming "details" is the name of the view you want to display the details
	}
}
