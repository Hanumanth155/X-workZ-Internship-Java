class ElectricityBillExecutor{

   public static void main(String[] args){
   
   ElectricityBill bill = new ElectricityBill();
   //System.out.println(bill);
   //bill.electricityBill();
   bill.billId = 1;
   bill.billAmount = 345.58;
   bill.isFinalBill= true;
   bill.isLatestBill = true;
   bill.billIssueDate= "02/02/2026";
   bill.billDueDate="03/02/2026";
   bill.isBillOverDue = false;
   bill.billInvoiceNo = "HG17";
   System.out.println("The bill id is :" + bill.billId);
   System.out.println("The bill amount is :" + bill.billAmount);
   System.out.println("is this final bill :" + bill.isFinalBill);
   System.out.println("is this final bill :" + bill.isLatestBill);
   System.out.println("The bill issue date is :" + bill.billIssueDate);
   System.out.println("The bill due date is :" + bill.billDueDate);
   System.out.println("is this bill over due :" + bill.isBillOverDue);
   System.out.println("The bill invoice no :" + bill.billInvoiceNo);
 
 }


}