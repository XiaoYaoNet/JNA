package pack1;
//与主机位数不符的dll会被无视！！！
import java.nio.FloatBuffer;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public interface TestJNA extends Library {
	public abstract void PT(Pointer ip,Pointer b);
	TestJNA INSTANCE = (TestJNA) Native.loadLibrary("C_Part", TestJNA.class);
}