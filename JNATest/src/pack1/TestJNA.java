package pack1;
//������λ��������dll�ᱻ���ӣ�����
import java.nio.FloatBuffer;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public interface TestJNA extends Library {
	public abstract void PT(Pointer ip,Pointer b);
	TestJNA INSTANCE = (TestJNA) Native.loadLibrary("C_Part", TestJNA.class);
}