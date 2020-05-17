package typingsSlinky.web3Core.mod

import typingsSlinky.web3Core.anon.Cipher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptedKeystoreV3Json extends js.Object {
  var address: String = js.native
  var crypto: Cipher = js.native
  var id: String = js.native
  var version: Double = js.native
}

object EncryptedKeystoreV3Json {
  @scala.inline
  def apply(address: String, crypto: Cipher, id: String, version: Double): EncryptedKeystoreV3Json = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], crypto = crypto.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptedKeystoreV3Json]
  }
  @scala.inline
  implicit class EncryptedKeystoreV3JsonOps[Self <: EncryptedKeystoreV3Json] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrypto(value: Cipher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crypto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

