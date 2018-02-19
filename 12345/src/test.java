import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@org.junit.Test
	public void test() {
		gui a = new gui();
		a.start();
		a.t9.setValue(381);
		a.t10.setValue(320);
		a.t3.setValue(800);
		a.t1.setValue(31);
		a.Confirm.doClick();
		assertEquals(a.res7.getText(), "78,95");
	}
	
}
