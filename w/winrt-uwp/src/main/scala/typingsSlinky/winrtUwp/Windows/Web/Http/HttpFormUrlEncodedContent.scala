package typingsSlinky.winrtUwp.Windows.Web.Http

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IInputStream
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IOutputStream
import typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpContentHeaderCollection
import typingsSlinky.winrtUwp.anon.Length
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides HTTP content that uses name/value data encoded with the application/x-www-form-urlencoded MIME type. */
@js.native
trait HttpFormUrlEncodedContent extends js.Object {
  /** Get a collection of content headers set on the HttpFormUrlEncodedContent . */
  var headers: HttpContentHeaderCollection = js.native
  /**
    * Serialize the HttpFormUrlEncodedContent into memory as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  def bufferAllAsync(): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
  /** Closes the HttpFormUrlEncodedContent instance and releases allocated resources. */
  def close(): Unit = js.native
  /**
    * Serialize the HttpFormUrlEncodedContent to a buffer as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsBufferAsync(): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
  /**
    * Serialize the HttpFormUrlEncodedContent and return an input stream that represents the content as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsInputStreamAsync(): IPromiseWithIAsyncOperationWithProgress[IInputStream, Double] = js.native
  /**
    * Serialize the HttpFormUrlEncodedContent to a String as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsStringAsync(): IPromiseWithIAsyncOperationWithProgress[String, Double] = js.native
  /**
    * Computes the HttpFormUrlEncodedContent length in bytes.
    */
  def tryComputeLength(): Length = js.native
  /**
    * Write the HttpFormUrlEncodedContent to an output stream as an asynchronous operation.
    * @param outputStream The output stream to write to.
    * @return The object that represents the asynchronous operation.
    */
  def writeToStreamAsync(outputStream: IOutputStream): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
}

object HttpFormUrlEncodedContent {
  @scala.inline
  def apply(
    bufferAllAsync: () => IPromiseWithIAsyncOperationWithProgress[Double, Double],
    close: () => Unit,
    headers: HttpContentHeaderCollection,
    readAsBufferAsync: () => IPromiseWithIAsyncOperationWithProgress[IBuffer, Double],
    readAsInputStreamAsync: () => IPromiseWithIAsyncOperationWithProgress[IInputStream, Double],
    readAsStringAsync: () => IPromiseWithIAsyncOperationWithProgress[String, Double],
    tryComputeLength: () => Length,
    writeToStreamAsync: IOutputStream => IPromiseWithIAsyncOperationWithProgress[Double, Double]
  ): HttpFormUrlEncodedContent = {
    val __obj = js.Dynamic.literal(bufferAllAsync = js.Any.fromFunction0(bufferAllAsync), close = js.Any.fromFunction0(close), headers = headers.asInstanceOf[js.Any], readAsBufferAsync = js.Any.fromFunction0(readAsBufferAsync), readAsInputStreamAsync = js.Any.fromFunction0(readAsInputStreamAsync), readAsStringAsync = js.Any.fromFunction0(readAsStringAsync), tryComputeLength = js.Any.fromFunction0(tryComputeLength), writeToStreamAsync = js.Any.fromFunction1(writeToStreamAsync))
    __obj.asInstanceOf[HttpFormUrlEncodedContent]
  }
  @scala.inline
  implicit class HttpFormUrlEncodedContentOps[Self <: HttpFormUrlEncodedContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBufferAllAsync(value: () => IPromiseWithIAsyncOperationWithProgress[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferAllAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHeaders(value: HttpContentHeaderCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadAsBufferAsync(value: () => IPromiseWithIAsyncOperationWithProgress[IBuffer, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readAsBufferAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadAsInputStreamAsync(value: () => IPromiseWithIAsyncOperationWithProgress[IInputStream, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readAsInputStreamAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReadAsStringAsync(value: () => IPromiseWithIAsyncOperationWithProgress[String, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readAsStringAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTryComputeLength(value: () => Length): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryComputeLength")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWriteToStreamAsync(value: IOutputStream => IPromiseWithIAsyncOperationWithProgress[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeToStreamAsync")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

