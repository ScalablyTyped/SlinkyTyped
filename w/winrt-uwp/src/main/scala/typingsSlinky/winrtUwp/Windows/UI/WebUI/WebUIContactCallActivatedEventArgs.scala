package typingsSlinky.winrtUwp.Windows.UI.WebUI

import typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typingsSlinky.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typingsSlinky.winrtUwp.Windows.ApplicationModel.Contacts.Contact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated to call a contact. */
@js.native
trait WebUIContactCallActivatedEventArgs extends js.Object {
  /** Gets the app activated operation. */
  var activatedOperation: ActivatedOperation = js.native
  /** Gets the contact for the call. */
  var contact: Contact = js.native
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the identifier of the service used for the call. */
  var serviceId: String = js.native
  /** Gets the user identifier of the service used for the call. */
  var serviceUserId: String = js.native
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  /** Gets the action to be performed. */
  var verb: String = js.native
}

object WebUIContactCallActivatedEventArgs {
  @scala.inline
  def apply(
    activatedOperation: ActivatedOperation,
    contact: Contact,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    serviceId: String,
    serviceUserId: String,
    splashScreen: SplashScreen,
    verb: String
  ): WebUIContactCallActivatedEventArgs = {
    val __obj = js.Dynamic.literal(activatedOperation = activatedOperation.asInstanceOf[js.Any], contact = contact.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], serviceUserId = serviceUserId.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], verb = verb.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUIContactCallActivatedEventArgs]
  }
  @scala.inline
  implicit class WebUIContactCallActivatedEventArgsOps[Self <: WebUIContactCallActivatedEventArgs] (val x: Self) extends AnyVal {
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
    def withContact(value: Contact): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact")(value.asInstanceOf[js.Any])
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
    def withServiceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceUserId")(value.asInstanceOf[js.Any])
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

