import java.util.Scanner;

public class Inheritance {
    public static void main(String []args) {
        System.out.println("Book your cab here----------------------");

        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter username: ");
        String username = s.next();
        System.out.print("Enter your contact number: ");
        long contactNumber = s.nextLong();

        System.out.print("\nEnter your cab booking choice\n(1) Mini\n(2) Prime\n(3) Luxury: \n");
        int choice = s.nextInt();

        switch(choice) {
            case 1:
                // book mini cab
                Ola mini = new Mini();

                if(mini instanceof Ola) {
                    System.out.println("Object upcasted successfully");
                }else{
                    System.out.println("Unable to upcast object");
                }

                mini.setUsername(username);
                mini.setContactNumber(contactNumber);

                if(mini.login()) {
                    Mini m1 = (Mini) mini;

                    if(m1 instanceof Mini) {
                        System.out.println("Object downcasted successfully");

                        m1.setPickup("bisauli");
                        m1.setDrop("Noida");

                        m1.bookCab();
                        m1.displayDetails();
                        m1.cancelRide();
                    }
                }else{
                    System.out.println("Exiting....");
                }
                break;
            case 2:
                // book prime cab

                break;
            case 3:
                // book luxury cab

                break;
        }

        s.close();
    }
}

class Ola {
    private String username;
    private long contactNumber;
    private double uberAccountBalance;

    {
        if(uberAccountBalance == 0) {
            uberAccountBalance = 1000;
        }
    }


    public void setUsername(String username) {
        if(!username.equals("")) {
            this.username = username;
        }else{
            System.out.println("Please enter a valid username");
        }
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getUsername() {
        return this.username;
    }

    public long getContactNumber() {
        return this.contactNumber;
    }

    public double getUberAccountBalance() {
        return this.uberAccountBalance;
    }

    public void reduceUberAccountBalance(double amount) {
        this.uberAccountBalance -= amount;
    }

    public void updateUberAccountBalance(double amount) {
        System.out.println("Refund successfully credited in user uber balance");
        this.uberAccountBalance += amount;
    }

    public boolean login() {
        if(this.username.equals("guptasaksham") && this.contactNumber == 9389772204l) {
            System.out.println("Login Successfull!");
            return true;
        }else{
            System.out.println("Sorry, unable to login!");
            return false;
        }
    }
}

class Mini extends Ola{
    private String pickup;
    private String drop;
    private double price;

    private double pkmprice = 20; 

    public void setPickup(String pickup) {
        this.pickup = pickup;
    }

    public void setDrop(String drop) {
        this.drop = drop;
    }

    public String getDrop() {
        return this.drop;
    }

    public String getPickup() {
        return this.pickup;
    }

    public void bookCab() {
        double dist = 20.5;  // assumed distance between the pickup and drop point
        this.price = dist * this.pkmprice;

        if(super.getUberAccountBalance() >= this.price) {
            System.out.println("Your Mini cab is successfully booked");
            super.reduceUberAccountBalance(this.price);
        }else{
            System.out.println("Sorry!, Your Uber account balance is not sufficient to book cab");
        }
    }

    public void displayDetails() {
        System.out.println("Pickup point is: " + this.pickup + "\nDrop point is: " + this.drop + "\nTotal Fare: " + this.price);
    }

    public void cancelRide() {
        super.updateUberAccountBalance(this.price);
        System.out.println("Your ride is cancelled");
    }
}

class Prime extends Ola {
    private String pickup;
    private String drop;
    private double price;

    private double pkmPriceOfPrime = 40.5;


    public void setPickup(String pickup) {
        this.pickup = pickup;
    }

    public void setDrop(String drop) {
        this.drop = drop;
    }

    public String getDrop() {
        return this.drop;
    }

    public String getPickup() {
        return this.pickup;
    }

    public void bookCab() {
        double dist = 20.5;
        this.price = dist * this.pkmPriceOfPrime;

        if(super.getUberAccountBalance() >= this.price) {
            System.out.println("Your prime ola is successfully booked");
            super.reduceUberAccountBalance(this.price);
        }else{
            System.out.println("Sorry!, Your Uber account balance is not sufficient to book cab");
        }
    }   

    public void displayDetails() {
        System.out.println("Pickup point is: " + this.pickup + "\nDrop point is: " + this.drop + "\nTotal Fare: " + this.price);
    }

    public void cancelRide() {
        System.out.println("Your prime ride is cancelled");
    }

}

class Luxury extends Ola {
    private String pickup;
    private String drop;
    private double price;

    private double pkmPriceOfPrime = 60.5;


    public void setPickup(String pickup) {
        this.pickup = pickup;
    }

    public void setDrop(String drop) {
        this.drop = drop;
    }

    public String getDrop() {
        return this.drop;
    }

    public String getPickup() {
        return this.pickup;
    }

    public void bookCab() {
        double dist = 20.5;
        this.price = dist * this.pkmPriceOfPrime;

        if(super.getUberAccountBalance() >= this.price) {
            System.out.println("Your Luxury ola is successfully booked=======================");
            super.reduceUberAccountBalance(this.price);
        }else{
            System.out.println("Sorry!, Your Uber account balance is not sufficient to book cab");
        }

    }   

    public void displayDetails() {
        System.out.println("Pickup point is: " + this.pickup + "\nDrop point is: " + this.drop + "\nTotal Fare: " + this.price);
    }

    public void cancelRide() {
        System.out.println("Your prime ride is cancelled");
    }
}