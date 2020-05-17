package typingsSlinky.winrtUwp.Windows.UI.WebUI

import typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents arguments used when the lock screen is activated. */
@js.native
trait WebUILockScreenActivatedEventArgs extends js.Object {
  /** Gets the object that manages an app activation operation. */
  var activatedOperation: ActivatedOperation = js.native
  /** Gets the identifier for the currently shown app view. */
  var currentlyShownApplicationViewId: Double = js.native
  /** Gets information about the app activation operation. */
  var info: js.Any = js.native
  /** Gets and activation kind for the app activation operation. */
  var kind: ActivationKind = js.native
  /** Gets the previous execution state. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
}

object WebUILockScreenActivatedEventArgs {
  @scala.inline
  def apply(
    activatedOperation: ActivatedOperation,
    currentlyShownApplicationViewId: Double,
    info: js.Any,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): WebUILockScreenActivatedEventArgs = {
    val __obj = js.Dynamic.literal(activatedOperation = activatedOperation.asInstanceOf[js.Any], currentlyShownApplicationViewId = currentlyShownApplicationViewId.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUILockScreenActivatedEventArgs]
  }
  @scala.inline
  implicit class WebUILockScreenActivatedEventArgsOps[Self <: WebUILockScreenActivatedEventArgs] (val x: Self) extends AnyVal {
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
    def withCurrentlyShownApplicationViewId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentlyShownApplicationViewId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
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

