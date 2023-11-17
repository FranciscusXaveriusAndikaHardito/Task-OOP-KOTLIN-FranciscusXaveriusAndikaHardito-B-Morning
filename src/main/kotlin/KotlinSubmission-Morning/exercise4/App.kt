package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    val esTeh = EsTehStore()

    // Contoh 1: Pembelian berhasil
    esTeh.beliEsTeh(5, 30000)

    // Contoh 2: Stok tidak mencukupi
    esTeh.beliEsTeh(10, 60000)

    // Contoh 3: Pembayaran kurang
    esTeh.beliEsTeh(3, 10000)
}
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

class EsTehStore {
    var stock: Int = 10
    val hargaPerCup: Int = 5000

    fun beliEsTeh(jumlahCup: Int, pembayaran: Int) {
        try {
            // Mengecek apakah stok mencukupi
            if (jumlahCup > stock) {
                throw IllegalArgumentException("Stok tidak mencukupi. Sisa Stock $stock, Jumlah Yang dibeli $jumlahCup")
            }

            // Menghitung total harga
            val totalHarga = jumlahCup * hargaPerCup

            // Mengecek apakah pembayaran mencukupi
            if (pembayaran < totalHarga) {
                throw IllegalStateException("Pembayaran kurang. Total harga: $totalHarga, uang Yang Diberikan $pembayaran" +
                        "")
            }

            // Proses pembelian
            stock -= jumlahCup
            println("Pembelian berhasil! Sisa stok: $stock")

        } catch (e: IllegalArgumentException) {
            println("ERROR: ${e.message}")

        } catch (e: IllegalStateException) {
            println("ERROR: ${e.message}")

        } catch (e: Exception) {
            println("Terjadi ERORR yang tidak diketahui: ${e.message}")
        }
    }
}


