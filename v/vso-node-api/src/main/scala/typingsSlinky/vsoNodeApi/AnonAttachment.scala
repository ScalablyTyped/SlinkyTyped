package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAttachment extends js.Object {
  var attachment: Double = js.native
  var changeEntry: Double = js.native
}

object AnonAttachment {
  @scala.inline
  def apply(attachment: Double, changeEntry: Double): AnonAttachment = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], changeEntry = changeEntry.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttachment]
  }
  @scala.inline
  implicit class AnonAttachmentOps[Self <: AnonAttachment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachment(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeEntry(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeEntry")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

