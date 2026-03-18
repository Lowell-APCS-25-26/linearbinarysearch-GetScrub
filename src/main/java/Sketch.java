public class Sketch {
  //see Item.java for class definition
  private Item[] store = 
    {
    new Item(184, 14), 
    new Item(196, 60), 
    new Item(206, 31), 
    new Item(2370, 65), 
    new Item(7282, 73), 
    new Item(8303, 90), 
    new Item(12328, 63), 
    new Item(12705, 14), 
    new Item(13066, 8), 
    new Item(14088, 92), 
    new Item(15320, 82), 
    new Item(15814, 60), 
    new Item(15917, 51), 
    new Item(17911, 96), 
    new Item(18061, 3), 
    new Item(18410, 56), 
    new Item(18465, 27), 
    new Item(18618, 64), 
    new Item(18871, 69), 
    new Item(19967, 45)
  };                             
  public int linearSearch(int target){
  Item[] a = store;
    for(int i = 0; i<a.length;i++){
    if(a[i].getCatNum()==target){
      return a[i].getInventory();
    }
  }
  return -1;
  }
  public int recursiveLinearSearch(int catNumToFind, int startIndex){
  Item[] a = store;
    if(startIndex>=a.length){
    return -1;
  }
  if(catNumToFind == store[startIndex].getCatNum()){
    return store[startIndex].getInventory();
  }else{
    if(recursiveLinearSearch(a,catNumToFind,startIndex+1)!=(-1)){
      return recursiveLinearSearch(a,catNumToFind,startIndex+1);
    }else{
      return -1;
    }
  }
  }
  public int binarySearch(int target){
  Item[] a = store;
    int low = 0;
  int high = a.length-1;
  int guess;
  while(high>=low){
    guess = (high+low)/2;
    if(a[guess].getCatNum()==target){
      return a[guess].getInventory();
    }
    if(a[guess].getCatNum()>target){
      high = guess-1;
    }else{
      low = guess+1;
    }
  }
  return -1;
  }
  public int recursiveBinarySearch(int target, int low, int high){
    int guess;
  while(high>=low){
    guess = (high+low)/2;
    if(a[guess].getCatNum()==target){
      return a[guess].getInventory();
    }
    if(a[guess].getCatNum()>target){
      return recursiveBinarySearch(a,target,low,guess-1);
    }else{
      return recursiveBinarySearch(a,target,guess+1,high);
    }
  }
  return -1;
  }
  public void tester(){
    int[] tests = {0, 183, 184, 2370, 15320, 19967, 19968};
    System.out.println();
    System.out.println("Testing Non-Recursive Linear Search");
    System.out.println("=====================");
    for (int i = 0; i < tests.length; i++){
      if (linearSearch(tests[i]) != -1)
        System.out.println("Catalog #"+tests[i]+" has "+linearSearch(tests[i]) + " in stock");
      else
        System.out.println("Catalog #"+tests[i]+" not found");
    }
    System.out.println();
    System.out.println("Testing Recursive Linear Search");
    System.out.println("=====================");
    for (int i = 0; i < tests.length; i++){
      if (recursiveLinearSearch(tests[i], 0) != -1)
        System.out.println("Catalog #"+tests[i]+" has "+recursiveLinearSearch(tests[i], 0) + " in stock");
      else
        System.out.println("Catalog #"+tests[i]+" not found");
    }
    System.out.println();
    System.out.println("Testing Non-Recursive Binary Search");
    System.out.println("===================================");
    for (int i = 0; i < tests.length; i++){
      if (binarySearch(tests[i]) != -1)
        System.out.println("Catalog #"+tests[i]+" has "+binarySearch(tests[i]) + " in stock");
      else
        System.out.println("Catalog #"+tests[i]+" not found");
    }
    System.out.println();
    System.out.println("Testing Recursive Binary Search");
    System.out.println("===============================");
    for (int i = 0; i < tests.length; i++){

      if (recursiveBinarySearch(tests[i], 0, store.length - 1) != -1)
        System.out.println("Catalog #"+tests[i]+" has "+recursiveBinarySearch(tests[i], 0, store.length - 1) + " in stock");
      else
        System.out.println("Catalog #"+tests[i]+" not found");
    }
  }

  public void draw(){
    //empty!
  }
}
