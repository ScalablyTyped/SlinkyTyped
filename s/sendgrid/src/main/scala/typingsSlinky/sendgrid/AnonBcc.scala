package typingsSlinky.sendgrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBcc extends js.Object {
  var bcc: js.Any = js.native
  var bypass_list_management: js.Any = js.native
  var footer: js.Any = js.native
  var sandbox_mode: js.Any = js.native
  var spam_check: js.Any = js.native
}

object AnonBcc {
  @scala.inline
  def apply(
    bcc: js.Any,
    bypass_list_management: js.Any,
    footer: js.Any,
    sandbox_mode: js.Any,
    spam_check: js.Any
  ): AnonBcc = {
    val __obj = js.Dynamic.literal(bcc = bcc.asInstanceOf[js.Any], bypass_list_management = bypass_list_management.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], sandbox_mode = sandbox_mode.asInstanceOf[js.Any], spam_check = spam_check.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBcc]
  }
  @scala.inline
  implicit class AnonBccOps[Self <: AnonBcc] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBcc(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bcc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBypass_list_management(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bypass_list_management")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFooter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSandbox_mode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sandbox_mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpam_check(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spam_check")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

