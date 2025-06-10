package panoramix.com.backend.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;

@Configuration
public class DataFolderConfig {

    @Bean
    CommandLineRunner createDataFolder() {
        return args -> {
            System.out.println(System.getProperty("user.dir"));
            File dataDir = new File("/app/data");
            if (!dataDir.exists()) {
                boolean created = dataDir.mkdirs();
                if (created) {
                    System.out.println("Dossier /app/data créé avec succès");
                } else {
                    System.err.println("Échec de la création du dossier /app/data");
                }
            } else {
                System.out.println("Dossier /app/data déjà existant");
            }
        };
    }
}

