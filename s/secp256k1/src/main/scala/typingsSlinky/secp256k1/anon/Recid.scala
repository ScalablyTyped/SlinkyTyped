package typingsSlinky.secp256k1.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Recid extends js.Object {
  var recid: Double
  var signature: js.typedarray.Uint8Array
}

object Recid {
  @scala.inline
  def apply(recid: Double, signature: js.typedarray.Uint8Array): Recid = {
    val __obj = js.Dynamic.literal(recid = recid.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recid]
  }
}

