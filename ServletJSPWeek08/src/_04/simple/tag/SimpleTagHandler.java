package _04.simple.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SimpleTagHandler extends SimpleTagSupport{

	@Override
	public void doTag() throws JspException, IOException {
	
		getJspContext().getOut().print("Hello Tag Example!");
	
	}
}

// container , ilgili SimpleTagHandler sinifni yukler(load)
// bu clastan yeni bir obje olusur.
// setJspContext metodu calisir.
// eger nested tag yapisi varsa setParent metodu calisir.
// eger attribute varsa attribute ait setter metot calisir.
// eger body bos degilse , <body-content>empty degilse setJSPBody calisir
// son olarka doTag calisir.