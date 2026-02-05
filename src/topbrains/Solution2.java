import java.util.*;

class Vehicle {
    private String vehicleNumber;
    private String type;
    private String checkpointName;
    private long timestamp;

    public Vehicle(String vehicleNumber, String type, String checkpointName) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.checkpointName = checkpointName;
        this.timestamp = System.currentTimeMillis();
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public String getCheckpointName() {
        return checkpointName;
    }

    public long getTimestamp() {
        return timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle v = (Vehicle) o;
        return vehicleNumber.equals(v.vehicleNumber) && timestamp == v.timestamp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleNumber, timestamp);
    }

    @Override
    public String toString() {
        return "Vehicle[" + vehicleNumber + ", " + type + ", " +
                checkpointName + ", " + timestamp + "]";
    }
}

public class SmartCityTrafficManagement {

    static ArrayList<Vehicle> allVehicles = new ArrayList<>();
    static HashMap<String, List<Vehicle>> checkpointMap = new HashMap<>();
    static HashMap<String, Vehicle> vehicleSearchMap = new HashMap<>();
    static LinkedList<Vehicle> lastFiveVehicles = new LinkedList<>();

    static PriorityQueue<Vehicle> emergencyQueue = new PriorityQueue<>(
            (v1, v2) -> getPriority(v1.getType()) - getPriority(v2.getType())
    );

    static int getPriority(String type) {
        if (type.equalsIgnoreCase("Ambulance")) return 1;
        if (type.equalsIgnoreCase("FireTruck")) return 2;
        return 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== SMART CITY TRAFFIC MANAGEMENT ===");
            System.out.println("1. Add Vehicle Entry");
            System.out.println("2. Remove Duplicates");
            System.out.println("3. Display Vehicles by Checkpoint");
            System.out.println("4. Process Emergency Vehicle Queue");
            System.out.println("5. Traffic Report");
            System.out.println("6. Show Last 5 Vehicles");
            System.out.println("7. Exit");
            System.out.print("Choose: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Vehicle Number: ");
                    String number = sc.nextLine();

                    System.out.print("Type (Car/Bike/Ambulance/FireTruck): ");
                    String type = sc.nextLine();

                    System.out.print("Checkpoint: ");
                    String checkpoint = sc.nextLine();

                    Vehicle v = new Vehicle(number, type, checkpoint);
                    allVehicles.add(v);
                    vehicleSearchMap.put(number, v);

                    checkpointMap
                            .computeIfAbsent(checkpoint, k -> new ArrayList<>())
                            .add(v);

                    emergencyQueue.add(v);

                    lastFiveVehicles.addFirst(v);
                    if (lastFiveVehicles.size() > 5)
                        lastFiveVehicles.removeLast();

                    System.out.println("Entry added!");
                    break;

                case 2:
                    HashSet<Vehicle> set = new HashSet<>(allVehicles);
                    allVehicles = new ArrayList<>(set);
                    System.out.println("Duplicates removed!");
                    break;

                case 3:
                    System.out.print("Enter checkpoint name: ");
                    String cp = sc.nextLine();
                    List<Vehicle> list = checkpointMap.get(cp);

                    if (list == null || list.isEmpty()) {
                        System.out.println("No vehicles at this checkpoint.");
                    } else {
                        System.out.println("Vehicles at " + cp + ":");
                        for (Vehicle ve : list) {
                            System.out.println(ve);
                        }
                    }
                    break;

                case 4:
                    if (emergencyQueue.isEmpty()) {
                        System.out.println("No vehicles in queue.");
                    } else {
                        System.out.println("Processing emergency vehicle:");
                        System.out.println(emergencyQueue.poll());
                    }
                    break;

                case 5:
                    System.out.println("--- Traffic Report ---");

                    HashMap<String, Integer> congestion = new HashMap<>();
                    for (Vehicle ve : allVehicles) {
                        congestion.put(
                                ve.getCheckpointName(),
                                congestion.getOrDefault(ve.getCheckpointName(), 0) + 1
                        );
                    }

                    System.out.println("Checkpoint congestion:");
                    for (Map.Entry<String, Integer> e : congestion.entrySet()) {
                        System.out.println(e.getKey() + ": " + e.getValue());
                    }

                    String busiest = Collections.max(congestion.entrySet(),
                            Map.Entry.comparingByValue()).getKey();

                    String leastBusy = Collections.min(congestion.entrySet(),
                            Map.Entry.comparingByValue()).getKey();

                    System.out.println("Busiest: " + busiest);
                    System.out.println("Least Busy: " + leastBusy);
                    break;

                case 6:
                    System.out.println("Last 5 vehicles:");
                    for (Vehicle ve : lastFiveVehicles) {
                        System.out.println(ve);
                    }
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}
