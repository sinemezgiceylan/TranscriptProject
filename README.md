# TranscriptProject (hw3)
Patika X Allianz İşbirliği Bootcamp Programı

### Grade (Enum):

- Bu sınıfta __stringValue__ ve __numericValue__ olmak üzere iki örnek alan bulunmaktadır.
- Örencilerin notlarını temsil eden __A, B, C, D, F__ `(stringValue)` sabitleri tanımlanmıştır. Bu sabitler sırasıyla __4, 3, 2, 1, 0__ `(numericValue)` sayısal değerlerine karşılık gelir.

### GradeTest:

 - Bu sınıf, Grade sınıfının values() metodu ve for döngüsü ile tüm harf notlarını ve sayısal değerlerini ekrana bastırır.

### CourseGrade:

- Bu sınıf __courseDepartment__ , __courseCode__ , __courseCredit__ , __gradeTaken__ alanlarından oluşmaktadır.
- Alanlara uygun get ve set metotları bulunmaktadır.
  
  * `courseDepartment` : Kursun bölümlerinin olası değerleri CENG, COMP, ECE, ME ve MATH. __CENG__ varsayılan değerdir.
  * `courseCode` : 100 ile 599 arasında üç haneli bir ders kodudur. __100__ varsayılan değerdir.
  * `courseCredit` : Kursun kredi değerini gösteren tamsayı değeridir. (3 ve 4)

### Transcript:

- Öğrencinin not ortalaması (GPA) hesaplanır.
- Öğrencilere ders notu eklemek için __addCourseTaken__ metodu kullanıldı.
