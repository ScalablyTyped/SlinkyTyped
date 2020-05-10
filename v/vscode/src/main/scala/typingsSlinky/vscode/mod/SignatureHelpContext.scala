package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignatureHelpContext extends js.Object {
  /**
  		 * The currently active [`SignatureHelp`](#SignatureHelp).
  		 *
  		 * The `activeSignatureHelp` has its [`SignatureHelp.activeSignature`] field updated based on
  		 * the user arrowing through available signatures.
  		 */
  val activeSignatureHelp: js.UndefOr[SignatureHelp] = js.native
  /**
  		 * `true` if signature help was already showing when it was triggered.
  		 *
  		 * Retriggers occur when the signature help is already active and can be caused by actions such as
  		 * typing a trigger character, a cursor move, or document content changes.
  		 */
  val isRetrigger: Boolean = js.native
  /**
  		 * Character that caused signature help to be triggered.
  		 *
  		 * This is `undefined` when signature help is not triggered by typing, such as when manually invoking
  		 * signature help or when moving the cursor.
  		 */
  val triggerCharacter: js.UndefOr[String] = js.native
  /**
  		 * Action that caused signature help to be triggered.
  		 */
  val triggerKind: SignatureHelpTriggerKind = js.native
}

object SignatureHelpContext {
  @scala.inline
  def apply(isRetrigger: Boolean, triggerKind: SignatureHelpTriggerKind): SignatureHelpContext = {
    val __obj = js.Dynamic.literal(isRetrigger = isRetrigger.asInstanceOf[js.Any], triggerKind = triggerKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpContext]
  }
  @scala.inline
  implicit class SignatureHelpContextOps[Self <: SignatureHelpContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsRetrigger(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRetrigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerKind(value: SignatureHelpTriggerKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveSignatureHelp(value: SignatureHelp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeSignatureHelp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveSignatureHelp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeSignatureHelp")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerCharacter(value: String): Self = {
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

