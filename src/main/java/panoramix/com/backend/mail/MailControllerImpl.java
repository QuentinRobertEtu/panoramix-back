package panoramix.com.backend.mail;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import panoramix.com.backend.mail.form.MailRequestForm;

@Component
@RequiredArgsConstructor
public class MailControllerImpl implements MailController {

    private final MailService mailService;

    @Override
    public ResponseEntity<String> sendMail(MailRequestForm mailRequestForm) {
        return ResponseEntity.status(HttpStatus.OK).body(mailService.sendEmail(mailRequestForm));
    }
    
}
