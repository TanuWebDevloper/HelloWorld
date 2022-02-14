package exceptionhandling;
import java.rmi.RemoteException;
import java.io.IOException;
import java.io.InputStreamReader;
package exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.RemoteException;

public class ThrowsExample{
	public void m() throws IOException,RemoteException,Exception {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader brr = new BufferedReader(r);
		System.out.println("Enter name");
		String name = brr.readLine();
		System.out.println(name);
	}
	public void n() throws RemoteException, IOException, Exception
	{
		m();
	}
	public static void main(String[] args) throws RemoteException, IOException, Exception {
		 ThrowsExample obj = new  ThrowsExample();
		obj.n();
	}
}