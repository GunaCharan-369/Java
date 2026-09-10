import java.util.*;

public class ExceptionHandling {
  public static void main(String[] args) {

  // 1.ArithmeticException
  try{
    int x = 10/0;
  }
  catch(ArithmeticException ae){
     System.out.println("Cannot be divided by zero.");
      System.out.println("1.ArithmeticException is handled successfully.");
  }

  System.out.println();

  // 2. InputMismatchException
  try {
    Scanner sc = new Scanner("Y");
    int x = sc.nextInt();
  }
  catch (InputMismatchException ime) {
    System.out.println("Invalid Input");
    System.out.println("2.InputMismatchException is handled successfully.");
  }

  System.out.println();

  // 3.NullPointerException
  try {
    String name = null;
    int x = name.length();
  }
  catch(NullPointerException npe) {
    System.out.println("Length of an empty string cannot be determined.");
    System.out.println("3.NullPointerException is handled successfully.");
  }

  System.out.println();

  // 4.ArrayIndexOutOfBoundsException
  try {
    int ar[] = {10,20,30};
    System.out.println(ar[3]); 
  }
  catch(ArrayIndexOutOfBoundsException aiobe) {
    System.out.println("Cannot access an array using an invalid index");
    System.out.println("4.ArrayIndexOutOfBoundsException is handled successfully.");
  }

  System.out.println();

  // 5.StringIndexOutOfBoundsException
  try {
    String name = "Java";
    int x = name.charAt(6);
  }
  catch(StringIndexOutOfBoundsException siobe) {
    System.out.println("Cannot access an invalid position in a String");
    System.out.println("5.StringIndexOutOfBoundsException is handled successfully.");
  }

  System.out.println();

  // 6.NumberFormatException
  try {
    String name = "Java";
    int x = Integer.parseInt(name);
  }
  catch(NumberFormatException nfe) {
    System.out.println("Cannot convert an invalid string into a number");
    System.out.println("6.NumberFormatException is handled successfully");
  }

  System.out.println();

  // 7.NegativeArraySizeException
  try {
    int ar[] = new int [-5];
  }
  catch(NegativeArraySizeException nase) {
    System.out.println("Array size cannot be negtive");
    System.out.println("7.NegativeArraySizeException");
  }

  System.out.println();

  // 8.ArrayStoreException
  try {
    Object arr[] = new String[3];

    arr[0] = 100;
  }
  catch(ArrayStoreException ase) {
    System.out.println("Invalid type");
    System.out.println("8.ArrayStoreException");
  }

  System.out.println();

  // 9.IllegalArgumentException
   try {
   Integer.parseInt("abc");
  }
  catch (IllegalArgumentException iae) {
  System.out.println("Invalid argument");
  System.out.println("9.IllegalArgumentException is handled successfully.");
  }

  System.out.println();

  // 10.IndexOutOfBoundsException
  try {
    ArrayList<Integer> list = new ArrayList<>();

    list.add(10);
    list.add(20);

    System.out.println(list.get(5));
  }
  catch (IndexOutOfBoundsException ioobe) {
    System.out.println("Invalid index");
    System.out.println("10.IndexOutOfBoundsException is handled successfully.");
  }

  System.out.println();

  // 11.IllegalStateException
  try {
    Scanner sc = new Scanner(System.in);

    sc.close();

    sc.nextInt();   
  }
  catch (IllegalStateException ise) {
    System.out.println("Scanner is already closed");
    System.out.println("11.IllegalStateException is handled successfully");
  }

  System.out.println();

  // 12. ClassCastException
  try {
    Object obj = "Hello";

    Integer num = (Integer) obj;   

  }
  catch (ClassCastException cce) {
    System.out.println("Cannot convert String to Integer");
    System.out.println("12.ClassCastException is handled successfully.");
  }
  }
} 