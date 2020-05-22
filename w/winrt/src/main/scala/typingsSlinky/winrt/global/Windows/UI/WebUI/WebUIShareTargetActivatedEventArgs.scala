package typingsSlinky.winrt.global.Windows.UI.WebUI

import typingsSlinky.winrt.Windows.ApplicationModel.Activation.ActivationKind
import typingsSlinky.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typingsSlinky.winrt.Windows.ApplicationModel.Activation.SplashScreen
import typingsSlinky.winrt.Windows.ApplicationModel.DataTransfer.ShareTarget.ShareOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.WebUI.WebUIShareTargetActivatedEventArgs")
@js.native
class WebUIShareTargetActivatedEventArgs ()
  extends typingsSlinky.winrt.Windows.UI.WebUI.WebUIShareTargetActivatedEventArgs {
  /* CompleteClass */
  override var activatedOperation: typingsSlinky.winrt.Windows.UI.WebUI.ActivatedOperation = js.native
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /* CompleteClass */
  override var shareOperation: ShareOperation = js.native
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
}

