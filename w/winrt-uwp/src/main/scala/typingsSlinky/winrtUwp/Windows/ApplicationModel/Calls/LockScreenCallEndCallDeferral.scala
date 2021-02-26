package typingsSlinky.winrtUwp.Windows.ApplicationModel.Calls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The LockScreenCallEndCallDeferral object signals when the app no longer needs to defer the removal of itself from the lock screen. */
@js.native
trait LockScreenCallEndCallDeferral extends StObject {
  
  /** Completes the deferral of the removal of the app from the lock screen, which causes the app to be removed from the lock screen if it hasn't already been removed by other means. */
  def complete(): Unit = js.native
}
object LockScreenCallEndCallDeferral {
  
  @scala.inline
  def apply(complete: () => Unit): LockScreenCallEndCallDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[LockScreenCallEndCallDeferral]
  }
  
  @scala.inline
  implicit class LockScreenCallEndCallDeferralMutableBuilder[Self <: LockScreenCallEndCallDeferral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
