package typingsSlinky.winrtUwp.Windows.Graphics.Imaging

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

/** An implementation of IRandomAccessStreamWithContent type used in the Imaging namespace. */
@js.native
trait ImageStream extends js.Object {
  /** Indicates if you can read the stream. */
  var canRead: Boolean = js.native
  /** Indicates if you can write to the stream. */
  var canWrite: Boolean = js.native
  /** Returns the data format of the stream. */
  var contentType: String = js.native
  /** Gets the byte offset of the stream. */
  var position: Double = js.native
  /** Gets or sets the size of the random access stream. */
  var size: Double = js.native
  /**
    * Returns the file stream for the ImageStream .
    * @return The file stream for the image.
    */
  def cloneStream(): IRandomAccessStream = js.native
  /** Closes the ImageStream . */
  def close(): Unit = js.native
  /**
    * Asynchronously commits the current frame data and flushes all of the data on the image stream.
    * @return An object that manages the asynchronous flush operation.
    */
  def flushAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
  /**
    * Returns an input stream at a specified location in a stream.
    * @param position The location in the stream at which to begin.
    * @return The input stream.
    */
  def getInputStreamAt(position: Double): IInputStream = js.native
  /**
    * Returns an output stream at a specified location in a stream.
    * @param position The location in the output stream at which to begin.
    * @return The output stream.
    */
  def getOutputStreamAt(position: Double): IOutputStream = js.native
  /**
    * Reads data asynchronously from a sequential stream.
    * @param buffer The buffer into which the asynchronous read operation stores the data.
    * @param count The size of the buffer.
    * @param options The options for the stream to be read.
    * @return The byte reader operation.
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

object ImageStream {
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
  ): ImageStream = {
    val __obj = js.Dynamic.literal(canRead = canRead.asInstanceOf[js.Any], canWrite = canWrite.asInstanceOf[js.Any], cloneStream = js.Any.fromFunction0(cloneStream), close = js.Any.fromFunction0(close), contentType = contentType.asInstanceOf[js.Any], flushAsync = js.Any.fromFunction0(flushAsync), getInputStreamAt = js.Any.fromFunction1(getInputStreamAt), getOutputStreamAt = js.Any.fromFunction1(getOutputStreamAt), position = position.asInstanceOf[js.Any], readAsync = js.Any.fromFunction3(readAsync), seek = js.Any.fromFunction1(seek), size = size.asInstanceOf[js.Any], writeAsync = js.Any.fromFunction1(writeAsync))
    __obj.asInstanceOf[ImageStream]
  }
  @scala.inline
  implicit class ImageStreamOps[Self <: ImageStream] (val x: Self) extends AnyVal {
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

