package typingsSlinky.winrtUwp.Windows.ApplicationModel.VoiceCommands

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The response to the question specified by the background app and shown on the Cortana confirmation screen. This screen is displayed when the background app service calls RequestConfirmationAsync . */
@js.native
trait VoiceCommandConfirmationResult extends StObject {
  
  /** Gets the response to the question specified by the background app and shown on the Cortana confirmation screen. */
  var confirmed: Boolean = js.native
}
object VoiceCommandConfirmationResult {
  
  @scala.inline
  def apply(confirmed: Boolean): VoiceCommandConfirmationResult = {
    val __obj = js.Dynamic.literal(confirmed = confirmed.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceCommandConfirmationResult]
  }
  
  @scala.inline
  implicit class VoiceCommandConfirmationResultMutableBuilder[Self <: VoiceCommandConfirmationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfirmed(value: Boolean): Self = StObject.set(x, "confirmed", value.asInstanceOf[js.Any])
  }
}
