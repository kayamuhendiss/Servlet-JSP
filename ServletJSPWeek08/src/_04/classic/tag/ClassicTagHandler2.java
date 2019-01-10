package _04.classic.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class ClassicTagHandler2 extends TagSupport{

	
	@Override
	public int doStartTag() throws JspException {
	
		JspWriter writer = pageContext.getOut();
		
		try {
			writer.print("hello classic tag 2");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return SKIP_BODY;
	}
	
	@Override
	public int doEndTag() throws JspException {
		
		JspWriter writer = pageContext.getOut();
		
		try {
			writer.print("doEndTag method");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return EVAL_PAGE;
	}
	
}
