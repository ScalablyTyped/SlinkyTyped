package typingsSlinky.stellarBase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEd25519PublicKey extends js.Object {
  var ed25519PublicKey: js.Any = js.native
}

object AnonEd25519PublicKey {
  @scala.inline
  def apply(ed25519PublicKey: js.Any): AnonEd25519PublicKey = {
    val __obj = js.Dynamic.literal(ed25519PublicKey = ed25519PublicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEd25519PublicKey]
  }
  @scala.inline
  implicit class AnonEd25519PublicKeyOps[Self <: AnonEd25519PublicKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEd25519PublicKey(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ed25519PublicKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

