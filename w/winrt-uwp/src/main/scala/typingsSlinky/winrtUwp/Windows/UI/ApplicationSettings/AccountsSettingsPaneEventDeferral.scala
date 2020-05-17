package typingsSlinky.winrtUwp.Windows.UI.ApplicationSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables the app to signal when it has finished populating command collections while handling the AccountCommandsRequested event. */
@js.native
trait AccountsSettingsPaneEventDeferral extends js.Object {
  /** Signals that the app has finished populating command collections while handling the AccountCommandsRequested event. */
  def complete(): Unit = js.native
}

object AccountsSettingsPaneEventDeferral {
  @scala.inline
  def apply(complete: () => Unit): AccountsSettingsPaneEventDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[AccountsSettingsPaneEventDeferral]
  }
  @scala.inline
  implicit class AccountsSettingsPaneEventDeferralOps[Self <: AccountsSettingsPaneEventDeferral] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

