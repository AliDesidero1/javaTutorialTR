//  chatGPT den
/*
Java'da == operatörü iki referansın bellekte aynı nesneyi gösterip göstermediğini
kontrol eder.
s1 ve s2 aynı karakter dizisini ("songul hanım") içeren String nesneleridir

 ve aynı String havuzunda (string pool) depolanırlar.

 String havuzu, JVM tarafından otomatik  olarak yönetilir ve aynı karakter dizisine sahip

 String nesneleri yalnızca bir kez depolanır.

 Bu nedenle, s1 ve s2 aynı bellek adresini gösterirler ve == operatörü ile karşılaştırıldığında true döndürürler.
Ancak, s3 ve s4 farklı String nesneleridir ve new anahtar kelimesi ile oluşturulmuşlardır.
Bu nedenle, her biri ayrı bir bellek alanında (heap memory) saklanır ve farklı referanslarla
(s3 ve s4) işaret edilir. Dolayısıyla, s1 == s3 veya s2 == s4 gibi karşılaştırmalar false döndürür,
çünkü farklı bellek adreslerine işaret ederler.
String s1="songul hanım"; ve String s4=new String("songul hanım"); iki farklı yöntemdir,
ancak her ikisi de aynı karakter dizisini ("songul hanım") içeren String nesneleri oluşturur.
String s1 ataması, bir string literali kullanarak bir String nesnesi oluşturur.
Bu string literali,Java'nın String havuzunda (string pool) depolanır.
String havuzu,
JVM tarafından otomatik olarak yönetilir
 ve aynı karakter dizisine sahip String nesneleri yalnızca bir kez depolanır.
 Bu nedenle, s1 değişkeni,
 bellekteki var olan bir String nesnesine işaret eder.
String s4 ataması, new anahtar kelimesi kullanarak bir String nesnesi oluşturur.
Bu işlem, yeni bir String nesnesi oluşturur ve bellekteki heap alanına yerleştirir.
Bu nedenle, s4 değişkeni, yeni oluşturulan String nesnesine işaret eder.
Bu iki farklı yöntem, bellek yönetimi açısından farklı davranışlar sergiler.
 String literalleri string havuzunda depolandığından, sıklıkla kullanılan stringler için bu yöntem
  daha verimlidir ve bellek kullanımını azaltır.
  Ancak, her seferinde yeni bir String nesnesi oluşturmak gerektiğinde new anahtar kelimesi kullanılmalıdır.
SSORU
 String s4=new String("songul hanım"); intellij idea da neden new kelimesi sonuk yaziyor neden?
IntelliJ IDEA, String sınıfının özel bir davranış sergilediği için new anahtar kelimesini
 kullanmanın çoğu durumda gereksiz olduğunu belirtir.
  Java'da, String nesneleri hem string literalleri hem de new anahtar kelimesi ile oluşturulabilir.
   Ancak, String nesneleri, bir kez oluşturulduktan sonra genellikle değiştirilemez (immutable) olduğundan,
    aynı karakter dizisi için birden fazla String nesnesi oluşturmak yerine, aynı nesneyi paylaşmak daha verimli
     ve bellek dostudur.
Bu nedenle, IntelliJ IDEA varsayılan olarak, String nesnelerinin string literalleri kullanarak
oluşturulmasını önerir ve
new anahtar kelimesi ile String nesneleri oluşturulduğunda, bunu vurgulamak
için new kelimesinin rengini soluk veya farklı bir renkle gösterir.
Ancak, new anahtar kelimesi kullanımı
bazı durumlarda gereklidir, özellikle String nesnesinin boyutu bilinmeyen veya çalışma zamanında belirlenen
bir karakter dizisini içermesi gerektiğinde.
 */
