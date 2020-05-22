package typingsSlinky.winrtUwp.global.Windows.Web.Http

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterable
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
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
@JSGlobal("Windows.Web.Http.HttpFormUrlEncodedContent")
@js.native
class HttpFormUrlEncodedContent protected ()
  extends typingsSlinky.winrtUwp.Windows.Web.Http.HttpFormUrlEncodedContent {
  /**
    * Initializes a new instance of the HttpFormUrlEncodedContent class with the specified content.
    * @param content The content used to initialize the HttpFormUrlEncodedContent .
    */
  def this(content: IIterable[IKeyValuePair[_, _]]) = this()
  /** Get a collection of content headers set on the HttpFormUrlEncodedContent . */
  /* CompleteClass */
  override var headers: HttpContentHeaderCollection = js.native
  /**
    * Serialize the HttpFormUrlEncodedContent into memory as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  /* CompleteClass */
  override def bufferAllAsync(): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
  /** Closes the HttpFormUrlEncodedContent instance and releases allocated resources. */
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Serialize the HttpFormUrlEncodedContent to a buffer as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  /* CompleteClass */
  override def readAsBufferAsync(): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
  /**
    * Serialize the HttpFormUrlEncodedContent and return an input stream that represents the content as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  /* CompleteClass */
  override def readAsInputStreamAsync(): IPromiseWithIAsyncOperationWithProgress[IInputStream, Double] = js.native
  /**
    * Serialize the HttpFormUrlEncodedContent to a String as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  /* CompleteClass */
  override def readAsStringAsync(): IPromiseWithIAsyncOperationWithProgress[String, Double] = js.native
  /**
    * Computes the HttpFormUrlEncodedContent length in bytes.
    */
  /* CompleteClass */
  override def tryComputeLength(): Length = js.native
  /**
    * Write the HttpFormUrlEncodedContent to an output stream as an asynchronous operation.
    * @param outputStream The output stream to write to.
    * @return The object that represents the asynchronous operation.
    */
  /* CompleteClass */
  override def writeToStreamAsync(outputStream: IOutputStream): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
}

