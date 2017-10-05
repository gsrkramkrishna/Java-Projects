package com.gsrk.reflection;

import java.lang.reflect.ReflectPermission;
import java.security.AccessController;
import java.security.PrivilegedAction;

public class JavaSingleton {

	private static JavaSingleton INSTANCE = null;

	private JavaSingleton() {
		if(INSTANCE!=null){
		ReflectPermission perm = new ReflectPermission("suppressAccessChecks", "");
		AccessController.checkPermission(perm);
		}
	}

	synchronized public static final JavaSingleton getInstance() {
	    if (INSTANCE == null) {
	      AccessController.doPrivileged(new PrivilegedAction<Object>() {
	        public Object run() {
	          INSTANCE= new JavaSingleton();
	          return null;
	        }
	      });
	    }
	    return INSTANCE;
	  }
	
}