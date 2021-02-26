package typingsSlinky.winrt.Windows.Storage.Streams

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInputStreamReference extends StObject {
  
  def openSequentialReadAsync(): IAsyncOperation[IInputStream] = js.native
}
object IInputStreamReference {
  
  @scala.inline
  def apply(openSequentialReadAsync: () => IAsyncOperation[IInputStream]): IInputStreamReference = {
    val __obj = js.Dynamic.literal(openSequentialReadAsync = js.Any.fromFunction0(openSequentialReadAsync))
    __obj.asInstanceOf[IInputStreamReference]
  }
  
  @scala.inline
  implicit class IInputStreamReferenceMutableBuilder[Self <: IInputStreamReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpenSequentialReadAsync(value: () => IAsyncOperation[IInputStream]): Self = StObject.set(x, "openSequentialReadAsync", js.Any.fromFunction0(value))
  }
}
