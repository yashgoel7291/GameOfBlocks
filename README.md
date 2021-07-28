# GameOfBlocks
SnT_Summer_Project
# 1) Assignment 1

## Problem Statement
Write a program that takes some data as string input. Then it tries to find a positive number x such that when x is appended to the end of the string, the SHA256 hash of this new string is less than the target, which is

0x00000FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF

Also print the time it takes to get this nonce value. 

## class and functions used

### 1)class MessageDigest
In this code, I have used the class MessageDigest from the package "security" in java to use the SHA-256 method to get the hash value in bytes for the
appended message(Entered by user + the value to be calculated).

### 2)Function bytesToHex(byte[] bytes)
A 'bytesToHex(byte[] bytes)' function that returns the Hexadecimal String value of the hash(in bytes). In this function , using 'for' loop we get the 
corresponding hexString(using Integer.toHexString function) of every byte in the array bytes and append these hexStrings and return the String.

### 3)Function check(String st, int n)
A 'check(String st, int n)' function to verify if the message 'st' starts with n zero's or not, if yes then this returns true else returns false.

### Problem approach
In the main function , within the while loop we iterate through the values of i starting from zero to get the number which when appended to the the message gives us
hash value less than  0x00000FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF and using the bytestoHex(byte[] bytes) and check(String st, int n) methods.

Then we print the required number along with the time that the code took to get this nonce value.

### Instructions to test the code
1) Compile the code.
2) Enter a String whose nonce value needs to be calculated.
3) The Nonce value is shown on terminal along with the time taken to execute the code.



<img width="1440" alt="Screenshot 1943-05-06 at 6 44 49 PM" src="https://user-images.githubusercontent.com/77124129/127329304-18108564-d123-4fed-9bba-a45ca9fee165.png">


# 2) Assignment 2
## Instructions to test the contract


1.Open the Remix IDE and create a new *.sol file.

2.Copy and Paste the code present in Assignment2.sol to the newly created *.sol file and compile it.

3.On the Left SideBar in Remix IDE , choose the First Account( Let this be Owner) and Deploy the Contract.

4. From the Left SideBar Choose the Second Address( Let this be person A to whom Owner owes amount 10000).

5. Now request Loan using reqLoan( Principle , Rate , Time )
And write the Principle Amount , Rate and Time and Click reqLoan.

6. Now Choose the Owner’s Account from the Left SideBar.

7. TO VIEW THE DUES OWED BY OWNER

Write the Address of A in the viewDues function and Click viewDues.

8. TO SETTLE THE DUES

Write the Address of A in the settleDues function and Click settleDues.

9. To Check if everything went well , Check the OwnerBalance by Clicking getOwnerBalance.

10. Check the Balance of ‘A’ by writing address in getBalance and click it.




## SAMPLE INPUT , OUTPUT:

Principle Amount - 10000

Rate(in %) - 10

Time(in Years) - 2



Compound Interest - 2100

Total Dues - 10000 + 2100 = 12100

Balances before settling Dues => Owner = 100000 ,  A   = 0

Balances after settling Dues => Owner = 87900 , A  = 12100
                                                       ![Assignment2 001](https://user-images.githubusercontent.com/77124129/127336506-8aa5d4dc-799f-4d91-976e-a49186d22abb.jpeg)
![Assignment2 002](https://user-images.githubusercontent.com/77124129/127336562-a594d4ce-03e4-4eb5-9e9b-172fbe0c6b3e.jpeg)


                                                        

