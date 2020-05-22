package typingsSlinky.winrtUwp.global.Windows.Storage.Streams

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a Windows Runtime input stream for an IStream base implementation. */
@JSGlobal("Windows.Storage.Streams.InputStreamOverStream")
@js.native
abstract class InputStreamOverStream ()
  extends typingsSlinky.winrtUwp.Windows.Storage.Streams.InputStreamOverStream {
  /** Closes the current stream and releases system resources. */
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Returns an asynchronous byte reader object.
    * @param buffer The buffer into which the asynchronous read operation places the bytes that are read.
    * @param count The number of bytes to read that is less than or equal to the Capacity value.
    * @param options Specifies the type of the asynchronous read operation.
    * @return The asynchronous operation.
    */
  /* CompleteClass */
  override def readAsync(
    buffer: IBuffer,
    count: Double,
    options: typingsSlinky.winrtUwp.Windows.Storage.Streams.InputStreamOptions
  ): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
}

