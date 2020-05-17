package typingsSlinky.winrtUwp.Windows.Web.Http

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IInputStream
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IOutputStream
import typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpContentHeaderCollection
import typingsSlinky.winrtUwp.anon.Length
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides HTTP content that uses the multipart/ * MIME type. */
@js.native
trait HttpMultipartContent extends js.Object {
  /** Get a collection of content headers set on the HttpMultipartContent . */
  var headers: HttpContentHeaderCollection = js.native
  /**
    * Add HTTP content to the HttpMultipartContent instance.
    * @param content The HTTP content to add to HttpMultipartContent .
    */
  def add(content: IHttpContent): Unit = js.native
  /**
    * Serialize the HttpMultipartContent into memory as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  def bufferAllAsync(): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
  /** Closes the HttpMultipartContent instance and releases allocated resources. */
  def close(): Unit = js.native
  /**
    * Gets an object that can be used to enumerate the contents in the HttpMultipartContent object.
    * @return An object that can be used to enumerate the contents in the HttpMultipartContent object.
    */
  def first(): IIterator[IHttpContent] = js.native
  /**
    * Serialize the HttpMultipartContent to a buffer as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsBufferAsync(): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
  /**
    * Serialize the HttpMultipartContent and return an input stream that represents the content as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsInputStreamAsync(): IPromiseWithIAsyncOperationWithProgress[IInputStream, Double] = js.native
  /**
    * Serialize the HttpMultipartContent to a String as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsStringAsync(): IPromiseWithIAsyncOperationWithProgress[String, Double] = js.native
  /**
    * Determines whether the HttpMultipartContent has a valid length in bytes.
    */
  def tryComputeLength(): Length = js.native
  /**
    * Write the HttpMultipartContent to an output stream as an asynchronous operation.
    * @param outputStream The output stream to write to.
    * @return The object that represents the asynchronous operation.
    */
  def writeToStreamAsync(outputStream: IOutputStream): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
}

object HttpMultipartContent {
  @scala.inline
  def apply(
    add: IHttpContent => Unit,
    bufferAllAsync: () => IPromiseWithIAsyncOperationWithProgress[Double, Double],
    close: () => Unit,
    first: () => IIterator[IHttpContent],
    headers: HttpContentHeaderCollection,
    readAsBufferAsync: () => IPromiseWithIAsyncOperationWithProgress[IBuffer, Double],
    readAsInputStreamAsync: () => IPromiseWithIAsyncOperationWithProgress[IInputStream, Double],
    readAsStringAsync: () => IPromiseWithIAsyncOperationWithProgress[String, Double],
    tryComputeLength: () => Length,
    writeToStreamAsync: IOutputStream => IPromiseWithIAsyncOperationWithProgress[Double, Double]
  ): HttpMultipartContent = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), bufferAllAsync = js.Any.fromFunction0(bufferAllAsync), close = js.Any.fromFunction0(close), first = js.Any.fromFunction0(first), headers = headers.asInstanceOf[js.Any], readAsBufferAsync = js.Any.fromFunction0(readAsBufferAsync), readAsInputStreamAsync = js.Any.fromFunction0(readAsInputStreamAsync), readAsStringAsync = js.Any.fromFunction0(readAsStringAsync), tryComputeLength = js.Any.fromFunction0(tryComputeLength), writeToStreamAsync = js.Any.fromFunction1(writeToStreamAsync))
    __obj.asInstanceOf[HttpMultipartContent]
  }
  @scala.inline
  implicit class HttpMultipartContentOps[Self <: HttpMultipartContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: IHttpContent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
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
    def withFirst(value: () => IIterator[IHttpContent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(js.Any.fromFunction0(value))
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

