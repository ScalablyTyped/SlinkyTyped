package typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation

import typingsSlinky.winrtUwp.Windows.UI.ViewManagement.ActivationViewSwitcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides event information when an app is launched. */
@js.native
trait LaunchActivatedEventArgs extends js.Object {
  /** Gets the arguments that are passed to the app during its launch activation. */
  var arguments: String = js.native
  /** Gets the identifier for the currently shown app view. */
  var currentlyShownApplicationViewId: Double = js.native
  /** Gets the reason that this app is being activated. */
  var kind: ActivationKind = js.native
  /** Indicates whether the app was pre-launched. */
  var prelaunchActivated: Boolean = js.native
  /** Gets the execution state of the app before this activation. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  /** Gets the ID of the tile that was invoked to launch the app. */
  var tileId: String = js.native
  /** Gets the view switcher object that allows you to set the view for the application. */
  var viewSwitcher: ActivationViewSwitcher = js.native
}

object LaunchActivatedEventArgs {
  @scala.inline
  def apply(
    arguments: String,
    currentlyShownApplicationViewId: Double,
    kind: ActivationKind,
    prelaunchActivated: Boolean,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    tileId: String,
    viewSwitcher: ActivationViewSwitcher
  ): LaunchActivatedEventArgs = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], currentlyShownApplicationViewId = currentlyShownApplicationViewId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], prelaunchActivated = prelaunchActivated.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], tileId = tileId.asInstanceOf[js.Any], viewSwitcher = viewSwitcher.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchActivatedEventArgs]
  }
  @scala.inline
  implicit class LaunchActivatedEventArgsOps[Self <: LaunchActivatedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArguments(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentlyShownApplicationViewId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentlyShownApplicationViewId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: ActivationKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrelaunchActivated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prelaunchActivated")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withTileId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewSwitcher(value: ActivationViewSwitcher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewSwitcher")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

