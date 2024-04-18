package wendydeluca.u5d12.esercizio1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@ToString
public class UserData {
    private String fullName;
    private int age;



    public void getData(DataSource ds){
        fullName = ds.getFullName();
        age= ds.getAge();
    }

}
