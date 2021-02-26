package typingsSlinky.winrtUwp.Windows.UI.WebUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages delayed navigation for an app. */
@js.native
trait WebUINavigatedDeferral extends StObject {
  
  /** Notifies the system that the app has set up its state and UI and is ready to be displayed after a top level navigation. */
  def complete(): Unit = js.native
}
object WebUINavigatedDeferral {
  
  @scala.inline
  def apply(complete: () => Unit): WebUINavigatedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[WebUINavigatedDeferral]
  }
  
  @scala.inline
  implicit class WebUINavigatedDeferralMutableBuilder[Self <: WebUINavigatedDeferral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
