package panoramix.com.backend.mail;

import org.springframework.mail.SimpleMailMessage;
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
        System.out.println(mailRequestForm);
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("panoramix.irreductible@gmail.com");
        message.setTo(mailRequestForm.getDestMail());
        message.setSubject("test");
        message.setText("test" + mailRequestForm.getDruidName());
        mailSender.send(message);
        mailRepository.save(new MailRegister(null, mailRequestForm.getDruidName(), mailRequestForm.getDestMail()));
        return "mail send";
    }
    
}
