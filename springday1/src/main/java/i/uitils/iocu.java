package i.uitils;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;


public class iocu {
    private static InputStream in = null;

    private static Object obj=null;
    private static Map<String,Object> ron = new HashMap<String, Object>();

    static {
        in=iocu.class.getClassLoader().getResourceAsStream("bean.xml");
    }
    public static <T> T getBean(String inteface)throws Exception{
        SAXReader saxReader = new SAXReader();
        Document read = saxReader.read(in);
        Element node = (Element) read.selectSingleNode("//bean[@id='" + inteface + "']");
        String aClass = node.attributeValue("class");
        System.out.println(aClass);
        Class clazz = Class.forName(aClass);
        if (obj==null){
            obj=clazz.newInstance();
            ron.put(inteface,obj);
        }
        /*T o = (T)clazz.newInstance();*/
        return (T) obj;
    }
    public static Object getBean1(String inteface)throws Exception{
        getBean(inteface);
        Object obj = ron.get(inteface);
        return obj;
    }
}
