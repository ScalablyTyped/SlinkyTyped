package typingsSlinky.winrtUwp.Windows.Storage.Streams

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a Windows Runtime input stream for an IStream base implementation. */
@js.native
trait InputStreamOverStream extends StObject {
  
  /** Closes the current stream and releases system resources. */
  def close(): Unit = js.native
  
  /**
    * Returns an asynchronous byte reader object.
    * @param buffer The buffer into which the asynchronous read operation places the bytes that are read.
    * @param count The number of bytes to read that is less than or equal to the Capacity value.
    * @param options Specifies the type of the asynchronous read operation.
    * @return The asynchronous operation.
    */
  def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
}
object InputStreamOverStream {
  
  @scala.inline
  def apply(
    close: () => Unit,
    readAsync: (IBuffer, Double, InputStreamOptions) => IPromiseWithIAsyncOperationWithProgress[IBuffer, Double]
  ): InputStreamOverStream = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), readAsync = js.Any.fromFunction3(readAsync))
    __obj.asInstanceOf[InputStreamOverStream]
  }
  
  @scala.inline
  implicit class InputStreamOverStreamMutableBuilder[Self <: InputStreamOverStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadAsync(
      value: (IBuffer, Double, InputStreamOptions) => IPromiseWithIAsyncOperationWithProgress[IBuffer, Double]
    ): Self = StObject.set(x, "readAsync", js.Any.fromFunction3(value))
  }
}
