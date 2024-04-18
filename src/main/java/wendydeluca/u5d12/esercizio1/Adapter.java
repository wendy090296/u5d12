package wendydeluca.u5d12.esercizio1;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Adapter implements DataSource{
    private Info info;

    public Adapter(Info info){
       this.info=info;
    }




    @Override
    public String getFullName() {
        return info.getName() + "  " + info.getSurname();
    }

    @Override
    public int getAge() {
        return LocalDate.now().getYear() - info.getBirthDate().getYear();
    }
}
