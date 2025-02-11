/*
 * Program 02
----------
Write a Program on OOPs to define Fan class properties and behaviour.

properties :

name    : String
coil    : String
wings	: int

behaviour:

switchOn()  : public void
switchOff() : public void   

 */
package SEPT_12;

public class p2 {

	public static void main(String[] args) {

		Fan.fanInfo("Usha", "15c", 3);
		Fan.switchOn();
		Fan.switchOff();
	}

}
