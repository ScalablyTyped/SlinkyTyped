package typingsSlinky.sodiumNative.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodium-native", "crypto_sign")
@js.native
object cryptoSign extends js.Object {
  
  def apply(signedMessage: Buffer, message: Buffer, secretKey: Buffer): Unit = js.native
}
