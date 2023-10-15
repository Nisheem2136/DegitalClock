import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
	public class DigitalClock {
	    public static void main(String[] args) {
	        while (true) {
	            LocalDateTime now = LocalDateTime.now();
	            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
	            String formattedTime = now.format(formatter);
	            System.out.print("\r" + formattedTime); // Use "\r" to overwrite the previous time

	            try {
	                Thread.sleep(1000); // Update the clock every 1 second
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}

