# 📱 Simple Word Validator - Tugas JUnit Kualitas Perangkat Lunak

Aplikasi Android sederhana yang dikembangkan untuk mendemonstrasikan praktik pengujian perangkat lunak (*Software Testing*) menggunakan **Local Unit Test (JUnit)** dan **Instrumented Test (Espresso)**.

Repositori ini dibuat untuk memenuhi Tugas mata kuliah Kualitas Perangkat Lunak.

## 🛠️ Teknologi & Framework
* **Bahasa** : Kotlin
* **IDE** : Android Studio
* **Local Test** : JUnit 4
* **UI/Instrumented Test** : AndroidX Espresso

## 📝 Deskripsi Project
Aplikasi ini memiliki satu halaman antarmuka yang meminta pengguna untuk memasukkan nama mereka. 
Sistem akan memvalidasi input tersebut dengan aturan:
1. Jika input **valid** (berisi teks), aplikasi akan menampilkan teks: `"Halo, [Nama]!"`.
2. Jika input **kosong**, aplikasi akan menampilkan pesan error: `"Input tidak boleh kosong!"`.

Logika validasi dipisahkan ke dalam kelas `WordValidator.kt` agar mudah diuji secara terisolasi.
