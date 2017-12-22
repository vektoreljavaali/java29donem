package com.sezgin;

public class ikinciSoru {

	/*
	
	2. soru çözüm yolu:
		•	Cümlenin tüm kelimelerini 5’li bir diziye ata
		o	İlk noktadan başlayarak boşluk ya da nokta ara.
		o	Boşluğu ya da noktayı  bulduğun zamanki lokasyonu işaretle
		o	Ilk nokta ile işaretlenen lokasyon arasından substring al
		o	Bu substring’I cümle dizisine ata, dizi sırasına +1 ekle
		o	Ilk noktayı işaretlenen nokta olarak belirle
		o	Eğer nokta tespit edilmediyse Döngüye devam et

		•	Tüm bağlaç, nesne vs. hepsini ayrı ayrı 5’li diziye ata
		•	Elinde toplam 6 adet dizi oldu.
		•	Kelimeleri birbirine eşitleyebilmek ancak ve ancak ilk iki karakterlerine bakarak mümkün oluyor. Problemi yaratan kelimeler “Ankaraya” ve “gideceğim”. 
		o	O yuzden tüm dizilerdeki her bir kelimenin ilk iki karakteri alınacak. 
		o	Bağlaç kelimelerinde iki tane sıfır karakterli kelime var: “”.
		o	O yüzden burada program hata verecek. Try cacth döngüsü ile buradaki hatayı ezip, sıfır karakterli bu iki bağlaç için “00” değerlerini ata.
		•	Artık elinde tüm dizi ifadelerinin iki karakterli halleri var. bu dizi isimlerine "2" ifadesi eklensin. Örneğin orjinal dizi cumle[] iken, iki karakterli dizi cumle2[] olsun.
		•	“Ar” ve “ar” büyük/küçük harf farklılığından dolayı problem çıkarmayacaktır.
		•	Ayrı ayrı if ya da case döngüleri ile eşleştirme yapılması. Örneğin bağlaç eşleştirmesi için;
		o	cümle2 dizisinin 1. elemanının 1 ve 2. Karakteri ile,
		o	baglac2 dizisinin 1. elemanının 1 ve 2. Karakterini karşılaştır,
			eğer her iki karakter de aynı ise cumle dizisinin 1. elemanını  baglac değişkenine ata.
			Eğer aynı değilse
			cümle2 dizisinin 1. elemanının 1 ve 2. Karakteri ile,
			baglac2 dizisinin 2. elemanının 1 ve 2. Karakterini karşılaştır
		•	eğer her iki karakter de aynı ise cumle dizisinin 1. elemanını  baglac değişkenine ata.
		•	Eğer aynı değilse
		o	…..
		o	Bu şekilde devam et. Burada şöyle bir Kabul yapıldı: cümlede bağlaç, yüklem, zarf gibi elemanlardan sadece ve en az 1 tane vardır.
		o	….
		o	….
		o	cümle2 dizisinin 1. elemanının 1 ve 2. Karakteri ile,
		o	zarf2 dizisinin 1. elemanının 1 ve 2. Karakterini karşılaştır,
			eğer her iki karakter de aynı ise cumle dizisinin 1. elemanını  zarf değişkenine ata.
			Eğer aynı değilse
			cümle2 dizisinin 1. elemanının 1 ve 2. Karakteri ile,
			zarf2 dizisinin 2. elemanının 1 ve 2. Karakterini karşılaştır
		•	eğer her iki karakter de aynı ise cumle dizisinin 1. elemanını  zarf değişkenine ata.
		•	Eğer aynı değilse
		o	…..
		o	Bu şekilde devam et. Burada şöyle bir Kabul yapıldı: cümlede bağlaç, yüklem, zarf gibi elemanlardan sadece ve en az 1 tane vardır.
		o	….
		o	….
		o	…
		o	…
		•	Ekrana 
		o	(baglac) ifadesi “bağlaçtır.”
		o	(zarf) ifadesi “zarftır.”  Şeklinde yazdır.

	
	
	*/
	
	
	
	
}
