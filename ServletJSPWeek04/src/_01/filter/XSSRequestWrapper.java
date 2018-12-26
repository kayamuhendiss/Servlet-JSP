package _01.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.util.HashMap;

public class XSSRequestWrapper  extends HttpServletRequestWrapper {

    public XSSRequestWrapper(HttpServletRequest request) {

        super(request);
    }
    @Override
    public String getParameter(String name) {
        String value = super.getParameter(name);
        return hmtlEncode(value);

    }
    public String hmtlEncode(String parameter){
        for (String key:encodeMap.keySet()){
            parameter=parameter.replaceAll(key,encodeMap.get(key));
        }
        return parameter;

    }
    private static final HashMap<String,String> encodeMap=new HashMap<String, String>();
    static {
        encodeMap.put("<","&#60");
        encodeMap.put(">","&#62");
        encodeMap.put("\"","&#34");
    }


}
