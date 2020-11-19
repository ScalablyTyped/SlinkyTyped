package typingsSlinky.secp256k1.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("secp256k1", "ecdh")
@js.native
object ecdh extends js.Object {
  
  def apply(publicKey: js.typedarray.Uint8Array, privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  def apply(publicKey: js.typedarray.Uint8Array, privateKey: js.typedarray.Uint8Array, opt: ecdhOptions): js.typedarray.Uint8Array = js.native
}
