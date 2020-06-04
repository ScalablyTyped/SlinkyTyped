package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The CryptoKeyPair dictionary of the Web Crypto API represents a key pair for an asymmetric cryptography algorithm, also known as a public-key algorithm. */
trait CryptoKeyPair extends js.Object {
  var privateKey: org.scalajs.dom.crypto.CryptoKey
  var publicKey: org.scalajs.dom.crypto.CryptoKey
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
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPrivateKey(value: org.scalajs.dom.crypto.CryptoKey): Self = this.set("privateKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicKey(value: org.scalajs.dom.crypto.CryptoKey): Self = this.set("publicKey", value.asInstanceOf[js.Any])
  }
  
}

