package typingsSlinky.winrt.Windows.ApplicationModel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISuspendingOperation extends StObject {
  
  var deadline: js.Date = js.native
  
  def getDeferral(): SuspendingDeferral = js.native
}
object ISuspendingOperation {
  
  @scala.inline
  def apply(deadline: js.Date, getDeferral: () => SuspendingDeferral): ISuspendingOperation = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[ISuspendingOperation]
  }
  
  @scala.inline
  implicit class ISuspendingOperationMutableBuilder[Self <: ISuspendingOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeadline(value: js.Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDeferral(value: () => SuspendingDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
  }
}
