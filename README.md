# GameOfBlocks
SnT_Summer_Project
1) Assignment 1

In this code, I have used the class MessageDigest from the package "security" in java to use the SHA-256 method to get the hash value in bytes for the
appended message(Entered by user + the value to be calculated).

I have build a 'bytesToHex(byte[] bytes)' function that returns the Hexadecimal String value of the hash(in bytes). In this function , using for loop we get the 
corresponding hexString(using Integer.toHexString function) of every byte in the array bytes and append these hexStrings and return the String.

I have build a 'check(String st, int n)' function to verify if the message st starts with n zero's or not, if yes then this returns true else returns false.

In the main function , within the while loop we iterate through the values of i starting from zero to get the number which when appended to the the message gives us
hash value less than  0x00000FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF and using the bytestoHex(byte[] bytes) and check(String st, int n) methods.

Then we print the required number along with the time that the code took to get this nonce value.

2)Assignment 2
# Instructions to test the contract


1.Open the Remix IDE and create a new *.sol file.

2.Copy and Paste the code present in Assignment2.sol to the newly created *.sol file and compile it.

3.On the Left SideBar in Remix IDE , choose the First Account( Let this be Owner) and Deploy the Contract.

4.  # Initialising the Mapping loans.
A)I have  created an “addLoansMap” function to initialise the loans map.
B)From the Left SideBar Choose the Second Address( Let this be person A to whom Owner owes amount 10000).
C)Copy the Address of A and paste in the addLoansMap( address , amount)  in the Deployed Contract along with Amount 10000 and Click addLoansMap.

5. Now request Loan using reqLoan( Principle , Rate , Time )
And write the Principle Amount , Rate and Time and Click reqLoan.

6. Now Choose the Owner’s Account from the Left SideBar.

7. TO VIEW THE DUES OWED BY OWNER
Write the Address of A in the viewDues function and Click viewDues.

8. TO SETTLE THE DUES
Write the Address of A in the settleDues function and Click settleDues.

9. To Check if everything went well , Check the OwnerBalance by Clicking getOwnerBalance.

10. Check the Balance of ‘A’ by writing address in getBalance and click it.




SAMPLE INPUT:
Principle Amount - 10000
Rate(in %) - 10
Time(in Years) - 2
SAMPLE OUTPUT:
Compound Interest - 2100
Total Dues - 10000 + 2100 = 12100
Balances before settling Dues => Owner = 100000 ,  A   = 0
                                                       
Balances after settling Dues => Owner = 87900 , A  = 12100
                                                        

