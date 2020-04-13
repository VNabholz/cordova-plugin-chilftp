/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkStream {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CkStream(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkStream obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkStream(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkStream() {
    this(chilkatJNI.new_CkStream(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkStream_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkStream_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkStream_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void put_EventCallbackObject(CkBaseProgress progress) {
    chilkatJNI.CkStream_put_EventCallbackObject(swigCPtr, this, CkBaseProgress.getCPtr(progress), progress);
  }

  public boolean get_AbortCurrent() {
    return chilkatJNI.CkStream_get_AbortCurrent(swigCPtr, this);
  }

  public void put_AbortCurrent(boolean newVal) {
    chilkatJNI.CkStream_put_AbortCurrent(swigCPtr, this, newVal);
  }

  public boolean get_CanRead() {
    return chilkatJNI.CkStream_get_CanRead(swigCPtr, this);
  }

  public boolean get_CanWrite() {
    return chilkatJNI.CkStream_get_CanWrite(swigCPtr, this);
  }

  public boolean get_DataAvailable() {
    return chilkatJNI.CkStream_get_DataAvailable(swigCPtr, this);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkStream_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkStream_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkStream_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public int get_DefaultChunkSize() {
    return chilkatJNI.CkStream_get_DefaultChunkSize(swigCPtr, this);
  }

  public void put_DefaultChunkSize(int newVal) {
    chilkatJNI.CkStream_put_DefaultChunkSize(swigCPtr, this, newVal);
  }

  public boolean get_EndOfStream() {
    return chilkatJNI.CkStream_get_EndOfStream(swigCPtr, this);
  }

  public boolean get_IsWriteClosed() {
    return chilkatJNI.CkStream_get_IsWriteClosed(swigCPtr, this);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkStream_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkStream_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkStream_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkStream_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkStream_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkStream_lastErrorXml(swigCPtr, this);
  }

  public boolean get_LastMethodSuccess() {
    return chilkatJNI.CkStream_get_LastMethodSuccess(swigCPtr, this);
  }

  public void put_LastMethodSuccess(boolean newVal) {
    chilkatJNI.CkStream_put_LastMethodSuccess(swigCPtr, this, newVal);
  }

  public int get_Length32() {
    return chilkatJNI.CkStream_get_Length32(swigCPtr, this);
  }

  public void put_Length32(int newVal) {
    chilkatJNI.CkStream_put_Length32(swigCPtr, this, newVal);
  }

  public int get_ReadFailReason() {
    return chilkatJNI.CkStream_get_ReadFailReason(swigCPtr, this);
  }

  public int get_ReadTimeoutMs() {
    return chilkatJNI.CkStream_get_ReadTimeoutMs(swigCPtr, this);
  }

  public void put_ReadTimeoutMs(int newVal) {
    chilkatJNI.CkStream_put_ReadTimeoutMs(swigCPtr, this, newVal);
  }

  public void get_SinkFile(CkString str) {
    chilkatJNI.CkStream_get_SinkFile(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String sinkFile() {
    return chilkatJNI.CkStream_sinkFile(swigCPtr, this);
  }

  public void put_SinkFile(String newVal) {
    chilkatJNI.CkStream_put_SinkFile(swigCPtr, this, newVal);
  }

  public void get_SourceFile(CkString str) {
    chilkatJNI.CkStream_get_SourceFile(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String sourceFile() {
    return chilkatJNI.CkStream_sourceFile(swigCPtr, this);
  }

  public void put_SourceFile(String newVal) {
    chilkatJNI.CkStream_put_SourceFile(swigCPtr, this, newVal);
  }

  public int get_SourceFilePart() {
    return chilkatJNI.CkStream_get_SourceFilePart(swigCPtr, this);
  }

  public void put_SourceFilePart(int newVal) {
    chilkatJNI.CkStream_put_SourceFilePart(swigCPtr, this, newVal);
  }

  public int get_SourceFilePartSize() {
    return chilkatJNI.CkStream_get_SourceFilePartSize(swigCPtr, this);
  }

  public void put_SourceFilePartSize(int newVal) {
    chilkatJNI.CkStream_put_SourceFilePartSize(swigCPtr, this, newVal);
  }

  public boolean get_StringBom() {
    return chilkatJNI.CkStream_get_StringBom(swigCPtr, this);
  }

  public void put_StringBom(boolean newVal) {
    chilkatJNI.CkStream_put_StringBom(swigCPtr, this, newVal);
  }

  public void get_StringCharset(CkString str) {
    chilkatJNI.CkStream_get_StringCharset(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String stringCharset() {
    return chilkatJNI.CkStream_stringCharset(swigCPtr, this);
  }

  public void put_StringCharset(String newVal) {
    chilkatJNI.CkStream_put_StringCharset(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkStream_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkStream_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkStream_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkStream_version(swigCPtr, this);
  }

  public int get_WriteFailReason() {
    return chilkatJNI.CkStream_get_WriteFailReason(swigCPtr, this);
  }

  public int get_WriteTimeoutMs() {
    return chilkatJNI.CkStream_get_WriteTimeoutMs(swigCPtr, this);
  }

  public void put_WriteTimeoutMs(int newVal) {
    chilkatJNI.CkStream_put_WriteTimeoutMs(swigCPtr, this, newVal);
  }

  public boolean LoadTaskCaller(CkTask task) {
    return chilkatJNI.CkStream_LoadTaskCaller(swigCPtr, this, CkTask.getCPtr(task), task);
  }

  public boolean ReadBd(CkBinData binData) {
    return chilkatJNI.CkStream_ReadBd(swigCPtr, this, CkBinData.getCPtr(binData), binData);
  }

  public CkTask ReadBdAsync(CkBinData binData) {
    long cPtr = chilkatJNI.CkStream_ReadBdAsync(swigCPtr, this, CkBinData.getCPtr(binData), binData);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean ReadBytes(CkByteData outBytes) {
    return chilkatJNI.CkStream_ReadBytes(swigCPtr, this, CkByteData.getCPtr(outBytes), outBytes);
  }

  public CkTask ReadBytesAsync() {
    long cPtr = chilkatJNI.CkStream_ReadBytesAsync(swigCPtr, this);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean ReadBytesENC(String encoding, CkString outStr) {
    return chilkatJNI.CkStream_ReadBytesENC(swigCPtr, this, encoding, CkString.getCPtr(outStr), outStr);
  }

  public String readBytesENC(String encoding) {
    return chilkatJNI.CkStream_readBytesENC(swigCPtr, this, encoding);
  }

  public CkTask ReadBytesENCAsync(String encoding) {
    long cPtr = chilkatJNI.CkStream_ReadBytesENCAsync(swigCPtr, this, encoding);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean ReadNBytes(int numBytes, CkByteData outBytes) {
    return chilkatJNI.CkStream_ReadNBytes(swigCPtr, this, numBytes, CkByteData.getCPtr(outBytes), outBytes);
  }

  public CkTask ReadNBytesAsync(int numBytes) {
    long cPtr = chilkatJNI.CkStream_ReadNBytesAsync(swigCPtr, this, numBytes);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean ReadNBytesENC(int numBytes, String encoding, CkString outStr) {
    return chilkatJNI.CkStream_ReadNBytesENC(swigCPtr, this, numBytes, encoding, CkString.getCPtr(outStr), outStr);
  }

  public String readNBytesENC(int numBytes, String encoding) {
    return chilkatJNI.CkStream_readNBytesENC(swigCPtr, this, numBytes, encoding);
  }

  public CkTask ReadNBytesENCAsync(int numBytes, String encoding) {
    long cPtr = chilkatJNI.CkStream_ReadNBytesENCAsync(swigCPtr, this, numBytes, encoding);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean ReadSb(CkStringBuilder sb) {
    return chilkatJNI.CkStream_ReadSb(swigCPtr, this, CkStringBuilder.getCPtr(sb), sb);
  }

  public CkTask ReadSbAsync(CkStringBuilder sb) {
    long cPtr = chilkatJNI.CkStream_ReadSbAsync(swigCPtr, this, CkStringBuilder.getCPtr(sb), sb);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean ReadString(CkString outStr) {
    return chilkatJNI.CkStream_ReadString(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String readString() {
    return chilkatJNI.CkStream_readString(swigCPtr, this);
  }

  public CkTask ReadStringAsync() {
    long cPtr = chilkatJNI.CkStream_ReadStringAsync(swigCPtr, this);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean ReadToCRLF(CkString outStr) {
    return chilkatJNI.CkStream_ReadToCRLF(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String readToCRLF() {
    return chilkatJNI.CkStream_readToCRLF(swigCPtr, this);
  }

  public CkTask ReadToCRLFAsync() {
    long cPtr = chilkatJNI.CkStream_ReadToCRLFAsync(swigCPtr, this);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean ReadUntilMatch(String matchStr, CkString outStr) {
    return chilkatJNI.CkStream_ReadUntilMatch(swigCPtr, this, matchStr, CkString.getCPtr(outStr), outStr);
  }

  public String readUntilMatch(String matchStr) {
    return chilkatJNI.CkStream_readUntilMatch(swigCPtr, this, matchStr);
  }

  public CkTask ReadUntilMatchAsync(String matchStr) {
    long cPtr = chilkatJNI.CkStream_ReadUntilMatchAsync(swigCPtr, this, matchStr);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public void Reset() {
    chilkatJNI.CkStream_Reset(swigCPtr, this);
  }

  public boolean RunStream() {
    return chilkatJNI.CkStream_RunStream(swigCPtr, this);
  }

  public CkTask RunStreamAsync() {
    long cPtr = chilkatJNI.CkStream_RunStreamAsync(swigCPtr, this);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkStream_SaveLastError(swigCPtr, this, path);
  }

  public boolean SetSinkStream(CkStream strm) {
    return chilkatJNI.CkStream_SetSinkStream(swigCPtr, this, CkStream.getCPtr(strm), strm);
  }

  public boolean SetSourceBytes(CkByteData sourceData) {
    return chilkatJNI.CkStream_SetSourceBytes(swigCPtr, this, CkByteData.getCPtr(sourceData), sourceData);
  }

  public boolean SetSourceStream(CkStream strm) {
    return chilkatJNI.CkStream_SetSourceStream(swigCPtr, this, CkStream.getCPtr(strm), strm);
  }

  public boolean SetSourceString(String srcStr, String charset) {
    return chilkatJNI.CkStream_SetSourceString(swigCPtr, this, srcStr, charset);
  }

  public boolean WriteBd(CkBinData binData) {
    return chilkatJNI.CkStream_WriteBd(swigCPtr, this, CkBinData.getCPtr(binData), binData);
  }

  public CkTask WriteBdAsync(CkBinData binData) {
    long cPtr = chilkatJNI.CkStream_WriteBdAsync(swigCPtr, this, CkBinData.getCPtr(binData), binData);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean WriteByte(int byteVal) {
    return chilkatJNI.CkStream_WriteByte(swigCPtr, this, byteVal);
  }

  public CkTask WriteByteAsync(int byteVal) {
    long cPtr = chilkatJNI.CkStream_WriteByteAsync(swigCPtr, this, byteVal);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean WriteBytes(CkByteData byteData) {
    return chilkatJNI.CkStream_WriteBytes(swigCPtr, this, CkByteData.getCPtr(byteData), byteData);
  }

  public CkTask WriteBytesAsync(CkByteData byteData) {
    long cPtr = chilkatJNI.CkStream_WriteBytesAsync(swigCPtr, this, CkByteData.getCPtr(byteData), byteData);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean WriteBytesENC(String byteData, String encoding) {
    return chilkatJNI.CkStream_WriteBytesENC(swigCPtr, this, byteData, encoding);
  }

  public CkTask WriteBytesENCAsync(String byteData, String encoding) {
    long cPtr = chilkatJNI.CkStream_WriteBytesENCAsync(swigCPtr, this, byteData, encoding);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean WriteClose() {
    return chilkatJNI.CkStream_WriteClose(swigCPtr, this);
  }

  public boolean WriteSb(CkStringBuilder sb) {
    return chilkatJNI.CkStream_WriteSb(swigCPtr, this, CkStringBuilder.getCPtr(sb), sb);
  }

  public CkTask WriteSbAsync(CkStringBuilder sb) {
    long cPtr = chilkatJNI.CkStream_WriteSbAsync(swigCPtr, this, CkStringBuilder.getCPtr(sb), sb);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean WriteString(String str) {
    return chilkatJNI.CkStream_WriteString(swigCPtr, this, str);
  }

  public CkTask WriteStringAsync(String str) {
    long cPtr = chilkatJNI.CkStream_WriteStringAsync(swigCPtr, this, str);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

}
