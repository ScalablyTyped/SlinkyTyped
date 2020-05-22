package typingsSlinky.winrt.global.Windows.UI.WebUI

import typingsSlinky.winrt.Windows.ApplicationModel.Activation.ActivationKind
import typingsSlinky.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typingsSlinky.winrt.Windows.ApplicationModel.Activation.SplashScreen
import typingsSlinky.winrt.Windows.Storage.Pickers.Provider.FileSavePickerUI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.WebUI.WebUIFileSavePickerActivatedEventArgs")
@js.native
class WebUIFileSavePickerActivatedEventArgs ()
  extends typingsSlinky.winrt.Windows.UI.WebUI.WebUIFileSavePickerActivatedEventArgs {
  /* CompleteClass */
  override var activatedOperation: typingsSlinky.winrt.Windows.UI.WebUI.ActivatedOperation = js.native
  /* CompleteClass */
  override var fileSavePickerUI: FileSavePickerUI = js.native
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
}

