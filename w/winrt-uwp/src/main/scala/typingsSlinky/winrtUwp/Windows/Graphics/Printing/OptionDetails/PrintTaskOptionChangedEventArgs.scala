package typingsSlinky.winrtUwp.Windows.Graphics.Printing.OptionDetails

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Called when a print task option has changed. */
@js.native
trait PrintTaskOptionChangedEventArgs extends StObject {
  
  /** Gets the ID of the print task option that changed. */
  var optionId: js.Any = js.native
}
object PrintTaskOptionChangedEventArgs {
  
  @scala.inline
  def apply(optionId: js.Any): PrintTaskOptionChangedEventArgs = {
    val __obj = js.Dynamic.literal(optionId = optionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintTaskOptionChangedEventArgs]
  }
  
  @scala.inline
  implicit class PrintTaskOptionChangedEventArgsMutableBuilder[Self <: PrintTaskOptionChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptionId(value: js.Any): Self = StObject.set(x, "optionId", value.asInstanceOf[js.Any])
  }
}
