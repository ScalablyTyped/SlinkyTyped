package typingsSlinky.sodiumNative.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodium-native", "crypto_box_detached")
@js.native
object cryptoBoxDetached extends js.Object {
  
  def apply(
    ciphertext: Buffer,
    mac: Buffer,
    message: Buffer,
    nonce: Buffer,
    publicKey: Buffer,
    secretKey: Buffer
  ): Unit = js.native
}
