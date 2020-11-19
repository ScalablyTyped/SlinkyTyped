package typingsSlinky.winrtUwp.global.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to app capture settings. */
@JSGlobal("Windows.Media.Capture.AppCaptureManager")
@js.native
abstract class AppCaptureManager ()
  extends typingsSlinky.winrtUwp.Windows.Media.Capture.AppCaptureManager
/* static members */
@JSGlobal("Windows.Media.Capture.AppCaptureManager")
@js.native
object AppCaptureManager extends js.Object {
  
  /**
    * Applies app capture settings.
    * @param appCaptureSettings The settings to apply.
    */
  def applySettings(appCaptureSettings: typingsSlinky.winrtUwp.Windows.Media.Capture.AppCaptureSettings): Unit = js.native
  
  /**
    * Gets the current app capture settings.
    * @return The current app capture settings.
    */
  def getCurrentSettings(): typingsSlinky.winrtUwp.Windows.Media.Capture.AppCaptureSettings = js.native
}
