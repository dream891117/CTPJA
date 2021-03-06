package thostmduserapi;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\u00fb\ufffd<br>
 * <i>native declaration : ctpapi/linux/ThostFtdcUserApiStruct.h:836</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("thostmduserapi") 
public class CThostFtdcBrokerUserField extends StructObject {
	/**
	 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(0) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \ufffd\u00fb\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcUserIDType
	 */
	@Array({16}) 
	@Field(1) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \ufffd\u00fb\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcUserNameType
	 */
	@Array({81}) 
	@Field(2) 
	public Pointer<Byte > UserName() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \ufffd\u00fb\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcUserTypeType
	 */
	@Field(3) 
	public byte UserType() {
		return this.io.getByteField(this, 3);
	}
	/**
	 * \ufffd\u00fb\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcUserTypeType
	 */
	@Field(3) 
	public CThostFtdcBrokerUserField UserType(byte UserType) {
		this.io.setByteField(this, 3, UserType);
		return this;
	}
	/**
	 * \ufffd\u01f7\ufffd\ufffd\u053e<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(4) 
	public int IsActive() {
		return this.io.getIntField(this, 4);
	}
	/**
	 * \ufffd\u01f7\ufffd\ufffd\u053e<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(4) 
	public CThostFtdcBrokerUserField IsActive(int IsActive) {
		this.io.setIntField(this, 4, IsActive);
		return this;
	}
	/**
	 * \ufffd\u01f7\ufffd\u02b9\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(5) 
	public int IsUsingOTP() {
		return this.io.getIntField(this, 5);
	}
	/**
	 * \ufffd\u01f7\ufffd\u02b9\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(5) 
	public CThostFtdcBrokerUserField IsUsingOTP(int IsUsingOTP) {
		this.io.setIntField(this, 5, IsUsingOTP);
		return this;
	}
	public CThostFtdcBrokerUserField() {
		super();
	}
	public CThostFtdcBrokerUserField(Pointer pointer) {
		super(pointer);
	}
}
