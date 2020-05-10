package typingsSlinky.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecipientListWithRecipients extends RecipientList {
  /** Array of recipient objects */
  var recipients: js.Array[Recipient] = js.native
}

object RecipientListWithRecipients {
  @scala.inline
  def apply(
    attributes: js.Any,
    description: String,
    id: String,
    name: String,
    recipients: js.Array[Recipient],
    total_accepted_recipients: Double
  ): RecipientListWithRecipients = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], recipients = recipients.asInstanceOf[js.Any], total_accepted_recipients = total_accepted_recipients.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipientListWithRecipients]
  }
  @scala.inline
  implicit class RecipientListWithRecipientsOps[Self <: RecipientListWithRecipients] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecipients(value: js.Array[Recipient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipients")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

