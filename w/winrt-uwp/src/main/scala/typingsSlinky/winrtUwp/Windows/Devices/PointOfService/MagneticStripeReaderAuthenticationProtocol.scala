package typingsSlinky.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MagneticStripeReaderAuthenticationProtocol extends js.Object
/** Defines the constants that indicates the authentication protocol supported by the device. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderAuthenticationProtocol")
@js.native
object MagneticStripeReaderAuthenticationProtocol extends js.Object {
  
  /** The device supports challenge response protocol. */
  @js.native
  sealed trait challengeResponse extends MagneticStripeReaderAuthenticationProtocol
  
  /** The device does not support device authentication. */
  @js.native
  sealed trait none extends MagneticStripeReaderAuthenticationProtocol
}
