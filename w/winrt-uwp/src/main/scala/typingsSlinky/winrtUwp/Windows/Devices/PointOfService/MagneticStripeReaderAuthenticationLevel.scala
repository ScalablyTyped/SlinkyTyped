package typingsSlinky.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MagneticStripeReaderAuthenticationLevel extends StObject
/** Defines the constants that indicates the level of support for magnetic stripe reader authentication protocol: NotSupported, Optional, or Required. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderAuthenticationLevel")
@js.native
object MagneticStripeReaderAuthenticationLevel extends StObject {
  
  /** Does not support authentication. */
  @js.native
  sealed trait notSupported extends MagneticStripeReaderAuthenticationLevel
  
  /** Supports authentication, but does not require it. */
  @js.native
  sealed trait optional extends MagneticStripeReaderAuthenticationLevel
  
  /** Requires authentication. */
  @js.native
  sealed trait required extends MagneticStripeReaderAuthenticationLevel
}
