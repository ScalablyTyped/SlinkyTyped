package typingsSlinky.sodiumNative.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodium-native", "crypto_scalarmult")
@js.native
object cryptoScalarmult extends js.Object {
  
  def apply(sharedSecret: Buffer, secretKey: Buffer, remotePublicKey: Buffer): Unit = js.native
}
