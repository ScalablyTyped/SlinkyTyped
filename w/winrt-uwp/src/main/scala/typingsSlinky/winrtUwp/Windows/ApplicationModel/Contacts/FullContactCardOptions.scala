package typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts

import typingsSlinky.winrtUwp.Windows.UI.ViewManagement.ViewSizePreference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the options for displaying the full contact card. */
@js.native
trait FullContactCardOptions extends StObject {
  
  /** Gets or sets a value that describes the desired view size for the full contact card. */
  var desiredRemainingView: ViewSizePreference = js.native
}
object FullContactCardOptions {
  
  @scala.inline
  def apply(desiredRemainingView: ViewSizePreference): FullContactCardOptions = {
    val __obj = js.Dynamic.literal(desiredRemainingView = desiredRemainingView.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullContactCardOptions]
  }
  
  @scala.inline
  implicit class FullContactCardOptionsMutableBuilder[Self <: FullContactCardOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesiredRemainingView(value: ViewSizePreference): Self = StObject.set(x, "desiredRemainingView", value.asInstanceOf[js.Any])
  }
}
