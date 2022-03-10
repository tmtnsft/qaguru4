package guru.qa4;

   public class Cat {

         String name;
         int age;
         float weight;
         boolean isActive;

         public void introduceUrself() {
            System.out.println("Meow, i'm "+ name +", i'm "+ age +", i weight "+ weight +" kg");
         }

         public void areUHungry() {
            if(isActive == true) {
                System.out.println("I'm hungry, give me food!");
            }
            else{
                System.out.println("I've just eaten, let me sleep");
            }
         }

         public void afterFood() {
             weight = weight + 0.2F;
             isActive = false;
         }

      public static void main(String[] args) {
         Cat wonky = new Cat();
         wonky.name = "Wonky";
         wonky.age = 10;
         wonky.weight = 4;
         wonky.isActive = true;

         wonky.introduceUrself();
         wonky.areUHungry();

         System.out.println("    >>Here you are, eat some fish");
         wonky.afterFood();
         wonky.introduceUrself();
         wonky.areUHungry();
      }
}
