package typingsSlinky.winrt.Windows.Storage.Streams

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsSlinky.winrt.Windows.Foundation.IClosable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOutputStream extends IClosable {
  
  def flushAsync(): IAsyncOperation[Boolean] = js.native
  
  def writeAsync(buffer: IBuffer): IAsyncOperationWithProgress[Double, Double] = js.native
}
object IOutputStream {
  
  @scala.inline
  def apply(
    close: () => Unit,
    flushAsync: () => IAsyncOperation[Boolean],
    writeAsync: IBuffer => IAsyncOperationWithProgress[Double, Double]
  ): IOutputStream = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), flushAsync = js.Any.fromFunction0(flushAsync), writeAsync = js.Any.fromFunction1(writeAsync))
    __obj.asInstanceOf[IOutputStream]
  }
  
  @scala.inline
  implicit class IOutputStreamMutableBuilder[Self <: IOutputStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlushAsync(value: () => IAsyncOperation[Boolean]): Self = StObject.set(x, "flushAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWriteAsync(value: IBuffer => IAsyncOperationWithProgress[Double, Double]): Self = StObject.set(x, "writeAsync", js.Any.fromFunction1(value))
  }
}
