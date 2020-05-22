package typingsSlinky.tweetnacl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignKeyPair extends js.Object {
  var publicKey: js.typedarray.Uint8Array
  var secretKey: js.typedarray.Uint8Array
}

object SignKeyPair {
  @scala.inline
  def apply(publicKey: js.typedarray.Uint8Array, secretKey: js.typedarray.Uint8Array): SignKeyPair = {
    val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignKeyPair]
  }
}

