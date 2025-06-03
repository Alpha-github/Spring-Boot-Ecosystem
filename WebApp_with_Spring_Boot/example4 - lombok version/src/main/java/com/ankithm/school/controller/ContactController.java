package com.ankithm.school.controller;

import com.ankithm.school.model.Contact;
import com.ankithm.school.service.ContactService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Slf4j
@Controller
public class ContactController {
    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @RequestMapping("/contact")
    public String displayContactPage() {
        return "contact.html";
    }

//    @RequestMapping(value = "/saveMsg", method = POST)
//    public ModelAndView saveMsg(@RequestParam String name, @RequestParam String mobileNum,
//                                @RequestParam String email, @RequestParam String subject,
//                                @RequestParam String message) {
//        log.info("Name: " + name);
//        log.info("Mobile Number: " + mobileNum);
//        log.info("Email: " + email);
//        log.info("Subject: " + subject);
//        log.info("Message: " + message);
//        return new ModelAndView("redirect:/contact");
//
//    }

    @RequestMapping(value = "/saveMsg", method = POST)
    public ModelAndView saveMsg(Contact contact){
//        log.info(contact.toString());
        contactService.saveMessageDetails(contact);
        return new ModelAndView("redirect:/contact");
    }
}
