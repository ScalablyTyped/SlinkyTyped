package typingsSlinky.winrtUwp.Windows.Devices.Enumeration

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IInputStream
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IOutputStream
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typingsSlinky.winrtUwp.Windows.Storage.Streams.InputStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the thumbnail image for a device. */
@js.native
trait DeviceThumbnail extends js.Object {
  /** Gets a value that indicates whether the stream can be read from. */
  var canRead: Boolean = js.native
  /** Gets a value that indicates whether the stream can be written to. */
  var canWrite: Boolean = js.native
  /** Returns the content type of the thumbnail image. */
  var contentType: String = js.native
  /** Gets the byte offset of the stream. */
  var position: Double = js.native
  /** Gets or sets the size of the device thumbnail image. */
  var size: Double = js.native
  /**
    * Creates a new instance of a IRandomAccessStream over the same resource as the current stream.
    * @return The new stream. The initial, internal position of the stream is 0.
    */
  def cloneStream(): IRandomAccessStream = js.native
  /** Closes the current stream and releases system resources. */
  def close(): Unit = js.native
  /**
    * Flushes data asynchronously in a sequential stream.
    * @return The stream flush operation.
    */
  def flushAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
  /**
    * Returns a pointer to an input stream starting at the specified location.
    * @param position The position in the input stream.
    * @return A pointer to an input stream.
    */
  def getInputStreamAt(position: Double): IInputStream = js.native
  /**
    * Returns a pointer to an output stream starting at the specified location.
    * @param position The position in the output stream.
    * @return A pointer to an output stream.
    */
  def getOutputStreamAt(position: Double): IOutputStream = js.native
  /**
    * Returns an asynchronous byte reader object.
    * @param buffer The buffer into which the asynchronous read operation places the bytes that are read.
    * @param count The number of bytes to read.
    * @param options Specifies the type of the asynchronous read operation.
    * @return The asynchronous operation.
    */
  def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
  /**
    * Sets the position of the stream to the specified value.
    * @param position The new position of the stream.
    */
  def seek(position: Double): Unit = js.native
  /**
    * Writes data asynchronously in a sequential stream.
    * @param buffer The buffer into which the asynchronous writer operation writes.
    * @return The byte writer operation.
    */
  def writeAsync(buffer: IBuffer): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
}

object DeviceThumbnail {
  @scala.inline
  def apply(
    canRead: Boolean,
    canWrite: Boolean,
    cloneStream: () => IRandomAccessStream,
    close: () => Unit,
    contentType: String,
    flushAsync: () => IPromiseWithIAsyncOperation[Boolean],
    getInputStreamAt: Double => IInputStream,
    getOutputStreamAt: Double => IOutputStream,
    position: Double,
    readAsync: (IBuffer, Double, InputStreamOptions) => IPromiseWithIAsyncOperationWithProgress[IBuffer, Double],
    seek: Double => Unit,
    size: Double,
    writeAsync: IBuffer => IPromiseWithIAsyncOperationWithProgress[Double, Double]
  ): DeviceThumbnail = {
    val __obj = js.Dynamic.literal(canRead = canRead.asInstanceOf[js.Any], canWrite = canWrite.asInstanceOf[js.Any], cloneStream = js.Any.fromFunction0(cloneStream), close = js.Any.fromFunction0(close), contentType = contentType.asInstanceOf[js.Any], flushAsync = js.Any.fromFunction0(flushAsync), getInputStreamAt = js.Any.fromFunction1(getInputStreamAt), getOutputStreamAt = js.Any.fromFunction1(getOutputStreamAt), position = position.asInstanceOf[js.Any], readAsync = js.Any.fromFunction3(readAsync), seek = js.Any.fromFunction1(seek), size = size.asInstanceOf[js.Any], writeAsync = js.Any.fromFunction1(writeAsync))
    __obj.asInstanceOf[DeviceThumbnail]
  }
  @scala.inline
  implicit class DeviceThumbnailOps[Self <: DeviceThumbnail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanRead(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canRead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanWrite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canWrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloneStream(value: () => IRandomAccessStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneStream")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlushAsync(value: () => IPromiseWithIAsyncOperation[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flushAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetInputStreamAt(value: Double => IInputStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInputStreamAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetOutputStreamAt(value: Double => IOutputStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOutputStreamAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadAsync(
      value: (IBuffer, Double, InputStreamOptions) => IPromiseWithIAsyncOperationWithProgress[IBuffer, Double]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readAsync")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSeek(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seek")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWriteAsync(value: IBuffer => IPromiseWithIAsyncOperationWithProgress[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeAsync")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

