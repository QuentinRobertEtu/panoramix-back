package panoramix.com.backend.mail.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MailRequestForm {
    
    String destMail;

    String druidName;
}
