package com.atm.model;

import java.util.Scanner;

public class Account {
  private String accountNumber;
  private String pin;
  private double balance;
  // Tentukan saldo minimal, tambahkan konstanta MINIMUM_BALANCE dalam kelas
  // Account
  public static final double MINIMUM_BALANCE = 50000;

  public Account(String accountNumber, String pin, double balance) {
    this.accountNumber = accountNumber;
    this.pin = pin;
    this.balance = balance;
  }

  // Getter dan Setter
  public String getAccountNumber() {
    return accountNumber;
  }

  public String getPin() {
    return pin;
  }

  public double getBalance() {
    return balance;
  }

  public void credit(double amount) {
    this.balance += amount;
  }

  public void debit(double amount) {
    this.balance -= amount;
  }

  public void changePin(String oldPin) {
    Scanner scanner = new Scanner(System.in);

    // verikasi pin yang sekarang
    if (!this.pin.equals(oldPin)) {
      System.out.println("Pin tidak valid");
      return;
    }

    // minta nasabah memasukan pin baru sebanyak dua kali
    System.out.print("Masukkan Pin baru anda: ");
    String newPin1 = scanner.nextLine();

    System.out.print("Konfimasi Pin baru anda: ");
    String newPin2 = scanner.nextLine();

    // validasi bahwa kedua input pin baru cocok
    if (!newPin1.equals(newPin2)) {
      System.out.println("Pin baru tidak sama");
    } else {
      // perbarui pin ketika validasi berhasil
      this.pin = newPin2;
      System.out.println("Pin berhasil diubah");
    }
  }

}
