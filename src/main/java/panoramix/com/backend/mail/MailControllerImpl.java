package panoramix.com.backend.mail;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import panoramix.com.backend.mail.form.MailRequestForm;

@Component
@RequiredArgsConstructor
public class MailControllerImpl implements MailController {

    private final MailService mailService;

    @Override
    public ResponseEntity<String> sendMail(MailRequestForm mailRequestForm, HttpServletRequest request) {
        String origin = request.getHeader("Origin");
        if (origin == null || !origin.equals("https://panoramix.up.railway.app/")) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Eh non");
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(mailService.sendEmail(mailRequestForm));
        }
    }
}
