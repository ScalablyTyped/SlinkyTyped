package typingsSlinky.winrtUwp.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the ShuffleEnabledChangeRequested event. */
@js.native
trait ShuffleEnabledChangeRequestedEventArgs extends StObject {
  
  /** Gets a value indicating whether the request is to enable or disable shuffle. */
  var requestedShuffleEnabled: Boolean = js.native
}
object ShuffleEnabledChangeRequestedEventArgs {
  
  @scala.inline
  def apply(requestedShuffleEnabled: Boolean): ShuffleEnabledChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(requestedShuffleEnabled = requestedShuffleEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShuffleEnabledChangeRequestedEventArgs]
  }
  
  @scala.inline
  implicit class ShuffleEnabledChangeRequestedEventArgsMutableBuilder[Self <: ShuffleEnabledChangeRequestedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestedShuffleEnabled(value: Boolean): Self = StObject.set(x, "requestedShuffleEnabled", value.asInstanceOf[js.Any])
  }
}
