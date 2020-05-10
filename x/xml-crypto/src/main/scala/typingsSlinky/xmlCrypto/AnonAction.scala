package typingsSlinky.xmlCrypto

import typingsSlinky.xmlCrypto.xmlCryptoStrings.after
import typingsSlinky.xmlCrypto.xmlCryptoStrings.append
import typingsSlinky.xmlCrypto.xmlCryptoStrings.before
import typingsSlinky.xmlCrypto.xmlCryptoStrings.prepend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAction extends js.Object {
  var action: append | prepend | before | after = js.native
  var reference: String = js.native
}

object AnonAction {
  @scala.inline
  def apply(action: append | prepend | before | after, reference: String): AnonAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAction]
  }
  @scala.inline
  implicit class AnonActionOps[Self <: AnonAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: append | prepend | before | after): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReference(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reference")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

