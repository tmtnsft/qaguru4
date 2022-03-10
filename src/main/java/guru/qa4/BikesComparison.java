package guru.qa4;

public class BikesComparison {

    static class Motobike {
        String modelName;
        int maxspeed;
        int accelerationpersec;
        int weight;

        public void whatModelName() {
            System.out.println(modelName);
        }

        public void topSpeedOnTrack() {
            maxspeed = maxspeed + 50;
                    System.out.println(maxspeed);
        }

        public void accelerationTimeToMax() {
            accelerationpersec = maxspeed / accelerationpersec;
                    System.out.println(accelerationpersec);

        }


    }

    public static void main(String[] args){
        Motobike suzuki = new Motobike();
        Motobike kawasaki = new Motobike();
        kawasaki.modelName = "Kawasaki Ninja 650";
        kawasaki.maxspeed = 400;
        kawasaki.accelerationpersec = 200;
        kawasaki.weight = 190;
        suzuki.modelName = "Suzuki SV 650";
        suzuki.maxspeed = 300;
        suzuki.accelerationpersec = 100;
        suzuki.weight = 210;
        suzuki.whatModelName();
        suzuki.topSpeedOnTrack();
        suzuki.accelerationTimeToMax();
        kawasaki.whatModelName();
        kawasaki.topSpeedOnTrack();
        kawasaki.accelerationTimeToMax();

    }


}
