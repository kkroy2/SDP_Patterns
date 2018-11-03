package BuilderPattern;

public class Test {
    public static void main(String[] args) {
        BankAccount bankAccount;
        bankAccount = new BankAccount.BankAccountBuilder("121212121")
                .withOwnerName("Rahima")
                .withOwnerEmail("rahima@gmail.com")
                .withOwnerBalance(1212121.0)
                .withNewLetter(true)
                .build();
        BankAccount bankAccount1 = new BankAccount.BankAccountBuilder("553435534")
                .withOwnerName("Alice")
                .withOwnerBalance(5643553)
                .withOwnerEmail("alice@gmail.com")
                .withNewLetter(false)
                .build();

        BankAccount bankAccount2 = new BankAccount.BankAccountBuilder("98938383")
                .withOwnerName("Bob")
                .withOwnerBalance(292922)
                .build();


        System.out.println(bankAccount.getOwnerName()+" "+bankAccount.getOwnerAccountNumber()+" "+bankAccount.getOwnerEmail()+" "+bankAccount.getOwnerBalance());
        System.out.println(bankAccount1.getOwnerName()+" "+bankAccount1.getOwnerAccountNumber()+" "+bankAccount1.getOwnerEmail()+" "+bankAccount1.getOwnerBalance());
        System.out.println(bankAccount2.getOwnerName()+" "+bankAccount2.getOwnerAccountNumber()+" "+bankAccount2.getOwnerEmail()+" "+bankAccount2.getOwnerBalance());
    }
}
