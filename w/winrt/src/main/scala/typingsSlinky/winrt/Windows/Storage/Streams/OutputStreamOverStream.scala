package typingsSlinky.winrt.Windows.Storage.Streams

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperationWithProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputStreamOverStream extends IOutputStream {
  
  def dispose(): Unit = js.native
}
object OutputStreamOverStream {
  
  @scala.inline
  def apply(
    close: () => Unit,
    dispose: () => Unit,
    flushAsync: () => IAsyncOperation[Boolean],
    writeAsync: IBuffer => IAsyncOperationWithProgress[Double, Double]
  ): OutputStreamOverStream = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), dispose = js.Any.fromFunction0(dispose), flushAsync = js.Any.fromFunction0(flushAsync), writeAsync = js.Any.fromFunction1(writeAsync))
    __obj.asInstanceOf[OutputStreamOverStream]
  }
  
  @scala.inline
  implicit class OutputStreamOverStreamMutableBuilder[Self <: OutputStreamOverStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
  }
}
