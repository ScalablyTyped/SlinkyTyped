package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The CryptoKeyPair dictionary of the Web Crypto API represents a key pair for an asymmetric cryptography algorithm, also known as a public-key algorithm. */
@js.native
trait CryptoKeyPair extends js.Object {
  var privateKey: org.scalajs.dom.crypto.CryptoKey = js.native
  var publicKey: org.scalajs.dom.crypto.CryptoKey = js.native
}

object CryptoKeyPair {
  @scala.inline
  def apply(privateKey: org.scalajs.dom.crypto.CryptoKey, publicKey: org.scalajs.dom.crypto.CryptoKey): CryptoKeyPair = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoKeyPair]
  }
  @scala.inline
  implicit class CryptoKeyPairOps[Self <: org.scalajs.dom.crypto.CryptoKeyPair] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrivateKey(value: org.scalajs.dom.crypto.CryptoKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKey")(value.asInstanceOf[js.Any])
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

