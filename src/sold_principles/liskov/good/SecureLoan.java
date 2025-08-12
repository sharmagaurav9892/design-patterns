package sold_principles.liskov.good;


public interface SecureLoan extends LoanPayment {
    public void foreCloseLoan();
}
