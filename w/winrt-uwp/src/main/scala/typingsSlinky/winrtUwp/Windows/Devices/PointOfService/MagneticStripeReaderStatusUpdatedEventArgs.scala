package typingsSlinky.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about an operation status change. */
@js.native
trait MagneticStripeReaderStatusUpdatedEventArgs extends StObject {
  
  /** Gets the vendor specific error code. */
  var extendedStatus: Double = js.native
  
  /** Gets the status change information. */
  var status: MagneticStripeReaderStatus = js.native
}
object MagneticStripeReaderStatusUpdatedEventArgs {
  
  @scala.inline
  def apply(extendedStatus: Double, status: MagneticStripeReaderStatus): MagneticStripeReaderStatusUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(extendedStatus = extendedStatus.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MagneticStripeReaderStatusUpdatedEventArgs]
  }
  
  @scala.inline
  implicit class MagneticStripeReaderStatusUpdatedEventArgsMutableBuilder[Self <: MagneticStripeReaderStatusUpdatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtendedStatus(value: Double): Self = StObject.set(x, "extendedStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: MagneticStripeReaderStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
