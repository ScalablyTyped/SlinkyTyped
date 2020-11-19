package typingsSlinky.winrtUwp.Windows.Storage.Streams

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Reads data from an input stream. */
@js.native
trait DataReader extends js.Object {
  
  /** Gets or sets the byte order of the data in the input stream. */
  var byteOrder: ByteOrder = js.native
  
  /** Closes the current stream and releases system resources. */
  def close(): Unit = js.native
  
  /**
    * Detaches the buffer that is associated with the data reader.
    * @return The detached buffer.
    */
  def detachBuffer(): IBuffer = js.native
  
  /**
    * Detaches the stream that is associated with the data reader.
    * @return The detached stream.
    */
  def detachStream(): IInputStream = js.native
  
  /** Gets or sets the read options for the input stream. */
  var inputStreamOptions: InputStreamOptions = js.native
  
  /**
    * Loads data from the input stream.
    * @param count The count of bytes to load into the intermediate buffer.
    * @return The asynchronous load data request.
    */
  def loadAsync(count: Double): IPromiseWithOperation[_, DataReaderLoadOperation] = js.native
  
  /**
    * Reads a Boolean value from the input stream.
    * @return The value.
    */
  def readBoolean(): Boolean = js.native
  
  /**
    * Reads a buffer from the input stream.
    * @param length The length of the buffer, in bytes.
    * @return The buffer.
    */
  def readBuffer(length: Double): IBuffer = js.native
  
  /**
    * Reads a byte value from the input stream.
    * @return The value.
    */
  def readByte(): Double = js.native
  
  /**
    * Reads an array of byte values from the input stream.
    * @return The array that receives the byte values.
    */
  def readBytes(): js.Array[Double] = js.native
  
  /**
    * Reads a date and time value from the input stream.
    * @return The value.
    */
  def readDateTime(): js.Date = js.native
  
  /**
    * Reads a floating-point value from the input stream.
    * @return The value.
    */
  def readDouble(): Double = js.native
  
  /**
    * Reads a GUID value from the input stream.
    * @return The value.
    */
  def readGuid(): String = js.native
  
  /**
    * Reads a 16-bit integer value from the input stream.
    * @return The value.
    */
  def readInt16(): Double = js.native
  
  /**
    * Reads a 32-bit integer value from the input stream.
    * @return The value.
    */
  def readInt32(): Double = js.native
  
  /**
    * Reads a 64-bit integer value from the input stream.
    * @return The value.
    */
  def readInt64(): Double = js.native
  
  /**
    * Reads a floating-point value from the input stream.
    * @return The value.
    */
  def readSingle(): Double = js.native
  
  /**
    * Reads a string value from the input stream.
    * @param codeUnitCount The length of the string.
    * @return The value.
    */
  def readString(codeUnitCount: Double): String = js.native
  
  /**
    * Reads a time-interval value from the input stream.
    * @return The value.
    */
  def readTimeSpan(): Double = js.native
  
  /**
    * Reads a 16-bit unsigned integer from the input stream.
    * @return The value.
    */
  def readUInt16(): Double = js.native
  
  /**
    * Reads a 32-bit unsigned integer from the input stream.
    * @return The value.
    */
  def readUInt32(): Double = js.native
  
  /**
    * Reads a 64-bit unsigned integer from the input stream.
    * @return The value.
    */
  def readUInt64(): Double = js.native
  
  /** Gets the size of the buffer that has not been read. */
  var unconsumedBufferLength: Double = js.native
  
  /** Gets or sets the Unicode character encoding for the input stream. */
  var unicodeEncoding: UnicodeEncoding = js.native
}
object DataReader {
  
