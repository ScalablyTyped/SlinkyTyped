package typingsSlinky.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRecipientList extends js.Object {
  /** Recipient list attribute object */
  var attributes: js.UndefOr[js.Any] = js.native
  /** Detailed description of the recipient list */
  var description: js.UndefOr[String] = js.native
  /** Short, unique, recipient list identifier */
  var id: js.UndefOr[String] = js.native
  /** Short, pretty/readable recipient list display name, not required to be unique */
  var name: js.UndefOr[String] = js.native
  /** limit the number of recipient errors returned. */
  var num_rcpt_errors: js.UndefOr[Double] = js.native
  /** Array of recipient objects */
  var recipients: js.Array[Recipient] = js.native
}

object CreateRecipientList {
  @scala.inline
  def apply(recipients: js.Array[Recipient]): CreateRecipientList = {
    val __obj = js.Dynamic.literal(recipients = recipients.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRecipientList]
  }
  @scala.inline
  implicit class CreateRecipientListOps[Self <: CreateRecipientList] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withAttributes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNum_rcpt_errors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_rcpt_errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNum_rcpt_errors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_rcpt_errors")(js.undefined)
        ret
    }
  }
  
}

