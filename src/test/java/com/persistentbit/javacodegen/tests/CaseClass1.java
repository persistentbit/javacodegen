/*
	Comment voor package
 */

package com.persistentbit.javacodegen.tests;

import com.persistentbit.core.Nullable;
import com.persistentbit.core.javacodegen.annotations.CaseClass;
import com.persistentbit.core.javacodegen.annotations.DefaultValue;
import com.persistentbit.core.javacodegen.annotations.Generated;
import com.persistentbit.core.utils.BaseValueClass;
import com.persistentbit.core.utils.NoToString;
import com.persistentbit.core.utils.builders.NOT;
import com.persistentbit.core.utils.builders.SET;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;

@CaseClass
public class CaseClass1 extends BaseValueClass implements Serializable {
	/**
	 * Simple primitive int value
	 */
	private  final	int	primInt;
	public  final	boolean	primBoolean;
	protected  final	char	primChar;
	@NoToString
	final	int[]	primIntArray;
	private  final	short	primShort;
	private  final	byte	primByte;
	@NoToString
	private  final	byte[]	primByteArray;
	private  final	String	aString;
	@Nullable
	@DefaultValue("\"Hello\"")
	private  final	String	nulString;
	private  final	double	primDouble;
	private  final	float	primFloat;
	@Nullable
	private  final	Double	nulDouble;
	
	@Generated
	@SuppressWarnings("unchecked")
	static public class Builder<_T1, _T2, _T3, _T4, _T5, _T6, _T7, _T8, _T9, _T10> {
		private	int	primInt;
		private	boolean	primBoolean;
		private	char	primChar;
		private	int[]	primIntArray;
		private	short	primShort;
		private	byte	primByte;
		private	byte[]	primByteArray;
		private	String	aString;
		private	String	nulString;
		private	double	primDouble;
		private	float	primFloat;
		private	Double	nulDouble;
		
		
		public  Builder<SET, _T2, _T3, _T4, _T5, _T6, _T7, _T8, _T9, _T10>	setPrimInt(int primInt){
			this.primInt	=	primInt;
			return (Builder<SET, _T2, _T3, _T4, _T5, _T6, _T7, _T8, _T9, _T10>)this;
		}
		public  Builder<_T1, SET, _T3, _T4, _T5, _T6, _T7, _T8, _T9, _T10>	setPrimBoolean(boolean primBoolean){
			this.primBoolean	=	primBoolean;
			return (Builder<_T1, SET, _T3, _T4, _T5, _T6, _T7, _T8, _T9, _T10>)this;
		}
		public  Builder<_T1, _T2, SET, _T4, _T5, _T6, _T7, _T8, _T9, _T10>	setPrimChar(char primChar){
			this.primChar	=	primChar;
			return (Builder<_T1, _T2, SET, _T4, _T5, _T6, _T7, _T8, _T9, _T10>)this;
		}
		public  Builder<_T1, _T2, _T3, SET, _T5, _T6, _T7, _T8, _T9, _T10>	setPrimIntArray(int[] primIntArray){
			this.primIntArray	=	primIntArray;
			return (Builder<_T1, _T2, _T3, SET, _T5, _T6, _T7, _T8, _T9, _T10>)this;
		}
		public  Builder<_T1, _T2, _T3, _T4, SET, _T6, _T7, _T8, _T9, _T10>	setPrimShort(short primShort){
			this.primShort	=	primShort;
			return (Builder<_T1, _T2, _T3, _T4, SET, _T6, _T7, _T8, _T9, _T10>)this;
		}
		public  Builder<_T1, _T2, _T3, _T4, _T5, SET, _T7, _T8, _T9, _T10>	setPrimByte(byte primByte){
			this.primByte	=	primByte;
			return (Builder<_T1, _T2, _T3, _T4, _T5, SET, _T7, _T8, _T9, _T10>)this;
		}
		public  Builder<_T1, _T2, _T3, _T4, _T5, _T6, SET, _T8, _T9, _T10>	setPrimByteArray(byte[] primByteArray){
			this.primByteArray	=	primByteArray;
			return (Builder<_T1, _T2, _T3, _T4, _T5, _T6, SET, _T8, _T9, _T10>)this;
		}
		public  Builder<_T1, _T2, _T3, _T4, _T5, _T6, _T7, SET, _T9, _T10>	setAString(String aString){
			this.aString	=	aString;
			return (Builder<_T1, _T2, _T3, _T4, _T5, _T6, _T7, SET, _T9, _T10>)this;
		}
		public  Builder<_T1, _T2, _T3, _T4, _T5, _T6, _T7, _T8, _T9, _T10>	setNulString(@Nullable String nulString){
			this.nulString	=	nulString;
			return this;
		}
		public  Builder<_T1, _T2, _T3, _T4, _T5, _T6, _T7, _T8, SET, _T10>	setPrimDouble(double primDouble){
			this.primDouble	=	primDouble;
			return (Builder<_T1, _T2, _T3, _T4, _T5, _T6, _T7, _T8, SET, _T10>)this;
		}
		public  Builder<_T1, _T2, _T3, _T4, _T5, _T6, _T7, _T8, _T9, SET>	setPrimFloat(float primFloat){
			this.primFloat	=	primFloat;
			return (Builder<_T1, _T2, _T3, _T4, _T5, _T6, _T7, _T8, _T9, SET>)this;
		}
		public  Builder<_T1, _T2, _T3, _T4, _T5, _T6, _T7, _T8, _T9, _T10>	setNulDouble(@Nullable Double nulDouble){
			this.nulDouble	=	nulDouble;
			return this;
		}
	}
	
