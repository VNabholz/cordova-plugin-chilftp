/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkLog {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CkLog(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkLog obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkLog(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkLog() {
    this(chilkatJNI.new_CkLog(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkLog_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkLog_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkLog_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkLog_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkLog_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkLog_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkLog_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkLog_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkLog_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkLog_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkLog_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkLog_lastErrorXml(swigCPtr, this);
  }

  public boolean get_LastMethodSuccess() {
    return chilkatJNI.CkLog_get_LastMethodSuccess(swigCPtr, this);
  }

  public void put_LastMethodSuccess(boolean newVal) {
    chilkatJNI.CkLog_put_LastMethodSuccess(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkLog_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkLog_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkLog_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkLog_version(swigCPtr, this);
  }

  public void Clear(String initialTag) {
    chilkatJNI.CkLog_Clear(swigCPtr, this, initialTag);
  }

  public void EnterContext(String tag) {
    chilkatJNI.CkLog_EnterContext(swigCPtr, this, tag);
  }

  public void LeaveContext() {
    chilkatJNI.CkLog_LeaveContext(swigCPtr, this);
  }

  public void LogData(String tag, String message) {
    chilkatJNI.CkLog_LogData(swigCPtr, this, tag, message);
  }

  public void LogDataBase64(String tag, CkByteData data) {
    chilkatJNI.CkLog_LogDataBase64(swigCPtr, this, tag, CkByteData.getCPtr(data), data);
  }

  public void LogDataHex(String tag, CkByteData data) {
    chilkatJNI.CkLog_LogDataHex(swigCPtr, this, tag, CkByteData.getCPtr(data), data);
  }

  public void LogDataMax(String tag, String message, int maxNumChars) {
    chilkatJNI.CkLog_LogDataMax(swigCPtr, this, tag, message, maxNumChars);
  }

  public void LogDateTime(String tag, boolean gmt) {
    chilkatJNI.CkLog_LogDateTime(swigCPtr, this, tag, gmt);
  }

  public void LogError(String message) {
    chilkatJNI.CkLog_LogError(swigCPtr, this, message);
  }

  public void LogInfo(String message) {
    chilkatJNI.CkLog_LogInfo(swigCPtr, this, message);
  }

  public void LogInt(String tag, int value) {
    chilkatJNI.CkLog_LogInt(swigCPtr, this, tag, value);
  }

  public void LogInt64(String tag, long value) {
    chilkatJNI.CkLog_LogInt64(swigCPtr, this, tag, value);
  }

  public void LogTimestamp(String tag) {
    chilkatJNI.CkLog_LogTimestamp(swigCPtr, this, tag);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkLog_SaveLastError(swigCPtr, this, path);
  }

}
