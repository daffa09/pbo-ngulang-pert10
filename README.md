<div style="font-size: 1.4em; margin-bottom: 20px;">
  <strong>Ini adalah tugas pertemuan 10 yang berisi dua tugas utama:</strong>
</div>

<br>

<div>
  <strong>Tambahkan fitur Ubah PIN</strong>
  <ol type="a">
    <li>Tambahkan opsi “Ubah PIN” pada menu utama.</li>
    <li>
      Buat method dalam kelas <code>Account</code> untuk mengubah PIN, yaitu:
      <code>changePin()</code>.
    </li>
    <li>
      Dalam method tersebut, lakukan langkah-langkah berikut:
      <ol type="i">
        <li>Verifikasi PIN lama.</li>
        <li>Minta nasabah memasukkan PIN baru dua kali.</li>
        <li>Validasi bahwa kedua input PIN baru cocok.</li>
        <li>Perbarui PIN jika validasi berhasil.</li>
      </ol>
    </li>
  </ol>
</div>

<div style="margin-top: 20px;">
  <img
    src="https://github.com/user-attachments/assets/b51b24ed-8859-4f86-b8ca-0d14b2778c77"
    alt="Ubah pin"
    style="width: 500px; max-width: 500px;"
  />
  <p style="text-align: center; font-style: italic;">
      Gambar 1: ChangePin
  </p>
</div>

<div>
  <strong>Validasi Saldo Minimal pada saat penarikan</strong>
  <ol type="a">
    <li>
      Modifikasi fitur penarikan sehingga nasabah harus menyisakan saldo minimal
      setelah penarikan dilakukan (contoh: Rp50,000-).
    </li>
    <li>
      Langkah-langkah:
      <ol type="i">
        <li>
          Tentukan saldo minimal, tambahkan konstanta
          <code>MINIMUM_BALANCE</code> dalam kelas <code>Account</code>.
        </li>
        <li>
          Modifikasi metode <code>execute()</code> dalam kelas
          <code>Withdrawal</code> untuk memeriksa apakah saldo setelah penarikan
          tidak kurang dari saldo minimal.
        </li>
        <li>Jika saldo tidak mencukupi, tampilkan pesan kesalahan.</li>
      </ol>
    </li>
  </ol>
</div>

<div style="margin-top: 20px;">
  <img
    src="https://github.com/user-attachments/assets/54e58faa-34d4-4ba1-84d2-2ad8beb6cd8f"
    alt="Validasi Saldo Minimal"
    style="width: 500px; max-width: 500px;"
  />
  <p style="text-align: center; font-style: italic;">
    Gambar 2: validasi saldo minimal saat penarikan
  </p>
</div>
