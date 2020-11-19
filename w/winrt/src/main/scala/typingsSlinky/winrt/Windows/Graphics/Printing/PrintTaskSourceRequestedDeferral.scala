package typingsSlinky.winrt.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrintTaskSourceRequestedDeferral extends IPrintTaskSourceRequestedDeferral
object PrintTaskSourceRequestedDeferral {
  
  @scala.inline
  def apply(complete: () => Unit): PrintTaskSourceRequestedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[PrintTaskSourceRequestedDeferral]
  }
}
