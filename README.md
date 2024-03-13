# Java Profiling and Performance Test

Name    : Ilham Abdillah Alhamdi <br>
NPM     : 2206081194 <br>
Class   : Advance Programming - A

## Reflection

### 1. Perbedaan _Performance Testing_ dan _Profiling_

Perbedaan _performance testing_ dengan JMeter dan _profiling_ dengan IntelliJ Profiler dapat dilihat dari aspek berikut.

1. Tujuan
   _Performance testing_ bertujuan untuk mensimulasikan sejumlah besar pengguna untuk menilai seberapa baik kinerja
   aplikasi dalam berbagai kondisi, seperti beban pengguna yang berat, _request_ secara bersamaan, atau penggunaan yang
   berkepanjangan. Sedangkan _profiling_ dirancang untuk menganalisis _runtime behaviour_ aplikasi secara mendalam.
   _Profiling_ juga dapat membantu mengidentifikasi _bottleneck_, _memory leaks_, dan kode yang menghabiskan banyak
   _resource_ sehingga dapat memberikan wawasan tentang bagaimana aplikasi berperilaku selama eksekusi.
2. Scope
   _Performance testing_ berfokus pada pengukuran dan penilaian performa aplikasi secara **keseluruhan**, termasuk
   _response
   time_, _throughput_, dan pemanfaatan _resource_ seperti memori. Sedangkan _profiling_ berfokus pada detail eksekusi
   aplikasi seperti, bagian _method_, _class_, atau _object_ tertentu yang menyebabkan masalah performa.

### 2. Bagaiamana _Profiling_ Membantu Menemukan Kelemahan dalam Aplikasi?

Proses _profiling_ sangat membantu developer untuk menemukan kelemahan-kelemahan tertentu dalam aplikasinya. Salah
satunya adalah menemukan _performance bottleneck_ dalam aplikasi. Proses _profiling_ membantu menentukan area kode yang
menggunakan _resource_ dalam jumlah yang tidak proporsional, seperti _CPU time_, _memory_, atau I/O disk. Dengan
mengidentifikasi hal ini, developer dapat memfokuskan pengoptimalan bagian tertentu dari kode
untuk meningkatkan kinerja secara keseluruhan. Misalnya, apabila ada method atau class tertentu yang memerlukan waktu
eksekusi yang lama atau menghabiskan banyak memori, _profiling tools_, seperti IntelliJ Profiler, dapat membantu
menemukannya sehingga developer dapat fokus mengoptimalkan kode tersebut.

### 3. Apakah IntelliJ Profiler Efektif dalam Identifikasi _Bottleneck_

Ya, IntelliJ Profiler sangat membantu mengidentifikasi dan menganalisis _bottleneck_ dalam proyek ini. Misalnya, saya
dapat menemukan _hotspot_ kode yang memerlukan waktu eksekusi lama atau menghabiskan banyak memori. Selain itu, _tools_
ini juga dapat memberikan perbandingan hasil pengukuran kode sebelum dan setelah optimasi. Hal ini tentunya memberikan
kemudahan bagi developer untuk mengukur seberapa optimal kode yang telah dibuat.

### 4. Tantangan dalam Melakukan _Performance Testing_ dan _Profiling_

Dalam melakukan demo ini saya tidak mengalami tantangan yang cukup berarti, baik dalam proses _performance testing_
maupun _profiling_. Akan tetapi, mungkin data hasil kedua test tersebut belum merepresentasikan kejadian yang sebenarnya
pada _production environment_ sehingga dapat dinilai belum cukup akurat. Jika akurasi data diperlukan, tantangan
terbesarnya ialah bagaimana melakukan setup environment sehingga menyerupai dengan production environment. Misalnya
adalah melakukan setup database sehingga mirip dengan setup database di production.

### 5. Keuntungan Menggunakan IntelliJ Profiling sebagai _Profiling Tools_

Di antara sekian banyak _profiling tools_ yang tersedia, IntelliJ Profiling dipilih sebagai _profiling tools_ dalam
proyek ini. Tentunya hal ini bukan tanpa alasan. IntelliJ Profiling memberikan kemudahan kepada developer untuk
menjalankan proses _profiling_ hanya di dalam IDE-nya saja, tanpa perlu _third party tools_. Dengan demikian, developer
dapat berfokus pada optimasi kode tanpa perlu bolak-balik _code editor_ dengan _profiling tools_. Selain itu, fitur
_profiling_ dalam IntelliJ Profiler juga cukup lengkap. Di dalamnya sudah tersedia _tools_ untuk merekam aktivitas
aplikasi, merepresentasikan data dalam berbagai format (_flame graph_, _timeline_, _call tree_), dan membandingkan data
_profiling_ satu dengan lainnya (_comparison_).

### 6. Bagaimana Jika Hasil _Profiling_ Tidak Konsisten dengan Hasil _Performance Test_?

Berikut merupakan langkah yang dapat dilakukan apabila terjadi inkonsistensi antara data hasil _profiling_ dengan
_performance test_.

1. Analisis Perbedaan Hasil
   Cek kembali apakah perbedaan terjadi pada metrik/parameter tertentu, seperti _response time_, _CPU time_, dan
   penggunaan _memory_.
2. Cek Environment
   Perbedaan data hasil tes mungkin disebabkan oleh perbedaan environment saat menjalankan _profiling tools_ dan
   _performance testing_.
3. Verifikasi Skenario Test
   Tinjau ulang skenario test yang digunakan pada saat menjalankan _profiling tools_ dan
   _performance testing_. Tentunya perbedaan skenario menyebabkan perbedaan pada hasil test.
4. Fokus pada Metriks/Parameter Tertentu
   Jika metrik tertentu menyebabkan perbedaan, fokuslah pada metrik tersebut satu per satu. Misalnya, jika _response
   time_  berbeda, analisis faktor-faktor yang memengaruhinya, seperti _server-side processing_, latensi jaringan, atau
   koneksi dengan database yang mungkin berkontribusi terhadap perbedaan tersebut.
5. Iterative Testing
   Lakukan pengujian secara berulang pada kedua proses. Buat perubahan bertahap pada aplikasi atau skenario pengujian
   dan amati bagaimana hasilnya berubah. Hal ini dapat membantu menentukan kondisi atau perubahan spesifik yang
   menyebabkan inkonsistensi.

### 7. Strategi Implementasi Optimasi Aplikasi

Untuk melakukan optimasi, saya melakukan perubahan secara iteratif dan bertahap pada hotspot kode yang menyebabkan
_bottleneck_. Hal ini memungkinkan kita melihat hasil optimasi sembari membandingkan fungsionalitas program setelah
optimasi. Apabila terjadi perubahan fungsionalitas setelah optimasi, kita dapat mengembalikan ke kode semula atau
memperbaikinya. Tentunya akan lebih meyakinkan apabila kita menuliskan test case terlebih dahulu. Dengan demikian, kita
hanya perlu fokus pada optimasinya saja.


