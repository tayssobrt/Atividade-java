import enums.StatusDePedido;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private LocalDate hora;
    private StatusDePedido status;

    //Composição de muitos representada por *
    private List<OrdemDePedido> ordemDePedidos = new ArrayList<>();

    //Composição unica representada por 1
    private Cliente cliente;

    public Pedido() {

    }

    public Pedido(LocalDate hora, StatusDePedido status, Cliente cliente) {
        this.hora = hora;
        this.status = status;
        this.cliente = cliente;
    }

    public LocalDate getHora() {
        return hora;
    }

    public void setHora(LocalDate hora) {
        this.hora = hora;
    }

    public List<OrdemDePedido> getOrdemDePedido() {
        return ordemDePedidos;
    }

    public void setOrdemDePedido(List<OrdemDePedido> OrdemDePedido) {
        this.ordemDePedidos = OrdemDePedido;
    }

    public StatusDePedido getStatus() {
        return status;
    }

    public void setStatus(StatusDePedido status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
