package typingsSlinky.stellarBase.anon

import typingsSlinky.stellarBase.mod.KeypairType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicKey extends js.Object {
  var publicKey: js.UndefOr[String] = js.native
  var secretKey: String = js.native
  var `type`: KeypairType = js.native
}

object PublicKey {
  @scala.inline
  def apply(secretKey: String, `type`: KeypairType): PublicKey = {
    val __obj = js.Dynamic.literal(secretKey = secretKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKey]
  }
  @scala.inline
  implicit class PublicKeyOps[Self <: PublicKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSecretKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: KeypairType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKey")(js.undefined)
        ret
    }
  }
  
}

