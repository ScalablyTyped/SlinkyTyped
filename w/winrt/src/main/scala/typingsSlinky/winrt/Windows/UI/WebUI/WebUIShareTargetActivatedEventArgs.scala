package typingsSlinky.winrt.Windows.UI.WebUI

import typingsSlinky.winrt.Windows.ApplicationModel.Activation.ActivationKind
import typingsSlinky.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typingsSlinky.winrt.Windows.ApplicationModel.Activation.IShareTargetActivatedEventArgs
import typingsSlinky.winrt.Windows.ApplicationModel.Activation.SplashScreen
import typingsSlinky.winrt.Windows.ApplicationModel.DataTransfer.ShareTarget.ShareOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebUIShareTargetActivatedEventArgs
  extends IShareTargetActivatedEventArgs
     with IActivatedEventArgsDeferral
object WebUIShareTargetActivatedEventArgs {
  
  @scala.inline
  def apply(
    activatedOperation: ActivatedOperation,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    shareOperation: ShareOperation,
    splashScreen: SplashScreen
  ): WebUIShareTargetActivatedEventArgs = {
    val __obj = js.Dynamic.literal(activatedOperation = activatedOperation.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], shareOperation = shareOperation.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUIShareTargetActivatedEventArgs]
  }
}
