package typingsSlinky.winrtUwp.Windows.Storage.Streams

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Reads data from an input stream. */
@js.native
trait DataReader extends js.Object {
  /** Gets or sets the byte order of the data in the input stream. */
  var byteOrder: ByteOrder = js.native
  /** Gets or sets the read options for the input stream. */
  var inputStreamOptions: InputStreamOptions = js.native
  /** Gets the size of the buffer that has not been read. */
  var unconsumedBufferLength: Double = js.native
  /** Gets or sets the Unicode character encoding for the input stream. */
  var unicodeEncoding: UnicodeEncoding = js.native
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
    def withByteOrder(value: ByteOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byteOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDetachBuffer(value: () => IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detachBuffer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDetachStream(value: () => IInputStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detachStream")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInputStreamOptions(value: InputStreamOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputStreamOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadAsync(value: Double => IPromiseWithOperation[_, DataReaderLoadOperation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReadBoolean(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readBoolean")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadBuffer(value: Double => IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readBuffer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReadByte(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readByte")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadBytes(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readBytes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadDateTime(value: () => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readDateTime")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadDouble(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readDouble")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadGuid(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readGuid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadInt16(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readInt16")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadInt32(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readInt32")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadInt64(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readInt64")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadSingle(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readSingle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadString(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReadTimeSpan(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readTimeSpan")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadUInt16(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readUInt16")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadUInt32(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readUInt32")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadUInt64(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readUInt64")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUnconsumedBufferLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unconsumedBufferLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnicodeEncoding(value: UnicodeEncoding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unicodeEncoding")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

