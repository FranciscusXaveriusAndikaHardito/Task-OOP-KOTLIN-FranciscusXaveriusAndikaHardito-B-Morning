package id.infinitelearning.KotlinSubmission.exercise3

fun main() {

    /** Latihan 1
    Buatlah logika if untuk mengevaluasi nilai score dengan ketentuan:
    1. Jika nilai score lebih atau sama dengan 90
    - Isi variabel result dengan nilai: 'Selamat! Anda mendapatkan nilai A.'
    2. Jika nilai score ada di antara 80 hingga 89
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai B.'
    3. Jika nilai score ada di antara 70 hingga 79
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai C.'
    4. Jika nilai score ada di antara 60 hingga 69:
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai D.'
    5. Jika nilai score di bawah 60:
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai E.'
     */
    // Buat di bawah sini
        println("Program Konversi Nilai ke Huruf")
        var totalNilai: Int
        var nilaiHuruf: Char
        totalNilai = 100;

            // Fungsi
            if (totalNilai >= 90) {
                nilaiHuruf = 'A'
                println("Selamat! Anda mendapatkan nilai : $nilaiHuruf")
            } else if (totalNilai >= 80 && totalNilai <= 89) {
                nilaiHuruf = 'B'
                println("Selamat! Anda mendapatkan nilai : $nilaiHuruf")
            } else if (totalNilai >= 70 && totalNilai <= 79) {
                nilaiHuruf = 'C'
                println("Selamat! Anda mendapatkan nilai : $nilaiHuruf")
            } else if (totalNilai >= 60 && totalNilai <= 69) {
                nilaiHuruf = 'D'
                println("Selamat! Anda mendapatkan nilai : $nilaiHuruf")
            } else if (totalNilai < 60 ) {
                nilaiHuruf = 'E'
                println("Selamat! Anda mendapatkan nilai : $nilaiHuruf")
            }



}