package typingsSlinky.winrtUwp.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information for the RedialRequested event. */
@js.native
trait RedialRequestedEventArgs extends StObject {
  
  /** Indicates that the RedialRequested event has been handled. */
  def handled(): Unit = js.native
}
object RedialRequestedEventArgs {
  
  @scala.inline
  def apply(handled: () => Unit): RedialRequestedEventArgs = {
    val __obj = js.Dynamic.literal(handled = js.Any.fromFunction0(handled))
    __obj.asInstanceOf[RedialRequestedEventArgs]
  }
  
  @scala.inline
  implicit class RedialRequestedEventArgsMutableBuilder[Self <: RedialRequestedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandled(value: () => Unit): Self = StObject.set(x, "handled", js.Any.fromFunction0(value))
  }
}
