package typingsSlinky.winrt.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPrintTaskCompletedEventArgs extends StObject {
  
  var completion: PrintTaskCompletion = js.native
}
object IPrintTaskCompletedEventArgs {
  
  @scala.inline
  def apply(completion: PrintTaskCompletion): IPrintTaskCompletedEventArgs = {
    val __obj = js.Dynamic.literal(completion = completion.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrintTaskCompletedEventArgs]
  }
  
  @scala.inline
  implicit class IPrintTaskCompletedEventArgsMutableBuilder[Self <: IPrintTaskCompletedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletion(value: PrintTaskCompletion): Self = StObject.set(x, "completion", value.asInstanceOf[js.Any])
  }
}
