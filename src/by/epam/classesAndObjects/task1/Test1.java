package by.epam.classesAndObjects.task1;

public class Test1 {

    int age = 19;
    int lenght = 21;

   void pri(){
       System.out.println("Lenght " + lenght + " , " + age + " years old");
   }

   public  void ren(int newAge, int newLenght){
       age = newAge;
       lenght = newLenght;
   }

   public int sum(){
       int summa = age + lenght;
       return  summa;
   }

   public int bol(){
       int a;
       if (age > lenght){
           a = age;
       } else
       {
            a = lenght;
       }

       return a;
   }

}
