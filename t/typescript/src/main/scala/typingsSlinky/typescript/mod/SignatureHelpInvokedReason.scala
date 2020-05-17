package typingsSlinky.typescript.mod

import typingsSlinky.typescript.typescriptStrings.invoked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Signals that the user manually requested signature help.
  * The language service will unconditionally attempt to provide a result.
  */
@js.native
trait SignatureHelpInvokedReason extends SignatureHelpTriggerReason {
  var kind: invoked = js.native
  var triggerCharacter: js.UndefOr[scala.Nothing] = js.native
}

object SignatureHelpInvokedReason {
  @scala.inline
  def apply(kind: invoked): SignatureHelpInvokedReason = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpInvokedReason]
  }
  @scala.inline
  implicit class SignatureHelpInvokedReasonOps[Self <: SignatureHelpInvokedReason] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: invoked): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

