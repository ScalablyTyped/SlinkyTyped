package typingsSlinky.webPush

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAuthorizationCryptoKey extends js.Object {
  var Authorization: String = js.native
  var `Crypto-Key`: js.UndefOr[String] = js.native
}

object AnonAuthorizationCryptoKey {
  @scala.inline
  def apply(Authorization: String): AnonAuthorizationCryptoKey = {
    val __obj = js.Dynamic.literal(Authorization = Authorization.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthorizationCryptoKey]
  }
  @scala.inline
  implicit class AnonAuthorizationCryptoKeyOps[Self <: AnonAuthorizationCryptoKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorization(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Authorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withCrypto-Key`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Crypto-Key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutCrypto-Key`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Crypto-Key")(js.undefined)
        ret
    }
  }
  
}

