package typingsSlinky.sodiumNative.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodium-native", "crypto_box_seal")
@js.native
object cryptoBoxSeal extends js.Object {
  
  def apply(ciphertext: Buffer, message: Buffer, publicKey: Buffer): Unit = js.native
}
