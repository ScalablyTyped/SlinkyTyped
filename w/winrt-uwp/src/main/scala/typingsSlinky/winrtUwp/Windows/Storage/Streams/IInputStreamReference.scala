package typingsSlinky.winrtUwp.Windows.Storage.Streams

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables a Windows Runtime component to provide sequential read access to an encapsulated stream. */
@js.native
trait IInputStreamReference extends StObject {
  
  /**
    * Opens a stream for sequential read access.
    * @return The asynchronous operation.
    */
  def openSequentialReadAsync(): IPromiseWithIAsyncOperation[IInputStream] = js.native
}
object IInputStreamReference {
  
  @scala.inline
  def apply(openSequentialReadAsync: () => IPromiseWithIAsyncOperation[IInputStream]): IInputStreamReference = {
    val __obj = js.Dynamic.literal(openSequentialReadAsync = js.Any.fromFunction0(openSequentialReadAsync))
    __obj.asInstanceOf[IInputStreamReference]
  }
  
  @scala.inline
  implicit class IInputStreamReferenceMutableBuilder[Self <: IInputStreamReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpenSequentialReadAsync(value: () => IPromiseWithIAsyncOperation[IInputStream]): Self = StObject.set(x, "openSequentialReadAsync", js.Any.fromFunction0(value))
  }
}
