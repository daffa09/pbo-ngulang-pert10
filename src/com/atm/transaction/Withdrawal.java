package com.atm.transaction;

import java.util.Scanner;

import com.atm.model.Account;

public class Withdrawal extends Transaction {
  public Withdrawal(Account account) {
    super(account);
  }

  @Override
  public void execute() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan jumlah penarikan: ");
    double amount = scanner.nextDouble();

    // Modifikasi methode execute() dalam kelas Withdrawal untuk memeriksa apakah
    // saldo setelah penarikan tidak kuran dari saldo minimal
    if (account.getBalance() <= account.MINIMUM_BALANCE) {
      // Jika saldo tidak mencukupi, tampilkan pesan kesalahan
      System.out.println("Saldo kurang dari 50.000");
      System.out.println("Saldo Anda sekarang: " + account.getBalance());
      return;
    } else if (amount <= account.getBalance()) {
      account.debit(amount);
      System.out.println("Penarikan berhasil. Saldo Anda sekarang: " + account.getBalance());
    } else {
      System.out.println("Saldo tidak mencukupi.");
    }
  }

}
