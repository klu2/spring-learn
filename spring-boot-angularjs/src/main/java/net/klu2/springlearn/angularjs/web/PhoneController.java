package net.klu2.springlearn.angularjs.web;

import net.klu2.springlearn.angularjs.domain.Phone;
import net.klu2.springlearn.angularjs.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PhoneController {

    @Autowired
    private PhoneService phoneService;

    @RequestMapping("phones/phones.json")
    public
    @ResponseBody
    List<Phone> phones() {
        List<Phone> phones = new ArrayList<Phone>();
        Phone phone = new Phone();
        phone.setId("dell-streak-7");
        phone.setImageUrl("img/phones/dell-streak-7.0.jpg");
        phone.setName("Dell Streak 7");
        phone.setSnippet("Introducing Dell\u2122 Streak 7. Share photos, videos and movies together. It\u2019s small enough to carry around, big enough to gather around.");
        phones.add(phone);
        return phoneService.findPhones();
    }



}
