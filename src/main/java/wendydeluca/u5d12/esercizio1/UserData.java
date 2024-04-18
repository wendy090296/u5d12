package wendydeluca.u5d12.esercizio1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Setter
//@Getter
@ToString
public class UserData {
    private String nomeCompleto;
    private int età;

    public UserData(String nomeCompleto,int età){
        this.nomeCompleto = nomeCompleto;
        this.età = età;

    }

    public void getData(DataSource ds){
        nomeCompleto = ds.getNomeCompleto();
        età= ds.getEtà();
    }

}
