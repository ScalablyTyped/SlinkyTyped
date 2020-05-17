package typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.ValueSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an event that occurs when the app is activated because a user tapped on the body of a toast notification or performed an action inside a toast notification. */
@js.native
trait ToastNotificationActivatedEventArgs extends js.Object {
  /** Gets the arguments that the app can retrieve after it is activated through an interactive toast notification. */
  var argument: String = js.native
  /** Gets the reason for the activation of the app for this event. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before the app was activated because a user tapped on the body of a toast notification or performed an action inside a toast notification. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  /** Gets a set of values that you can use to obtain the user input from an interactive toast notification. */
  var userInput: ValueSet = js.native
}

object ToastNotificationActivatedEventArgs {
  @scala.inline
  def apply(
    argument: String,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    userInput: ValueSet
  ): ToastNotificationActivatedEventArgs = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], userInput = userInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastNotificationActivatedEventArgs]
  }
  @scala.inline
  implicit class ToastNotificationActivatedEventArgsOps[Self <: ToastNotificationActivatedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgument(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argument")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withUserInput(value: ValueSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userInput")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

