package typingsSlinky.sodiumNative.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodium-native", "crypto_secretbox_easy")
@js.native
object cryptoSecretboxEasy extends js.Object {
  
  def apply(ciphertext: Buffer, message: Buffer, nonce: Buffer, secretKey: Buffer): Unit = js.native
}
