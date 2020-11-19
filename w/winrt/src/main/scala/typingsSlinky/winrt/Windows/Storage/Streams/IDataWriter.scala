package typingsSlinky.winrt.Windows.Storage.Streams

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDataWriter extends js.Object {
  
  var byteOrder: ByteOrder = js.native
  
  def detachBuffer(): IBuffer = js.native
  
  def detachStream(): IOutputStream = js.native
  
  def flushAsync(): IAsyncOperation[Boolean] = js.native
  
  def measureString(value: String): Double = js.native
  
  def storeAsync(): DataWriterStoreOperation = js.native
  
  var unicodeEncoding: UnicodeEncoding = js.native
  
  var unstoredBufferLength: Double = js.native
  
  def writeBoolean(value: Boolean): Unit = js.native
  
  def writeBuffer(buffer: IBuffer): Unit = js.native
  def writeBuffer(buffer: IBuffer, start: Double, count: Double): Unit = js.native
  
  def writeByte(value: Double): Unit = js.native
  
  def writeBytes(value: js.Array[Double]): Unit = js.native
  def writeBytes(value: js.typedarray.Uint8Array): Unit = js.native
  
  def writeDateTime(value: js.Date): Unit = js.native
  
  def writeDouble(value: Double): Unit = js.native
  
  def writeGuid(value: String): Unit = js.native
  
  def writeInt16(value: Double): Unit = js.native
  
  def writeInt32(value: Double): Unit = js.native
  
  def writeInt64(value: Double): Unit = js.native
  
  def writeSingle(value: Double): Unit = js.native
  
  def writeString(value: String): Double = js.native
  
  def writeTimeSpan(value: Double): Unit = js.native
  
  def writeUInt16(value: Double): Unit = js.native
  
  def writeUInt32(value: Double): Unit = js.native
  
  def writeUInt64(value: Double): Unit = js.native
}
