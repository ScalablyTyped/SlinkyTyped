package typingsSlinky.xrm.Xrm.Controls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * interface to define the actions on a control notification
  */
@js.native
trait ControlNotificationAction extends js.Object {
  /**
    * Array of functions. The corresponding actions for the message.
    */
  var actions: js.Array[js.Function0[Unit]] = js.native
  /**
    * The body message of the notification to be displayed to the user. Limit your message to 100 characters for optimal user experience.
    */
  var message: js.UndefOr[String] = js.native
}

object ControlNotificationAction {
  @scala.inline
  def apply(actions: js.Array[js.Function0[Unit]]): ControlNotificationAction = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlNotificationAction]
  }
  @scala.inline
  implicit class ControlNotificationActionOps[Self <: ControlNotificationAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: js.Array[js.Function0[Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
  }
  
}

