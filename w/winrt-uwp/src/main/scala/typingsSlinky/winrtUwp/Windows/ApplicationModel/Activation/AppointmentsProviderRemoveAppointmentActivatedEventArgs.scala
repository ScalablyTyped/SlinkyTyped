package typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation

import typingsSlinky.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentsProvider.RemoveAppointmentOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated to remove an appointment from the user’s calendar. */
@js.native
trait AppointmentsProviderRemoveAppointmentActivatedEventArgs extends js.Object {
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the appointment that is provided to the app when the user tries to remove it. */
  var removeAppointmentOperation: RemoveAppointmentOperation = js.native
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  /** Gets the action to be performed by the appointments provider. */
  var verb: String = js.native
}

object AppointmentsProviderRemoveAppointmentActivatedEventArgs {
  @scala.inline
  def apply(
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    removeAppointmentOperation: RemoveAppointmentOperation,
    splashScreen: SplashScreen,
    verb: String
  ): AppointmentsProviderRemoveAppointmentActivatedEventArgs = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], removeAppointmentOperation = removeAppointmentOperation.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], verb = verb.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentsProviderRemoveAppointmentActivatedEventArgs]
  }
  @scala.inline
  implicit class AppointmentsProviderRemoveAppointmentActivatedEventArgsOps[Self <: AppointmentsProviderRemoveAppointmentActivatedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withRemoveAppointmentOperation(value: RemoveAppointmentOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAppointmentOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplashScreen(value: SplashScreen): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splashScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verb")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

