package typingsSlinky.winrtUwp.global.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents zoom settings that can be applied to the ZoomControl by calling the Configure method. */
@JSGlobal("Windows.Media.Devices.ZoomSettings")
@js.native
/** Initializes a new instance of the ZoomSettings class. */
class ZoomSettings ()
  extends typingsSlinky.winrtUwp.Windows.Media.Devices.ZoomSettings {
  /** Gets or sets a ZoomTransitionMode value indicating how the capture device should transition to the new zoom value specified with the Value property. */
  /* CompleteClass */
  override var mode: typingsSlinky.winrtUwp.Windows.Media.Devices.ZoomTransitionMode = js.native
  /** Gets or sets the zoom value to which the ZoomControl will transition. */
  /* CompleteClass */
  override var value: Double = js.native
}

