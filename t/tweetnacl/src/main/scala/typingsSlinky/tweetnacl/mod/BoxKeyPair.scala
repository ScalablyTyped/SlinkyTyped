package typingsSlinky.tweetnacl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoxKeyPair extends js.Object {
  var publicKey: js.typedarray.Uint8Array = js.native
  var secretKey: js.typedarray.Uint8Array = js.native
}

object BoxKeyPair {
  @scala.inline
  def apply(publicKey: js.typedarray.Uint8Array, secretKey: js.typedarray.Uint8Array): BoxKeyPair = {
    val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxKeyPair]
  }
  @scala.inline
  implicit class BoxKeyPairOps[Self <: BoxKeyPair] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPublicKey(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecretKey(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

