package typingsSlinky.winrt.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CameraCaptureUIMode extends js.Object
@JSGlobal("Windows.Media.Capture.CameraCaptureUIMode")
@js.native
object CameraCaptureUIMode extends js.Object {
  
  @js.native
  sealed trait photo extends CameraCaptureUIMode
  
  @js.native
  sealed trait photoOrVideo extends CameraCaptureUIMode
  
  @js.native
  sealed trait video extends CameraCaptureUIMode
}
