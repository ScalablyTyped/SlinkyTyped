package typingsSlinky.winrt.Windows.UI.WebUI

import typingsSlinky.winrt.Windows.ApplicationModel.Activation.ActivationKind
import typingsSlinky.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typingsSlinky.winrt.Windows.ApplicationModel.Activation.IFileSavePickerActivatedEventArgs
import typingsSlinky.winrt.Windows.ApplicationModel.Activation.SplashScreen
import typingsSlinky.winrt.Windows.Storage.Pickers.Provider.FileSavePickerUI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebUIFileSavePickerActivatedEventArgs
  extends IFileSavePickerActivatedEventArgs
     with IActivatedEventArgsDeferral
object WebUIFileSavePickerActivatedEventArgs {
  
  @scala.inline
  def apply(
    activatedOperation: ActivatedOperation,
    fileSavePickerUI: FileSavePickerUI,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): WebUIFileSavePickerActivatedEventArgs = {
    val __obj = js.Dynamic.literal(activatedOperation = activatedOperation.asInstanceOf[js.Any], fileSavePickerUI = fileSavePickerUI.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUIFileSavePickerActivatedEventArgs]
  }
}
