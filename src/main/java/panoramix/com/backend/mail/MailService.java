package panoramix.com.backend.mail;

import org.springframework.stereotype.Service;

import panoramix.com.backend.mail.form.MailRequestForm;

@Service
public interface MailService {
    
    String sendEmail(MailRequestForm mailRequestForm);
    
}
