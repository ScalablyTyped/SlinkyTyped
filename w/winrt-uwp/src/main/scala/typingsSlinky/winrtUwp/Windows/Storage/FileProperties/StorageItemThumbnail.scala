package typingsSlinky.winrtUwp.Windows.Storage.FileProperties

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

/** Represents the thumbnail image associated with a system resource (like a file or folder). */
@js.native
trait StorageItemThumbnail extends js.Object {
  /** Gets a value that indicates whether the thumbnail stream can be read from. */
  var canRead: Boolean = js.native
  /** Gets a value that indicates whether the thumbnail stream can be written to. */
  var canWrite: Boolean = js.native
  /** Gets the MIME content type of the thumbnail image. */
  var contentType: String = js.native
  /** Gets the original (not scaled) height of the thumbnail image. */
  var originalHeight: Double = js.native
  /** Gets the original (not scaled) width of the thumbnail image. */
  var originalWidth: Double = js.native
  /** Gets the byte offset of the thumbnail stream. */
  var position: Double = js.native
  /** Gets a value that indicates whether the thumbnail image returned was a cached version with a smaller size. */
  var returnedSmallerCachedSize: Boolean = js.native
  /** Gets or sets the size of the thumbnail image. */
  var size: Double = js.native
  /** Gets a value that indicates if the thumbnail is an icon or an image. */
  var `type`: ThumbnailType = js.native
  /**
    * Creates a new stream over the thumbnail that is represented by the current storageItemThumbnail object.
    * @return The new thumbnail stream. The initial, internal position of the stream is 0.
    */
  def cloneStream(): IRandomAccessStream = js.native
  /** Releases system resources that are exposed by a Windows Runtime object. */
  def close(): Unit = js.native
  /**
    * Flushes data asynchronously in a sequential stream.
    * @return The stream flush operation.
    */
  def flushAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
  /**
    * Retrieves the thumbnail image data as an undecoded stream.
    * @param position The position in the storage item to start reading thumbnail image data.
    * @return An object for reading the thumbnail image data.
    */
  def getInputStreamAt(position: Double): IInputStream = js.native
  /**
    * Retrieves an output stream object for writing thumbnail image data to a storage item.
    * @param position The position in the storage item to start writing thumbnail image data.
    * @return The output stream.
    */
  def getOutputStreamAt(position: Double): IOutputStream = js.native
  /**
    * Returns an asynchronous byte reader object.
    * @param buffer The buffer into which the asynchronous read operation places the bytes that are read.
    * @param count The number of bytes to read that is less than or equal to the Capacity value.
    * @param options Specifies the type of the asynchronous read operation.
    * @return The asynchronous operation.
    */
  def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
  /**
    * Sets the offset of the thumbnail stream to the specified value.
    * @param position The number of bytes from the start of the thumbnail stream where the position of the thumbnail stream is set.
    */
  def seek(position: Double): Unit = js.native
  /**
    * Writes data asynchronously in a sequential stream.
    * @param buffer The buffer into which the asynchronous writer operation writes.
    * @return The byte writer operation.
    */
  def writeAsync(buffer: IBuffer): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
}

object StorageItemThumbnail {
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
    originalHeight: Double,
    originalWidth: Double,
    position: Double,
    readAsync: (IBuffer, Double, InputStreamOptions) => IPromiseWithIAsyncOperationWithProgress[IBuffer, Double],
    returnedSmallerCachedSize: Boolean,
    seek: Double => Unit,
    size: Double,
    `type`: ThumbnailType,
    writeAsync: IBuffer => IPromiseWithIAsyncOperationWithProgress[Double, Double]
  ): StorageItemThumbnail = {
    val __obj = js.Dynamic.literal(canRead = canRead.asInstanceOf[js.Any], canWrite = canWrite.asInstanceOf[js.Any], cloneStream = js.Any.fromFunction0(cloneStream), close = js.Any.fromFunction0(close), contentType = contentType.asInstanceOf[js.Any], flushAsync = js.Any.fromFunction0(flushAsync), getInputStreamAt = js.Any.fromFunction1(getInputStreamAt), getOutputStreamAt = js.Any.fromFunction1(getOutputStreamAt), originalHeight = originalHeight.asInstanceOf[js.Any], originalWidth = originalWidth.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], readAsync = js.Any.fromFunction3(readAsync), returnedSmallerCachedSize = returnedSmallerCachedSize.asInstanceOf[js.Any], seek = js.Any.fromFunction1(seek), size = size.asInstanceOf[js.Any], writeAsync = js.Any.fromFunction1(writeAsync))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageItemThumbnail]
  }
  @scala.inline
  implicit class StorageItemThumbnailOps[Self <: StorageItemThumbnail] (val x: Self) extends AnyVal {
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
    def withOriginalHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalWidth")(value.asInstanceOf[js.Any])
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
    def withReturnedSmallerCachedSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnedSmallerCachedSize")(value.asInstanceOf[js.Any])
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
    def withType(value: ThumbnailType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
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

