package BM408Y_B09P01;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Veritabaniİslem {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection baglanti = VeritabaniBaglanti.dbBaglanti();
		Statement ifade = baglanti.createStatement();

		/*
		 * String SQLifade = "Create database BM408Y_VT03"; int etkilenensatirsayisi =
		 * ifade.executeUpdate(SQLifade); if (etkilenensatirsayisi == 0)
		 * System.out.println("BM408Y_VT03 Veritabani olusturulmustur.");
		 */

		//tablolar CREATE
		/*
		String SQLifade1 = "CREATE TABLE personel" + 
							"(id int," + 
							"departman_id int," + 
							"ad NVARCHAR(32)," + 
							"soyad NVARCHAR(32)," + 
							"email NVARCHAR(32)," + 
							"dogum date," + 
							"maas  int," + 
							"PRIMARY KEY (id));";

		String SQLifade2 = "CREATE TABLE urun" + 
							"(id int," + 
							"ad NVARCHAR(32)," + 
							"gorsel NVARCHAR(32)," + 
							"PRIMARY KEY (id));";

		String SQLifade3 = "CREATE TABLE departman" + 
							"(id int," + 
							"ad NVARCHAR(32)," + 
							"odano int,"+ 
							"PRIMARY KEY (id));";

		String SQLifade4 = "CREATE TABLE musteri" + 
							"(id int," + 
							"ulke_id NVARCHAR(32)," + 
							"ad NVARCHAR(32)," + 
							"soyad NVARCHAR(32)," + 
							"email NVARCHAR(32)," + 
							"dogum date," + 
							"kullaniciadi NVARCHAR(32)," + 
							"sifre NVARCHAR(32)," + 
							"PRIMARY KEY (id));";
		
		String SQLifade5 = "CREATE TABLE ulke" + 
							"(id NVARCHAR(32)," + 
							"ad NVARCHAR(32)," + 
							"orjinalad NVARCHAR(32)," + 
							"PRIMARY KEY (id));";

		String SQLifade6 = "CREATE TABLE firma" + 
							"(id int," + 
							"ad NVARCHAR(32)," + 
							"PRIMARY KEY (id));";

		String SQLifade7 = "CREATE TABLE firma_adres" + 
							"(id int," + 
							"firma_id int," + 
							"baslangic date," + 
							"bitis date," +
							"adres NVARCHAR(32)," + 
							"telefon NVARCHAR(32)," + 
							"faks NVARCHAR(32)," + 
							"PRIMARY KEY (id));";
		
		String SQLifade8 = "CREATE TABLE urun_fiyat" + 
							"(id int," + 
							"baslangic date," + 
							"bitis date," + 
							"urun_id int," + 
							"fiyat int," + 
							"PRIMARY KEY (id));";
		
		String SQLifade9 = "CREATE TABLE urun_grup" + 
							"(id int," + 
							"urun_id int," + 
							"ad NVARCHAR(32)," + 
							"PRIMARY KEY (id));";
		
		String SQLifade10 = "CREATE TABLE siparis_baslik" + 
							"(id int," + 
							"tarih date," + 
							"musteri_id int," + 
							"PRIMARY KEY (id));";
		
		String SQLifade11 = "CREATE TABLE siparis_kalem" + 
							"(id int," + 
							"siparis_id int," + 
							"urun_id int," + 
							"adet int," + 
							"PRIMARY KEY (id));";
		
		String SQLifade12 = "CREATE TABLE teslimat_kalem" + 
							"(id int," + 
							"teslimat_id int," + 
							"siparis_kalem_id int," + 
							"PRIMARY KEY (id));";
		
		String SQLifade13 = "CREATE TABLE teslimat_baslik" + 
							"(id int," + 
							"musteri_id int," + 
							"tarih date," + 
							"notlar NVARCHAR(32)," + 
							"PRIMARY KEY (id));";

		int etkilenensatirsayisi1=ifade.executeUpdate(SQLifade1);
		if(etkilenensatirsayisi1==0)
		System.out.println("Personel Tablosu olusturulmustur.");
		
		int etkilenensatirsayisi2=ifade.executeUpdate(SQLifade2); 
		if(etkilenensatirsayisi2==0)
		System.out.println("urun Tablosu olusturulmustur."); 
		
		int etkilenensatirsayisi3=ifade.executeUpdate(SQLifade3); 
		if(etkilenensatirsayisi3==0)
		System.out.println("departman Tablosu olusturulmustur."); 
		
		int etkilenensatirsayisi4=ifade.executeUpdate(SQLifade4); 
		if(etkilenensatirsayisi4==0)
		System.out.println("musteri Tablosu olusturulmustur."); 
		
		int etkilenensatirsayisi5=ifade.executeUpdate(SQLifade5); 
		if(etkilenensatirsayisi5==0)
		System.out.println("ulke Tablosu olusturulmustur."); 
		
		int etkilenensatirsayisi6=ifade.executeUpdate(SQLifade6); 
		if(etkilenensatirsayisi6==0)
		System.out.println("firma Tablosu olusturulmustur."); 
		
		int etkilenensatirsayisi7=ifade.executeUpdate(SQLifade7); 
		if(etkilenensatirsayisi7==0)
		System.out.println("firma_adres Tablosu olusturulmustur.");
		
		int etkilenensatirsayisi8=ifade.executeUpdate(SQLifade8);
		if(etkilenensatirsayisi8==0)
		System.out.println("urun_fiyat Tablosu olusturulmustur.");
		
		int etkilenensatirsayisi9=ifade.executeUpdate(SQLifade9);
		if(etkilenensatirsayisi9==0)
		System.out.println("urun_grup Tablosu olusturulmustur.");

		int etkilenensatirsayisi10=ifade.executeUpdate(SQLifade10);
		if(etkilenensatirsayisi10==0)
		System.out.println("siparis_baslik Tablosu olusturulmustur.");
		
		int etkilenensatirsayisi11=ifade.executeUpdate(SQLifade11);
		if(etkilenensatirsayisi11==0)
		System.out.println("siparis_kalem	Tablosu olusturulmustur.");
		
		int etkilenensatirsayisi12=ifade.executeUpdate(SQLifade12);
		if(etkilenensatirsayisi12==0)
		System.out.println("teslimat_kalem Tablosu olusturulmustur.");
		
		int etkilenensatirsayisi13=ifade.executeUpdate(SQLifade13);
		if(etkilenensatirsayisi13==0)
		System.out.println("teslimat_baslik Tablosu olusturulmustur.");
		
		*/
		//INSERT İŞLEMLERİ
		
		String SQLifade14 = "Insert into personel(id, departman_id, ad, soyad, email, dogum, maas) " +
										"values (8, 8,'Emre','Büyükkalfa','emrebuyukkalfa@hotmail.com', '1978-07-13',2000); " +
							"Insert into personel(id, departman_id, ad, soyad, email, dogum, maas) " + 
										"values (9, 4, 'Ali','Polat','hasanali@hotmail.com', '1978-09-05', 3500); "+
							"Insert into personel(id, departman_id, ad, soyad, email, dogum, maas) " + 
										"values (10, 5, 'Özgür','Şengül','ozgursengul@yahoo.com', '1981-11-16',900); " +
							"Insert into personel(id, departman_id, ad, soyad, email, dogum, maas) " + 
										"values (11, 5, 'Can','Göksun','cangoksun@gmail.com', '1980-05-19', 1200);"	+
							"Insert into personel(id, departman_id, ad, soyad, email, dogum, maas) " + 
										"values (12, 5, 'Dara','Ganjiavi','daragan@yahoo.com', '1975-02-14',1500);" +
							"Insert into personel(id, departman_id, ad, soyad, email, dogum, maas) " + 
										"values (13, 5, 'Elif','Akşar','elifeel@hotmail.com', '1975-12-26', 750);"+
							"Insert into personel(id, departman_id, ad, soyad, email, dogum, maas) " + 
										"values (14, 3, 'Azade','Çerkezoğlu','info@azade.info.com', '1979-09-05',2200);" +
							"Insert into personel(id, departman_id, ad, soyad, email, dogum, maas) " + 
										"values (15, 3, 'Asude','Çerkezoğlu','asude@gmail.com', '1973-09-05',1100);" +
							"Insert into personel(id, departman_id, ad, soyad, email, dogum, maas) " + 
										"values (16, 8, 'Cengiz','Çerkezoğlu','cengiz@gmail.com', '1950-01-01',2600);" +
							"Insert into personel(id, departman_id, ad, soyad, email, dogum, maas) " + 
										"values (17, 5, 'Seval','Çerkezoğlu','sevalc@gmail.com', '1962-05-01',1200);" +
							"Insert into personel(id, departman_id, ad, soyad, email, dogum, maas) " + 
										"values (18, 8, 'Aytek','Karadeniz','aytek@ghotmail.com', '1983-10-11',950);";
		
		
		String SQLifade15 =  "Insert into urun(id, ad, gorsel)" + "values (1,'Boş CD','cd.jpg');" +
							"Insert into urun(id, ad, gorsel)" + "values (2,'A4 Kağıt','kagit.jpg');" + 
							"Insert into urun(id, ad, gorsel)" + "values (3,'Boş DVD','cd.jpg');" + 
							"Insert into urun(id, ad, gorsel)" + "values (4,'HP Laptop','hp.jpg');" + 
							"Insert into urun(id, ad, gorsel)" + "values (5,'Toshiba Laptop','toshiba.jpg');" + 
							"Insert into urun(id, ad, gorsel)" + "values (6,'Casper Masaüstü Bilgisayar','casper.jpg');" +				
							"Insert into urun(id, ad, gorsel)" + "values (7,'Programcılık Mantığı','program.jpg');" +
							"Insert into urun(id, ad, gorsel)" + "values (8,'Bilgisayar Destekli Müzik','bdm.jpg');" + 
							"Insert into urun(id, ad, gorsel)" + "values (9,'Nokia 6260','n6260.jpg');" + 
							"Insert into urun(id, ad, gorsel)" + "values (10,'Siemens SX1', 'sx1.jpg');";

		String SQLifade16 = "Insert into departman(id, ad, odano)" + "values (1,'Muhasebe',1312);" +
							"Insert into departman(id, ad, odano)" + "values (2,'İnsan Kaynakları',2435);" + 
							"Insert into departman(id, ad, odano)" + "values (3,'Pazarlama',4235);" +  
							"Insert into departman(id, ad, odano)" + "values (4,'IT',6235);" +
							"Insert into departman(id, ad, odano)" + "values (5,'Üretim',1324);" +
							"Insert into departman(id, ad, odano)" + "values (6,'Temizlik',4432);" +
							"Insert into departman(id, ad, odano)" + "values (7,'Güvenlik',2665);" +
							"Insert into departman(id, ad, odano)" + "values (8,'Yönetim',8565);" +
							"Insert into departman(id, ad, odano)" + "values (9,'Lojistik',3456);";

		String SQLifade17 = "Insert into musteri(id, ulke_id, ad, soyad, email, dogum, kullaniciadi, sifre)" +
										"values (1, 'TR', 'Bülent', 'Muska', 'bulentmuska@msn.com', '1980-10-13', 'bulent','muska');" +
							"Insert into musteri(id, ulke_id, ad, soyad, email, dogum, kullaniciadi, sifre)" +
										"values (2, 'TR', 'Nuri', 'Çolak', 'nuric@hotmail.com', '1976-06-13', 'nuri', 'muska');" +
							"Insert into musteri(id, ulke_id, ad, soyad, email, dogum, kullaniciadi, sifre)" +
										"values (3, 'TR', 'Mete', 'Çağlayan', 'mete.caglayan@sap.com', '1976-01- 13', 'mete','muska');" +
							"Insert into musteri(id, ulke_id, ad, soyad, email, dogum, kullaniciadi, sifre)" +
										"values (4, 'TR', 'Begüm', 'Güven', 'begum77@yahoo.com', '1977-11-13', 'begum','muska');" +
							"Insert into musteri(id, ulke_id, ad, soyad, email, dogum, kullaniciadi, sifre)" +
										"values (5, 'DE', 'Buket', 'Akçetin', 'buket.akcetin@klueber.de', '1978-06- 13','buket', 'muska');" +
							"Insert into musteri(id, ulke_id, ad, soyad, email, dogum, kullaniciadi, sifre)" +
										"values (6, 'TR', 'Cemal', 'Cinkılıç', 'cemal@doublekey.org', '1978-12-13', 'cemal', 'muska');" +
							"insert into musteri(id, ulke_id, ad, soyad, email, dogum, kullaniciadi, sifre)" +
										"values (7, 'TR', 'Burak', 'Göreli', 'burakgoreli@diss.com', '1972-10-13', 'burak','muska');" +
							"Insert into musteri(id, ulke_id, ad, soyad, email, dogum, kullaniciadi, sifre)" +
										"values (8, 'TR', 'Okay', 'Alp', 'okay@gmail.com', '1974-07-13', 'okay', 'muska');" +
							"Insert into musteri(id, ulke_id, ad, soyad, email, dogum, kullaniciadi, sifre)" +
										"values (9, 'TR', 'Azra', 'Yalnız', 'azra@gmail.com', '1972-10-13', 'azra', 'muska');" +
							"insert into musteri(id, ulke_id, ad, soyad, email, dogum, kullaniciadi, sifre)" +
										"values (10, 'TR', 'Oya', 'Başar', 'oyabas@hotmail.com', '1973-02-13', 'oya', 'muska');" +
							"Insert into musteri(id, ulke_id, ad, soyad, email, dogum, kullaniciadi, sifre)" +
										"values (11, 'TR', 'Kayıhan', 'Onuk', 'kayihano@hotmail.com', '1978-03-13', 'kayihan','muska');" +
							"Insert into musteri(id, ulke_id, ad, soyad, email, dogum, kullaniciadi, sifre)" +
										"values (12, 'TR', 'Tolga', 'Ader', 'tolgader@hotmail.com', '1972-10-13', 'tolga','muska');" +
							"insert into musteri(id, ulke_id, ad, soyad, email, dogum, kullaniciadi, sifre)" +
										"values (13, 'TR', 'Tolga', 'Çavuşoğlu', 'tolga.cavusoglu@eczacibasi.com', '1972-07-13', 'tolga', 'muska');" +
							"Insert into musteri(id, ulke_id, ad, soyad, email, dogum, kullaniciadi, sifre)" +
										"values (14, 'TR', 'Volkan', 'Özkoçak', 'master@gmail.com', '1970-10-13', 'volkan','muska');" +
							"Insert into musteri(id, ulke_id, ad, soyad, email, dogum, kullaniciadi, sifre)" +
										"values (15, 'UK', 'Melissa', 'Crawford', 'melcrawmirc.co.uk', '1983-10- 13', 'melissa','muska');" +
							"Insert into musteri(id, ulke_id, ad, soyad, email, dogum, kullaniciadi, sifre)" +
										"values (16, 'TR', 'Barış', 'Çekiç', 'baris.cekic@t-systems.com.tr', '1970- 10-13','baris', 'muska');" + "" +
							"insert into musteri(id, ulke_id, ad, soyad, email, dogum, kullaniciadi, sifre)" +
										"values (17, 'DE', 'Horst', 'Müller', 'horst@gmail.com', '1970-07-13', 'horst','muska');" +
							"Insert into musteri(id, ulke_id, ad, soyad, email, dogum, kullaniciadi, sifre)" +
										"values (18, 'DE', 'Kurt', 'Frankfurter', 'kurtfrank@yahoo.com', '1971-05- 13', 'kurt','muska');" +
							"Insert into musteri(id, ulke_id, ad, soyad, email, dogum, kullaniciadi, sifre)" +
										"values (19, 'TR', 'Yavuz', 'Çetin', 'yavuz.cetin@otherside.com', '1970-05- 13','yavuz', 'muska');" +
							"Insert into musteri(id, ulke_id, ad, soyad, email, dogum, kullaniciadi, sifre)" +
										"values (20, 'TR', 'Kerim', 'Çaplı', 'kerim.capli@otherside.com', '1960-08- 13','kerim', 'muska');";

		
		
		
		
		String SQLifade18 = "Insert into ulke(id, ad, orjinalad)" + "values ('DE', 'Almanya', 'Deutschland');" +
							"Insert into ulke(id, ad, orjinalad)" + "values ('TR', 'Türkiye', 'Türkiye');" + 
							"Insert into ulke(id, ad, orjinalad)" + "values ('UK', 'İngiltere', 'England');";

		
		String SQLifade19 = "Insert into firma(id, ad)" + "values (1, 'Çözümevi');" +
							"Insert into firma(id, ad)" + "values (2, 'T-Systems');" + 
							"Insert into firma(id, ad)" + "values (3, 'SBS');" + 
							"Insert into firma(id, ad)" + "values (4, 'Delphi');";

		
		
		String SQLifade20 = "Insert into firma_adres(id, firma_id, baslangic, bitis, adres, telefon, faks)" +
											"values (1, 1, '2004-01-01', '2004-12-31', 'Erenköy İstanbul','02164671458','02164671459');" +
							"Insert into firma_adres(id, firma_id, baslangic, bitis, adres, telefon, faks)" +
											"values (2, 2, '2004-01-01', '9999-12-31', 'Mecidiyeköy İstanbul','02121112233','02122223344');" +
							"Insert into firma_adres(id, firma_id, baslangic, bitis, adres, telefon, faks)" +
											"values (3, 3, '2004-01-01', '2005-05-31', 'Kartal İstanbul','02163334455','02167748594');" +
							"Insert into firma_adres(id, firma_id, baslangic, bitis, adres, telefon, faks)" +
											"values (4, 4, '2004-01-01', '9999-12-31', 'Dudullu İstanbul','02164756475','02169405839');" +
							"Insert into firma_adres(id, firma_id, baslangic, bitis, adres, telefon, faks)" +
											"values (5, 1, '2005-01-01', '9999-12-31', 'Kozyatağı İstanbul','02164671458','02164671459');" +
							"Insert into firma_adres(id, firma_id, baslangic, bitis, adres, telefon, faks)" +
											"values (6, 2, '2005-06-01', '9999-12-31', 'Maslak İstanbul','02125344332','02125344335');";
		
		String SQLifade21 = "Insert into urun_fiyat(id, baslangic, bitis, urun_id, fiyat)" +
											"values (1, '2004-03-01', '2005-02-28', 1, 1);" +
							"Insert into urun_fiyat(id, baslangic, bitis, urun_id, fiyat)" + 
											"values (2, '2004-03-01', '2005-02-28', 2, 5);" +
							"Insert into urun_fiyat(id, baslangic, bitis, urun_id, fiyat)" + 
											"values (3, '2004-03-01', '2005-02-28', 3, 10);" +
							"Insert into urun_fiyat(id, baslangic, bitis, urun_id, fiyat)" + 
											"values (4, '2004-03-01', '2005-02-28', 4, 1200);" +
							"Insert into urun_fiyat(id, baslangic, bitis, urun_id, fiyat)" + 
											"values (5, '2004-03-01', '2005-02-28', 5, 1499);" +
							"Insert into urun_fiyat(id, baslangic, bitis, urun_id, fiyat)" +	 
											"values (6, '2004-03-01', '2005-02-28', 6, 800);" +
							"Insert into urun_fiyat(id, baslangic, bitis, urun_id, fiyat)" + 
											"values (7, '2004-03-01', '2005-02-28', 7, 30);" +
							"Insert into urun_fiyat(id, baslangic, bitis, urun_id, fiyat)" + 
											"values (8, '2004-03-01', '2005-02-28', 8, 15);" +
							"Insert into urun_fiyat(id, baslangic, bitis, urun_id, fiyat)" + 
											"values (9, '2005-03-01', '2006-02-28', 1, 2);" +
							"Insert into urun_fiyat(id, baslangic, bitis, urun_id, fiyat)" + 
											"values (10, '2005-03-01', '2006-02-28', 2, 6);" +
							"Insert into urun_fiyat(id, baslangic, bitis, urun_id, fiyat)" + 
											"values (11, '2005-03-01', '2006-02-28', 3, 12);" +
							"Insert into urun_fiyat(id, baslangic, bitis, urun_id, fiyat)" + 
											"values (12, '2005-03-01', '2006-02-28', 4, 1100);" +
							"Insert into urun_fiyat(id, baslangic, bitis, urun_id, fiyat)" + 
											"values (13, '2005-03-01', '2006-02-28', 5, 1200);" +
							"Insert into urun_fiyat(id, baslangic, bitis, urun_id, fiyat)" + 
											"values (14, '2005-03-01', '2006-02-28', 6, 750);" +
							"Insert into urun_fiyat(id, baslangic, bitis, urun_id, fiyat)" + 
											"values (15, '2005-03-01', '2006-02-28', 7, 25);" +
							"Insert into urun_fiyat(id, baslangic, bitis, urun_id, fiyat)" + 
											"values (16, '2005-03-01', '2006-02-28', 8, 12);" +
							"Insert into urun_fiyat(id, baslangic, bitis, urun_id, fiyat)" + 
											"values (17, '2004-03-01', '2005-02-28', 9, 450);" +
							"Insert into urun_fiyat(id, baslangic, bitis, urun_id, fiyat)" + 
											"values (18, '2004-03-01', '2005-02-28', 10, 500);" +
							"Insert into urun_fiyat(id, baslangic, bitis, urun_id, fiyat)" + 
											"values (19, '2005-03-01', '2006-02-28', 9, 400);" +
							"Insert into urun_fiyat(id, baslangic, bitis, urun_id, fiyat)" + 
											"values (20, '2005-03-01', '2006-02-28', 10, 450);";

		
		String SQLifade22 = "Insert into urun_grup(id, urun_id, ad)" + "values (1, 5, 'Sarf Malzemeleri');" +
							"Insert into urun_grup(id, urun_id, ad)" + "values (2, 4, 'Bilgisayarlar');" + 
							"Insert into urun_grup(id, urun_id, ad)" + "values (3, 5, 'Kitaplar');" +
							"Insert into urun_grup(id, urun_id, ad)" + "values (4, 0, 'Elektronik ürünler');" + 
							"Insert into urun_grup(id, urun_id, ad)" + "values (5, 0, 'Diğer ürünler');" + 
							"Insert into urun_grup(id, urun_id, ad)" + "values (6, 4, 'Cep telefonları');" + 
							"Insert into urun_grup(id, urun_id, ad)" + "values (7, 4, 'PDA cihazları');" + 
							"Insert into urun_grup(id, urun_id, ad)" + "values (8, 7, 'Windows CE tabanlı');" + 
							"Insert into urun_grup(id, urun_id, ad)" + "values (9, 7, 'Palm OS tabanlı');";
		
		String SQLifade23 = "Insert into siparis_baslik(id, tarih, musteri_id)" + "values (1, '2005-01-01', 18);" +
							"Insert into siparis_baslik(id, tarih, musteri_id)" + "values (2, '2005-01-01', 2);" +
							"Insert into siparis_baslik(id, tarih, musteri_id)" + "values (3, '2005-01-03', 2);" +
							"Insert into siparis_baslik(id, tarih, musteri_id)" + "values (4, '2005-01-04', 7);" +
							"Insert into siparis_baslik(id, tarih, musteri_id)" + "values (5, '2005-01-05', 9);" +
							"Insert into siparis_baslik(id, tarih, musteri_id)" + "values (6, '2005-01-05', 15);" +
							"Insert into siparis_baslik(id, tarih, musteri_id)" + "values (7, '2005-01-12', 20);" +			 
							"Insert into siparis_baslik(id, tarih, musteri_id)" + "values (8, '2005-04-04', 2);" +
							"Insert into siparis_baslik(id, tarih, musteri_id)" + "values (9, '2005-04-10', 1);";


		String SQLifade24 = "Insert into siparis_kalem (id, siparis_id, urun_id, adet)" + "values (1,1,1,1);" +
							"Insert into siparis_kalem (id, siparis_id, urun_id, adet)" + "values (2,1,4,1);" +
							"Insert into siparis_kalem (id, siparis_id, urun_id, adet)" + "values (3,2,5,1);" +
							"Insert into siparis_kalem (id, siparis_id, urun_id, adet)" + "values (4,2,3,2);" +
							"Insert into siparis_kalem (id, siparis_id, urun_id, adet)" + "values (5,2,4,1);" +
							"Insert into siparis_kalem (id, siparis_id, urun_id, adet)" + "values (6,3,2,1);" +
							"Insert into siparis_kalem (id, siparis_id, urun_id, adet)" + "values (7,3,3,1);" +
							"Insert into siparis_kalem (id, siparis_id, urun_id, adet)" + "values (8,4,4,2);" +
							"Insert into siparis_kalem (id, siparis_id, urun_id, adet)" + "values (9,4,3,1);" +
							"Insert into siparis_kalem (id, siparis_id, urun_id, adet)" + "values (10,4,6,1);" +
							"Insert into siparis_kalem (id, siparis_id, urun_id, adet)" + "values (11,5,2,1);" +
							"Insert into siparis_kalem (id, siparis_id, urun_id, adet)" + "values (12,5,1,2);" +
							"Insert into siparis_kalem (id, siparis_id, urun_id, adet)" + "values (13,5,4,1);" +
							"Insert into siparis_kalem (id, siparis_id, urun_id, adet)" + "values (14,5,1,1);" +
							"Insert into siparis_kalem (id, siparis_id, urun_id, adet)" + "values (15,6,7,1);" +
							"Insert into siparis_kalem (id, siparis_id, urun_id, adet)" + "values (16,7,3,3);" +
							"Insert into siparis_kalem (id, siparis_id, urun_id, adet)" + "values (17,7,5,1);" +
							"Insert into siparis_kalem (id, siparis_id, urun_id, adet)" + "values (18,8,8,1);" +
							"Insert into siparis_kalem (id, siparis_id, urun_id, adet)" + "values (19,8,2,1);" +
							"Insert into siparis_kalem (id, siparis_id, urun_id, adet)" + "values (20,8,6,2);" +
							"Insert into siparis_kalem (id, siparis_id, urun_id, adet)" + "values (21,9,1,1);" +
							"Insert into siparis_kalem (id, siparis_id, urun_id, adet)" + "values (22,9,7,2);" +
							"Insert into siparis_kalem (id, siparis_id, urun_id, adet)" + "values (23,9,8,3);";

		
		String SQLifade25 = "Insert into teslimat_kalem (id, teslimat_id, siparis_kalem_id)" + "values (8,1,1);" +
							"Insert into teslimat_kalem (id, teslimat_id, siparis_kalem_id)" + "values (9,1,2);" +
							"Insert into teslimat_kalem (id, teslimat_id, siparis_kalem_id)" + "values (10,2,3);" +
							"Insert into teslimat_kalem (id, teslimat_id, siparis_kalem_id)" + "values (11,2,4);" +							 
							"Insert into teslimat_kalem (id, teslimat_id, siparis_kalem_id)" + "values (12,2,5);" +
							"Insert into teslimat_kalem (id, teslimat_id, siparis_kalem_id)" + "values (13,2,6);" +
							"Insert into teslimat_kalem (id, teslimat_id, siparis_kalem_id)" + "values (14,2,7);" +
							"Insert into teslimat_kalem (id, teslimat_id, siparis_kalem_id)" + "values (15,3,8);" +
							"Insert into teslimat_kalem (id, teslimat_id, siparis_kalem_id)" + "values (16,3,9);" +
							"Insert into teslimat_kalem (id, teslimat_id, siparis_kalem_id)" + "values (17,3,10);" +
							"Insert into teslimat_kalem (id, teslimat_id, siparis_kalem_id)" + "values (18,4,11);" +
							"Insert into teslimat_kalem (id, teslimat_id, siparis_kalem_id)" + "values (19,4,12);" +
							"Insert into teslimat_kalem (id, teslimat_id, siparis_kalem_id)" + "values (20,4,13);" +
							"Insert into teslimat_kalem (id, teslimat_id, siparis_kalem_id)" + "values (21,4,14);" +
							"Insert into teslimat_kalem (id, teslimat_id, siparis_kalem_id)" + "values (22,5,15);" +
							"Insert into teslimat_kalem (id, teslimat_id, siparis_kalem_id)" + "values (23,6,16);" +
							"Insert into teslimat_kalem (id, teslimat_id, siparis_kalem_id)" + "values (24,6,17);";

		String SQLifade26 = "Insert into teslimat_baslik (id, musteri_id, tarih, notlar)" +
												 "values (1, 18, '2005-01-03', 'Hediye paketi');" + 
							"Insert into teslimat_baslik (id, musteri_id, tarih, notlar)" +
												 "values (2, 2, '2005-01-05', 'İki sipariş');" +  
							"Insert into teslimat_baslik (id, musteri_id, tarih, notlar)" +
												 "values (3, 7, '2005-01-10', 'Tek sipariş');" +  
							"Insert into teslimat_baslik (id, musteri_id, tarih, notlar)" +
												 "values (4, 9, '2005-01-08', 'Peşin ödenmişti');" + 
							"Insert into teslimat_baslik (id, musteri_id, tarih, notlar)" +
												 "values (5, 15, '2005-01-08', 'Uzak bölge');" +  
							"Insert into teslimat_baslik (id, musteri_id, tarih, notlar)" +
												 "values (6, 20, '2005-01-12', 'Hediye paketi');";

		int etkilenensatirsayisi14 = ifade.executeUpdate(SQLifade14);
		if(etkilenensatirsayisi14>0) 
			System.out.println("personel veri girilmiştir.");
		
		int etkilenensatirsayisi15 = ifade.executeUpdate(SQLifade15);
		if(etkilenensatirsayisi15>0)
			System.out.println("urun Tablosuna veri girilmiştir."); 
		
		int etkilenensatirsayisi16 = ifade.executeUpdate(SQLifade16); 
		if(etkilenensatirsayisi16>0)
			System.out.println("departman Tablosuna veri girilmiştir."); 
		
		int etkilenensatirsayisi17 = ifade.executeUpdate(SQLifade17); 
		if(etkilenensatirsayisi17>0)
			System.out.println("musteri Tablosuna veri girilmiştir.");
		
		int etkilenensatirsayisi18 = ifade.executeUpdate(SQLifade18); 
		if(etkilenensatirsayisi18>0)
			System.out.println("ulke Tablosuna veri girilmiştir."); 
		
		int etkilenensatirsayisi19 = ifade.executeUpdate(SQLifade19); 
		if(etkilenensatirsayisi19>0)
			System.out.println("firma Tablosuna veri girilmiştir."); 
		
		int etkilenensatirsayisi20 = ifade.executeUpdate(SQLifade20); 
		if(etkilenensatirsayisi20>0)
			System.out.println("firma_adres Tablosuna veri girilmiştir.");
		 
		int etkilenensatirsayisi21 = ifade.executeUpdate(SQLifade21);
		if(etkilenensatirsayisi21>0)
			System.out.println("urun_fiyat Tablosuna veri girilmiştir.");

		int etkilenensatirsayisi22 = ifade.executeUpdate(SQLifade22);
		if(etkilenensatirsayisi22>0)
			System.out.println("urun_grup Tablosuna veri girilmiştir.");


		int etkilenensatirsayisi23 = ifade.executeUpdate(SQLifade23);
		if(etkilenensatirsayisi23>0)
			System.out.println("siparis_baslik Tablosuna veri girilmiştir."); 
		
		int etkilenensatirsayisi24 = ifade.executeUpdate(SQLifade24); 
		if(etkilenensatirsayisi24>0)
			System.out.println("siparis_kalem Tablosuna veri girilmiştir.");
		
		int etkilenensatirsayisi25 = ifade.executeUpdate(SQLifade25); 
		if(etkilenensatirsayisi25>0)
			System.out.println("teslimat_kalem Tablosuna veri girilmiştir."); 
		
		int etkilenensatirsayisi26 = ifade.executeUpdate(SQLifade26); 
		if(etkilenensatirsayisi26>0)
			System.out.println("teslimat_baslik Tablosuna veri girilmiştir.");

		
	}

}
