package typingsSlinky.winrt.global.Windows.UI.WebUI

import typingsSlinky.winrt.Windows.ApplicationModel.Activation.ActivationKind
import typingsSlinky.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typingsSlinky.winrt.Windows.ApplicationModel.Activation.SplashScreen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.WebUI.WebUILaunchActivatedEventArgs")
@js.native
class WebUILaunchActivatedEventArgs ()
  extends typingsSlinky.winrt.Windows.UI.WebUI.WebUILaunchActivatedEventArgs {
  /* CompleteClass */
  override var activatedOperation: typingsSlinky.winrt.Windows.UI.WebUI.ActivatedOperation = js.native
  /* CompleteClass */
  override var arguments: String = js.native
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
  /* CompleteClass */
  override var tileId: String = js.native
}

