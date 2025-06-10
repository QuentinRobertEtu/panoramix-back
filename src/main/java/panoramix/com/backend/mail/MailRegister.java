package panoramix.com.backend.mail;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "mailregister")
public class MailRegister {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long druidId;
    
    String druidName;

    String mail;
}
