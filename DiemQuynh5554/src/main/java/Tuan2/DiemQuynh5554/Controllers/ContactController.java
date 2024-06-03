package Tuan2.DiemQuynh5554.Controllers;
import Tuan2.DiemQuynh5554.Models.Contact;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactController {
    @PostMapping("/contact/submit")
    public String submitContact(Contact contact, Model model) {
        model.addAttribute("contact", contact);
        return "home/result";
    }
}
