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


