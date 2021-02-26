package typingsSlinky.winrtUwp.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Reports the completion of the print task. */
@js.native
trait PrintTaskCompletedEventArgs extends StObject {
  
  /** Gets the completion status of the print task. */
  var completion: PrintTaskCompletion = js.native
}
object PrintTaskCompletedEventArgs {
  
  @scala.inline
  def apply(completion: PrintTaskCompletion): PrintTaskCompletedEventArgs = {
    val __obj = js.Dynamic.literal(completion = completion.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintTaskCompletedEventArgs]
  }
  
  @scala.inline
  implicit class PrintTaskCompletedEventArgsMutableBuilder[Self <: PrintTaskCompletedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletion(value: PrintTaskCompletion): Self = StObject.set(x, "completion", value.asInstanceOf[js.Any])
  }
}
