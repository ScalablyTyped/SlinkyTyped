package typingsSlinky.winrt.Windows.ApplicationModel.Activation

import typingsSlinky.winrt.Windows.ApplicationModel.Contacts.Provider.ContactPickerUI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContactPickerActivatedEventArgs extends IActivatedEventArgs {
  var contactPickerUI: ContactPickerUI = js.native
}

object IContactPickerActivatedEventArgs {
  @scala.inline
  def apply(
    contactPickerUI: ContactPickerUI,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): IContactPickerActivatedEventArgs = {
    val __obj = js.Dynamic.literal(contactPickerUI = contactPickerUI.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContactPickerActivatedEventArgs]
  }
  @scala.inline
  implicit class IContactPickerActivatedEventArgsOps[Self <: IContactPickerActivatedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContactPickerUI(value: ContactPickerUI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactPickerUI")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

