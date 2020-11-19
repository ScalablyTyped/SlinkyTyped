package typingsSlinky.winrtUwp.global.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a method for displaying a UI, by which the UI contains options for the capture of photos, audio recordings and videos. */
@JSGlobal("Windows.Media.Capture.CameraOptionsUI")
@js.native
abstract class CameraOptionsUI ()
  extends typingsSlinky.winrtUwp.Windows.Media.Capture.CameraOptionsUI
/* static members */
@JSGlobal("Windows.Media.Capture.CameraOptionsUI")
@js.native
object CameraOptionsUI extends js.Object {
  
  /**
    * Displays a UI that contains options for the capture of photos, audio recordings and videos.
    * @param mediaCapture The MediaCapture object that provides methods for the capture of photos, audio recordings and videos.
    */
  def show(mediaCapture: typingsSlinky.winrtUwp.Windows.Media.Capture.MediaCapture): Unit = js.native
}
