/*
 * Program 01
----------
Write a Program on OOPs to define Dog class properties and behaviour.

properties :

name    : String
height  : double
age	: int

behaviour:

getDogInformation() : public void
             bark() : public void    
 */
package SEPT_12;

public class p1 {

	public static void main(String[] args) {
		
		Dog.getDogInformation("blacky", 2.5, 2);
		Dog.bark();

	}

}
