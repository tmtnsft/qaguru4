package guru.qa4;

   public class Cat {

         String name;
         int age;
         boolean isActive;

         public void introduceUrself() {
            System.out.println("Meow, i'm "+ name +", i'm "+ age +"");
         }

         public void areUHungry() {
            if(isActive=true) {
                System.out.println("I'm hungry, give me food!");
            }
            else{
                System.out.println("I've just eaten, let me sleep");
            }
         }

      public static void main(String[] args) {
         Cat wonky = new Cat();
         wonky.name = "Wonky";
         wonky.age = 10;

         wonky.introduceUrself();
         wonky.areUHungry();
      }


}
