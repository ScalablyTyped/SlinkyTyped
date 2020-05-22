package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScopedCredentialInfo extends js.Object {
  val credential: ScopedCredential
  val publicKey: org.scalajs.dom.crypto.CryptoKey
}

object ScopedCredentialInfo {
  @scala.inline
  def apply(credential: ScopedCredential, publicKey: org.scalajs.dom.crypto.CryptoKey): ScopedCredentialInfo = {
    val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopedCredentialInfo]
  }
}

