package Lab6;

public class Park {
    public class Attraction {
        private String name;
        private String workingHours;
        private int cost;

        public Attraction(String name, String workingHours, int cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public void info() {
            System.out.println("Аттракцион: " + name +
                    "; Время работы: " + workingHours +
                    "; Стоимость: " + cost + ";");
        }
    }
}
