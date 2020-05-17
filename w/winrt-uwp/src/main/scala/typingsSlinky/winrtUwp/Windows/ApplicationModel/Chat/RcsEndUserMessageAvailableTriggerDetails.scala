package typingsSlinky.winrtUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data to the background task about a new message. */
@js.native
trait RcsEndUserMessageAvailableTriggerDetails extends js.Object {
  /** Gets the text of the new message. */
  var text: String = js.native
  /** Gets the title of the new message. */
  var title: String = js.native
}

object RcsEndUserMessageAvailableTriggerDetails {
  @scala.inline
  def apply(text: String, title: String): RcsEndUserMessageAvailableTriggerDetails = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[RcsEndUserMessageAvailableTriggerDetails]
  }
  @scala.inline
  implicit class RcsEndUserMessageAvailableTriggerDetailsOps[Self <: RcsEndUserMessageAvailableTriggerDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

