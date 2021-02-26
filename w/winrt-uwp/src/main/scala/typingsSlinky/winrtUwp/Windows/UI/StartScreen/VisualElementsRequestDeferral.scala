package typingsSlinky.winrtUwp.Windows.UI.StartScreen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A deferral object used during the creation of the Pin to Start flyout. By using this object, the app can delay the display of the flyout while it gathers the information and assets that will be shown in that flyout. */
@js.native
trait VisualElementsRequestDeferral extends StObject {
  
  /** Tells Windows that the app is ready to display the Pin to Start flyout. The app calls this method when it has finished setting the properties that specify what to show in that flyout. */
  def complete(): Unit = js.native
}
object VisualElementsRequestDeferral {
  
  @scala.inline
  def apply(complete: () => Unit): VisualElementsRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[VisualElementsRequestDeferral]
  }
  
  @scala.inline
  implicit class VisualElementsRequestDeferralMutableBuilder[Self <: VisualElementsRequestDeferral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
