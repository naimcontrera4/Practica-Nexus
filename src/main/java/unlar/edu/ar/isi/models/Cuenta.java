package unlar.edu.ar.isi.models;
import lombok.Data;

import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicInteger;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Cuenta {
    private String cbu;
    private BigDecimal saldo=new BigDecimal("0");

    public void extraer( BigDecimal extraer){
        
        BigDecimal nuevomonto=saldo.subtract(extraer);
       /*  if (saldo.compareTo(nuevomonto) < 0) {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
    }
    public double consultarSaldo(){
        return this.saldo;
    } 
    */
}
}
