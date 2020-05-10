package typingsSlinky.winrtUwp.Windows.Web.Http

import typingsSlinky.winrtUwp.AnonLength
import typingsSlinky.winrtUwp.Windows.Foundation.IClosable
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typingsSlinky.winrtUwp.Windows.Foundation.IStringable
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IInputStream
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IOutputStream
import typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpContentHeaderCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a base interface for an HTTP entity body and content headers. */
@js.native
trait IHttpContent
  extends IClosable
     with IStringable {
  /** Get a collection of content headers set on the IHttpContent . */
  var headers: HttpContentHeaderCollection = js.native
  /**
    * Serialize the HTTP content into memory as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  def bufferAllAsync(): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
  /**
    * Serialize the HTTP content to a buffer as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsBufferAsync(): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
  /**
    * Serialize the HTTP content and return an input stream that represents the content as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsInputStreamAsync(): IPromiseWithIAsyncOperationWithProgress[IInputStream, Double] = js.native
  /**
    * Serialize the HTTP content to a String as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsStringAsync(): IPromiseWithIAsyncOperationWithProgress[String, Double] = js.native
  /**
    * Determines whether the HTTP content has a valid length in bytes.
    */
  def tryComputeLength(): AnonLength = js.native
  /**
    * Write the HTTP content to an output stream as an asynchronous operation.
    * @param outputStream The output stream to write to.
    * @return The object representing the asynchronous operation.
    */
  def writeToStreamAsync(outputStream: IOutputStream): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
}

object IHttpContent {
  @scala.inline
  def apply(
    bufferAllAsync: () => IPromiseWithIAsyncOperationWithProgress[Double, Double],
    close: () => Unit,
    headers: HttpContentHeaderCollection,
    readAsBufferAsync: () => IPromiseWithIAsyncOperationWithProgress[IBuffer, Double],
    readAsInputStreamAsync: () => IPromiseWithIAsyncOperationWithProgress[IInputStream, Double],
    readAsStringAsync: () => IPromiseWithIAsyncOperationWithProgress[String, Double],
    tryComputeLength: () => AnonLength,
    writeToStreamAsync: IOutputStream => IPromiseWithIAsyncOperationWithProgress[Double, Double]
  ): IHttpContent = {
    val __obj = js.Dynamic.literal(bufferAllAsync = js.Any.fromFunction0(bufferAllAsync), close = js.Any.fromFunction0(close), headers = headers.asInstanceOf[js.Any], readAsBufferAsync = js.Any.fromFunction0(readAsBufferAsync), readAsInputStreamAsync = js.Any.fromFunction0(readAsInputStreamAsync), readAsStringAsync = js.Any.fromFunction0(readAsStringAsync), tryComputeLength = js.Any.fromFunction0(tryComputeLength), writeToStreamAsync = js.Any.fromFunction1(writeToStreamAsync))
    __obj.asInstanceOf[IHttpContent]
  }
  @scala.inline
  implicit class IHttpContentOps[Self <: IHttpContent] (val x: Self) extends AnyVal {
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
    def withTryComputeLength(value: () => AnonLength): Self = {
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

