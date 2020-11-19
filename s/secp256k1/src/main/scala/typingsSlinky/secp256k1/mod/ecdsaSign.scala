package typingsSlinky.secp256k1.mod

import typingsSlinky.secp256k1.anon.Recid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("secp256k1", "ecdsaSign")
@js.native
object ecdsaSign extends js.Object {
  
  def apply(message: js.typedarray.Uint8Array, privateKey: js.typedarray.Uint8Array): Recid = js.native
  def apply(message: js.typedarray.Uint8Array, privateKey: js.typedarray.Uint8Array, options: SignOptions): Recid = js.native
}
