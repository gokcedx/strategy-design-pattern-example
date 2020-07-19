# strategy-design-pattern-example

Bir işlemi yapabileceğimiz birden fazla algoritmaya sahipsek bu durumda Strategy tasarım kalıbı kullanılabilir. 
Sistem gereksinimleri doğrultusunda en uygun yöntem seçilerek işlem gerçekleştirilir.


Bu örnekte; bir oyun indirmek için farklı stratejiler belirledik:
steam yöntemi - web sayfasından indirme yöntemi - torrent üzerinden indirme yöntemi.

Hepsi farklı yöntemler ile giriş/doğrulama yapıyor ancak sonucunda hepsinde istediğimiz oyun iniyor. Yani olayın nasıl gerçekleştiği önemli değil, önemli olan hangi stratejiyi kullanmak istediğimiz.
