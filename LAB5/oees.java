public class oees {
        private static int counter = 0;
        private int id;

        public oees() {
            counter++;
            this.id = counter;
        }

        public static int getCounter() {
            return counter;
        }

        public static void main(String[] args) {
            new oees();
            new oees();
            new oees();
            System.out.println("Құрылған объектілер саны: " + oees.getCounter());
        }
    }
