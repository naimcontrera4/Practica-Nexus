package unlar.edu.ar.isi.models;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class CajaAhorro extends Cuenta {
    private double tasaIntereses=1.1;
    
    //public double aplicarInteres(){
        //double saldo=getSaldo();
        //return saldo*tasaIntereses;
    //}

}