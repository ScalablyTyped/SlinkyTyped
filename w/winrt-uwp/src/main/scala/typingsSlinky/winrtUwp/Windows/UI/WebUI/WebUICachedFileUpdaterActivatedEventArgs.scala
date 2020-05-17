package typingsSlinky.winrtUwp.Windows.UI.WebUI

import typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typingsSlinky.winrtUwp.Windows.Storage.Provider.CachedFileUpdaterUI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the activated event that fires when the user saves or opens a file that needs updates from the app. */
@js.native
trait WebUICachedFileUpdaterActivatedEventArgs extends js.Object {
  /** Gets the app activated operation. */
  var activatedOperation: ActivatedOperation = js.native
  /** Gets the letterbox UI of the file picker that is displayed when a file needs updates from the app. */
  var cachedFileUpdaterUI: CachedFileUpdaterUI = js.native
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
}

object WebUICachedFileUpdaterActivatedEventArgs {
  @scala.inline
  def apply(
    activatedOperation: ActivatedOperation,
    cachedFileUpdaterUI: CachedFileUpdaterUI,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): WebUICachedFileUpdaterActivatedEventArgs = {
    val __obj = js.Dynamic.literal(activatedOperation = activatedOperation.asInstanceOf[js.Any], cachedFileUpdaterUI = cachedFileUpdaterUI.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUICachedFileUpdaterActivatedEventArgs]
  }
  @scala.inline
  implicit class WebUICachedFileUpdaterActivatedEventArgsOps[Self <: WebUICachedFileUpdaterActivatedEventArgs] (val x: Self) extends AnyVal {
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
    def withCachedFileUpdaterUI(value: CachedFileUpdaterUI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachedFileUpdaterUI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: ActivationKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
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

