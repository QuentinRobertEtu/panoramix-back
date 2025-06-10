package panoramix.com.backend.mail;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import panoramix.com.backend.mail.form.MailRequestForm;

@Component
@RequiredArgsConstructor
public class MailControllerImpl implements MailController{

    @Override
    public ResponseEntity<String> sendMail(MailRequestForm mailRequestForm) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
