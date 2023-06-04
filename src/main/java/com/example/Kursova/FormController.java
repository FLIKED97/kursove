package com.example.Kursova;

import com.example.Kursova.bd.Form;
import com.example.Kursova.repo.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/form")
public class FormController {
    private final FormRepository formRepository;

    @Autowired
    public FormController(FormRepository formRepository) {
        this.formRepository = formRepository;
    }

    @PostMapping("/submit")
    public String submitForm(@RequestParam("FirstName") String firstName,
                             @RequestParam("SurName") String surName,
                             @RequestParam("Patronymic") String patronymic,
                             @RequestParam("Phone") int phone,
                             @RequestParam("area") float area,
                             @RequestParam("workType") String workType) {
        Form form = new Form();
        form.setFirstName(firstName);
        form.setSurName(surName);
        form.setPatronymic(patronymic);
        form.setPhone(phone);
        form.setArea(area);
        form.setWorkType(workType);

        formRepository.save(form);

        return "redirect:/success.html";
    }
}
