package pack1;

import java.nio.FloatBuffer;

import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;


public class TEST {

	/**  
     * @param args  
     */  
    public static void main(String[] args) {  
    	  
        Pointer p1 = new Memory(15);
		String ip="192.168.1.101";
		p1.setString(0, ip);
		float t1=-6;
		int size=Native.getNativeSize(Float.class);
		Pointer p2 = new Memory(size);
		p2.setFloat(0, t1);
		TestJNA.INSTANCE.PT(p1,p2);
    }  
	
}
