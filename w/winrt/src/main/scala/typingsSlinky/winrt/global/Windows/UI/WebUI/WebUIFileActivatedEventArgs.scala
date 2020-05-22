package typingsSlinky.winrt.global.Windows.UI.WebUI

import typingsSlinky.winrt.Windows.ApplicationModel.Activation.ActivationKind
import typingsSlinky.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typingsSlinky.winrt.Windows.ApplicationModel.Activation.SplashScreen
import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Storage.IStorageItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.WebUI.WebUIFileActivatedEventArgs")
@js.native
class WebUIFileActivatedEventArgs ()
  extends typingsSlinky.winrt.Windows.UI.WebUI.WebUIFileActivatedEventArgs {
  /* CompleteClass */
  override var activatedOperation: typingsSlinky.winrt.Windows.UI.WebUI.ActivatedOperation = js.native
  /* CompleteClass */
  override var files: IVectorView[IStorageItem] = js.native
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
  /* CompleteClass */
  override var verb: String = js.native
}

