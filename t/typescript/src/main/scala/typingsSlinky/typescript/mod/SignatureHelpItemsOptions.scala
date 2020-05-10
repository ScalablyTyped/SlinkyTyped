package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignatureHelpItemsOptions extends js.Object {
  var triggerReason: js.UndefOr[SignatureHelpTriggerReason] = js.native
}

object SignatureHelpItemsOptions {
  @scala.inline
  def apply(): SignatureHelpItemsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignatureHelpItemsOptions]
  }
  @scala.inline
  implicit class SignatureHelpItemsOptionsOps[Self <: SignatureHelpItemsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTriggerReason(value: SignatureHelpTriggerReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerReason")(js.undefined)
        ret
    }
  }
  
}

