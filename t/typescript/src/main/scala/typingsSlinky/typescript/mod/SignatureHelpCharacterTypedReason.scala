package typingsSlinky.typescript.mod

import typingsSlinky.typescript.typescriptStrings.characterTyped
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Signals that the signature help request came from a user typing a character.
  * Depending on the character and the syntactic context, the request may or may not be served a result.
  */
@js.native
trait SignatureHelpCharacterTypedReason extends SignatureHelpTriggerReason {
  var kind: characterTyped = js.native
  /**
    * Character that was responsible for triggering signature help.
    */
  var triggerCharacter: SignatureHelpTriggerCharacter = js.native
}

object SignatureHelpCharacterTypedReason {
  @scala.inline
  def apply(kind: characterTyped, triggerCharacter: SignatureHelpTriggerCharacter): SignatureHelpCharacterTypedReason = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], triggerCharacter = triggerCharacter.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpCharacterTypedReason]
  }
  @scala.inline
  implicit class SignatureHelpCharacterTypedReasonOps[Self <: SignatureHelpCharacterTypedReason] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: characterTyped): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerCharacter(value: SignatureHelpTriggerCharacter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerCharacter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

