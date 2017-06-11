package com.persistentbit.javacodegen.tests;

import com.persistentbit.core.javacodegen.annotations.CaseClass;

/**
 * TODOC
 * 
 * @author petermuys
 * @since 11/06/17
 */
@CaseClass
public class CaseClass2 {
		int	id;
		Name	name;
	
	@CaseClass
	static public class Name {
			String	firstName;
			String	lastName;
		

	}

}
