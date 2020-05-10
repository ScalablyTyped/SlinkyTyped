package typingsSlinky.secp256k1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRecid extends js.Object {
  var recid: Double = js.native
  var signature: js.typedarray.Uint8Array = js.native
}

object AnonRecid {
  @scala.inline
  def apply(recid: Double, signature: js.typedarray.Uint8Array): AnonRecid = {
    val __obj = js.Dynamic.literal(recid = recid.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRecid]
  }
  @scala.inline
  implicit class AnonRecidOps[Self <: AnonRecid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignature(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