  @scala.inline
  def apply(
    byteOrder: ByteOrder,
    close: () => Unit,
    detachBuffer: () => IBuffer,
    detachStream: () => IInputStream,
    inputStreamOptions: InputStreamOptions,
    loadAsync: Double => IPromiseWithOperation[_, DataReaderLoadOperation],
    readBoolean: () => Boolean,
    readBuffer: Double => IBuffer,
    readByte: () => Double,
    readBytes: () => js.Array[Double],
    readDateTime: () => js.Date,
    readDouble: () => Double,
    readGuid: () => String,
    readInt16: () => Double,
    readInt32: () => Double,
    readInt64: () => Double,
    readSingle: () => Double,
    readString: Double => String,
    readTimeSpan: () => Double,
    readUInt16: () => Double,
    readUInt32: () => Double,
    readUInt64: () => Double,
    unconsumedBufferLength: Double,
    unicodeEncoding: UnicodeEncoding
  ): DataReader = {
    val __obj = js.Dynamic.literal(byteOrder = byteOrder.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), detachBuffer = js.Any.fromFunction0(detachBuffer), detachStream = js.Any.fromFunction0(detachStream), inputStreamOptions = inputStreamOptions.asInstanceOf[js.Any], loadAsync = js.Any.fromFunction1(loadAsync), readBoolean = js.Any.fromFunction0(readBoolean), readBuffer = js.Any.fromFunction1(readBuffer), readByte = js.Any.fromFunction0(readByte), readBytes = js.Any.fromFunction0(readBytes), readDateTime = js.Any.fromFunction0(readDateTime), readDouble = js.Any.fromFunction0(readDouble), readGuid = js.Any.fromFunction0(readGuid), readInt16 = js.Any.fromFunction0(readInt16), readInt32 = js.Any.fromFunction0(readInt32), readInt64 = js.Any.fromFunction0(readInt64), readSingle = js.Any.fromFunction0(readSingle), readString = js.Any.fromFunction1(readString), readTimeSpan = js.Any.fromFunction0(readTimeSpan), readUInt16 = js.Any.fromFunction0(readUInt16), readUInt32 = js.Any.fromFunction0(readUInt32), readUInt64 = js.Any.fromFunction0(readUInt64), unconsumedBufferLength = unconsumedBufferLength.asInstanceOf[js.Any], unicodeEncoding = unicodeEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataReader]
  }
  
  @scala.inline
  implicit class DataReaderOps[Self <: DataReader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setByteOrder(value: ByteOrder): Self = this.set("byteOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDetachBuffer(value: () => IBuffer): Self = this.set("detachBuffer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDetachStream(value: () => IInputStream): Self = this.set("detachStream", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInputStreamOptions(value: InputStreamOptions): Self = this.set("inputStreamOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadAsync(value: Double => IPromiseWithOperation[_, DataReaderLoadOperation]): Self = this.set("loadAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReadBoolean(value: () => Boolean): Self = this.set("readBoolean", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadBuffer(value: Double => IBuffer): Self = this.set("readBuffer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReadByte(value: () => Double): Self = this.set("readByte", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadBytes(value: () => js.Array[Double]): Self = this.set("readBytes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadDateTime(value: () => js.Date): Self = this.set("readDateTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadDouble(value: () => Double): Self = this.set("readDouble", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadGuid(value: () => String): Self = this.set("readGuid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadInt16(value: () => Double): Self = this.set("readInt16", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadInt32(value: () => Double): Self = this.set("readInt32", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadInt64(value: () => Double): Self = this.set("readInt64", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadSingle(value: () => Double): Self = this.set("readSingle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadString(value: Double => String): Self = this.set("readString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReadTimeSpan(value: () => Double): Self = this.set("readTimeSpan", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadUInt16(value: () => Double): Self = this.set("readUInt16", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadUInt32(value: () => Double): Self = this.set("readUInt32", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadUInt64(value: () => Double): Self = this.set("readUInt64", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnconsumedBufferLength(value: Double): Self = this.set("unconsumedBufferLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnicodeEncoding(value: UnicodeEncoding): Self = this.set("unicodeEncoding", value.asInstanceOf[js.Any])
  }
}
