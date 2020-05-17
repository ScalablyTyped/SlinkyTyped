package typingsSlinky.stellarBase.anon

import typingsSlinky.stellarBase.mod.xdr.Signature
import typingsSlinky.stellarBase.mod.xdr.SignatureHint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hint extends js.Object {
  var hint: SignatureHint = js.native
  var signature: Signature = js.native
}

object Hint {
  @scala.inline
  def apply(hint: SignatureHint, signature: Signature): Hint = {
    val __obj = js.Dynamic.literal(hint = hint.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hint]
  }
  @scala.inline
  implicit class HintOps[Self <: Hint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHint(value: SignatureHint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignature(value: Signature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

