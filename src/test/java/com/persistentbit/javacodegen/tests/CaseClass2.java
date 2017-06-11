package com.persistentbit.javacodegen.tests;

import com.persistentbit.core.Nullable;
import com.persistentbit.core.javacodegen.annotations.CaseClass;
import com.persistentbit.core.javacodegen.annotations.Generated;
import com.persistentbit.core.javacodegen.annotations.NoBuilder;
import com.persistentbit.core.javacodegen.annotations.NoWith;
import com.persistentbit.core.utils.UString;

import java.util.Objects;
import java.util.Optional;

/**
 * TODOC
 * 
 * @author petermuys
 * @since 11/06/17
 */
@CaseClass
@NoBuilder
@NoWith
public class CaseClass2 {
	final	int	id;
	final	Name	name;
	
	@CaseClass
	@NoBuilder
	static public class Name {
		/**
		 * The first name of a person
		 */
		private  final	String	firstName;
		/**
		 * The last name of a person;
		 */
		private  final	String	lastName;
		@Nullable
		private  final	String	middleName;
		
		
		@Generated
		public Name(String firstName, String lastName, @Nullable String middleName){
				this.firstName = Objects.requireNonNull(firstName, "firstName can not be null");
				this.lastName = Objects.requireNonNull(lastName, "lastName can not be null");
				this.middleName = middleName;
		}
		/**
		 * Get the value of field {@link #firstName}.<br>
		 * @return {@link #firstName}
		 */
		@Generated
		public  String	getFirstName(){
			return this.firstName;
		}
		/**
		 * Create a copy of this Name object with a new value for field {@link #firstName}.<br>
		 * @param firstName The new value for field {@link #firstName}
		 * @return A new instance of {@link Name}
		 */
		@Generated
		public  Name	withFirstName(String firstName){
			return new Name(firstName, lastName, middleName);
		}
		/**
		 * Get the value of field {@link #lastName}.<br>
		 * @return {@link #lastName}
		 */
		@Generated
		public  String	getLastName(){
			return this.lastName;
		}
		/**
		 * Create a copy of this Name object with a new value for field {@link #lastName}.<br>
		 * @param lastName The new value for field {@link #lastName}
		 * @return A new instance of {@link Name}
		 */
		@Generated
		public  Name	withLastName(String lastName){
			return new Name(firstName, lastName, middleName);
		}
		/**
		 * Get the value of field {@link #middleName}.<br>
		 * @return {@link #middleName}
		 */
		@Generated
		public  Optional<String>	getMiddleName(){
			return Optional.ofNullable(this.middleName);
		}
		/**
		 * Create a copy of this Name object with a new value for field {@link #middleName}.<br>
		 * @param middleName The new value for field {@link #middleName}
		 * @return A new instance of {@link Name}
		 */
		@Generated
		public  Name	withMiddleName(@Nullable String middleName){
			return new Name(firstName, lastName, middleName);
		}
		@Generated
		@Override
		public  boolean	equals(@Nullable Object o){
			if(this == o) return true;
			if(o instanceof Name == false) return false;
			Name obj = (Name)o;
			if(!firstName.equals(obj.firstName)) return false;
			if(!lastName.equals(obj.lastName)) return false;
			if(middleName != null ? !middleName.equals(obj.middleName) : obj.middleName!= null) return false;
			return true;
		}
		@Generated
		@Override
		public  int	hashCode(){
			int result;
			result = (this.firstName != null ? this.firstName.hashCode() : 0);
			result = 31 * result + (this.lastName != null ? this.lastName.hashCode() : 0);
			result = 31 * result + (this.middleName != null ? this.middleName.hashCode() : 0);
			return result;
		}
		@Generated
		@Override
		public  String	toString(){
			return "Name[" + 
				"firstName=" + (firstName == null ? "null" : '\"' + UString.present(UString.escapeToJavaString(firstName),32,"...") + '\"') +
				", lastName=" + (lastName == null ? "null" : '\"' + UString.present(UString.escapeToJavaString(lastName),32,"...") + '\"') +
				", middleName=" + (middleName == null ? "null" : '\"' + UString.present(UString.escapeToJavaString(middleName),32,"...") + '\"') +
				']';
		}
	}
	
	@Generated
	public CaseClass2(int id, Name name){
			this.id = id;
			this.name = Objects.requireNonNull(name, "name can not be null");
	}
	public  static void	main(String[] args){
	    Name m = new Name("hello\nPeter", "test", null);
	    System.out.println(m);
	}
	/**
	 * Get the value of field {@link #id}.<br>
	 * @return {@link #id}
	 */
	@Generated
	public  int	getId(){
		return this.id;
	}
	/**
	 * Get the value of field {@link #name}.<br>
	 * @return {@link #name}
	 */
	@Generated
	public  Name	getName(){
		return this.name;
	}
	@Generated
	@Override
	public  boolean	equals(@Nullable Object o){
		if(this == o) return true;
		if(o instanceof CaseClass2 == false) return false;
		CaseClass2 obj = (CaseClass2)o;
		if(id!= obj.id) return false;
		if(!name.equals(obj.name)) return false;
		return true;
	}
	@Generated
	@Override
	public  int	hashCode(){
		int result;
		result = this.id;
		result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
		return result;
	}
	@Generated
	@Override
	public  String	toString(){
		return "CaseClass2[" + 
			"id=" + id + 
			", name=" + name + 
			']';
	}
}
