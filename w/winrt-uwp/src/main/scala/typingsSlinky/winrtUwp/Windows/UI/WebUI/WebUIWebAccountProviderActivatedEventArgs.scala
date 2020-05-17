package typingsSlinky.winrtUwp.Windows.UI.WebUI

import typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typingsSlinky.winrtUwp.Windows.Security.Authentication.Web.Provider.IWebAccountProviderOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the arguments involved in activated a web account provider. */
@js.native
trait WebUIWebAccountProviderActivatedEventArgs extends js.Object {
  /** Gets the activated operation. */
  var activatedOperation: ActivatedOperation = js.native
  /** Gets the kind of activation. */
  var kind: ActivationKind = js.native
  /** Gets the web account provider operation. */
  var operation: IWebAccountProviderOperation = js.native
  /** Gets the previous execution state of the app. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen. */
  var splashScreen: SplashScreen = js.native
}

object WebUIWebAccountProviderActivatedEventArgs {
  @scala.inline
  def apply(
    activatedOperation: ActivatedOperation,
    kind: ActivationKind,
    operation: IWebAccountProviderOperation,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): WebUIWebAccountProviderActivatedEventArgs = {
    val __obj = js.Dynamic.literal(activatedOperation = activatedOperation.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUIWebAccountProviderActivatedEventArgs]
  }
  @scala.inline
  implicit class WebUIWebAccountProviderActivatedEventArgsOps[Self <: WebUIWebAccountProviderActivatedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivatedOperation(value: ActivatedOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activatedOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: ActivationKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperation(value: IWebAccountProviderOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousExecutionState(value: ApplicationExecutionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousExecutionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplashScreen(value: SplashScreen): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splashScreen")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

