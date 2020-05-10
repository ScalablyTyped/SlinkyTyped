package typingsSlinky.winstonMail.mod.winstonAugmentingMod

import typingsSlinky.winstonMail.mod.Mail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transports extends js.Object {
  var Mail: typingsSlinky.winstonMail.mod.Mail = js.native
}

object Transports {
  @scala.inline
  def apply(Mail: Mail): Transports = {
    val __obj = js.Dynamic.literal(Mail = Mail.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transports]
  }
  @scala.inline
  implicit class TransportsOps[Self <: Transports] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMail(value: Mail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mail")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

