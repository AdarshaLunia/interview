package com.example.designs.builder;

public class BuilderPatternDriver {

    public static void main(String[] args) {
        BankAccount newAccount=new BankAccount.BankAccountBuilder("Adarsha" ,"123123")
                .withEmail("adarsha@mindtree")
                .wantNewsletter(true)
                .build();

        System.out.println("Name: " + newAccount.getName());
        System.out.println("AccountNumber:" + newAccount.getAccountNumber());
        System.out.println("Email: " + newAccount.getEmail());
        System.out.println("Want News letter?: " + newAccount.isNewsletter());
    }
}
