package typingsSlinky.winrtUwp.global.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the card type of the recently swiped card. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderCardTypes")
@js.native
abstract class MagneticStripeReaderCardTypes ()
  extends typingsSlinky.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderCardTypes
/* static members */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderCardTypes")
@js.native
object MagneticStripeReaderCardTypes extends js.Object {
  
  /** Indicates the American Association of Motor Vehicle Administrators (AAMVA) card type. */
  var aamva: Double = js.native
  
  /** Indicates a bank card type. */
  var bank: Double = js.native
  
  /** Indicates vendor-specific card type. */
  var extendedBase: Double = js.native
  
  /** Indicates an unknown card type. */
  var unknown: Double = js.native
}
