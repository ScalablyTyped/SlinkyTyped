package typingsSlinky.sparkpost.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Showrecipients extends js.Object {
  var show_recipients: js.UndefOr[Boolean] = js.native
}

object Showrecipients {
  @scala.inline
  def apply(): Showrecipients = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Showrecipients]
  }
  @scala.inline
  implicit class ShowrecipientsOps[Self <: Showrecipients] (val x: Self) extends AnyVal {
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

