package typingsSlinky.winrtUwp.Windows.ApplicationModel.LockScreen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an unlock deferral. */
@js.native
trait LockScreenUnlockingDeferral extends js.Object {
  /** Notifies the system that your deferral is complete. If your deferral takes too long to complete, your lock screen app will be terminated by the system and potentially removed as the user’s default lock app. */
  def complete(): Unit = js.native
}

object LockScreenUnlockingDeferral {
  @scala.inline
  def apply(complete: () => Unit): LockScreenUnlockingDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[LockScreenUnlockingDeferral]
  }
  @scala.inline
  implicit class LockScreenUnlockingDeferralOps[Self <: LockScreenUnlockingDeferral] (val x: Self) extends AnyVal {
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

