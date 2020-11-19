package typingsSlinky.sodiumNative.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodium-native", "crypto_sign_detached")
@js.native
object cryptoSignDetached extends js.Object {
  
  def apply(signature: Buffer, message: Buffer, secretKey: Buffer): Unit = js.native
}
