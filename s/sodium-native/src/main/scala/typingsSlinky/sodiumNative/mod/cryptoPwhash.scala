package typingsSlinky.sodiumNative.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodium-native", "crypto_pwhash")
@js.native
object cryptoPwhash extends js.Object {
  
  def apply(
    output: Buffer,
    password: Buffer,
    salt: Buffer,
    opslimit: Double,
    memlimit: Double,
    algorithm: Double
  ): Unit = js.native
}
