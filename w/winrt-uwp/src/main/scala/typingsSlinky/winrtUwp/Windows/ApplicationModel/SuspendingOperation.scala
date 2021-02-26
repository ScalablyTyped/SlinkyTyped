package typingsSlinky.winrtUwp.Windows.ApplicationModel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides info about an app suspending operation. */
@js.native
trait SuspendingOperation extends StObject {
  
  /** Gets the time remaining before a delayed app suspending operation continues. */
  var deadline: js.Date = js.native
  
  /**
    * Requests that the app suspending operation be delayed.
    * @return The suspension deferral.
    */
  def getDeferral(): SuspendingDeferral = js.native
}
object SuspendingOperation {
  
  @scala.inline
  def apply(deadline: js.Date, getDeferral: () => SuspendingDeferral): SuspendingOperation = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[SuspendingOperation]
  }
  
  @scala.inline
  implicit class SuspendingOperationMutableBuilder[Self <: SuspendingOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeadline(value: js.Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDeferral(value: () => SuspendingDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
  }
}
