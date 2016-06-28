package com.lyh.itms;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.junit.Test;

public class PluginTest {

	@Test
	public void test() {
		Map map = new HashMap();  
	    map = (Map) new MyMapPlugin().plugin(map);
	    System.out.println(map.get("Anything"));
	}

}

@Intercepts({@Signature(type = Map.class, method = "get", args = {Object.class})})
class MyMapPlugin implements Interceptor{

	public Object intercept(Invocation invocation) throws Throwable {
//		return invocation.proceed();
		return "trs";
	}

	public Object plugin(Object target) {
//		return Plugin.wrap(target, this);
		return null;
	}

	public void setProperties(Properties properties) {
	}
	
}