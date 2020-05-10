package typingsSlinky.typescript.mod

import typingsSlinky.typescript.typescriptStrings.retrigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Signals that this signature help request came from typing a character or moving the cursor.
  * This should only occur if a signature help session was already active and the editor needs to see if it should adjust.
  * The language service will unconditionally attempt to provide a result.
  * `triggerCharacter` can be `undefined` for a retrigger caused by a cursor move.
  */
@js.native
trait SignatureHelpRetriggeredReason extends SignatureHelpTriggerReason {
  var kind: retrigger = js.native
  /**
    * Character that was responsible for triggering signature help.
    */
  var triggerCharacter: js.UndefOr[SignatureHelpRetriggerCharacter] = js.native
}

object SignatureHelpRetriggeredReason {
  @scala.inline
  def apply(kind: retrigger): SignatureHelpRetriggeredReason = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpRetriggeredReason]
  }
  @scala.inline
  implicit class SignatureHelpRetriggeredReasonOps[Self <: SignatureHelpRetriggeredReason] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: retrigger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerCharacter(value: SignatureHelpRetriggerCharacter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerCharacter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerCharacter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerCharacter")(js.undefined)
        ret
    }
  }
  
}

