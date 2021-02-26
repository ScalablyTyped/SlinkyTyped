package typingsSlinky.winrt.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrintTaskSourceRequestedArgs extends IPrintTaskSourceRequestedArgs
object PrintTaskSourceRequestedArgs {
  
  @scala.inline
  def apply(
    deadline: js.Date,
    getDeferral: () => PrintTaskSourceRequestedDeferral,
    setSource: IPrintDocumentSource => Unit
  ): PrintTaskSourceRequestedArgs = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), setSource = js.Any.fromFunction1(setSource))
    __obj.asInstanceOf[PrintTaskSourceRequestedArgs]
  }
}
