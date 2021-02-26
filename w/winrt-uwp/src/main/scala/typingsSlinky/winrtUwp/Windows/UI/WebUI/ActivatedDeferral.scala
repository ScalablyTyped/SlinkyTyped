package typingsSlinky.winrtUwp.Windows.UI.WebUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages delayed activation for an app. */
@js.native
trait ActivatedDeferral extends StObject {
  
  /** Notifies the system that the app has set up its state and initial UI and is ready to be displayed. */
  def complete(): Unit = js.native
}
object ActivatedDeferral {
  
  @scala.inline
  def apply(complete: () => Unit): ActivatedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[ActivatedDeferral]
  }
  
  @scala.inline
  implicit class ActivatedDeferralMutableBuilder[Self <: ActivatedDeferral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
