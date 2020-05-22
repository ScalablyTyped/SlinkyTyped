package typingsSlinky.tweetnacl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxKeyPair extends js.Object {
  var publicKey: js.typedarray.Uint8Array
  var secretKey: js.typedarray.Uint8Array
}

object BoxKeyPair {
  @scala.inline
  def apply(publicKey: js.typedarray.Uint8Array, secretKey: js.typedarray.Uint8Array): BoxKeyPair = {
    val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxKeyPair]
  }
}

