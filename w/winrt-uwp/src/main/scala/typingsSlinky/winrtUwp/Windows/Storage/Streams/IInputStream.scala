package typingsSlinky.winrtUwp.Windows.Storage.Streams

import typingsSlinky.winrtUwp.Windows.Foundation.IClosable
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a sequential stream of bytes to be read. */
@js.native
trait IInputStream extends IClosable {
  
  /**
    * Reads data from the stream asynchronously.
    * @param buffer A buffer that may be used to return the bytes that are read. The return value contains the buffer that holds the results.
    * @param count The number of bytes to read that is less than or equal to the Capacity value.
    * @param options Specifies the type of the asynchronous read operation.
    * @return The asynchronous operation.
    */
  def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
}
object IInputStream {
  
  @scala.inline
  def apply(
    close: () => Unit,
    readAsync: (IBuffer, Double, InputStreamOptions) => IPromiseWithIAsyncOperationWithProgress[IBuffer, Double]
  ): IInputStream = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), readAsync = js.Any.fromFunction3(readAsync))
    __obj.asInstanceOf[IInputStream]
  }
  
  @scala.inline
  implicit class IInputStreamMutableBuilder[Self <: IInputStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadAsync(
      value: (IBuffer, Double, InputStreamOptions) => IPromiseWithIAsyncOperationWithProgress[IBuffer, Double]
    ): Self = StObject.set(x, "readAsync", js.Any.fromFunction3(value))
  }
}
