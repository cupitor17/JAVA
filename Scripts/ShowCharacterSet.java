import java.nio.charset.Charset;

public class ShowCharacterSet {
	public static void main(String[] args) {
		String defaultCharset = System.getProperty( "file.encoding" );
		String charsetName = Charset.forName(defaultCharset).name();
		System.out.println("Default character set is " + charsetName);
	}
}
