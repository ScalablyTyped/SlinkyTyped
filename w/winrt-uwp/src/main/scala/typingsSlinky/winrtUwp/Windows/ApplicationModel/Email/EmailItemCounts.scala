package typingsSlinky.winrtUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the counts for various email message attributes such as flagged, important, unread, and so on. */
@js.native
trait EmailItemCounts extends js.Object {
  /** Gets the number of flagged email messages. */
  var flagged: Double = js.native
  /** Gets the number of important email messages. */
  var important: Double = js.native
  /** Gets the total number of email messages */
  var total: Double = js.native
  /** Gets the number of unread email messages. */
  var unread: Double = js.native
}

object EmailItemCounts {
  @scala.inline
  def apply(flagged: Double, important: Double, total: Double, unread: Double): EmailItemCounts = {
    val __obj = js.Dynamic.literal(flagged = flagged.asInstanceOf[js.Any], important = important.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], unread = unread.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailItemCounts]
  }
  @scala.inline
  implicit class EmailItemCountsOps[Self <: EmailItemCounts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlagged(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flagged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImportant(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("important")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnread(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unread")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

