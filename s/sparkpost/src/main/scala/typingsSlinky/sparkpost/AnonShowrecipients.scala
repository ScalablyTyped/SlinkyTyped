package typingsSlinky.sparkpost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonShowrecipients extends js.Object {
  var show_recipients: js.UndefOr[Boolean] = js.native
}

object AnonShowrecipients {
  @scala.inline
  def apply(): AnonShowrecipients = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonShowrecipients]
  }
  @scala.inline
  implicit class AnonShowrecipientsOps[Self <: AnonShowrecipients] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShow_recipients(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show_recipients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow_recipients: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show_recipients")(js.undefined)
        ret
    }
  }
  
}

