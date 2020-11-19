package typingsSlinky.tweetnacl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait nacl extends js.Object {
  
  def box(
    msg: js.typedarray.Uint8Array,
    nonce: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array,
    secretKey: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = js.native
  @JSName("box")
  var box_Original: box = js.native
  
  def hash(msg: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  @JSName("hash")
  var hash_Original: hash = js.native
  
  def randomBytes(n: Double): js.typedarray.Uint8Array = js.native
  
  def scalarMult(n: js.typedarray.Uint8Array, p: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  @JSName("scalarMult")
  var scalarMult_Original: scalarMult = js.native
  
  def secretbox(msg: js.typedarray.Uint8Array, nonce: js.typedarray.Uint8Array, key: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  @JSName("secretbox")
  var secretbox_Original: secretbox = js.native
  
  def setPRNG(fn: js.Function2[/* x */ js.typedarray.Uint8Array, /* n */ Double, Unit]): Unit = js.native
  
  def sign(msg: js.typedarray.Uint8Array, secretKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  @JSName("sign")
  var sign_Original: sign = js.native
  
  def verify(x: js.typedarray.Uint8Array, y: js.typedarray.Uint8Array): Boolean = js.native
}
