
public class BalanceoController {

    private BalanceoChecker checker;

    public BalanceoController() {
        this.checker = new BalanceoChecker();
    }

    public String verificarBalanceo(String expresion) {
        // Utiliza el checker para verificar la expresión
        return checker.estaBalanceada(expresion) ? "Balanceada" : "No balanceada";
    }
}
