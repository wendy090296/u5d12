package wendydeluca.u5d12.esercizio1;

import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import wendydeluca.u5d12.esercizio1.Adapter;
import wendydeluca.u5d12.esercizio1.DataSource;
import wendydeluca.u5d12.esercizio1.Info;
import wendydeluca.u5d12.esercizio1.UserData;

import java.time.LocalDate;
import java.util.Locale;
@Component
public class AdapterRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("********************** ADAPTER ****************");
        System.out.println();

        UserData userData = new UserData();
        Info info = new Info();

        info.setName("Aldo");
        info.setSurname("Baglio");
        info.setBirthDate(LocalDate.of(1965,4,7));
        Adapter adapter = new Adapter(info);
        userData.getData(adapter);

        System.out.println("Full name: " + userData.getFullName());
        System.out.println("Age: "+ userData.getAge());
    }
}
