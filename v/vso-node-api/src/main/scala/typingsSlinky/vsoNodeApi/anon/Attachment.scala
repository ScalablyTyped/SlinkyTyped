package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attachment extends js.Object {
  var attachment: scala.Double = js.native
  var changeEntry: scala.Double = js.native
}

object Attachment {
  @scala.inline
  def apply(attachment: scala.Double, changeEntry: scala.Double): Attachment = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], changeEntry = changeEntry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachment]
  }
  @scala.inline
  implicit class AttachmentOps[Self <: Attachment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachment(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangeEntry(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeEntry")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

