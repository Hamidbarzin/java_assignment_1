

public class chapter_test_312 {
    public static void main(String[] args) {
        chapter_312 invoice1 = new chapter_312("12345", "Hammer", 2, 12.5);
        
        // Display the invoice information
        System.out.println("Part number: " + invoice1.getPartNumber());
        System.out.println("Part description: " + invoice1.getPartDescription());
        System.out.println("Quantity: " + invoice1.getQuantity());
        System.out.println("Price per item: $" + invoice1.getPricePerItem());
        System.out.println("Invoice amount: $" + invoice1.getInvoiceAmount());
    
    }
}
