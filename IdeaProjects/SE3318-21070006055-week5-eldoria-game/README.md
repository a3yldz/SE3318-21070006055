Eldoria Game Project

Bu proje, SE3318 Software Construction dersi kapsamında geliştirilen bir Java oyun simülasyonudur.
## Yapı

Proje bir **Maven** projesidir. Aşağıdaki sınıfları ve arayüzleri içerir:

### 🔹 `Character` (abstract class)
- Tüm karakterlerin üst sınıfıdır.
- Özellikler: `name`, `level`
- Soyut metot: `speak()`

### 🔹 `Hero` (class)
- `Character` sınıfından türemiştir.
- Oyuncunun oynayabileceği karakterlerdir.

### 🔹 `Enemy` (class)
- `Character` sınıfından türemiştir.
- Oyunun düşman karakterleridir.

### 🔹 `Questable` (interface)
- Görev alabilen karakterler bu arayüzü uygular.
- Metot: `acceptQuest(String questName)`

### 🔹 `QuestBoard` (class)
- `Questable` arayüzünü implemente eden karakterlere görev atar.

### 🔹 `BattleManager` (class)
- `Hero` ve `Enemy` arasında bir savaşı simüle eder.
- Seviye karşılaştırması ile kazananı belirler.

### 🔹 `Main` (class)
- Sistemin örnek kullanımını içerir.
- Karakterler oluşturulur, görev atanır, savaş yapılır.
