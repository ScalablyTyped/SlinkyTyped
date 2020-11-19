package typingsSlinky.sodiumNative.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodium-native", "crypto_auth_verify")
@js.native
object cryptoAuthVerify extends js.Object {
  
  def apply(output: Buffer, input: Buffer, key: Buffer): Boolean = js.native
}
