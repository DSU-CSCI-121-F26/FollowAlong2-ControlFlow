package part07;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4843s
//        rewatch 80:43–91:54 for logical operators and while loops
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps and the output to match.

public class InClass {

    // a method  that is not displayed for
    static boolean canDrive(int battery, boolean docked) {
        // returns back based upon input if it matches the standard set over 20 percent and is not docked
        return battery > 20 && !docked;
    }

    public static void main(String[] args) {
        // from the method earlier it calls on canDrive with 80 and false, so this prints true
        System.out.println("Can drive? " + canDrive(80, false));
        // same as above calls on the method with 80 and true which will output false because it is docked
        System.out.println("Can drive? " + canDrive(80, true));
        // calls on method, batttery is 10 percent, and it is not docked so it outputs false
        System.out.println("Can drive? " + canDrive(10, false));
        // assigning integer battery with the value of 100
        int battery = 100;
        // a while loop that is similar to the method just not using the docked because it is for when the rover is driving
        while (battery >= 20) {
            // it displays the battery percentage while it is driving
            System.out.println("Driving... battery " + battery + "%");
            // everything time the loop happens and gets back to the top it subtracts 25% from the battery and goes until the battery percent is below 20% the loop stops
            battery = battery - 25;
        }
        // stops driving and displays the battery percentage
        System.out.println("Stopped at " + battery + "%");

        // STEP 2 goes here at the bottom of main. Move one line out of the comment at a time.
        // outputs True if the battery percentage and the status inRange is 20-100, false for any other value
        boolean inRange = battery >= 20 && battery <= 100;
        // outputs True if the battery percentage is values either 20-100 stating that it is almost charged, false for any other value
        boolean almostFull = battery >= 20 || battery <= 100;
        // if the battery is 20 or more and also outputs true than that means the rover is ready to drive
        boolean ready = battery >= 20 && true;

    }
}





