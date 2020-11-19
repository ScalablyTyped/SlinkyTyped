package typingsSlinky.sodiumNative.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodium-native", "crypto_box_open_detached")
@js.native
object cryptoBoxOpenDetached extends js.Object {
  
  def apply(
    message: Buffer,
    ciphertext: Buffer,
    mac: Buffer,
    nonce: Buffer,
    publicKey: Buffer,
    secretKey: Buffer
  ): Boolean = js.native
}
