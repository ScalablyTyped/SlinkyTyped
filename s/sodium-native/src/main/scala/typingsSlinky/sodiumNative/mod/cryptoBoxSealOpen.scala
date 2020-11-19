package typingsSlinky.sodiumNative.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodium-native", "crypto_box_seal_open")
@js.native
object cryptoBoxSealOpen extends js.Object {
  
  def apply(message: Buffer, ciphertext: Buffer, publicKey: Buffer, secretKey: Buffer): Unit = js.native
}
