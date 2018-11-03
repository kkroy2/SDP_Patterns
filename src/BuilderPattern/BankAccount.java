package BuilderPattern;

public class BankAccount {

    private String ownerName;
    private String ownerAccountNumber;
    private String ownerEmail;
    private boolean newsLetter;
    private double ownerBalance;


    private BankAccount(){}

    public static class BankAccountBuilder
    {
        private String ownerName;
        private String ownerAccountNumber;
        private String ownerEmail;
        private boolean newsLetter;
        private double ownerBalance;

        public BankAccountBuilder(String ownerAccountNumber)
        {
            this.ownerAccountNumber = ownerAccountNumber;
        }

        public BankAccountBuilder withOwnerName(String ownerName)
        {
            this.ownerName = ownerName;
            return this;
        }

        public BankAccountBuilder withOwnerBalance(double ownerBalance)
        {
            this.ownerBalance = ownerBalance;
            return this;
        }

        public BankAccountBuilder withOwnerEmail(String ownerEmail)
        {
            this.ownerEmail = ownerEmail;
            return this;
        }

        public BankAccountBuilder withNewLetter(boolean newLetter)
        {
            this.newsLetter = newsLetter;
            return this;
        }

        public BankAccount build()
        {
            BankAccount bankAccount = new BankAccount();
            bankAccount.ownerAccountNumber = ownerAccountNumber;
            bankAccount.ownerName = ownerName;
            bankAccount.ownerBalance = ownerBalance;
            bankAccount.ownerEmail = ownerEmail;
            bankAccount.newsLetter = newsLetter;
            return bankAccount;
        }

    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getOwnerAccountNumber() {
        return ownerAccountNumber;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public boolean isNewsLetter() {
        return newsLetter;
    }

    public double getOwnerBalance() {
        return ownerBalance;
    }
}
