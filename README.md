[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=23149633)
# LinearBinarySearchTemplate
# Linear and Binary Searching Functions
==================
a github classroom template of https://github.com/APCSLowell/BinarySearch

In this assignment you will write four searching functions:  
1. linearSearch  
2. recursiveLinearSearch   
3. binarySearch   
4. recursiveBinarySearch    

The functions are searching through an array of type `Item`. The `Item` class is defined as:
```Java
public class Item
{
    private int myCatNum, myInventory;
    public Item(int nNum, int nInv)
    {
        myCatNum = nNum;
        myInventory = nInv;
    }
    public int getCatNum(){return myCatNum;}
    public int getInventory(){return myInventory;}
}
```
Every `Item` has two integers, a catalog number and an inventory. Your functions will search for a catalog number. If the catalog number is found, the function will return the corresponding inventory. If an `Item` with that catalog number is not found, the function should return `-1`.   

Steps to complete the assignment
--------------------
1. First, complete the [codingbat searching problem set](https://codingbat.com/home/simona1@sfusd.edu/searching)
2. Write the four functions
3. Check your output. You should see the following:    
```   
Testing Linear Search   
Catalog #0 not found   
Catalog #183 not found   
Catalog #184 has 14 in stock   
Catalog #2370 has 65 in stock   
Catalog #15320 has 82 in stock   
Catalog #19967 has 45 in stock   
Catalog #19968 not found   

Testing Recursive Linear Search   
Catalog #0 not found   
Catalog #183 not found   
Catalog #184 has 14 in stock   
Catalog #2370 has 65 in stock   
Catalog #15320 has 82 in stock   
Catalog #19967 has 45 in stock   
Catalog #19968 not found   

Testing Non Recursive Binary Search   
Catalog #0 not found   
Catalog #183 not found   
Catalog #184 has 14 in stock   
Catalog #2370 has 65 in stock   
Catalog #15320 has 82 in stock   
Catalog #19967 has 45 in stock   
Catalog #19968 not found   
   
Testing Recursive Binary Search   
Catalog #0 not found   
Catalog #183 not found   
Catalog #184 has 14 in stock   
Catalog #2370 has 65 in stock   
Catalog #15320 has 82 in stock   
Catalog #19967 has 45 in stock   
Catalog #19968 not found   
```   

4. Submit the code to your GitHub Classroom and make sure you pass all the test cases (see the green checkmark).

