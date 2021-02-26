package typingsSlinky.winrtUwp.Windows.Devices.AllJoyn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains status information that indicates why a Producer app was stopped. */
@js.native
trait AllJoynProducerStoppedEventArgs extends StObject {
  
  /** Returns an AllJoyn status code that indicates why the Producer was stopped. Common values are defined by AllJoynStatus . */
  var status: Double = js.native
}
object AllJoynProducerStoppedEventArgs {
  
  @scala.inline
  def apply(status: Double): AllJoynProducerStoppedEventArgs = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynProducerStoppedEventArgs]
  }
  
  @scala.inline
  implicit class AllJoynProducerStoppedEventArgsMutableBuilder[Self <: AllJoynProducerStoppedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
