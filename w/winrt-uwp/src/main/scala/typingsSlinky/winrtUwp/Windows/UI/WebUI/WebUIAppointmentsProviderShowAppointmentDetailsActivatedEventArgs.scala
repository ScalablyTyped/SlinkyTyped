package typingsSlinky.winrtUwp.Windows.UI.WebUI

import typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated to show the details of an appointment. */
@js.native
trait WebUIAppointmentsProviderShowAppointmentDetailsActivatedEventArgs extends js.Object {
  /** Gets the app activation operation. */
  var activatedOperation: ActivatedOperation = js.native
  /** Gets the start date of the appointment instance for which the app should display details. */
  var instanceStartDate: js.Date = js.native
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the local identifier of the appointment for which the app should display details. */
  var localId: String = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the roaming identifier of the appointment for which the app should display details. */
  var roamingId: String = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  /** Gets the action to be performed by the appointments provider. */
  var verb: String = js.native
}

object WebUIAppointmentsProviderShowAppointmentDetailsActivatedEventArgs {
  @scala.inline
  def apply(
    activatedOperation: ActivatedOperation,
    instanceStartDate: js.Date,
    kind: ActivationKind,
    localId: String,
    previousExecutionState: ApplicationExecutionState,
    roamingId: String,
    splashScreen: SplashScreen,
    verb: String
  ): WebUIAppointmentsProviderShowAppointmentDetailsActivatedEventArgs = {
    val __obj = js.Dynamic.literal(activatedOperation = activatedOperation.asInstanceOf[js.Any], instanceStartDate = instanceStartDate.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], localId = localId.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], roamingId = roamingId.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], verb = verb.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUIAppointmentsProviderShowAppointmentDetailsActivatedEventArgs]
  }
  @scala.inline
  implicit class WebUIAppointmentsProviderShowAppointmentDetailsActivatedEventArgsOps[Self <: WebUIAppointmentsProviderShowAppointmentDetailsActivatedEventArgs] (val x: Self) extends AnyVal {
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
    def withInstanceStartDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceStartDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: ActivationKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousExecutionState(value: ApplicationExecutionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousExecutionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoamingId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roamingId")(value.asInstanceOf[js.Any])
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

