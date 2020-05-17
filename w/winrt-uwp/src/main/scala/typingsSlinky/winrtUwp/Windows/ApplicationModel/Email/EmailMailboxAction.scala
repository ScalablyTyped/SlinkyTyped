package typingsSlinky.winrtUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data about a change that occurred to a mailbox. */
@js.native
trait EmailMailboxAction extends js.Object {
  /** Gets the number that identifies the change that happened to the mailbox. */
  var changeNumber: Double = js.native
  /** Gets the value that represents the kind of change that happened to the mailbox. */
  var kind: EmailMailboxActionKind = js.native
}

object EmailMailboxAction {
  @scala.inline
  def apply(changeNumber: Double, kind: EmailMailboxActionKind): EmailMailboxAction = {
    val __obj = js.Dynamic.literal(changeNumber = changeNumber.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailMailboxAction]
  }
  @scala.inline
  implicit class EmailMailboxActionOps[Self <: EmailMailboxAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: EmailMailboxActionKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

