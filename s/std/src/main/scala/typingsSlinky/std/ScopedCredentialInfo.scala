package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScopedCredentialInfo extends js.Object {
  val credential: ScopedCredential = js.native
  val publicKey: org.scalajs.dom.crypto.CryptoKey = js.native
}

object ScopedCredentialInfo {
  @scala.inline
  def apply(credential: ScopedCredential, publicKey: org.scalajs.dom.crypto.CryptoKey): ScopedCredentialInfo = {
    val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopedCredentialInfo]
  }
  @scala.inline
  implicit class ScopedCredentialInfoOps[Self <: ScopedCredentialInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCredential(value: ScopedCredential): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credential")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicKey(value: org.scalajs.dom.crypto.CryptoKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

