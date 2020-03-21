package typingsSlinky.winrtUwp.Windows.Web.Http

import typingsSlinky.winrtUwp.AnonLength
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IInputStream
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IOutputStream
import typingsSlinky.winrtUwp.Windows.Web.Http.Headers.HttpContentHeaderCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides HTTP content that uses a stream. */
@JSGlobal("Windows.Web.Http.HttpStreamContent")
@js.native
class HttpStreamContent protected () extends js.Object {
  /**
    * Initializes a new instance of the HttpStreamContent class with the specified content.
    * @param content The content used to initialize the HttpStreamContent .
    */
  def this(content: IInputStream) = this()
  /** Get a collection of content headers set on the HttpStreamContent . */
  var headers: HttpContentHeaderCollection = js.native
  /**
    * Serialize the HttpStreamContent into memory as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  def bufferAllAsync(): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
  /** Closes the HttpStreamContent instance and releases allocated resources. */
  def close(): Unit = js.native
  /**
    * Serialize the HttpStreamContent to a buffer as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsBufferAsync(): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
  /**
    * Serialize the HttpStreamContent and return an input stream that represents the content as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsInputStreamAsync(): IPromiseWithIAsyncOperationWithProgress[IInputStream, Double] = js.native
  /**
    * Serialize the HttpStreamContent to a String as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsStringAsync(): IPromiseWithIAsyncOperationWithProgress[String, Double] = js.native
  /**
    * Determines whether the HttpStreamContent has a valid length in bytes.
    */
  def tryComputeLength(): AnonLength = js.native
  /**
    * Write the HttpStreamContent to an output stream as an asynchronous operation.
    * @param outputStream The output stream to write to.
    * @return The object that represents the asynchronous operation.
    */
  def writeToStreamAsync(outputStream: IOutputStream): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
}

