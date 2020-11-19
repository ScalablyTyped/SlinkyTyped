package typingsSlinky.winrtUwp.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaCaptureThermalStatus extends js.Object
/** Specifies the thermal status of a media capture device. */
@JSGlobal("Windows.Media.Capture.MediaCaptureThermalStatus")
@js.native
object MediaCaptureThermalStatus extends js.Object {
  
  /** The thermal state is normal. */
  @js.native
  sealed trait normal extends MediaCaptureThermalStatus
  
  /** The capture device is overheated. You should stop the current capture session and save any captured media. */
  @js.native
  sealed trait overheated extends MediaCaptureThermalStatus
}
