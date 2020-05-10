package typingsSlinky.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecipientList extends js.Object {
  /** Recipient list attribute object */
  var attributes: js.Any = js.native
  /** Detailed description of the recipient list */
  var description: String = js.native
  /** Short, unique, recipient list identifier */
  var id: String = js.native
  /** Short, pretty/readable recipient list display name, not required to be unique */
  var name: String = js.native
  /** Number of accepted recipients */
  var total_accepted_recipients: Double = js.native
}

object RecipientList {
  @scala.inline
  def apply(
    attributes: js.Any,
    description: String,
    id: String,
    name: String,
    total_accepted_recipients: Double
  ): RecipientList = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], total_accepted_recipients = total_accepted_recipients.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipientList]
  }
  @scala.inline
  implicit class RecipientListOps[Self <: RecipientList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_accepted_recipients(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_accepted_recipients")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

