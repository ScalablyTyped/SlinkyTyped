package typingsSlinky.tweetnacl.tweetnaclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxKeyPair extends js.Object {
  var publicKey: scala.scalajs.js.typedarray.Uint8Array
  var secretKey: scala.scalajs.js.typedarray.Uint8Array
}

object BoxKeyPair {
  @scala.inline
  def apply(
    publicKey: scala.scalajs.js.typedarray.Uint8Array,
    secretKey: scala.scalajs.js.typedarray.Uint8Array
  ): BoxKeyPair = {
    val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BoxKeyPair]
  }
}

