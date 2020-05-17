package typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation

import typingsSlinky.winrtUwp.Windows.Devices.Printers.Extensions.PrintTaskConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information in response to the event that is raised when print task settings are activated. */
@js.native
trait PrintTaskSettingsActivatedEventArgs extends js.Object {
  /** Gets the configuration information for the print task. */
  var configuration: PrintTaskConfiguration = js.native
  /** Gets the activation type for the print task settings. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before the settings were activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
}

object PrintTaskSettingsActivatedEventArgs {
  @scala.inline
  def apply(
    configuration: PrintTaskConfiguration,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): PrintTaskSettingsActivatedEventArgs = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintTaskSettingsActivatedEventArgs]
  }
  @scala.inline
  implicit class PrintTaskSettingsActivatedEventArgsOps[Self <: PrintTaskSettingsActivatedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfiguration(value: PrintTaskConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(value.asInstanceOf[js.Any])
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

