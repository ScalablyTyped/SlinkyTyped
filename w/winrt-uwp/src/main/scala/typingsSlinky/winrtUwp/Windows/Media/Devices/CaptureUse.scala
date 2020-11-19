package typingsSlinky.winrtUwp.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CaptureUse extends js.Object
/** Defines the values for the primary use of the capture device. */
@JSGlobal("Windows.Media.Devices.CaptureUse")
@js.native
object CaptureUse extends js.Object {
  
  /** The capture device does not have a primary use. */
  @js.native
  sealed trait none extends CaptureUse
  
  /** The capture device is used primarily for photos. */
  @js.native
  sealed trait photo extends CaptureUse
  
  /** The capture device is used primarily for video. */
  @js.native
  sealed trait video extends CaptureUse
}
