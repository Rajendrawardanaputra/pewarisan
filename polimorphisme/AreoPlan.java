
    public class AreoPlan extends vehicle{

        @Override
        public void walk (){
            System.out.println("Aeroplan Flying");
        }
        public static void main(String []args) {
            AreoPlan Garuda = new AreoPlan();
            Garuda.function();
            Garuda.fuel();
            Garuda.walk();
        }
    }

