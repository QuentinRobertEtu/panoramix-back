package panoramix.com.backend.mail;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import panoramix.com.backend.mail.form.MailRequestForm;

@RequestMapping("/mail")
@RestController
public interface MailController {
    
    @PostMapping
    public ResponseEntity<String> sendMail(@RequestBody MailRequestForm mailRequestForm, HttpServletRequest request);
 
}
