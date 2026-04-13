# 🛒 SauceDemo – Katalon Studio Automation

End-to-end test suite untuk demo e-commerce **[SauceDemo](https://www.saucedemo.com)** menggunakan **Katalon Studio**.

> Project ini merupakan versi automation berbeda dari [saucedemo-project](https://github.com/creedzr/saucedemo-project) yang menggunakan Cypress — di sini menggunakan Katalon Studio dengan Groovy.

---

## ✅ Fitur yang Diuji

| Modul | Skenario yang Tercover |
|---|---|
| Login | Valid credential, invalid username, invalid password, kombinasi invalid, empty username, empty password, empty keduanya |
| Sort | Sort A to Z, Z to A, Price Low to High, Price High to Low |
| Burger Menu | Visibility icon, open menu, close via X, navigate All Items, navigate About, logout, reset app state |
| Cart & Checkout | Add 2 items, add lebih dari 1 item, remove item di cart, complete checkout, cancel checkout, checkout tanpa produk |

---

## 🚀 Cara Menjalankan

> Katalon Studio sudah ter-install di komputer

1. Clone repo
```
git clone https://github.com/creedzr/katalon_web_ecomerce.git
```

2. Buka Katalon Studio → **Open Project** → pilih folder hasil clone

3. Jalankan via **Test Suite** atau **Test Suite Collection**:
   - Klik kanan Test Suite → **Run**
   - Pilih browser (direkomendasikan: **Microsoft Edge**)

---

## 📁 Struktur Folder

```
katalon_web_ecomerce/
├── Object Repository/     # Lokasi semua element/locator
├── Test Cases/            # Script test case (Groovy)
├── Test Suites/           # Kumpulan test suite
├── Scripts/               # Script pendukung
├── Profiles/              # Environment & variabel
└── settings/              # Konfigurasi project
```

---

## 🛠️ Tools & Tech

- **Katalon Studio** (Free Edition)
- **Groovy** (bahasa scripting)
- **Microsoft Edge** (browser eksekusi)
- **WebUI Built-in Keywords**

---

## 📝 Catatan

- Browser yang digunakan adalah **Microsoft Edge** karena Chrome memunculkan popup Google Password Manager yang dapat mengganggu jalannya test
- Project ini dibuat sebagai mini project portfolio untuk pembelajaran automation testing
