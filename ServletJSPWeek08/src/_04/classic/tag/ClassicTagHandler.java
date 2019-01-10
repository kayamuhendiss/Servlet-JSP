package _04.classic.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class ClassicTagHandler extends TagSupport{

	
	@Override
	public int doStartTag() throws JspException {
	
		JspWriter writer = pageContext.getOut();
		
		try {
			writer.print("hello classic tag");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return SKIP_BODY;
	}
	
}
