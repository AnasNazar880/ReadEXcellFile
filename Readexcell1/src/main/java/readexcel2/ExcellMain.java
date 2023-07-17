package readexcel2;


import java.io.IOException;

public class ExcellMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
String d=ReadExcellCode.getStringData(0,1);
System.out.println(d);
String e =ReadExcellCode.getIntegerData(3,0);
System.out.println(e);
}

}
