/*
	Comment voor package
 */

package com.persistentbit.javacodegen.tests;

import com.persistentbit.core.Nullable;
import com.persistentbit.core.javacodegen.annotations.CaseClass;
import com.persistentbit.core.utils.BaseValueClass;
import com.persistentbit.core.utils.NoToString;

import java.io.Serializable;

@CaseClass
public class CaseClass1 extends BaseValueClass implements Serializable {
	/**
	 * Simple primitive int value
	 */
	private  	int	primInt;
	public  	boolean	primBoolean;
	protected  	char	primChar;
	@NoToString
		int[]	primIntArray;
	private  	short	primShort;
	private  	byte	primByte;
	@NoToString
	private  	byte[]	primByteArray;
	private  	String	aString;
	@Nullable
	private  	String	nulString;
	private  	double	primDouble;
	private  	float	primFloat;
	@Nullable
	private  	Double	nulDouble;
	

	public  String	sayHello(String name){
	    return "Hello" + name;
	}
	private  static final void	aStaticMethod(){
	    if (true) {
	        System.out.println(true);
	    }
	}

}
