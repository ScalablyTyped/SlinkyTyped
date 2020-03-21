package typingsSlinky.secp256k1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRecovery extends js.Object {
  var recovery: Double
  var signature: scala.scalajs.js.typedarray.Uint8Array
}

object AnonRecovery {
  @scala.inline
  def apply(recovery: Double, signature: scala.scalajs.js.typedarray.Uint8Array): AnonRecovery = {
    val __obj = js.Dynamic.literal(recovery = recovery.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRecovery]
  }
}

