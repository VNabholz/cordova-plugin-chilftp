/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkXmlCertVault {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CkXmlCertVault(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkXmlCertVault obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkXmlCertVault(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkXmlCertVault() {
    this(chilkatJNI.new_CkXmlCertVault(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkXmlCertVault_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkXmlCertVault_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkXmlCertVault_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkXmlCertVault_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkXmlCertVault_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkXmlCertVault_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkXmlCertVault_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkXmlCertVault_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkXmlCertVault_lastErrorXml(swigCPtr, this);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkXmlCertVault_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkXmlCertVault_version(swigCPtr, this);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkXmlCertVault_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkXmlCertVault_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkXmlCertVault_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkXmlCertVault_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkXmlCertVault_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkXmlCertVault_SaveLastError(swigCPtr, this, path);
  }

  public void get_MasterPassword(CkString str) {
    chilkatJNI.CkXmlCertVault_get_MasterPassword(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String masterPassword() {
    return chilkatJNI.CkXmlCertVault_masterPassword(swigCPtr, this);
  }

  public void put_MasterPassword(String newVal) {
    chilkatJNI.CkXmlCertVault_put_MasterPassword(swigCPtr, this, newVal);
  }

  public boolean AddCert(CkCert cert) {
    return chilkatJNI.CkXmlCertVault_AddCert(swigCPtr, this, CkCert.getCPtr(cert), cert);
  }

  public boolean AddCertBinary(CkByteData certBytes) {
    return chilkatJNI.CkXmlCertVault_AddCertBinary(swigCPtr, this, CkByteData.getCPtr(certBytes), certBytes);
  }

  public boolean AddCertChain(CkCertChain certChain) {
    return chilkatJNI.CkXmlCertVault_AddCertChain(swigCPtr, this, CkCertChain.getCPtr(certChain), certChain);
  }

  public boolean AddCertEncoded(String encodedBytes, String encoding) {
    return chilkatJNI.CkXmlCertVault_AddCertEncoded(swigCPtr, this, encodedBytes, encoding);
  }

  public boolean AddCertFile(String path) {
    return chilkatJNI.CkXmlCertVault_AddCertFile(swigCPtr, this, path);
  }

  public boolean AddCertString(String certData) {
    return chilkatJNI.CkXmlCertVault_AddCertString(swigCPtr, this, certData);
  }

  public boolean AddPemFile(String path, String password) {
    return chilkatJNI.CkXmlCertVault_AddPemFile(swigCPtr, this, path, password);
  }

  public boolean AddPfx(SWIGTYPE_p_CkPfx pfx) {
    return chilkatJNI.CkXmlCertVault_AddPfx(swigCPtr, this, SWIGTYPE_p_CkPfx.getCPtr(pfx));
  }

  public boolean AddPfxBinary(CkByteData pfxBytes, String password) {
    return chilkatJNI.CkXmlCertVault_AddPfxBinary(swigCPtr, this, CkByteData.getCPtr(pfxBytes), pfxBytes, password);
  }

  public boolean AddPfxEncoded(String encodedBytes, String encoding, String password) {
    return chilkatJNI.CkXmlCertVault_AddPfxEncoded(swigCPtr, this, encodedBytes, encoding, password);
  }

  public boolean AddPfxFile(String path, String password) {
    return chilkatJNI.CkXmlCertVault_AddPfxFile(swigCPtr, this, path, password);
  }

  public boolean GetXml(CkString outStr) {
    return chilkatJNI.CkXmlCertVault_GetXml(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String getXml() {
    return chilkatJNI.CkXmlCertVault_getXml(swigCPtr, this);
  }

  public String xml() {
    return chilkatJNI.CkXmlCertVault_xml(swigCPtr, this);
  }

  public boolean LoadXml(String xml) {
    return chilkatJNI.CkXmlCertVault_LoadXml(swigCPtr, this, xml);
  }

  public boolean LoadXmlFile(String path) {
    return chilkatJNI.CkXmlCertVault_LoadXmlFile(swigCPtr, this, path);
  }

  public boolean SaveXml(String path) {
    return chilkatJNI.CkXmlCertVault_SaveXml(swigCPtr, this, path);
  }

}
