JUDUL PROGRAM “Sistem Rental Mobil” 
Program ini merupakan sistem “ jasa Rentalan Mobil” menggunakan Bahasa pemrograman Java yang diselesaikan untuk mengsimulasikan rangkaian Alur proses Layanan Sewa Mobil, yang meliputi pencarian mobil, sewa mobil dimulai dari harga yang termurah s/d Termahal, Menampilkan data" mobil serta Metode pembayaran. 

Penjelasan rangkaian program : 
1. Data Mobil sudah Tersedia dalam Sistem Program ini menggunakan Array untuk menyimpan daftar kamar yang tersedia,  
lengkap dengan :

- Tipe Mobil
-Merek Mobil  
- Harga Sewa Mobil per Hari. 
- Status 

2. Menampilkan Daftar Kamar 
Saat user memilih fitur 2 (Tampilkan Daftar Mobil), maka program akan : 
- Menampilkan semua informasi terkait Mobil, termasuk informasi  Merek,tipe, harga, dan Harganya. Fitur ini memudahkan agar user dapat melihat
- daftar Mobil yang bisa mereka pilih 

3. Pemesanan Kamar dengan Validasi 
Saat user memilih fitur 3 (Sewa Mobil), maka program akan : 
-sistem akan menampilkan kembali daftar mobil
- sistem akan meminta user untuk memilih mobil mana yang akan di pesan.
- Sistem akan mencari apakah data mobil yang akan disewa tersedia. Jika Tersedia, user dapat berlanjut ke tahap berikutnya dan sistem menampilkan Berapa hari Anda akan sewa.
-  Jika Tidak Tersedia, user akan dijelaskan bahwa pilihannya tersebut tidak valid.
-  
4. Menentukan jumlah Hari dan total Harga yg harus dibayar
- Setelah mobil ditemukan, user akan diarahkan untuk berapa hari yg akan disewa 
- Sistem kemudian menghitung total biaya berdasarkan harga per hari. 

5. Proses Pembayaran 
- sistem akan memastikan user untuk Melakukan pembayaran
Sistem akan mengecek apakah user ingin melanjutkan pembayaran, jika ya sistem akan menampilkan nama Bank User,  No rekening, dan jumlah Nominal Uang. Jika Tidak tidak sistem akan menampilkan "pembayaran dibatalkan".
- jika user memilih ya,Setelah total biaya dihitung, user harus memasukkan jumlah nominal uang untuk  membayar. 
- Sistem akan mengecek apakah uang user cukup. Jika cukup, transaksi berhasil dan kamar mobil telah dipesan. Dan sistem menampilkan pembayaran telah berhasil.Jika uang lebih, maka sistem akan menampilkan jumlah kembaliannya. 
Fitur ini mensimulasikan proses transaksi pembayaran, termasuk pengecekan  kecukupan dana user.

6. Pencarian Kamar 
Jika user memilih fitur 1 (Cari Kamar), maka program akan : 
- Dapat memasukkan data Mobil yang ingin dicari. 
- Sistem akan menampilkan informasi Mobil jika ditemukan.
Fitur ini memudahkan dalam mencari data mobil tertentu yang diinginkan tanpa harus melihat keseluruhan daftar Mobil.
 
7. Pengurutan Kamar Berdasarkan Harga (termurah ke termahal) 
Jika user memilih fitur 4 (Urut mobil berdasarkan harga), maka program akan : 
- Mengurutkan data mobil berdasarkan dari yang termurah sampai yang termahal berdasarkan tipe, dan Harganya masing".  menggunakan sorting. 
- Setelah diurutkan, sistem akan menampilkan daftar Mobil kembali. 
Fitur ini membantu user  guna memilih mobil berdasarkan harga dari yang termurah sampai yang termahal.
 
8. Keluar dari Program 
Jika user memilih fitur 5 (Keluar), maka program akan menampilkan pesan  
“Terima kasih telah menggunakan layanan kami !”.  
Program ini akan terus berjalan sampai user dapat memilih fitur keluar, memastikan mereka untuk melakukan beberapa transaksi tanpa harus kembali ke program awal
