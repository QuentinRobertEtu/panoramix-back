package panoramix.com.backend.mail;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import panoramix.com.backend.mail.form.MailRequestForm;

@Component
@RequiredArgsConstructor
public class MailServiceImpl implements MailService {

    private final JavaMailSender mailSender;

    private final MailRepository mailRepository;

    @Override
    public String sendEmail(MailRequestForm mailRequestForm) {
        S
    }
    
}
