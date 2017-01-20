package com.brynlloyd;

public class Main {

    public static void main(String[] args) {

        /*Account account = new Account();

        account.setNumber("5206542");
        account.setBalance(999.00);
        account.setCustomerName("Fred Jones");
        account.setCustomerEmailAddress("freddie.jonesy@yourmail.com");
        account.setCustomerPhoneNumber("01259 845427");

        account.deposit(54);
        account.withdraw(22);
        account.withdraw(1000000);

        Account josAccount = new Account("5206542", 0.00, "Jonanne Bleak", "jb.funny@yourmail.com", "00153 54654");
        josAccount.getBalance();

        Account brynsAccount = new Account("Bryn", "b", "12345");
        System.out.println(brynsAccount.getNumber() + " name " + brynsAccount.getCustomerName());*/

        VipAccount moi = new VipAccount();
        System.out.println(moi.getName());

        VipAccount yosi = new VipAccount("yosi", 00.00);
        System.out.println(yosi.getName());

        VipAccount mario = new VipAccount("mario", 00.00, "mario@nientendo.com");
        System.out.println(mario.getName());
        System.out.println(mario.getEmailAddress());

        Account testAccount = new Account("6875757", 100.55, "tester X", "testerx@email.com", "00000 000001");
        testAccount.withdraw(100.55);

    }
}
