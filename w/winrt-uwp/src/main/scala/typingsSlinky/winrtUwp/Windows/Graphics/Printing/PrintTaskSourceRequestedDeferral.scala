package typingsSlinky.winrtUwp.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used to defer the request for a print task source. */
@js.native
trait PrintTaskSourceRequestedDeferral extends StObject {
  
  /** Indicates when the deferral for a print task source request is over. */
  def complete(): Unit = js.native
}
object PrintTaskSourceRequestedDeferral {
  
  @scala.inline
  def apply(complete: () => Unit): PrintTaskSourceRequestedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[PrintTaskSourceRequestedDeferral]
  }
  
  @scala.inline
  implicit class PrintTaskSourceRequestedDeferralMutableBuilder[Self <: PrintTaskSourceRequestedDeferral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
