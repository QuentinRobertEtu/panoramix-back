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
        message.setSubject("Bienvenue "+ mailRequestForm.getDruidName()+", jeune apprenti druide 🌿");
        message.setText("Par Toutatis !\n" +
                        "\n" + 
                        "Quelle joie de voir que tu as trouvé le chemin vers Panoramix.com, le sanctuaire digital des vrais druides ! Ton adresse a bien été inscrite dans notre druidique grimoire\n" + //
                        "\n" +
                        "Le site est encore en gestation, tel un chaudron frémissant sous la pleine lune, mais bientôt… très bientôt, tu pourras découvrir potions, savoirs anciens, sangliers, et conseils de sagesse millénaire\n" + //
                        "\n" + 
                        "En attendant l'ouverture du cercle, veille sur ton feu sacré et surveille les messages dans ta boîte mail... car lorsqu’il sera temps, tu seras parmi les premiers à fouler les pierres sacrées du site Panoramix.com\n" + //
                        "\n" + 
                        "Druidiquement,\n" +
                        "– Panoramix\n");
        mailSender.send(message);
        mailRepository.save(new MailRegister(null, mailRequestForm.getDruidName(), mailRequestForm.getDestMail()));
        return "mail send";
    }
    
}