	@Generated
	public CaseClass1(int primInt, boolean primBoolean, char primChar, int[] primIntArray, short primShort, byte primByte, byte[] primByteArray, String aString, @Nullable String nulString, double primDouble, float primFloat, @Nullable Double nulDouble){
			this.primInt = primInt;
			this.primBoolean = primBoolean;
			this.primChar = primChar;
			this.primIntArray = Objects.requireNonNull(primIntArray, "primIntArray can not be null");
			this.primShort = primShort;
			this.primByte = primByte;
			this.primByteArray = Objects.requireNonNull(primByteArray, "primByteArray can not be null");
			this.aString = Objects.requireNonNull(aString, "aString can not be null");
			this.nulString = nulString == null ? "Hello" : nulString;
			this.primDouble = primDouble;
			this.primFloat = primFloat;
			this.nulDouble = nulDouble;
	}
	public  String	sayHello(String name){
	    return "Hello" + name;
	}
	private  static final void	aStaticMethod(){
	    if (true) {
	        System.out.println(true);
	    }
	}
	/**
	 * Get the value of field {@link #primInt}.<br>
	 * @return {@link #primInt}
	 */
	@Generated
	public  int	getPrimInt(){
		return this.primInt;
	}
	/**
	 * Create a copy of this CaseClass1 object with a new value for field {@link #primInt}.<br>
	 * @param primInt The new value for field {@link #primInt}
	 * @return A new instance of {@link CaseClass1}
	 */
	@Generated
	public  CaseClass1	withPrimInt(int primInt){
		return new CaseClass1(primInt, primBoolean, primChar, primIntArray, primShort, primByte, primByteArray, aString, nulString, primDouble, primFloat, nulDouble);
	}
	/**
	 * Get the value of field {@link #primBoolean}.<br>
	 * @return {@link #primBoolean}
	 */
	@Generated
	public  boolean	getPrimBoolean(){
		return this.primBoolean;
	}
	/**
	 * Create a copy of this CaseClass1 object with a new value for field {@link #primBoolean}.<br>
	 * @param primBoolean The new value for field {@link #primBoolean}
	 * @return A new instance of {@link CaseClass1}
	 */
	@Generated
	public  CaseClass1	withPrimBoolean(boolean primBoolean){
		return new CaseClass1(primInt, primBoolean, primChar, primIntArray, primShort, primByte, primByteArray, aString, nulString, primDouble, primFloat, nulDouble);
	}
	/**
	 * Get the value of field {@link #primChar}.<br>
	 * @return {@link #primChar}
	 */
	@Generated
	public  char	getPrimChar(){
		return this.primChar;
	}
	/**
	 * Create a copy of this CaseClass1 object with a new value for field {@link #primChar}.<br>
	 * @param primChar The new value for field {@link #primChar}
	 * @return A new instance of {@link CaseClass1}
	 */
	@Generated
	public  CaseClass1	withPrimChar(char primChar){
		return new CaseClass1(primInt, primBoolean, primChar, primIntArray, primShort, primByte, primByteArray, aString, nulString, primDouble, primFloat, nulDouble);
	}
	/**
	 * Get the value of field {@link #primIntArray}.<br>
	 * @return {@link #primIntArray}
	 */
	@Generated
	public  int[]	getPrimIntArray(){
		return this.primIntArray;
	}
	/**
	 * Create a copy of this CaseClass1 object with a new value for field {@link #primIntArray}.<br>
	 * @param primIntArray The new value for field {@link #primIntArray}
	 * @return A new instance of {@link CaseClass1}
	 */
	@Generated
	public  CaseClass1	withPrimIntArray(int[] primIntArray){
		return new CaseClass1(primInt, primBoolean, primChar, primIntArray, primShort, primByte, primByteArray, aString, nulString, primDouble, primFloat, nulDouble);
	}
	/**
	 * Get the value of field {@link #primShort}.<br>
	 * @return {@link #primShort}
	 */
	@Generated
	public  short	getPrimShort(){
		return this.primShort;
	}
	/**
	 * Create a copy of this CaseClass1 object with a new value for field {@link #primShort}.<br>
	 * @param primShort The new value for field {@link #primShort}
	 * @return A new instance of {@link CaseClass1}
	 */
	@Generated
	public  CaseClass1	withPrimShort(short primShort){
		return new CaseClass1(primInt, primBoolean, primChar, primIntArray, primShort, primByte, primByteArray, aString, nulString, primDouble, primFloat, nulDouble);
	}
	/**
	 * Get the value of field {@link #primByte}.<br>
	 * @return {@link #primByte}
	 */
	@Generated
	public  byte	getPrimByte(){
		return this.primByte;
	}
	/**
	 * Create a copy of this CaseClass1 object with a new value for field {@link #primByte}.<br>
	 * @param primByte The new value for field {@link #primByte}
	 * @return A new instance of {@link CaseClass1}
	 */
	@Generated
	public  CaseClass1	withPrimByte(byte primByte){
		return new CaseClass1(primInt, primBoolean, primChar, primIntArray, primShort, primByte, primByteArray, aString, nulString, primDouble, primFloat, nulDouble);
	}
	/**
	 * Get the value of field {@link #primByteArray}.<br>
	 * @return {@link #primByteArray}
	 */
	@Generated
	public  byte[]	getPrimByteArray(){
		return this.primByteArray;
	}
	/**
	 * Create a copy of this CaseClass1 object with a new value for field {@link #primByteArray}.<br>
	 * @param primByteArray The new value for field {@link #primByteArray}
	 * @return A new instance of {@link CaseClass1}
	 */
	@Generated
	public  CaseClass1	withPrimByteArray(byte[] primByteArray){
		return new CaseClass1(primInt, primBoolean, primChar, primIntArray, primShort, primByte, primByteArray, aString, nulString, primDouble, primFloat, nulDouble);
	}
	/**
	 * Get the value of field {@link #aString}.<br>
	 * @return {@link #aString}
	 */
	@Generated
	public  String	getAString(){
		return this.aString;
	}
	/**
	 * Create a copy of this CaseClass1 object with a new value for field {@link #aString}.<br>
	 * @param aString The new value for field {@link #aString}
	 * @return A new instance of {@link CaseClass1}
	 */
	@Generated
	public  CaseClass1	withAString(String aString){
		return new CaseClass1(primInt, primBoolean, primChar, primIntArray, primShort, primByte, primByteArray, aString, nulString, primDouble, primFloat, nulDouble);
	}
	/**
	 * Get the value of field {@link #nulString}.<br>
	 * @return {@link #nulString}
	 */
	@Generated
	public  String	getNulString(){
		return this.nulString;
	}
	/**
	 * Create a copy of this CaseClass1 object with a new value for field {@link #nulString}.<br>
	 * @param nulString The new value for field {@link #nulString}
	 * @return A new instance of {@link CaseClass1}
	 */
	@Generated
	public  CaseClass1	withNulString(@Nullable String nulString){
		return new CaseClass1(primInt, primBoolean, primChar, primIntArray, primShort, primByte, primByteArray, aString, nulString, primDouble, primFloat, nulDouble);
	}
	/**
	 * Get the value of field {@link #primDouble}.<br>
	 * @return {@link #primDouble}
	 */
	@Generated
	public  double	getPrimDouble(){
		return this.primDouble;
	}
	/**
	 * Create a copy of this CaseClass1 object with a new value for field {@link #primDouble}.<br>
	 * @param primDouble The new value for field {@link #primDouble}
	 * @return A new instance of {@link CaseClass1}
	 */
	@Generated
	public  CaseClass1	withPrimDouble(double primDouble){
		return new CaseClass1(primInt, primBoolean, primChar, primIntArray, primShort, primByte, primByteArray, aString, nulString, primDouble, primFloat, nulDouble);
	}
	/**
	 * Get the value of field {@link #primFloat}.<br>
	 * @return {@link #primFloat}
	 */
	@Generated
	public  float	getPrimFloat(){
		return this.primFloat;
	}
	/**
	 * Create a copy of this CaseClass1 object with a new value for field {@link #primFloat}.<br>
	 * @param primFloat The new value for field {@link #primFloat}
	 * @return A new instance of {@link CaseClass1}
	 */
	@Generated
	public  CaseClass1	withPrimFloat(float primFloat){
		return new CaseClass1(primInt, primBoolean, primChar, primIntArray, primShort, primByte, primByteArray, aString, nulString, primDouble, primFloat, nulDouble);
	}
	/**
	 * Get the value of field {@link #nulDouble}.<br>
	 * @return {@link #nulDouble}
	 */
	@Generated
	public  Optional<Double>	getNulDouble(){
		return Optional.ofNullable(this.nulDouble);
	}
	/**
	 * Create a copy of this CaseClass1 object with a new value for field {@link #nulDouble}.<br>
	 * @param nulDouble The new value for field {@link #nulDouble}
	 * @return A new instance of {@link CaseClass1}
	 */
	@Generated
	public  CaseClass1	withNulDouble(@Nullable Double nulDouble){
		return new CaseClass1(primInt, primBoolean, primChar, primIntArray, primShort, primByte, primByteArray, aString, nulString, primDouble, primFloat, nulDouble);
	}
	@Generated
	@Override
	public  boolean	equals(@Nullable Object o){
		if(this == o) return true;
		if(o instanceof CaseClass1 == false) return false;
		CaseClass1 obj = (CaseClass1)o;
		if(primInt!= obj.primInt) return false;
		if(primBoolean!= obj.primBoolean) return false;
		if(primChar!= obj.primChar) return false;
		if(!Arrays.equals(primIntArray, obj.primIntArray)) return false;
		if(primShort!= obj.primShort) return false;
		if(primByte!= obj.primByte) return false;
		if(!Arrays.equals(primByteArray, obj.primByteArray)) return false;
		if(!aString.equals(obj.aString)) return false;
		if(nulString != null ? !nulString.equals(obj.nulString) : obj.nulString!= null) return false;
		if(Double.compare(primDouble, obj.primDouble) != 0) return false;
		if(primDouble!= obj.primDouble) return false;
		if(Float.compare(primFloat, obj.primFloat) != 0) return false;
		if(primFloat!= obj.primFloat) return false;
		if(nulDouble != null ? !nulDouble.equals(obj.nulDouble) : obj.nulDouble!= null) return false;
		return true;
	}
	@Generated
	@Override
	public  int	hashCode(){
		int result;
		long temp;
		result = this.primInt;
		result = 31 * result + (this.primBoolean ? 1 : 0);
		result = 31 * result + (int)this.primChar;
		result = 31 * result + Arrays.hashCode(this.primIntArray);
		result = 31 * result + (int)this.primShort;
		result = 31 * result + (int)this.primByte;
		result = 31 * result + Arrays.hashCode(this.primByteArray);
		result = 31 * result + (this.aString != null ? this.aString.hashCode() : 0);
		result = 31 * result + (this.nulString != null ? this.nulString.hashCode() : 0);
		temp =  Double.doubleToLongBits(this.primDouble);
		result = 31 * result + (int)(temp ^ (temp >>> 32));
		result = 31 * result + (this.primFloat != +0.0f ? Float.floatToIntBits(this.primFloat) : 0);
		result = 31 * result + (this.nulDouble != null ? this.nulDouble.hashCode() : 0);
		return result;
	}
	@Generated
	@Override
	public  String	toString(){
		return "CaseClass1";
	}
	@Generated
	public  CaseClass1	updated(Function<Builder,Builder> updater){
		Builder b = new Builder();
		b.setPrimInt(this.primInt);
		b.setPrimBoolean(this.primBoolean);
		b.setPrimChar(this.primChar);
		b.setPrimIntArray(this.primIntArray);
		b.setPrimShort(this.primShort);
		b.setPrimByte(this.primByte);
		b.setPrimByteArray(this.primByteArray);
		b.setAString(this.aString);
		b.setNulString(this.nulString);
		b.setPrimDouble(this.primDouble);
		b.setPrimFloat(this.primFloat);
		b.setNulDouble(this.nulDouble);
		b = updater.apply(b);
		return new CaseClass1(b.primInt, b.primBoolean, b.primChar, b.primIntArray, b.primShort, b.primByte, b.primByteArray, b.aString, b.nulString, b.primDouble, b.primFloat, b.nulDouble);
	}
	@Generated
	public  static CaseClass1	build(Function<Builder<NOT,NOT,NOT,NOT,NOT,NOT,NOT,NOT,NOT,NOT>, Builder<SET, SET, SET, SET, SET, SET, SET, SET, SET, SET>> setter){
		Builder b = setter.apply(new Builder<>());
		return new CaseClass1(b.primInt, b.primBoolean, b.primChar, b.primIntArray, b.primShort, b.primByte, b.primByteArray, b.aString, b.nulString, b.primDouble, b.primFloat, b.nulDouble);
	}
}
