package typingsSlinky.winrtUwp.Windows.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a user authentication status change deferral returned by the UserAuthenticationStatusChangingEventArgs.GetDeferral method. */
@js.native
trait UserAuthenticationStatusChangeDeferral extends js.Object {
  /** Reports that the application has completed its user authentication status change deferral. */
  def complete(): Unit = js.native
}

object UserAuthenticationStatusChangeDeferral {
  @scala.inline
  def apply(complete: () => Unit): UserAuthenticationStatusChangeDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[UserAuthenticationStatusChangeDeferral]
  }
  @scala.inline
  implicit class UserAuthenticationStatusChangeDeferralOps[Self <: UserAuthenticationStatusChangeDeferral] (val x: Self) extends AnyVal {
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

